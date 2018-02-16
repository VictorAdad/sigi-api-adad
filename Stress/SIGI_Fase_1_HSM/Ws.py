#!/usr/bin/env python
# -*- coding: utf-8 -*-
# 
from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder
from random import randrange
import requests
from requests.auth import HTTPBasicAuth
import mysql.connector
from mysql.connector import errorcode
import variables
import time

url = variables.url #cambiar formato de url si es necesario (agregar / o cadena vacia)
nombres       = variables.nombres
paternos      = variables.paternos
maternos      = variables.maternos
sexos         = variables.sexos
procedencia   = variables.procedencia
fecha         = variables.fechaRegistro

def index(self):
	self.client.get(url)
	self.wait()

def solicitud(self):
	index(self)
	time.sleep(3)
	print("Creando una defensa...")
	self.client.post(url+"ws/solicitud/save", data = {
		"nombreRemite": "Ana Hernández García", 
		"procedencia":procedencia[randrange(0,2)], 
		"fechaSolicitud":fecha, 
		"horaLlegada":"15:00", 
		"nombre":nombres[randrange(0,11)], 
		"paterno":paternos[randrange(0,17)], 
		"materno":maternos[randrange(0,17)], 
		"idReferencia":"1", 
		"NUC":"444", 
		"edad":"30",
		"cel":"555912893173",
		"distritoJudicial":"CHALCO", 
		"cargoSolicita":"Ministerio público", 
		"curp":"ROBD851203MVZASXC", 
		"sexo":sexos[randrange(0,2)], 
		"calle":"Gardenias",
		"numInt":"18-A",
		"numExt":"18",
		"colonia":"5 de Mayo",
		"cp":"91500",
		"agencia":"Agencia Chalco",
		"estado":"Veracruz", 
		"municipio":"Xalapa", 
		"email":"peticionario1@anyplace.com"
	},auth=HTTPBasicAuth('receptorsolicitud1', 'secret'))
	self.wait()

class UserTasks(TaskSet):
	tasks = {
    	index:2,
    	solicitud:2
  	}