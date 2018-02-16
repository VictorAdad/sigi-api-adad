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
import evotilities

def mpiAcuerdos(Mpi,response_idCaso,r_User):
  ########################################################################################
  ### 1X. Inserta Registro en la BD (Acuerdos: Acuerdo de Inicio)                      ###
  ########################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Acuerdo de Inicio")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Acuerdo de Inicio: Peticion para consultar datos del Caso")
  evotilities.logger("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Acuerdo de Inicio", response)
  
  print("Peticion para Cargar las opciones del Catalogo Presentó o Recibió Llamada - Acuerdo de Inicio")
  response = Mpi.client.get("/v1/catalogos/entrevista/presento-llamadas/options", name="Acuerdo de Inicio: Peticion para Cargar las opciones del Catalogo Presentó o Recibió Llamada")
  evotilities.logger("Peticion para Cargar las opciones del Catalogo Presentó o Recibió Llamada - Acuerdo de Inicio", response)

  print("Peticion para consultar el Tipo de Acuerdo de Inicio del Caso #"+str(response_idCaso))
  response = Mpi.client.get("/v1/base/acuerdos/casos/" + str(response_idCaso) + "/tipos?tipo=Acuerdo%20Inicio", name="Acuerdo de Inicio: Peticion para consultar el Tipo de Acuerdo de Inicio del Caso")
  evotilities.logger("Peticion para consultar el Tipo de Acuerdo de Inicio del Caso #"+str(response_idCaso), response)
  
  nuc = str(json.loads(r_User.text)['Distrito'])+"/"+str(json.loads(r_User.text)['fiscaliaAcronimo'])+"/"+str(json.loads(r_User.text)['agenciaAcronimo'])+"/"+str(json.loads(r_User.text)['Municipio'])+"/"+str(response_idCaso)+"/"+str(time.strftime("%y"))+"/"+str(time.strftime("%m"))

  time.sleep(3)
  jsonAcInicio = {
  "caso": {
    "nuc": nuc,
    "id": response_idCaso
  },
  "personas":[],
  "tipo": "Acuerdo Inicio",
  "nombrePersonaAcepta": "Nombre de la Persona que Acepta Asistir a JR",
  "presentoLlamada": {
    "id": 1
  },
  "manifesto": "Manifestó",
  "sintesisHechos": "Sintesis de los Hechos",
  "observaciones": "Observaciones"
  }

  json_again = json.dumps(jsonAcInicio)
  print("Insertando Registro en la BD (Acuerdo de Inicio) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_AcInicio = Mpi.client.post("/v1/base/acuerdos", data=json_again, name="Acuerdo de Inicio: Peticion para Generar El Acuerdo de Inicio del Caso (NUC)")
  evotilities.logger("Insertando Registro en la BD (Acuerdo de Inicio) en Caso #" +str(response_idCaso), r_AcInicio)
  Mpi.wait()

  r_idAcInicio = str(json.loads(r_AcInicio.text)['id'])

  ############ Caratula del Acuerdo de Inicio #################
  time.sleep(10)
  print("Peticion para Generar el Oficio Caratula Acuerdo General #"+str(response_idCaso)+ " - Acuerdo de Inicio")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idAcInicio + "/F1_007", name="ERROR DOC - Acuerdo de Inicio: Peticion para Generar el Oficio Caratula Acuerdo General")
  evotilities.logger("Peticion para Generar el Oficio Caratula Acuerdo General #"+str(response_idCaso)+ " - Acuerdo de Inicio", response)
  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Caratula Acuerdo General del Caso #"+str(response_idCaso)+ " - Acuerdo de Inicio")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Acuerdo de Inicio: Peticion para Abrir el Oficio Caratula Acuerdo General del Caso")
    print ("Response status code:", response.status_code)  
  

  ############ Acuerdo de Inicio #################
  time.sleep(10)
  print("Peticion para Generar el Oficio Acuerdo de inicio #"+str(response_idCaso)+ " - Acuerdo de Inicio")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idAcInicio + "/F1_015_016", name="ERROR DOC - Acuerdo de Inicio: Peticion para Generar el Oficio Acuerdo de Inicio")
  evotilities.logger("Peticion para Generar el Oficio Acuerdo de inicio #"+str(response_idCaso)+ " - Acuerdo de Inicio", response)

  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Acuerdo Inicio del Caso #"+str(response_idCaso)+ " - Acuerdo de Inicio")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Acuerdo de Inicio: Peticion para Abrir el Oficio Acuerdo de Inicio del Caso")
    print ("Response status code:", response.status_code)
  

  ############ Registro de Derivación a la Justicia Restaurativa #################
  time.sleep(10)
  print("Peticion para Generar el Oficio Registro de Derivación a la Justicia Restaurativa del Caso #"+str(response_idCaso)+ " - Acuerdo de Inicio")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idAcInicio + "/F2_117", name="ERROR DOC - Acuerdo de Inicio: Peticion para Generar el Oficio Registro de Derivación a la Justicia Restaurativa del Caso")
  evotilities.logger("Peticion para Generar el Oficio Registro de Derivación a la Justicia Restaurativa del Caso #"+str(response_idCaso)+ " - Acuerdo de Inicio", response)

  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Registro de Derivación a la Justicia Restaurativa del Caso #"+str(response_idCaso)+ " - Acuerdo de Inicio")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Acuerdo de Inicio: Peticion para Abrir el Oficio Registro de Derivación a la Justicia Restaurativa del Caso")
    print ("Response status code:", response.status_code)  
  
  #print ("Response content:", response.content)

  ########################################################################################
  ### 1X. Inserta Registro en la BD (Acuerdos: Acuerdo de Radicación).                 ###
  ########################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Acuerdo de Radicación: Peticion para consultar datos del Caso")
  evotilities.logger("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación", response)

  print("Peticion para mostrar Acuerdo de Radicación del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  response = Mpi.client.get("/v1/base/acuerdos/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Acuerdo de Radicación: Peticion para mostrar Acuerdo de Radicación del Caso")
  evotilities.logger("Peticion para mostrar Acuerdo de Radicación del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación", response)

  time.sleep(3)
  jsonAcRadic = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "tipo": "Acuerdo Radicación",
  "observaciones": "Observaciones Acuerdo de Radicación"
  }

  json_again = json.dumps(jsonAcRadic)
  print("Insertando Registro en la BD (Acuerdo de Radicación) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_AcRadic = Mpi.client.post("/v1/base/acuerdos", data=json_again, name="Acuerdo de Radicación: Peticion para Generar un Acuerdo de Radicación")
  evotilities.logger("Insertando Registro en la BD (Acuerdo de Radicación) en Caso #" +str(response_idCaso), r_AcRadic)

  Mpi.wait()

  r_idAcRadic = str(json.loads(r_AcRadic.text)['id'])

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Acuerdo de Radicación: Peticion para consultar datos del Caso")
  evotilities.logger("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación", response)

  print("Peticion para consultar datos del Acuerdo de Radicacion del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  response = Mpi.client.get("/v1/base/acuerdos/" + r_idAcRadic, name="Acuerdo de Radicación: Peticion para consultar datos del Acuerdo de Radicación del Caso")
  evotilities.logger("Peticion para consultar datos del Acuerdo de Radicacion del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación", response)

  time.sleep(10)
  print("Peticion para Generar el Oficio Acuerdo de recepción y/o radicación del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + str(r_idAcRadic) + "/F2_138", name="ERROR DOC - Acuerdo de Radicación: Peticion para Generar el Oficio Acuerdo de recepción y/o radicación")
  evotilities.logger("Peticion para Generar el Oficio Acuerdo de recepción y/o radicación del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación", response)  

  #response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
  #buscar = "application/" 
  #reemplazar_por = "application-" 
  #response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)

  #time.sleep(5)
  #print("Peticion para Abrir el Oficio Acuerdo de recepción y/o radicación del Caso #"+str(response_idCaso)+ " - Acuerdo de Radicación")
  #response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Acuerdo de Radicación: Peticion para Abrir el Oficio Acuerdo de recepción y/o radicación")
  #print ("Response status code:", response.status_code)
      
def mpiEntrevistas(Mpi,response_idCaso):
  #########################################################
  ### 1X. Inserta Registro en la BD (Entrevista)        ###
  #########################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Entrevista")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Entrevista: Peticion para consultar datos del Caso")
  evotilities.logger("Peticion para consultar datos del Caso #"+str(response_idCaso)+ " - Entrevista", response)  
  
  print("Peticion para mostrar las Entrevistas del Caso #"+str(response_idCaso)+ " - Entrevista ")
  response = Mpi.client.get("/v1/base/entrevistas/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Entrevistas del Caso")
  evotilities.logger("Peticion para mostrar las Entrevistas del Caso #"+str(response_idCaso)+ " - Entrevista ", response)  
  
  time.sleep(3)
  jsonEntrev = {
  "personas":[],
  "sexoHeredar": "",
  "edadHeredar": "",
  "cpHeredar": "",
  "fechaNacimientoHeredar": "",
  "noTelefonoCelularHeredar": "",
  "noTelefonoParticularHeredar": "",
  "curpHeredar": "",
  "rfcHeredar": "",
  "sexo": {},
  "fechaNacimiento": "",
  "fechasNacimiento": "",
  "tipoInterviniente": {},
  "curp": "",
  "rfc": "",
  "noOficio": "2342424",
  "fechaReq": "2018-01-17T04:20:52.209Z",
  "autoridadReq": "Nombre de la Autoridad Requerida",
  "cargoTurnoAdscripcion": "Cargo, turno y Adscripcion",
  "domicilioAutoridad": "Domicilio de la Autoridad Requerida",
  "infoRequerida": "Informacion Requerida",
  "plazoDias": "4 dias",
  "apercibimiento": "Apercibimiento",
  "observaciones": "Observaciones",
  "caso": {
    "id": response_idCaso
  }
 }

  json_again = json.dumps(jsonEntrev)
  print("Insertando Registro en la BD (Entrevistas) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_Entrev = Mpi.client.post("/v1/base/entrevistas", data=json_again, name="Entrevistas: Peticion para Generar una Entrevista")
  evotilities.logger("Insertando Registro en la BD (Entrevistas) en Caso #" +str(response_idCaso), r_Entrev)  
  
  Mpi.wait()

  r_idEntrev = str(json.loads(r_Entrev.text)['id'])

  time.sleep(10)
  print("Peticion para Generar el Oficio Entrevista del Caso #"+str(response_idCaso)+ " - Entrevistas")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idEntrev + "/F1_008", name="ERROR DOC - Entrevistas: Peticion para Generar el Oficio Entrevista")
  evotilities.logger("Peticion para Generar el Oficio Entrevista del Caso #"+str(response_idCaso)+ " - Entrevistas", response)  
  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Entrevista del Caso #"+str(response_idCaso)+ " - Entrevistas")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Entrevistas: Peticion para Abrir el Oficio Entrevista")
    #print ("Response status code:", response.status_code)
