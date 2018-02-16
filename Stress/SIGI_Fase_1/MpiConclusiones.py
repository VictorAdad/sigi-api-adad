# -*- coding: utf8 -*-
import sys
from locust import HttpLocust, TaskSet, task
from requests_toolbelt import MultipartEncoder
from random import randrange
import json
import requests
import variables
import time
import datetime

#lanza las peticiones para la sesión de conclusiones del caso
def conclusiones_mpi(Mpi, response_idCaso):
  ###########################################################
  ### Archivo temporal                                    ###
  ###########################################################
  
  #petición get al paginador de Archivo temporal
  print("Petición a caso " + str(response_idCaso) + " para Archivo temporal ")
  response = Mpi.client.get("/v1/base/archivos-temporales/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="archivos-temporales get")
  print("Response status code", response.status_code)
  print("Response content", response.content)
  
  #Preparación de json para hacer post a archivo temporal

  json_archivoTemporal = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "observaciones": "Observaciones para el archivo temporal"
  }

  json_again = json.dumps(json_archivoTemporal)
  print(json_again)
  #petición post para guardar archivo temporal en BD
  print("Insertando Registro en la BD (Solicitud para archivo temporal)")
  Mpi.client.headers['Content-Type'] = "application/json"
  response = Mpi.client.post("/v1/base/archivos-temporales", data=json_again, name="archivos-temporales post")
  print("Response status_code", response.status_code)
  print("Response content", response.content)
  formatoArchivoTemporalId = str(json.loads(response.text)['id'])

  # Petición get ya con datos en el paginador de archivo temporal
  print("Petición a caso " + str(response_idCaso) + " para Archivo temporal ")
  response = Mpi.client.get("/v1/base/archivos-temporales/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="archivos-temporales get")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  #petición get para generar formato de archivo temporal
  time.sleep(10)
  print("Petición a caso " + str(response_idCaso) + " para generar formato Archivo temporal ")
  response = Mpi.client.get("/v1/documentos/formatos/save/"+formatoArchivoTemporalId+"/F1_012", name="archivos-temporales generar formato")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio de archivo temporal: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()  


  ###########################################################
  ### No ejercicio de la acción penal                     ###
  ###########################################################

  #petición get al paginador de no ejercicio a la acción penal
  print("Petición a caso " + str(response_idCaso) + " para no ejercicio a la accion penal ")
  response = Mpi.client.get("/v1/base/no-ejercicio-accion/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="no ejercicio a la accion penal get")
  print("Response status code", response.status_code)
  print("Response content", response.content)
  
  #Preparación de jason para hacer post de no ejercicio a la acción penal

  json_noEjericicioAccionPenal = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "hipotesisSobreseimiento": "IV",
  "ambitoHechos": "competencia",
  "narracionHechos": "Estas son las narraciones de los hechos",
  "datosPrueba": "Aquí van los datos de prueba ",
  "fechaHechoDelictivo": "2018-01-08T16:50:09.264Z",
  "articuloCpem": "Articulo x",
  "hipotesisCnpp": "Actualización del articulo 327",
  "fraccionArticulo": "fracción segunda",
  "nombreProcurador": "Pedro Fiscal",
  "autoridadCompetente": "Antonio Tablada",
  "causaIncompetencia": "causa irreconocible",
  "cargoAutoridadCompetente": "Cargo noveno",
  "observaciones": "mis observaciones "
  }

  json_again = json.dumps(json_noEjericicioAccionPenal)
  print(json_again)
  #petición post para guardar no ejercicio a la acción penal en BD
  print("Insertando Registro en la BD (Solicitud para no ejercicio a la accion penal)")
  Mpi.client.headers['Content-Type'] = "application/json"
  response = Mpi.client.post("/v1/base/no-ejercicio-accion", data=json_again, name="no ejercicio a la acción penal post")
  print("Response status_code", response.status_code)
  print("Response content", response.content)
  formatoNoEjercicioPenalId = str(json.loads(response.text)['id'])

  # Petición get ya con datos en el paginador de no ejercicio a la acción penal
  print("Petición a caso " + str(response_idCaso) + " para no ejercicio a la accion penal ")
  response = Mpi.client.get("/v1/base/no-ejercicio-accion/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="no ejercicio a la acción penal get")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  #petición get para generar formato no ejercicio a la accion penal 
  time.sleep(10)
  print("Petición a caso " + str(response_idCaso) + " para generar no ejercicio a la accion penal")
  response = Mpi.client.get("/v1/documentos/formatos/save/"+formatoNoEjercicioPenalId+"/F1_014", name="no ejercicio a la accion penal generar formato")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio no ejercicio a la accion penal: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()  

  ###########################################################
  ### Facultad de no investigar                           ###
  ###########################################################

  #petición get al paginador de facultad de no investigar
  print("Petición a caso " + str(response_idCaso) + " para facultades-no-investigar ")
  response = Mpi.client.get("/v1/base/facultades-no-investigar/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="facultades-no-investigar get")
  print("Response status code", response.status_code)
  print("Response content", response.content)
  
  #Preparación de jason para hacer post facultad de no investigar

  json_facultadNoInvestigar = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "observaciones": "Mis observaciones",
  "sintesisHechos": "Mi síntesis de los hechos ",
  "datosPrueba": "Aquí están mis datos de prueba ",
  "motivosAbstuvoInvestigar": "Motivo para investigar",
  "medioAlternativoSolucion": "Medios alternativos",
  "destinatarioDeterminacion": "A Juan Fernandez",
  "superiorJerarquico": "Hoffman Hernan",
  "nombreDenunciante": "Juan alvarez",
  "originarioDenunciante": "Puebla",
  "edadDenunciante": "50",
  "domicilioDenunciante": "La otra cuadra",
  "fraccion": "5"
  }

  json_again = json.dumps(json_facultadNoInvestigar)
  print(json_again)
  #petición post para guardar facultad de no investigar en BD
  print("Insertando Registro en la BD (Solicitud para facultades-no-investigar)")
  Mpi.client.headers['Content-Type'] = "application/json"
  response = Mpi.client.post("/v1/base/facultades-no-investigar", data=json_again, name="facultades-no-investigar post")
  print("Response status_code", response.status_code)
  print("Response content", response.content)

  formatoFacultadId = str(json.loads(response.text)['id'])

  # Petición get ya con datos en el paginador de no ejercicio a la acción penal
  print("Petición a caso " + str(response_idCaso) + " para facultades-no-investigar ")
  response = Mpi.client.get("/v1/base/facultades-no-investigar/casos/"+str(response_idCaso)+"/page?f=&p=0&tr=10", name="facultades-no-investigar penal get")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  #petición get para generar formato de facultad no investigar
  time.sleep(10)
  print("Petición a caso " + str(response_idCaso) + " para generar facultades-no-investigar")
  response = Mpi.client.get("/v1/documentos/formatos/save/"+formatoFacultadId+"/F1_013", name="facultades-no-investigar penal generar formato")
  print("Response status code", response.status_code)
  print("Response content", response.content)

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio de facultad de no inverstigar: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()