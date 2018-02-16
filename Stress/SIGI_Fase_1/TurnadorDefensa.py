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

def login(self):
  time.sleep(3)
  self.client.post(url+"login", {"nombreUsuario":"turnadordefensa1", "password":"secret"})
  print "LOGIN como turnador defensa"

def index(self):
    print "Entrando a index como turnador de defensas..."
    self.client.get(url)
    self.wait()

def turnarDefensa(self):
    index(self)
    time.sleep(3)
    print("Entrando a Defensas por turnar...")
    self.client.get(url+"defensa/turnar")
    self.wait()
    solicitud = findSolicitudDefensa()
    if solicitud != 0:
      print("Turnando la defensa" + str(solicitud))
      self.client.post(url+"solicitud/defensa/turnar/"+str(solicitud), data={
          "cambiarDistrito": "false",
          "usuario.nombreUsuario": "defensor10"
      })
    self.wait()

def findSolicitudDefensa():
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
    query = ("SELECT id FROM solicitud_atencion WHERE defensa_id IS NOT NULL AND region_id = 1 AND estatus = 'Autorizada'")
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

class UserTasks(TaskSet):
  tasks = {
    index:2,
    turnarDefensa:2
  }

  def on_start(self):
    login(self)