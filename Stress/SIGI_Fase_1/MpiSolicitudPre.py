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


def mpiSolicitudesPreliminares(Mpi,response_idCaso):

  #################################################################################
  ### 13. Solicitudes a policia de investigación                                ###
  #################################################################################
  
  print("Peticion de caso "+str(response_idCaso)+ " para policias de investigacion")  
  response = Mpi.client.get("/v1/base/solicitudes-pre-policias/casos/" + str(response_idCaso) + 
  "/page?f=&p=0&tr=10", name="Policias de Investigacion")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  json_solicitudPolicias = {
  "caso": {
    "id": response_idCaso
  },
  "personas": [],
  "noOficio": "23",
  "nombreComisario": "Alfredo",
  "actuacionesSolicitadas": "Mis actuaciones"
  }

  json_again = json.dumps(json_solicitudPolicias)
  print(json_again)
  print("Insertando Registro en la BD (Solicitud de policia de investigación)")
  Mpi.client.headers['Content-Type'] = "application/json"
  response = Mpi.client.post("/v1/base/solicitudes-pre-policias", data=json_again, name="Nueva Predenuncia")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  formatoPoliciaInvestId = str(json.loads(response.text)['id'])
  Mpi.wait()

  #Se hace otra petición para ver si se genero la solicitud de investigación 
  print("Peticion de caso "+str(response_idCaso)+ " para policias de investigacion")  
  response = Mpi.client.get("/v1/base/solicitudes-pre-policias/casos/" + str(response_idCaso) + 
  "/page?f=&p=0&tr=10", name="Policias de Investigacion")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  #Genera formato de Oficio de solicitud de investigación 
  time.sleep(10)
  print("FORMATO: OFICIO SOLICITUD DE INVESTIGACION")  
  response = Mpi.client.get("/v1/documentos/formatos/save/"+formatoPoliciaInvestId+"/F1_011", name="Policias de Investigacion Formato 1")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio de solicitud de investigación: \n' + 'Response status code: \n' + str(response.status_code) + 
    '\n' + 'Response content: \n' + str(response.content))
    f.close()
  #Genera formato de Oficio de solicitud de investigación sin apercibimiento
  time.sleep(10)
  print("FORMATO: OFICIO SOLICITUD DE INVESTIGACION SIN APERCIBIMIENTO")  
  response = Mpi.client.get("/v1/documentos/formatos/save/"+formatoPoliciaInvestId+"/F1_021", name="Policias de Investigacion Formato 2")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
    
  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio de solicitud de investigación sin apercibimiento: \n' + 'Response status code: \n' + str(response.status_code) + 
    '\n' + 'Response content: \n' + str(response.content))
    f.close()
  

  ##########################################################################################
  ### 12. Inserta Registro en la BD (Solicitudes preliminares a periciales - Periciales) ###
  ##########################################################################################

  print("Peticion para mostrar Solicitudes Preliminares a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes Preliminares a Perciales")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
 
  print("Peticion para mostrar Solicitudes Preliminares a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/base/predenuncias/casos/" + str(response_idCaso) + "/page", name="Solicitudes: Peticion para saber si cuenta con Predenunicia")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolPer = {
  "personas":[],
  "tipo": "Periciales",
  "noOficio": "312341234123",
  "directorInstituto": "Lic. Arnulfo Rodriguez Cano",
  "peritoMateria": {
    "id": 40
  },
  "finalidad": "Finalidad del requerimiento",
  "plazoDias": "3 dias",
  "apercibimiento": "Apercibimiento ",
  "observaciones": "Observaciones",
  "medicoLegista": None,
  "realizadoA": None,
  "tipoExamen": {
    "id": ""
  },
  "caso": {
    "id": response_idCaso
  }
  }

  json_again = json.dumps(jsonSolPer)
  print("Insertando Registro en la BD (Solicitudes preliminares a periciales - Periciales) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  jsonSolPer = Mpi.client.post("/v1/base/solicitudes-pre-pericial", data=json_again, name="Solicitudes: Peticion para Generar una Solicitud Preliminar a Perciales - Periciales")
  print ("Response status code:", jsonSolPer.status_code)
  print ("Response content:", jsonSolPer.content)
  Mpi.wait() 

  r_idSolPer = str(json.loads(jsonSolPer.text)['id'])

  print("Peticion para Abrir la Solicitud Preliminar a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/" + r_idSolPer, name="Solicitudes: Peticion para Abrir la Solicitud Preliminar a Perciales")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Solicitud a Servicios Periciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolPer + "/F1_009", name="Solicitudes: Peticion para Generar el Oficio Solicitud a Servicios Periciales")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + ' Oficio Solicitud a Servicios Periciales: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()
 
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Solicitud a Servicios Periciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Solicitud a Servicios Periciales")
    print ("Response status code:", response.status_code)
  
  

  ###########################################################################################
  ### 13. Inserta Registro en la BD (Solicitudes preliminares a periciales - Psicofisico) ###
  ###########################################################################################

  print("Peticion para mostrar Solicitudes Preliminares a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales - Psicofisico")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes Preliminares a Perciales - Psicofisico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
 
  print("Peticion para mostrar Solicitudes Preliminares a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales - Psicofisico")
  response = Mpi.client.get("/v1/base/predenuncias/casos/" + str(response_idCaso) + "/page", name="Solicitudes: Peticion para saber si cuenta con Predenunicia - Psicofisico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolPsic = {
  "personas":[],
  "tipo": "Psicofísico",
  "noOficio": "234524524",
  "directorInstituto": None,
  "peritoMateria": {
    "id": ""
  },
  "finalidad": None,
  "plazoDias": None,
  "apercibimiento": "Apercibimiento",
  "observaciones": "Observaciones",
  "medicoLegista": "Nombre del Medico legista",
  "realizadoA": "a quien se realizara el examen",
  "tipoExamen": {
    "id": 1
  },
  "caso": {
    "id": response_idCaso
  }
  }

  json_again = json.dumps(jsonSolPsic)
  print("Insertando Registro en la BD (Solicitudes preliminares a periciales - Psicofisico) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolPsic = Mpi.client.post("/v1/base/solicitudes-pre-pericial", data=json_again, name="Solicitudes: Peticion para Generar una Solicitud Preliminar a Perciales - Psicofisico")
  print ("Response status code:", r_SolPsic.status_code)
  print ("Response content:", r_SolPsic.content)
  Mpi.wait()

  r_idSolPsic = str(json.loads(r_SolPsic.text)['id'])

  print("Peticion para Abrir la Solicitud Preliminar a Perciales del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/" + r_idSolPsic, name="Solicitudes: Peticion para Abrir la Solicitud Preliminar a Perciales - Psicofisico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Solicitud Examen Psicofísico del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolPsic + "/F1_010", name="Solicitudes: Peticion para Generar el Oficio Solicitud Examen Psicofísico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Solicitud Examen Psicofísico: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()
  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print(response_contentType)
    print("Peticion para Abrir el Oficio Solicitud Examen Psicofísico del Caso #"+str(response_idCaso)+ " Solicitudes a Perciales - Psicofisico")
    response = Mpi.client.get("/v1/documentos/documento/" + str(response_uuidEcm) + "/" + str(response_contentType) + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Solicitud Examen Psicofísico")
    print ("Response status code:", response.status_code)
  
  

  ########################################################################################################
  ### 1X. Inserta Registro en la BD (Solicitudes y acuerdos generales - Asignación de asesor jurídico) ###
  ########################################################################################################

  print("Peticion para mostrar Solicitudes y acuerdos generales del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes y acuerdos generales del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
 
  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes y acuerdos generales")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolAcuAAJ = {
  "personas":[],
  "tipo": "Asignación de asesor jurídico",
  "fundamentoLegal": None,
  "contenidoAcuerdo": None,
  "finalidad": None,
  "apercibimiento": None,
  "plazo": None,
  "senialar": None,
  "observaciones": None,
  "noOficioAtencion": "3432432154",
  "autoridadAtencion": None,
  "cargoAdscripcionAtencion": None,
  "necesidades": None,
  "ubicacionAtencion": None,
  "ubicacionJuridico": "UBICACION DE LA UNIDAD INMEDIATA",
  "autoridadJuridico": "Nombre DE LA AUTORIDAD A QUIEN SE DIRIGE EL OFICIO",
  "cargoAdscripcionJuridico": "CARGO Y ADSCRIPCION DE LA AUTORIDAD ",
  "denunciaQuerella": {
    "id": 1
  },
  "victimaQuerellante": {
    "id": 2
  },
  "caso": {
    "id": response_idCaso
  }
  }

  json_again = json.dumps(jsonSolAcuAAJ)
  print("Insertando Registro en la BD (Solicitudes y acuerdos generales - Asignación de asesor jurídico) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolAcuAAJ = Mpi.client.post("/v1/base/solicitudes-pre-acuerdos", data=json_again, name="Solicitudes: Peticion para Generar una Solicitud de Asignación de Asesor jurídico")
  print ("Response status code:", r_SolAcuAAJ.status_code)
  print ("Response content:", r_SolAcuAAJ.content)
  Mpi.wait()

  r_idSolAcuAAJ = str(json.loads(r_SolAcuAAJ.text)['id'])

  print("Peticion para Abrir la Solicitud de Asignación de Asesor Jurídico del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-acuerdos/" + r_idSolAcuAAJ, name="Solicitudes: Peticion para Abrir la Solicitud de Asignación de Asesor Jurídico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Solicitud de Asesor Jurídico del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolAcuAAJ + "/F1_002", name="Solicitudes: Peticion para Generar el Oficio Solicitud de asesor jurídico")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Solicitud de Asesor Jurídico: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()

  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Solicitud de Asesor Jurídico del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/application-pdf/Formato", name="Solicitudes: Peticion para Abrir el Oficio Solicitud de asesor jurídico")
    print ("Response status code:", response.status_code)  

  ######################################################################################################
  ### 1X. Inserta Registro en la BD (Solicitudes y acuerdos generales - Ayuda y atención a víctimas) ###
  ######################################################################################################

  print("Peticion para mostrar Solicitudes y acuerdos generales del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-pericial/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes y acuerdos generales del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
 
  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes y acuerdos generales")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolAcuAAV = {
  "heredarSintesisHechos": False,
  "personas": [
    {
      "id": 31
    },
    {
      "id": 31
    }
  ],
  "tipo": "Ayuda y atención a víctimas",
  "fundamentoLegal": None,
  "contenidoAcuerdo": None,
  "finalidad": None,
  "apercibimiento": None,
  "plazo": None,
  "senialar": None,
  "observaciones": "Observaciones e incidencias ",
  "noOficioAtencion": "21",
  "autoridadAtencion": None,
  "cargoAdscripcionAtencion": "Agente de ministerio público",
  "necesidades": "necesidades que se ayudan a cubrir",
  "ubicacionAtencion": "ubicación que es inmediata",
  "ubicacionJuridico": None,
  "autoridadJuridico": "Juan Bernardo Ideth Martinez",
  "cargoAdscripcionJuridico": None,
  "denunciaQuerella": {
    "id": ""
  },
  "victimaQuerellante": {
    "id": ""
  },
  "caso": {
    "id": response_idCaso
  }
  }

  json_again = json.dumps(jsonSolAcuAAV)
  print("Insertando Registro en la BD (Solicitudes y acuerdos generales - Ayuda y atención a víctimas) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolAcuAAV = Mpi.client.post("/v1/base/solicitudes-pre-acuerdos", data=json_again, name="Solicitudes: Peticion para Generar una Solicitud de Ayuda y atención a víctimas")
  print ("Response status code:", r_SolAcuAAV.status_code)
  print ("Response content:", r_SolAcuAAV.content)
  Mpi.wait()

  r_idSolAcuAAV = str(json.loads(r_SolAcuAAV.text)['id'])

  print("Peticion para Abrir la Solicitud de Ayuda y atención a víctimas del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/base/solicitudes-pre-acuerdos/" + r_idSolAcuAAV, name="Solicitudes: Peticion para Abrir la Solicitud de Ayuda y atención a víctimas")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio de ayuda a atencion a la victima del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolAcuAAV + "/F1_001", name="Solicitudes: Peticion para Generar el Oficio de ayuda a atencion a la victima")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio de ayuda a atencion a la victima: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()
  
  
  time.sleep(5)
  if response.status_code != 500 :
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio de ayuda a atencion a la victima del Caso #"+str(response_idCaso)+ " Solicitudes y acuerdos generales")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/application-pdf/Formato", name="Solicitudes: Peticion para Abrir el Oficio de ayuda a atencion a la victima")
    print ("Response status code:", response.status_code)
  

  ######################################################################################################
  ### 1X. Inserta Registro en la BD (Solicitudes: Registro general - Acuerdo General) ###
  ######################################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes de registro general")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes de Registro General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion para mostrar Solicitudes de Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de Registro General del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolRegGralAG = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "tipo": "Acuerdo general",
  "contenidoConstancia": "",
  "noTelefonico": "",
  "atencionLlamada": "",
  "observaciones": "Observaciones",
  "fundamentoLegal": "Fundamento Legal",
  "contenidoAcuerdo": "Contenido del Acuerdo",
  "finalidad": "Con la Finalidad de ",
  "plazo": "3 dias",
  "apercibimiento": "Apercibimiento",
  "senialar": "señalar que se solicita"
  }

  json_again = json.dumps(jsonSolRegGralAG)
  print("Insertando Registro en la BD (Solicitudes de Registro General - Acuerdo General) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolRegGralAG = Mpi.client.post("/v1/base/solicitudes-pre-registros", data=json_again, name="Solicitudes: Peticion para Generar una Solicitudes de Acuerdo General")
  print ("Response status code:", r_SolRegGralAG.status_code)
  print ("Response content:", r_SolRegGralAG.content)
  Mpi.wait()

  r_idSolRegGralAG = str(json.loads(r_SolRegGralAG.text)['id'])

  print("Peticion para Abrir la Solicitudes de Acuerdo General #"+str(response_idCaso)+ " Solicitudes de Registro General - Acuerdo General")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/" + r_idSolRegGralAG, name="Solicitudes: Peticion para Abrir la Solicitud de Acuerdo General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Acuerdo General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General - Acuerdo General")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolRegGralAG + "/F1_006", name="Solicitudes: Peticion para Generar el Oficio Acuerdo General del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio acuerdo General: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()

  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Acuerdo General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General - Acuerdo General")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Acuerdo General del Caso")
    print ("Response status code:", response.status_code)
  
  #print ("Response content:", response.content)

#################################################################################################################################################
### 1X. Inserta Registro en la BD (Solicitudes: Registro general - Registro de llamada para permitir al imputado comunicarse con su defensor) ###
#################################################################################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes de registro general")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes de Registro General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion para mostrar Solicitudes de Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de Registro General del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolRegLlamada = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "tipo": "Registro de llamada",
  "contenidoConstancia": "",
  "noTelefonico": "2281543383",
  "atencionLlamada": "Nombre de la Persona que atiende la llamada ",
  "observaciones": "Observaciones",
  "fundamentoLegal": "",
  "contenidoAcuerdo": "",
  "finalidad": "",
  "plazo": "",
  "apercibimiento": "",
  "senialar": ""
  }

  json_again = json.dumps(jsonSolRegLlamada)
  print("Insertando Registro en la BD (Solicitudes de Registro General - Registro de llamada para permitir al imputado comunicarse con su defensor) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolRegGraLlamda = Mpi.client.post("/v1/base/solicitudes-pre-registros", data=json_again, name="Solicitudes: Peticion para Generar una Solicitudes de Registro de llamada para permitir al imputado comunicarse con su defensor")
  print ("Response status code:", r_SolRegGraLlamda.status_code)
  print ("Response content:", r_SolRegGraLlamda.content)
  Mpi.wait()

  r_idSolRegGraLlamada = str(json.loads(r_SolRegGraLlamda.text)['id'])

  print("Peticion para Abrir la Solicitudes de Acuerdo General #"+str(response_idCaso)+ " Solicitudes de Registro General - Registro de llamada para permitir al imputado comunicarse con su defensor")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/" + r_idSolRegGraLlamada, name="Solicitudes: Peticion para Abrir la Solicitud de Registro de llamada para permitir al imputado comunicarse con su defensor")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Registro de llamada para permitir al imputado comunicarse con su defensor del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General - Registro de llamada para permitir al imputado comunicarse con su defensor")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolRegGraLlamada + "/F2_063", name="Solicitudes: Peticion para Generar el Oficio Registro de llamada para permitir al imputado comunicarse con su defensor del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content) 

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Registro de llamada para permitir al imputado comunicarse con su defensor: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close() 

  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Registro de llamada para permitir al imputado comunicarse con su defensor del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General - Registro de llamada para permitir al imputado comunicarse con su defensor")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Registro de llamada para permitir al imputado comunicarse con su defensor del Caso")
    print ("Response status code:", response.status_code)    

  #print ("Response content:", response.content)


########################################################################################
### 1X. Inserta Registro en la BD (Solicitudes: Registro General)                    ###
########################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes de registro general")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes de Registro General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion para mostrar Solicitudes de Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de Registro General del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolRegGral = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "tipo": "Registro general",
  "contenidoConstancia": "Contenido de la constancia ",
  "noTelefonico": "",
  "atencionLlamada": "",
  "observaciones": "",
  "fundamentoLegal": "",
  "contenidoAcuerdo": "",
  "finalidad": "",
  "plazo": "",
  "apercibimiento": "",
  "senialar": ""
  }

  json_again = json.dumps(jsonSolRegGral)
  print("Insertando Registro en la BD (Solicitudes de Registro General - Registro General) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolRegGral = Mpi.client.post("/v1/base/solicitudes-pre-registros", data=json_again, name="Solicitudes: Peticion para Generar una Solicitudes de Registro General")
  print ("Response status code:", r_SolRegGral.status_code)
  print ("Response content:", r_SolRegGral.content)
  Mpi.wait()

  r_idSolRegGral = str(json.loads(r_SolRegGral.text)['id'])

  print("Peticion para Abrir la Solicitudes de Acuerdo General del caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
  response = Mpi.client.get("/v1/base/solicitudes-pre-registros/" + r_idSolRegGral, name="Solicitudes: Peticion para Abrir la Solicitud de Registro General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Registro general del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolRegGral + "/F1_017", name="Solicitudes: Peticion para Generar el Oficio Registro General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Registro general: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close() 

  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de Registro General")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Registro General del Caso")
    print ("Response status code:", response.status_code)
  
########################################################################################
### 1X. Inserta Registro en la BD (Solicitudes: Inspección)                          ###
########################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes de inspección")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes de inspección")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  print("Peticion para mostrar Solicitudes de Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de inspección")
  response = Mpi.client.get("/v1/base/solicitudes-pre-inspecciones/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de inspección")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolInsp = {
  "caso": {
    "id": response_idCaso
  },
  "personas":[],
  "fechaHoraInspeccion": "2018-1-7 13:16:00.000",
  "adscripcion": "Adscripcion",
  "descripcion": "Descripcion"
}

  json_again = json.dumps(jsonSolInsp)
  print("Insertando Registro en la BD (Solicitudes de Inspección) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolInsp = Mpi.client.post("/v1/base/solicitudes-pre-inspecciones", data=json_again, name="Solicitudes: Peticion para Generar una Solicitudes de Inspección")
  print ("Response status code:", r_SolInsp.status_code)
  print ("Response content:", r_SolInsp.content)
  Mpi.wait()

  r_idSolInsp = str(json.loads(r_SolInsp.text)['id'])

  print("Peticion para Abrir la Solicitudes de Inspección del caso #"+str(response_idCaso)+ " Solicitudes de Inspección")
  response = Mpi.client.get("/v1/base/solicitudes-pre-inspecciones/" + r_idSolInsp, name="Solicitudes: Peticion para Abrir la Solicitud de Inspección")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Inspección General #"+str(response_idCaso)+ " Solicitudes de Inspección")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolInsp + "/F1_018", name="Solicitudes: Peticion para Generar el Oficio Inspección General")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  
  
  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Inspección General: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()
  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Inspección General del Caso #"+str(response_idCaso)+ " Solicitudes de Inspección")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Inspección General del Caso")
    print ("Response status code:", response.status_code)
  
  

########################################################################################
### 1X. Inserta Registro en la BD (Solicitudes: Requerimiento de información)        ###
########################################################################################

  print("Peticion para consultar datos del Caso #"+str(response_idCaso)+ ": Solicitudes de Requerimiento de información")
  response = Mpi.client.get("/v1/base/casos/" + str(response_idCaso), name="Solicitudes: Peticion para consultar datos del Caso - Solicitudes de Requerimiento de información")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  print("Peticion para mostrar Solicitudes de Registro General del Caso #"+str(response_idCaso)+ " Solicitudes de inspección")
  response = Mpi.client.get("/v1/base/solicitudes-pre-info/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de requerimiento de informacion")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  time.sleep(3)
  jsonSolReqInf = {
  "personas":[],
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

  json_again = json.dumps(jsonSolReqInf)
  print("Insertando Registro en la BD (Solicitudes de Requerimiento de información) en Caso #" +str(response_idCaso))
  Mpi.client.headers['Content-Type'] = "application/json"
  r_SolReqInf = Mpi.client.post("/v1/base/solicitudes-pre-info", data=json_again, name="Solicitudes: Peticion para Generar una Solicitud de Requerimiento de información")
  print ("Response status code:", r_SolReqInf.status_code)
  print ("Response content:", r_SolReqInf.content)
  Mpi.wait()

  r_idSolReqInf = str(json.loads(r_SolReqInf.text)['id'])

  print("Peticion para Abrir la Solicitudes de Requerimiento de información del caso #"+str(response_idCaso)+ " Solicitudes de Requerimiento de información")
  response = Mpi.client.get("/v1/base/solicitudes-pre-info/casos/" + str(response_idCaso) + "/page?f=&p=0&tr=10", name="Solicitudes: Peticion para mostrar las Solicitudes de requerimiento de informacion")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(10)
  print("Peticion para Generar el Oficio Solicitud de requerimiento de información #"+str(response_idCaso)+ " Solicitudes de Requerimiento de información")
  response = Mpi.client.get("/v1/documentos/formatos/save/" + r_idSolReqInf + "/F2_039", name="Solicitudes: Peticion para Generar el Oficio Solicitud de requerimiento de información")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)  

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Oficio Solicitud de requerimiento de información: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()
  
  buscar = "application/" 
  reemplazar_por = "application-" 

  time.sleep(5)
  if response.status_code != 500:
    response_contentType = str(json.loads(response.text)['contentType']).replace(buscar, reemplazar_por)
    response_uuidEcm = str(json.loads(response.text)['uuidEcm'])
    print("Peticion para Abrir el Oficio Solicitud de requerimiento de información del Caso #"+str(response_idCaso)+ " Solicitudes de Requerimiento de información")
    response = Mpi.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Formato", name="Solicitudes: Peticion para Abrir el Oficio Solicitud de requerimiento de información del Caso")
    print ("Response status code:", response.status_code)