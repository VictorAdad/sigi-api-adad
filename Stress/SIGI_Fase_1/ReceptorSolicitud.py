#!/usr/bin/env python
# -*- coding: utf-8 -*-

from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder #Para enviar un archivo adjunto
from random import randrange
import requests
import mysql.connector
from mysql.connector import errorcode
import variables
import time

url         = variables.url
nombres     = variables.nombres
paternos    = variables.paternos
maternos    = variables.maternos
sexos       = variables.sexos
documentos  = variables.documentos
fecha       = variables.fechaRegistro

def login(self):
  time.sleep(3)
  self.client.post(url+"login", {"nombreUsuario":"receptorsolicitud1", "password":"secret"})
  print "LOGIN como receptor de solicitudes"

def index(self):
  print "Entrando a index como receptor de solicitud"
  time.sleep(3)
  self.client.get(url)
  self.wait()

def listPeticionario(self):
  index(self)
  print "Entrando a 'Recepción de peticionarios'"
  time.sleep(3)
  self.client.get(url+"listaPeticionario")
  self.wait()


def searchPeticionario(self):
  listPeticionario(self)
  print "Buscando peticionarios sin parámetros..."
  time.sleep(3)
  i = randrange(2,11)
  self.client.post(url+"busquedaPeticionarios", data = {"nombre":nombres[i]})
  self.wait()

def searchPeticionarioAndCreateSolicitud(self):
  listPeticionario(self)
  print "Buscando peticionario existente y creando solicitud..."
  time.sleep(3)
  i = randrange(0,9)
  print "Peticionario a buscar: " + nombres[i]
  self.client.post(url+"busquedaPeticionarios", data = {"nombre":nombres[i]})
  self.wait()
  time.sleep(3)
  createSolicitud(self)
  self.wait()

def createSolicitud(self):
  listPeticionario(self)
  print "Entrando a 'Recepción de peticionarios'..."
  time.sleep(3)
  self.client.get(url+"solicitud/new")
  self.wait()
  i = randrange(0,6)
  print("Documento a subir: "+documentos[i][0])
  m = MultipartEncoder(
  fields={
    "horaLlegada": str(randrange(10,24))+":"+str(randrange(10,60)),
    "tipoSolicitud":"Externa",
    "nombre":nombres[randrange(0,11)],
    "paterno":paternos[randrange(0,17)],
    "materno":maternos[randrange(0,17)],
    "sexo":sexos[randrange(0,1)],
    "fechaNacimiento":"22/03/1989",
    "edad":str(randrange(18,89)),
    "curp": "COMO"+str(randrange(1000,9999))+"HVZ"+str(randrange(100,999)),
    "estado.id":"9",
    "municipio.id": str(randrange(377,392)), 
    "fechaSolicitud":fecha,
    "fechaRegistro":fecha,
    "nivelEstudio.id":str(randrange(1,11)),
    "ocupacion.id":str(randrange(1,19)),
    "tieneDiscapacidad":"false", 
    "esIndigena":"false", 
    "calle":"Calle Lomas de san Pedro",
    "numeroExterior":"45",
    "numeroInterior":"",
    "colonia":"Colonia 1", 
    "cp":"91098", 
    "celular":"3423534534",
    "fax":"5454-25432453",
    "email":"anymail@anymail.com",
    "oficioReferente": (documentos[i][0], open('Files/'+documentos[i][0], 'r'),documentos[i][1])
  })
  time.sleep(3)
  print "Creando solicitud de atención..."
  self.client.post(url+"solicitud", data=m, headers={'Content-Type': m.content_type})
  self.wait()


class UserTasks(TaskSet):
  tasks = {
    index:1,
    listPeticionario:2,
    searchPeticionario: 2,
    createSolicitud:3,
    searchPeticionarioAndCreateSolicitud: 2
  }

  def on_start(self):
    login(self)
