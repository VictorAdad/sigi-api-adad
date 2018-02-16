#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 
from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder
from random import randrange
import requests
import mysql.connector
from mysql.connector import errorcode
import variables
import time

url = variables.url #cambiar formato de url si es necesario (agregar / o cadena vacia)
documentos = variables.documentos

def login(self):
  time.sleep(3)
  self.client.post(url+"login", {"nombreUsuario":"ana.martinez", "password":"secret"})
  print "DEFENSOR LOGIN"

def index(self):
    self.client.get(url)
    self.wait()

def verMisDefensas(self):
    index(self)
    time.sleep(3)
    print("Ver mis Defensas")
    self.client.get(url+"defensa/abogado")
    self.wait()

def verDetalleDefensa(self):
  idDefensa = findDefensa()
  print("Ver Detalle de la defensa: "+str(idDefensa))
  if idDefensa!=0:
    self.client.get(url+"defensa/"+idDefensa)
    self.wait()

def crearEtapasProcesales(self, idDefensa):
  print("Crear la etapas procesales")
  #audienciaInicial(self, idDefensa, "Control Detención - Audiencia Inicial", "controlDetencion/new/"+idDefensa)
  #otrasAudiencias(self, idDefensa, "Otras Audiencias", "audiencia/new/"+idDefensa+"/E")
  #acusacion(self, idDefensa, "Acusacion", "acusacion/new/"+idDefensa)
  options = randrange(1,4)
  print("ETAPA NUMERO: "+str(options))
  options = {
    1 : audienciaInicial(self, idDefensa, "Control Detención - Audiencia Inicial", "controlDetencion/new/"+str(idDefensa)),
    2 : otrasAudiencias(self, idDefensa, "Otras Audiencias", "audiencia/new/"+idDefensa+"/E"),
    3 : acusacion(self, idDefensa, "Acusacion", "acusacion/new/"+idDefensa)
  }
  self.wait()

def audienciaInicial(self, idDefensa, etapa, urlEtapa):
  print("Crear la Etapa Procesal: "+etapa+" Para la defensa: "+str(idDefensa))
  self.client.get(url+urlEtapa)
  i = randrange(0,6)
  print("Sube Documento "+documentos[i][0])
  m = MultipartEncoder(
    fields={
      "fecha":"18/07/2016",
      "hora":"16:00",
      "tipoAudiencia":"Inicial",
      "antecedente":"false",
      "action":"Crear",
      "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'rb'),documentos[i][1])
  })
  time.sleep(3)
  self.client.post(url+"controlDetencion/"+idDefensa, data = m, headers={'Content-Type': m.content_type})  
  self.wait()

def otrasAudiencias(self, idDefensa, etapa, urlEtapa):
  print("Crear la Etapa Procesal: "+etapa+" Para la defensa: "+str(idDefensa))
  self.client.get(url+urlEtapa)
  i = randrange(0,4)
  print("Sube Documento "+documentos[i][0])
  m = MultipartEncoder(
    fields={
      "clasificacion": "E",
      "tipoAudiencia": "Intermedia",
      "organoJurisdiccional.id":"10027",
      "fechaAudiencia":"29/07/2016",
      "horaAudiencia":"10:00",
      "fundamentoLegal":"Fundamento legal de la audiencia",
      "comentarios":"La Audiencia de ... se llevará a cabo con el fin de ...",
      "causaMotivo":"",
      "sintesisAudiencia":"Síntesis de la Audiencia ...",
      "antecedente":"false",
      "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
  })
  time.sleep(3)
  self.client.post(url+"audiencia/"+idDefensa+"/0", data = m, headers={'Content-Type': m.content_type})  
  self.wait()

def acusacion(self, idDefensa, etapa, urlEtapa):
  print("Crear la Etapa Procesal: "+etapa+" Para la defensa: "+str(idDefensa))
  self.client.get(url+urlEtapa)
  i = randrange(0,4)
  print("Sube Documento "+documentos[i][0])
  m = MultipartEncoder(
    fields={
      "fechaPresentacion":"20/07/2016",
      "delitos":"111,149",
      "clasificacionLegal":"Clasificación Legal de la Acusación",
      "coadyuvanciaAcusacion":"false",
      "delitosCoadyuvancia":"",
      "fechaAudienciaIntermedia":"25/07/2016",
      "horaAudienciaIntermedia":"17:00",  
      "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
  })
  time.sleep(3)
  self.client.post(url+"acusacion/"+idDefensa, data = m, headers={'Content-Type': m.content_type})  
  self.wait()

def GuardarSituacionJuridicaDefensa(self):
  idDefensa = findDefensa()
  print("Guardar Situació Jurídica de Defensa para Mayores de Edad: "+str(idDefensa))
  if idDefensa != 0:
    self.client.post(url+"defensa/"+idDefensa, data = {
      "edadDelito": "25",
      "fechaInicioTermino":"16/07/2016",
      "horaInicioTermino": "15:00",
      "delitos":"311,48",
      "observaciones":"El peticionario se encuentra en una situación ... Para lo cual se recomienda ...",
      "defensorAsistio":"",
      "defensoresAutorizados":""
    })
    self.wait()
    crearEtapasProcesales(self, idDefensa)

def findDefensa():
  defensaId = 0
  try:
    conn = mysql.connector.connect(user = variables.DB_USER, password=variables.DB_PASS, database = variables.DB_NAME, host =variables.DB_HOST)
  except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
      print("Something is wrong with your user name or password")
    elif err.errno == errorcode.ER_BAD_DB_ERROR:
      print("Database does not exists")
    else:
      print(err)
  else:
    cursor = conn.cursor()
    query = ("SELECT id FROM defensa WHERE usuario_id = 27 AND edad_delito is null")
    print(query)
    cursor.execute(query)
    print(cursor)
    available = []
    for id in cursor:
      print("VALUE %s" % str(id[0]) )
      available.append(str(id[0]))
    print(available)
    print(len(available))
    if len(available) != 0:
      maxNumber = len(available)-1
      if maxNumber == 0:
        defensaId = available[maxNumber]
      else:
        defensaId = available[randrange(maxNumber)]
    else:
      defensaId = 0
      print("No hay Defensas disponibles pendientes...")
    cursor.close()
    conn.close()
  return defensaId

class UserTasks(TaskSet):
  tasks = {
    index:2,
    verMisDefensas:2,
    verDetalleDefensa:2,
    GuardarSituacionJuridicaDefensa:2
  }

  def on_start(self):
    login(self)