#!/usr/bin/env python
# -*- coding: utf-8 -*-

from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder
from random import randrange
import requests
import mysql.connector
from mysql.connector import errorcode
import variables
import time

url       = variables.url
nombres   = variables.nombres
paternos  = variables.paternos
maternos  = variables.maternos
sexos     = variables.sexos
fecha     = variables.fechaRegistro

def findSolicitudRepresentacion():
  idSolicitud = 0
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
    query = ("SELECT solicitud_atencion.id FROM solicitud_atencion, asesoria, representacion WHERE solicitud_atencion.id = solicitud_atencion_id AND asesoria.id = representacion.asesoria_id AND representacion.estatus = 'Autorizada'")
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
        idSolicitud = available[maxNumber]
      else:
        idSolicitud = available[randrange(maxNumber)]
    else:
      idSolicitud = 0
      print("No hay Solicitudes disponibles pendientes...")
    cursor.close()
    conn.close()
  return idSolicitud

def login(self):
  time.sleep(3)
  self.client.post(url+"login", {"nombreUsuario":"turnadorrepresentacion1", "password":"secret"})
  print "LOGIN como turnador representacion"

def index(self):
  print "Entrando a index como turnador representacion"
  time.sleep(3)
  self.client.get(url)
  self.wait()

def listRepresentaciones(self):
  index(self)
  print "Listando representaciones por turnar..."
  time.sleep(3)
  self.client.get(url+"representacion/turnar")
  self.wait()

def turnarRepresentacion(self):
    listRepresentaciones(self)
    solicitud = findSolicitudRepresentacion()
    print("Turnando representacion " + str(solicitud))
    if solicitud != 0:
      self.client.post(url+"solicitud/turnar/"+str(solicitud)+"/defensor10", data={
          "numeroOficioTurnar": "OFI3232XAL",
          "cambiarDistrito": "false",
          "peticionario_nombre": "Nombre",
          "peticionario_paterno": "Paterno",
          "peticionario_materno": "Materno"
      })
    self.wait()

class UserTasks(TaskSet):
  tasks = {
    index:1,
    listRepresentaciones:1,
    turnarRepresentacion: 2
  }

  def on_start(self):
    login(self)
