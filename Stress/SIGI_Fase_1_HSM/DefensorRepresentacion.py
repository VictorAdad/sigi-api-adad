#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 
from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder
from random import randrange
import requests
import mysql.connector
from mysql.connector import errorcode, locales
from mysql.connector.locales.eng import client_error
import variables
import time

url = variables.url #cambiar formato de url si es necesario (agregar / o cadena vacia)
documentos = variables.documentos

def login(self):
  time.sleep(3)
  self.client.post(url+"login", {"nombreUsuario":"defensor10", "password":"secret"})
  print "LOGIN como defensor para atención de patrocinios"

def index(self):
  print "Entrando a index como defensor para atención de patrocinios..."
  self.client.get(url)
  self.wait()

def representaciones(self):
  index(self)
  time.sleep(3)
  print "Entrando a 'Mis Patrocinios'"
  self.client.get(url+"mis-representaciones")
  self.wait()

def readRepresentacion(self):
  representaciones(self)
  time.sleep(3)
  idRepresentacion = findRepresentacion()
  if idRepresentacion != 0:
    print("Viendo patrocinio:"+str(idRepresentacion))
    self.client.get(url+"solicitud/detalle/representacion/"+str(idRepresentacion))
    self.wait()

def addHistoricoRepresentacionFase(self):
  representaciones(self)
  time.sleep(3)
  idRepresentacion = findRepresentacion()
  if idRepresentacion != 0:
    print("Se agrega una fase al patrocinio "+str(idRepresentacion))
    self.client.get(url+"solicitud/detalle/representacion/"+str(idRepresentacion))
    self.wait()
    asunto = randrange(1,8)
    i = randrange(0,6)
    print("Documento a subir: "+documentos[i][0])
    m = MultipartEncoder(
      fields={
        "faseAsunto.id": str(asunto),
        "fechaRealFase": "14/07/2016",
        "fechaMaximaAtencion": "14/07/2016",
        "observaciones": "Una Observación",
        "fechaIngresoFases": "14/07/2016",
        "defensor": "Fernanda",
        "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'rb'),documentos[i][1])
    })
    time.sleep(3)
    self.client.post(url+"representacion/fase/"+str(idRepresentacion), data=m, headers={'Content-Type': m.content_type})
    self.wait()

def addHistoricoRepresentacionMedio(self):
  representaciones(self)
  time.sleep(3)
  idRepresentacion = findRepresentacion()
  if idRepresentacion != 0:
    print("Se agrega un medio de impugnación al patrocinio "+str(idRepresentacion))
    self.client.get(url+"solicitud/detalle/representacion/"+str(idRepresentacion))
    self.wait()
    ran = randrange(1, 4)
    if ran == 1:
      self.client.get(url+"impugnacion/representacion/new/"+str(idRepresentacion)+"/Revocación")
      i = randrange(0,3)
      print("Documento a subir: "+documentos[i][0])
      m = MultipartEncoder(
        fields={
          "sujetoPromovente[]":"Actor",
          "fechaActoImpugnado":"14/07/2016",
          "actoImpugnado":"Acto impugnado de prueba",
          "fechaImpugnacion":"14/07/2016",
          "resolucion":"Favorable",
          "comentarios":"Comentarios de prueba",
          "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
      })
      time.sleep(3)
      self.client.post(url+"impugnacion/representacion/"+str(idRepresentacion)+"/Revocación", data=m, headers={'Content-Type': m.content_type})

    elif ran == 2:
      self.client.get(url+"impugnacion/representacion/new/"+str(idRepresentacion)+"/Queja")
      i = randrange(0,3)
      print("Sube Documento "+documentos[i][0])
      m = MultipartEncoder(
        fields={
          "sujetoPromovente[]":"Actor",
          "fechaActoImpugnado":"14/07/2016",
          "actoImpugnado":"Aun no hay acto impugnado",
          "fechaImpugnacion":"14/07/2016",
          "resolucion":"Favorable",
          "comentarios":"Unos Comentarios Agregados dinamicamente",
          "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
      })
      time.sleep(3)
      self.client.post(url+"impugnacion/representacion/"+str(idRepresentacion)+"/Queja", data=m, headers={'Content-Type': m.content_type})


    elif ran == 3:
      self.client.get(url+"impugnacion/representacion/new/"+str(idRepresentacion)+"/Apelación")
      i = randrange(0,3)
      print("Sube Documento "+documentos[i][0])
      m = MultipartEncoder(
        fields={
          "sujetoPromovente[]":"Actor",
          "fechaActoImpugnado":"14/07/2016",
          "actoImpugnado":"Aun no hay acto impugnado",
          "fechaImpugnacion":"14/07/2016",
          "resolucion":"Favorable",
          "comentarios":"Unos Comentarios Agregados dinamicamente",
          "documentos": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
      })
      time.sleep(3)
      self.client.post(url+"impugnacion/representacion/"+str(idRepresentacion)+"/Apelación", data=m, headers={'Content-Type': m.content_type})

  self.wait()

def findRepresentacion():
  idRepresentacion = 0
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
    query = ("SELECT id FROM representacion where usuario_id = 27 AND estatus = 'En Proceso'")
    print(query)
    cursor.execute(query)
    print(cursor)
    available = []
    for id in cursor:
      # print("VALUE %s" % str(id[0]) )
      available.append(str(id[0]))
    # print(available)
    print("Cantidad de representaciones pendientes encontradas: "+str(len(available)))
    if len(available) != 0:
      maxNumber = len(available)-1
      if maxNumber == 0:
        idRepresentacion = available[maxNumber]
      else:
        idRepresentacion = available[randrange(maxNumber)]
    else:
      idRepresentacion = 0
      print("No hay Representaciones disponibles pendientes...")
    cursor.close()
    conn.close()

  return idRepresentacion


class UserTasks(TaskSet):
  tasks = {
    index:1,
    representaciones:1, 
    readRepresentacion:1,
    addHistoricoRepresentacionFase:2,
    addHistoricoRepresentacionMedio:1
  }

  def on_start(self):
    login(self)