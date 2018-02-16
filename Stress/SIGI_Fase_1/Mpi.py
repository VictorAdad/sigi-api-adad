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

#subclases de mpi
import MpiConclusiones
import Mpi_Acuerdos_Entrevistas
import MpiSolicitudPre
#Cambia la codificación a utf8
reload(sys)
sys.setdefaultencoding('utf8')

#borrar archivos de errores
f = open('error.txt', 'w')
f.write('')
f.close()

url = variables.url #cambiar formato de url si es necesario (agregar / o cadena vacia)
host = variables.host

r_accToken = ""


nombres     = variables.nombres
paternos    = variables.paternos
maternos    = variables.maternos
sexos       = variables.sexos
documentos  = variables.documentos
fecha       = variables.fechaRegistro

def login(self):
  print("Login")
  print("Locust instance (%r) executing my_task" % (self.locust))
  payload = { "grant_type":"PASSWORD","username":"mpi","password":"secret","scope":"AttributesOUD.attrs"}
  self.client.headers['Content-Type'] = "application/x-www-form-urlencoded"
  self.client.headers['Charset'] = "UTF-8"
  self.client.headers['Authorization'] = "Basic b2F1dGhzaWdpY2xpZW50OmZjODFmZGFmNjlhYjQ4NjZhMmZjODU3NWMwZGIwYmQ2"
  self.client.headers['X-OAUTH-IDENTITY-DOMAIN-NAME'] = "OAuthSIGIDomain"
  response = self.client.post("http://10.0.30.12/oauth2/rest/token", payload , catch_response=True)
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  global r_accToken
  r_accToken = str(json.loads(response.text)['access_token'])
  
  '''
  print("Login - Obtiene Datos de Usuario")
  print("Locust instance (%r) executing my_task" % (self.locust))
  r_User = self.client.get("http://10.0.30.12/oauth2/rest/token/info?access_token=" + str(r_accToken), name="Datos de Usuario")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)
  '''
def index(self):
  time.sleep(5)
  print("Entra a Index")
  response2=self.client.get(url, name="Index")
  print("Response status code:", response2.status_code)
  print("Response content:", response2.content)


##################################################################
### Inicia Carga de Catalogos al Cargar SIGI.                  ###


def getCatPais(self):
  print("Inicia Cat Pais")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/pais/options", name="Cat Pais")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersSexo(self):
  print("Inicia Cat Sexo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/sexo/options", name="Cat Sexo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersEsc(self):
  print("Inicia Cat Escolaridad")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/escolaridad/options", name="Cat Escolaridad")
  print "Response status code:", response.status_code
  print "Response content:", response.content

def getCatPersOcup(self):
  print("Inicia Cat Ocupacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/ocupacion/options", name="Cat Ocupacion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersEstCiv(self):
  print("Inicia Cat EstadoCivil")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/estado-civil/options", name="Cat EstadoCivil")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersIdiom(self):
  print("Inicia Cat Idioma")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/idioma/options", name="Cat Idioma")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersGrupEtn(self):
  print("Inicia Cat GrupoEtnico")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/grupo-etnico/options", name="Cat GrupoEtnico")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

def getCatPersInterp(self):
  print("Inicia Cat Interprete")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/interprete/options", name="Cat Interprete")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)



### Fin Catalogos.                                             ###
##################################################################


##################################################################
### Carga Pagina Principal, muestra todos los Casos Registrados ##
##################################################################

def getCasos(self):
  print("Muestra Casos")
  print ("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/base/casos/titulares/mpi/page", name="Ricibe Casos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)


##################################################################
### Carga Formulario para Registrar Nuevo Caso.                 ##
##################################################################


def getFormNuevoCaso(self):
  print("Abre Formulario Nuevo Caso")
  response = self.client.get("/noticia-hecho/datos-generales", name="Formulario Nuevo Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

##################################################################
### *************** REGISTRO DE UN NUEVO CASO ***************** ##
##################################################################

def getCreaNuevoCaso(self):
##################################################################
### 1. Busca un delito                                         ###
##################################################################
  print("Busca el Delito Principal")
  response = self.client.get("/v1/catalogos/delitos/search?name=violencia", name="Nuevo Caso: Busqueda de Delito Principal")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

##################################################################
### 3. Inserta Registro en la BD (Nuevo Caso).                 ###
##################################################################
  
  time.sleep(3)
  print("Login - Obtiene Datos de Usuario")
  print("Locust instance (%r) executing my_task" % (self.locust))
  r_User = self.client.get("http://10.0.30.12/oauth2/rest/token/info?access_token=" + str(r_accToken), name="Login - Obtiene Datos de Usuario")
  print("Response status code:", r_User.status_code)
  print("Response content:", r_User.content)
  self.wait()

  nic = str(json.loads(r_User.text)['fiscaliaAcronimo'])+"/"+str(json.loads(r_User.text)['agenciaAcronimo'])+"/"+str(json.loads(r_User.text)['Turno'])+"/"+str(json.loads(r_User.text)['sub'])+"/240/NICID/"+str(time.strftime("%y"))+"/"+str(time.strftime("%m"))
  time.sleep(3)
  jsonNCaso = {
  "titulo": "Robo de Tractor",
  "descripcion": "Robo con Violencia - Armas",
  "delito": "ROBO CON VIOLENCIA",
  "titulares": [
    {
      "fechaAsignacion": "2018-01-2T22:43:57.753Z",
      "userNamePropietario": "mpi",
      "userNameAsignado": "mpi",
      "vigente": True
    }
  ],
  "name": "NIC:   -  NUC: ",
  "delitoCaso": {
    "delito": {
      "id": 240
    }
  },
  "nic": nic,
  "created": None
  }

  json_again = json.dumps(jsonNCaso)
  print(json_again)
  print("Insertando Registro en la BD (Nuevo Caso)")
  self.client.headers['Content-Type'] = "application/json"
  responseNCaso = self.client.post("/v1/base/casos", data=json_again, name="Nuevo Caso - Noticia de Hecho - Datos Generales: Registro en BD")
  print ("Response status code:", responseNCaso.status_code)
  print ("Response content:", responseNCaso.content)
  response_idCaso = json.loads(responseNCaso.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  self.wait()


#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************
  print("Carga Nuevo Caso "+str(response_idCaso)+ " Noticia de Hecho - Datos Generales")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Nuevo Caso: Carga Nuevo Caso Registrado")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Nuevo Caso "+str(response_idCaso)+ " Noticia de Hecho - Datos Generales - ALL")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Nuevo Caso: Carga Nuevo Caso Registrado - ALL")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Nuevo Caso "+str(response_idCaso)+ " Noticia de Hecho - Datos Generales")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Nuevo Caso: Carga Nuevo Caso Registrado")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  self.wait()

  print("Sincronizacion de Catalogs")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Nuevo Caso: Carga Nuevo Caso Registrado")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)


##################################################################
### Inicia Registro de Personas                                ###
##################################################################

#Carga pagina de personas registradas en el Caso
  print("Carga Nuevo Caso "+str(response_idCaso)+ " Noticia de Hecho - Personas")
  response = self.client.get("/v1/base/personas-casos/casos/" + str(response_idCaso) + "/page", name="Nuevo Caso/Registro PersonaF-Victima: Carga Personas")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  self.wait()

#Inicia Sincronizacion y Carga de Catalogos para Registrar persona
  print("Sincronizacion Catalogos")
  response =  self.client.get("/v1/catalogos/sincronizacion", name="Nuevo Caso/Registro PersonaF-Victima: Sincronizacion Catalogos")

  print("Inicia Cat Pais")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/pais/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Pais")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Sexo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/sexo/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Sexo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Escolaridad")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/escolaridad/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Escolaridad")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Ocupacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/ocupacion/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Ocupacion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat EstadoCivil")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/estado-civil/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat EstadoCivil")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat GrupoEtnico")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/grupo-etnico/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat GrupoEtnico")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Interprete")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/interprete/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Interprete")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Adiccion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/adiccion/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Adiccion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Inicia Cat Tipo-domicilio")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipo-domicilio/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Tipo-domicilio")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)    

  print("Inicia Cat Tipo-intervinientes")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipos-intervinientes/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Tipo-intervinientes")
                             
  print("Response status code:", response.status_code)
  print("Response content:", response.content)   

  print("Inicia Cat Alfabetismo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/alfabetismo/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Alfabetismo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Inicia Cat Perito-materia")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/perito-materia/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Perito-materia")
  print("Response status code:", response.status_code)
  print("Response content:", response.content) 

  print("Inicia Cat Tipo-examen")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/tipo-examen/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Tipo-examen")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Denuncia-querella")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/denuncia-querella/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Denuncia-querella")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Victima-querellante")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/victima-querellante/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Victima-querellante")
  print("Response status code", response.status_code)
  print("Response content:", response.content)

  print("Inicia Cat Tipo-persona")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-persona/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Tipo-persona")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Inicia Cat Tipo-linea")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-linea/options", name="Nuevo Caso/Registro PersonaF-Victima: Cat Tipo-linea")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

#Fin Sincronizacion y Carga de Catalogos para Registrar persona

#Carga Valor de Selects en Catalogos Pais y Estado para Datos de Nacimiento
  print("Carga Valor Cat Pais - Datos de Nacimiento")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Nacimiento: Carga Valor Cat Pais")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

  print("Carga Valor Cat Estado - Datos de Nacimiento")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/municipio/estado/16/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Nacimiento: Carga Valor Cat Estado")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

#Carga Valor de Selects en catalogos Pais, Estado, Colonia y Localidad para Datos de Localizacion 
  print("Carga Valor Cat Pais - Datos de Localizacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Localizacion: Carga Valor Cat Pais")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

  print("Carga Valor Cat Estado - Datos de Localizacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/municipio/estado/16/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Localizacion: Carga Valor Cat Estado")
  print("Response status code", response.status_code)
  print("Response content:", response.content)

  print("Carga Valor Cat Colonia - Datos de Localizacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/colonia/municipio/108/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Localizacion: Carga Valor Cat Colonia")
  print("Response status code", response.status_code)
  print("Response content:", response.content)

  print("Carga Valor Cat Localidad - Datos de Localizacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/localidad/municipio/108/options", name="Nuevo Caso/Registro PersonaF-Victima/Datos de Localizacion: Carga Valor Cat Localidad")
  print("Response status code", response.status_code)
  print("Response content:", response.content)
  #assert response.status_code != 200, "Código de respuesta inesperado: " + str(response.status_code)

##################################################################
### 4. Inserta Registro en la BD (Persona - Fisica - Victima)  ###
##################################################################

  # Consulta Opciones de comunicación para el recurso de destino 
  """ SE COMENTA, PETICION NO APLICA
  print("Opciones de comunicacion para el recurso de destino")
  response = self.client.options("/v1/base/personas", name="Nuevo Caso/Registro PersonaF-Victima: Consulta Opciones de comunicacion para el recurso de destino")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  """
  time.sleep(3)
  jsonPF_V = {
  "id": "",
  "tipoPersona": "Física",
  "nombre": "ULISES",
  "paterno": "MORALES",
  "materno": "MARTINEZ",
  "fechaNacimiento": "1997-12-20T18:49:44.151Z",
  "curp": "AABS840102MDGBTR04",
  "rfc": "HEMJ9701015N5",
  "numHijos": "1",
  "lugarTrabajo": "OFICINA",
  "ingresoMensual": "10000",
  "detenido": "",
  "nacionalidad": "Argentina",
  "nacionalidadReligion": {
    "id": 33
  },
  "religion": "CATÓLICO",
  "hablaEspaniol": "NO APLICA",
  "familiaLinguistica": "ALGONQUINA",
  "lenguaIndigena": "NO",
  "identificacion": "CARTILLA SERVICIO MILITAR",
  "idiomaIdentificacion": {
    "id": 722
  },
  "autoridadEmisora": "Cuartel de alta lucero",
  "folioIdentificacion": "123345",
  "localizacionPersona": [
    {
      "id": None,
      "pais": {
        "id": 143,
        "nombre": "MÉXICO"
      },
      "estado": {
        "id": 2,
        "nombre": "BAJA CALIFORNIA"
      },
      "municipio": {
        "id": 14,
        "nombre": "MEXICALI"
      },
      "colonia": {
        "id": None,
        "idCp": None,
        "nombre": None
      },
      "localidad": {
        "id": None,
        "nombre": None
      },
      "tipoDomicilio": {
        "id": 6,
        "nombre": "LUGAR DE TRABAJO"
      },
      "calle": "Octavio paz",
      "noExterior": "600",
      "noInterior": "23",
      "cp": "91002",
      "referencias": "Referencias",
      "telParticular": "1234567890",
      "telTrabajo": "1234567890",
      "extension": "12345",
      "telMovil": "1234567890",
      "fax": "1234567890",
      "otroMedioContacto": "CORREO",
      "correo": "rev@gmail.com",
      "tipoRecidencia": "Residencia habitual"
    }
  ],
  "mediaFiliacion": {
    "id": "",
    "orejaDerecha": {
      "id": 73715
    },
    "orejaIzquierda": {
      "id": 73715
    },
    "complexionPielSangre": {
      "id": 252
    },
    "caraNariz": {
      "id": 3840
    },
    "frenteMenton": {
      "id": 1753
    },
    "cejaBoca": {
      "id": 3451
    },
    "cabello": {
      "id": 1121
    },
    "labioOjo": {
      "id": 4755
    },
    "usaAnteojos": False,
    "cicatrices": "",
    "tatuajes": "",
    "lunares": "",
    "disminucionesFisicas": "",
    "protesis": "",
    "otras": "",
    "estatura": "",
    "peso": ""
  },
  "sexo": {
    "id": 1
  },
  "pais": {
    "id": 143
  },
  "estado": {
    "id": 1
  },
  "estadoNacimientoOtro": "",
  "municipio": {
    "id": 1
  },
  "escolaridad": {
    "id": 6
  },
  "ocupacion": {
    "id": 16
  },
  "grupoEtnico": {
    "id": 62
  },
  "alfabetismo": {
    "id": 4
  },
  "interprete": {
    "id": 4
  },
  "adiccion": {
    "id": 7
  },
  "estadoCivil": {
    "id": 1
  },
  "personaCaso": [
    {
      "id": None,
      "fechaDetencion": None,
      "fechaDeclaracion": None,
      "horaDetencion": "",
      "tipoDetenido": {
        "id": "",
        "tipoDetencion": "",
        "tipoReincidencia": "",
        "cereso": ""
      },
      "caso": {
        "id": response_idCaso
      },
      "tipoInterviniente": {
        "id": "9"
      },
      "detenido": False
    }
  ],
  "aliasNombrePersona": [],
  "edad": 20
}

  #print("Json String dummy:: : %s " % myJson)

  # python_struct = json.loads(myJson)
  json_again = json.dumps(jsonPF_V)
  # print("Datos a enviar: %s" % python_struct)
  print("Insertando Registro en la BD (Persona - Fisica - Victima) en Caso #" +str(response_idCaso))
  #print("Json to send %s/v1/base/personas :: : %s " % (host, json_again))
  self.client.headers['Content-Type'] = "application/json"
  responsePF_V = self.client.post("/v1/base/personas", data=json_again, name="Nuevo Caso/PersonaF-Victima: Registro en BD")
  print ("Response status code:", responsePF_V.status_code)
  print ("Response content:", responsePF_V.content)
  #assert response.status_code != 201, "Código de respuesta inesperado: " + str(response.status_code)
  #responseP_id = json.loads(responseP.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  self.wait()

  #Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************

  print("Carga Personas del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Personas")
  response = self.client.get("/v1/base/personas-casos/casos/" + str(response_idCaso) + "/page", name="Personas: Carga Todas las Personas del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

##################################################################
### 5. Inserta Registro en la BD (Persona - Fisica - Imputado) ###
##################################################################
  time.sleep(3)
  jsonPF_I = {
  "id": "",
  "tipoPersona": "Física",
  "nombre": "SARA ALICIA",
  "paterno": "BOTELLO",
  "materno": "RIOS",
  "fechaNacimiento": "1993-01-01T06:00:00.000Z",
  "curp": "AABS840102MDGBTR04",
  "rfc": "HEMJ9701015N5",
  "numHijos": "2",
  "lugarTrabajo": "CASA",
  "ingresoMensual": "8000",
  "detenido": True,
  "nacionalidad": "Anguila",
  "nacionalidadReligion": {
    "id": 1
  },
  "religion": "CATÓLICO",
  "hablaEspaniol": "HABLA ESPAÑOL",
  "familiaLinguistica": "ALGONQUINA",
  "lenguaIndigena": "SI",
  "identificacion": "ACTA DE NACIMIENTO",
  "idiomaIdentificacion": {
    "id": 433
  },
  "autoridadEmisora": "REGISTRO CIVIL",
  "folioIdentificacion": "23134123",
  "localizacionPersona": [
    {
      "id": None,
      "pais": {
        "id": 143
      },
      "estado": {
        "id": 30
      },
      "municipio": {
        "id": 2113
      },
      "colonia": {
        "id": None,
        "idCp": None
      },
      "localidad": {
        "id": None
      },
      "tipoDomicilio": {
        "id": 6
      },
      "calle": "CALLE 3",
      "noExterior": "133",
      "noInterior": "331",
      "cp": "91184",
      "referencias": "ESQUINA CAXA",
      "telParticular": "2281543383",
      "telTrabajo": "2281543383",
      "extension": "22815",
      "telMovil": "2281543383",
      "fax": "2281543383",
      "otroMedioContacto": "REDES SOCIALES",
      "correo": "correo@correo.com",
      "tipoRecidencia": "Domicilio procesal"
    }
  ],
  "mediaFiliacion": {
    "id": "",
    "orejaDerecha": {
      "id": 118225
    },
    "orejaIzquierda": {
      "id": 85178
    },
    "complexionPielSangre": {
      "id": 34
    },
    "caraNariz": {
      "id": 1072
    },
    "frenteMenton": {
      "id": 56
    },
    "cejaBoca": {
      "id": 1750
    },
    "cabello": {
      "id": 553
    },
    "labioOjo": {
      "id": 2394
    },
    "usaAnteojos": True,
    "cicatrices": "Cicatrices",
    "tatuajes": "tatuajes",
    "lunares": "lunares",
    "disminucionesFisicas": "disminuciones fisicas",
    "protesis": "protesis",
    "otras": "otras",
    "estatura": "1.80",
    "peso": "90"
  },
  "sexo": {
    "id": 2
  },
  "pais": {
    "id": 143
  },
  "estado": {
    "id": 9
  },
  "municipio": {
    "id": 274
  },
  "escolaridad": {
    "id": 7
  },
  "ocupacion": {
    "id": 8
  },
  "grupoEtnico": {
    "id": 23
  },
  "alfabetismo": {
    "id": 1
  },
  "interprete": {
    "id": 2
  },
  "adiccion": {
    "id": 7
  },
  "estadoCivil": {
    "id": 2
  },
  "personaCaso": [
    {
      "caso": {
        "id": response_idCaso
      },
      "tipoInterviniente": {
        "id": "5"
      },
      "detalleDetenido": {
        "id": None,
        "fechaDetencion": "2018-1-1 11:30:00.000",
        "fechaDeclaracion": "2018-01-01T17:48:04.856Z",
        "horaDetenido": "11:30",
        "tipoDetenido": {
          "id": 135,
          "tipoDetencion": "FLAGRANCIA",
          "tipoReincidencia": "DELINCUENTE HABITUAL",
          "cereso": "DE BARRIENTOS"
        }
      },
      "detenido": True
    }
  ],
  "aliasNombrePersona": [
    {
      "nombre": "LOLA",
      "tipo": "Alias",
      "id": None
    },
    {
      "nombre": "BETY",
      "tipo": "Otro",
      "id": None
    }
  ],
  "edad": 21
}

  json_again = json.dumps(jsonPF_I)
  print("Insertando Registro en la BD (Persona - Fisica - Imputado) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responsePF_I = self.client.post("/v1/base/personas", data=json_again, name="Nuevo Caso/PersonaF-Imputado: Registro en BD")
  print ("Response status code:", responsePF_I.status_code)
  print ("Response content:", responsePF_I.content)
  self.wait()

#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************

  print("Carga Personas del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Personas")
  response = self.client.get("/v1/base/personas-casos/casos/" + str(response_idCaso) + "/page", name="Personas: Carga Todas las Personas del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)


##################################################################
### 5. Inserta Registro en la BD (Delitos)                     ###
##################################################################  

  print("Carga Delitos del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Delitos")
  response = self.client.get("/v1/base/delitos-casos/casos/" + str(response_idCaso) + "/page", name="Delitos: Carga Todos los Delitos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Busca Delito a Agregar")
  response = self.client.get("/v1/catalogos/delitos/search?name=auto", name="Delitos: Busqueda Delito a Agregar")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(3)
  jsonDelitos = {
  "caso": {
    "id": response_idCaso
  },
  "delito": {
    "id": 2
  },
  "principal": False
}
  json_again = json.dumps(jsonDelitos)
  print("Insertando Registro en la BD (Delitos) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responseDelitos = self.client.post("/v1/base/delitos-casos", data=json_again, name="Delitos: Registro en BD")
  print ("Response status code:", responseDelitos.status_code)
  print ("Response content:", responseDelitos.content)
  self.wait()


#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************

  print("Carga Personas del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Delitos")
  response = self.client.get("/v1/base/delitos-casos/casos/" + str(response_idCaso) + "/page", name="Delitos: Carga Todos los Delitos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)


##################################################################
### 6. Inserta Registro en la BD (Lugares)                     ###
##################################################################

  print("Carga Lugares del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Lugares")
  response = self.client.get("/v1/base/lugares/casos/" + str(response_idCaso) + "/page", name="Lugares: Carga Todos los Lugares del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)


#Inicia Sincronizacion y Carga de Catalogos para Registrar Lugar

  print("Lugares: Inicia Cat Pais")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/pais/options", name="Lugares: Sincronizacion Cat Pais")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Sexo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/sexo/options", name="Lugares: Sincronizacion Cat Sexo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Escolaridad")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/escolaridad/options", name="Lugares: Sincronizacion Cat Escolaridad")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Ocupacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/ocupacion/options", name="Lugares: Sincronizacion Cat Ocupacion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat EstadoCivil")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/estado-civil/options", name="Lugares: Sincronizacion Cat EstadoCivil")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat GrupoEtnico")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/grupo-etnico/options", name="Lugares: Sincronizacion Cat GrupoEtnico")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Interprete")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/interprete/options", name="Lugares: Sincronizacion Cat Interprete")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Adiccion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/adiccion/options", name="Lugares: Sincronizacion Cat Adiccion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Lugares: Inicia Cat Tipo-domicilio")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipo-domicilio/options", name="Lugares: Sincronizacion Cat Tipo-domicilio")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)    

  print("Lugares: Inicia Cat Tipo-intervinientes")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipos-intervinientes/options", name="Lugares: Sincronizacion Cat Tipo-intervinientes")                           
  print("Response status code:", response.status_code)
  print("Response content:", response.content)   

  print("Lugares: Inicia Cat Alfabetismo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/alfabetismo/options", name="Lugares: Sincronizacion Cat Alfabetismo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Lugares: Inicia Cat Perito-materia")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/perito-materia/options", name="Lugares: Sincronizacion Cat Perito-materia")
  print("Response status code:", response.status_code)
  print("Response content:", response.content) 

  print("Lugares: Inicia Cat Tipo-examen")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/tipo-examen/options", name="Lugares: Sincronizacion Cat Tipo-examen")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Denuncia-querella")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/denuncia-querella/options", name="Lugares: Sincronizacion Cat Denuncia-querella")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Victima-querellante")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/victima-querellante/options", name="Lugares: Sincronizacion Cat Victima-querellante")
  print("Response status code", response.status_code)
  print("Response content:", response.content)

  print("Lugares: Inicia Cat Tipo-persona")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-persona/options", name="Lugares: Sincronizacion Cat Tipo-persona")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Lugares: Inicia Cat Tipo-linea")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-linea/options", name="Lugares: Sincronizacion Cat Tipo-linea")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

#Fin Sincronizacion y Carga de Catalogos para Registrar Lugar

#Carga Valor de Selects en Catalogos Estado, Municipio y Colonia para Registrar Lugar


  print("Lugare: Carga Valor Cat Estado")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Lugares: Carga Valor Cat Estado")
  print("Response status code", response.status_code) 
  print("Response content:", response.content) 
  '''
  print("Lugares: Carga Valor Cat Municipio")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/municipio/estado/16/options", name="Lugares: Carga Valor Cat Municipio")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

  print("Lugares: Carga Valor Cat Colonia")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/colonia/municipio/108/options", name="Lugares: Carga Valor Cat Colonia")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 
  '''
  time.sleep(3)
  jsonLugDifMX = {
  "id": "",
  "tipo": "LUGAR DE HALLAZGO",
  "tipoZona": "APOSENTO",
  "calle": "Calle 2",
  "referencias": "ESQUINA CON AV. AVILA CAMACHO",
  "estadoOtro": "Estado",
  "municipioOtro": "Municipio",
  "coloniaOtro": "Colonia",
  "fecha": "2018-1-1 12:0:00.000",
  "hora": "12:00",
  "cp": "91017",
  "dia": "JUEVES",
  "descripcionLugar": "REFERENCIAS GEOGRAFICAS 123",
  "detalleLugar": {
    "id": 2
  },
  "pais": {
    "id": 1
  },
  "caso": {
    "id": response_idCaso
  },
  "latitud": "21.85984900",
  "longitud": "-102.25110090"
}

  json_again = json.dumps(jsonLugDifMX)
  print("Insertando Registro en la BD (Lugares) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responseLugDifMX = self.client.post("/v1/base/lugares", data=json_again, name="Lugares: Registro en BD")
  print ("Response status code:", responseLugDifMX.status_code)
  print ("Response content:", responseLugDifMX.content)
  self.wait()

#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************

  print("Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Carga Lugares del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Lugares")
  response = self.client.get("/v1/base/lugares/casos/" + str(response_idCaso) + "/page", name="Lugares: Carga Todos los Lugares del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

##################################################################
### 7. Inserta Registro en la BD (Armas)                       ###
##################################################################

  print("Carga Armas del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Armas")
  response = self.client.get("/v1/base/armas/casos/" + str(response_idCaso) + "/page", name="Lugares: Carga Todas las Armas del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  time.sleep(3)
  jsonArma = {
  "id": "",
  "clase": "ARMA DE FUEGO",
  "tipo": "PISTOLA",
  "subtipo": "PISTOLA AF2011-A1",
  "calibre": ".22 CORTO",
  "mecanismo": "AUTOMATICAS",
  "serie": 23123132,
  "notas": "ARMA ANTIGUA DEL EJERCITO ",
  "matricula": "MAT23234",
  "caso": {
    "id": response_idCaso
  },
  "claseArma": {
    "id": 138
  },
  "calibreMecanismo": {
    "id": 1
  }
}

  json_again = json.dumps(jsonArma)
  print("Insertando Registro en la BD (Armas) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responseArma = self.client.post("/v1/base/armas", data=json_again, name="Armas: Registro en BD")
  print ("Response status code:", responseArma.status_code)
  print ("Response content:", responseArma.content)
  self.wait()

#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************
  print("Peticion Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion Carga Armas del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Armas")
  response = self.client.get("/v1/base/armas/casos/" + str(response_idCaso) + "/page", name="Lugares: Carga Todas las Armas del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

##################################################################
### 8. Inserta Registro en la BD (Vehiculos)                   ###
##################################################################

  print("Carga Vehiculos del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Vehiculos")
  response = self.client.get("/v1/base/vehiculos/casos/" + str(response_idCaso) + "/page", name="Lugares: Carga Todos los Vehiculos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

#Carga Valor de Selects en Catalogo Estado Registrar Vehiculo

  print("Vehiculo: Carga Valor Cat Estado")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Vehiculo: Carga Valor Cat Estado")
  print("Response status code", response.status_code) 
  print("Response content:", response.content) 

  time.sleep(3)
  jsonVehicle = {
  "caso": {
    "id": response_idCaso
  },
  "id": "",
  "motivoRegistro": "ABANDONADO",
  "campoVehiculo": "AUTOMÓVIL/CAMIONETA",
  "tarjetaCirculacion": "TC12344",
  "noEconomico": "234",
  "clase": "USO PRIVADO",
  "marca": "ACURA",
  "submarca": "MDX",
  "color": "BLANCO",
  "modelo": "2016",
  "placas": "XTY2323",
  "placasAdicionales": "ADI2323",
  "registroFederalVehiculo": "RFV2342423424234234",
  "noSerie": "VIN23424223423",
  "noMotor": "HECHO EN MEXICO",
  "aseguradora": "ABA SEGUROS, S.A.",
  "factura": "FAC123456",
  "datosTomados": "PERSONA",
  "noPoliza": "POL123453",
  "valorEstimado": "12300",
  "tipoUso": "SERVICIO FEDERAL ARRENDAMINETO",
  "procedencia": "ESTATAL",
  "llevaCarga": True,
  "alterado": True,
  "seniasParticulares": "GOLPE COSTADO DERECHO",
  "notas": "AUTO EN MALAS CONDICIONES",
  "marcaSubmarca": {
    "id": 246,
    "marca": "ACURA",
    "tipoVehiculo": "AUTOMÓVIL/CAMIONETA"
  },
  "procedenciaAseguradora": {
    "id": 1
  },
  "tipoUsoTipoVehiculo": {
    "id": 24
  },
  "estadoOrigenPlacas": {
    "id": 1
  },
  "motivoRegistroColorClase": {
    "id": 19,
    "color": "AZUL"
  }
}

  json_again = json.dumps(jsonVehicle)
  print("Insertando Registro en la BD (Vehiculos) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responseVehicle = self.client.post("/v1/base/vehiculos", data=json_again, name="Vehiculos: Registro en BD")
  print ("Response status code:", responseVehicle.status_code)
  print ("Response content:", responseVehicle.content)
  self.wait()

#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************
  print("Peticion Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion Carga Vehiculos del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Vehiculos")
  response = self.client.get("/v1/base/vehiculos/casos/" + str(response_idCaso) + "/page", name="Vehiculos: Carga Todos los Vehiculos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

#######################################################################
### 9. Inserta Registro en la BD (Relacion Imputado-Victima-Delito) ###
#######################################################################

  print("Peticion a Relacion Imputado-Victima-Delito del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/tipo-relacion-persona/casos/" + str(response_idCaso) + "/page", name="Peticion a Relaciones del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Todos los elementos del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Relacion Imputado-Victima-Delito: Peticion a Todos los Elementos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Todas los Lugares del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/lugares/casos/" + str(response_idCaso), name="Relacion Imputado-Victima-Delito: Peticion a Todos los Lugares del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Todos los Vehiculos del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/vehiculos/casos/" + str(response_idCaso), name="Relacion Imputado-Victima-Delito: Peticion a Todos los Vehiculos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Todas las Armas del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/armas/casos/" + str(response_idCaso), name="Relacion Imputado-Victima-Delito: Peticion a Todas las Armas del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  print("Peticion a Todos los Delitos del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/delitos-casos/casos/" + str(response_idCaso) + "/page", name="Relacion Imputado-Victima-Delito: Carga Todos los Delitos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

#Inicia Peticiones a Tipo Interviniente

  print("Peticion a Tipo Interviniente 1 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/1", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Apoderado legal"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 2 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/2", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Defensor público"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 3 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/3", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Representante legal"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 4 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/4", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Asesor jurídico privado"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 5 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/5", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Imputado"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 6 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/6", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Testigo"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 7 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/7", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Asesor jurídico público"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 8 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/8", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Ofendido"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 9 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/9", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Víctima"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 10 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/10", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Defensor privado"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Tipo Interviniente 11 del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Relacion Imputado-Victima-Delito ")
  response = self.client.get("/v1/base/personas-casos/casos/189/tipos-intervinientes/11", name="Relacion Imputado-Victima-Delito: Peticion a Tipo Interviniente ""Remitente(policía)"" del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

#Termina Peticiones a Tipo Interviniente

#Inicia Sincronizacion y Carga de Catalogos para Realizar Relacion Imputado-Victima-Delito

  print("Relacion: Inicia Cat Pais")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/pais/options", name="Relacion: Sincronizacion Cat Pais")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Sexo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/sexo/options", name="Relacion: Sincronizacion Cat Sexo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Escolaridad")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/escolaridad/options", name="Relacion: Sincronizacion Cat Escolaridad")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Ocupacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/ocupacion/options", name="Relacion: Sincronizacion Cat Ocupacion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat EstadoCivil")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/estado-civil/options", name="Relacion: Sincronizacion Cat EstadoCivil")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat GrupoEtnico")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/grupo-etnico/options", name="Relacion: Sincronizacion Cat GrupoEtnico")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Interprete")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/interprete/options", name="Relacion: Sincronizacion Cat Interprete")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Adiccion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/adiccion/options", name="Relacion: Sincronizacion Cat Adiccion")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Tipo-domicilio")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipo-domicilio/options", name="Relacion: Sincronizacion Cat Tipo-domicilio")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)    

  print("Relacion: Inicia Cat Tipo-intervinientes")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/tipos-intervinientes/options", name="Relacion: Sincronizacion Cat Tipo-intervinientes")                           
  print("Response status code:", response.status_code)
  print("Response content:", response.content)   

  print("Relacion: Inicia Cat Alfabetismo")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/persona/alfabetismo/options", name="Relacion: Sincronizacion Cat Alfabetismo")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Perito-materia")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/perito-materia/options", name="Relacion: Sincronizacion Cat Perito-materia")
  print("Response status code:", response.status_code)
  print("Response content:", response.content) 

  print("Relacion: Inicia Cat Tipo-examen")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/tipo-examen/options", name="Relacion: Sincronizacion Cat Tipo-examen")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Denuncia-querella")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/denuncia-querella/options", name="Relacion: Sincronizacion Cat Denuncia-querella")
  print("Response status code:", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Victima-querellante")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/solicitud-preliminar/victima-querellante/options", name="Relacion: Sincronizacion Cat Victima-querellante")
  print("Response status code", response.status_code)
  print("Response content:", response.content)

  print("Relacion: Inicia Cat Tipo-persona")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-persona/options", name="Relacion: Sincronizacion Cat Tipo-persona")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Tipo-linea")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/predenuncia/tipo-linea/options", name="Relacion: Sincronizacion Cat Tipo-linea")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Grado-participacion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/grado-participacion/options", name="Relacion: Sincronizacion Cat Grado-participacion")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Forma-accion")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/forma-accion/options", name="Relacion: Sincronizacion Cat Forma-accion")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Concurso-delito")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/concurso-delito/options", name="Relacion: Sincronizacion Cat Concurso-delito")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Clasificacion-delito-orden")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/clasificacion-delito-orden/options", name="Relacion: Sincronizacion Cat Clasificacion-delito-orden")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Modalidad-delito")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/modalidad-delito/options", name="Relacion: Sincronizacion Cat Modalidad-delito")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Forma-comision")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/forma-comision/options", name="Relacion: Sincronizacion Cat Forma-comision")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Clasificacion-delito")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/clasificacion-delito/options", name="Relacion: Sincronizacion Cat Clasificacion-delito")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Elemento-comision")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/elemento-comision/options", name="Relacion: Sincronizacion Cat Clemento-comision")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  print("Relacion: Inicia Cat Forma-conducta")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/relacion/forma-conducta/options", name="Relacion: Sincronizacion Cat Forma-conducta")
  print("Response status code", response.status_code)
  print("Response content:", response.content)  

  #Fin Sincronizacion y Carga de Catalogos para Realizar Relacion Imputado-Victima-Delito

  #Carga Valor de Selects en Catalogos Estado y Municipio para Realizar Relacion Imputado-Victima-Delito

  print("Relacion: Carga Valor Cat Estado Origen")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Relacion Imputado-Victima-Delito: Carga Valor Cat Estado Origen")
  print("Response status code", response.status_code) 
  print("Response content:", response.content) 

  print("Relacion: Carga Valor Cat Municipio Origen")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/municipio/estado/16/options", name="Relacion Imputado-Victima-Delito: Carga Valor Cat Municipio Origen")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

  print("Relacion: Carga Valor Cat Estado Destino")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/estado/pais/143/options", name="Relacion Imputado-Victima-Delito: Carga Valor Cat Estado Destino")
  print("Response status code", response.status_code) 
  print("Response content:", response.content) 

  print("Relacion: Carga Valor Cat Municipio Destino")
  print("Locust instance (%r) executing my_task" % (self.locust))
  response = self.client.get("/v1/catalogos/municipio/estado/16/options", name="Relacion Imputado-Victima-Delito: Carga Valor Cat Municipio Destino")
  print("Response status code", response.status_code)
  print("Response content:", response.content) 

  #Carga IDs
  
  r_idPFV = json.loads(responsePF_V.text)['personaCasoId'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  r_idPFI = json.loads(responsePF_I.text)['personaCasoId'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  r_idDelito = json.loads(responseDelitos.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  r_idLugDifMX = json.loads(responseLugDifMX.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  r_idArma = json.loads(responseArma.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  r_idVehicle = json.loads(responseVehicle.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  resp_idCaso = ""+str(response_idCaso)+""

  time.sleep(3)
  jsonRelacion = {
  "id": None,
  "flagrancia": True,
  "tieneViolenciaGenero": True,
  "caso": {
    "id": ""
  },
  "clasificacionDelito": {
    "id": 1
  },
  "clasificacionDelitoOrden": {
    "id": 2
  },
  "concursoDelito": {
    "id": 1
  },
  "delitoCaso": {
    "id": r_idDelito
  },
  "desaparicionConsumacion": {
    "id": 145,
    "consumacion": "NO APLICA",
    "tipoDesaparicion": "AUSENTE",
    "relacionAcusado": "AUTORIDAD"
  },
  "elementoComision": {
    "id": 1
  },
  "formaAccion": {
    "id": 3
  },
  "formaComision": {
    "id": 1
  },
  "formaConducta": {
    "id": 1
  },
  "gradoParticipacion": {
    "id": 1
  },
  "modalidadDelito": {
    "id": 4
  },
  "violenciaGenero": {
    "id": 8
  },
  "hostigamientoAcoso": [
    {
      "modalidadAmbito": {
        "id": 6
      },
      "conductaDetalle": {
        "id": 23
      },
      "testigo": {
        "id": None
      },
      "id": ""
    }
  ],
  "trataPersona": [
    {
      "paisOrigen": {
        "id": 143
      },
      "estadoOrigen": {
        "id": 4
      },
      "municipioOrigen": {
        "id": 25
      },
      "paisDestino": {
        "id": 143
      },
      "estadoDestino": {
        "id": 1
      },
      "municipioDestino": {
        "id": 2
      },
      "tipoTransportacion": {
        "id": 7
      },
      "paisOrigenOtro": None,
      "estadoOrigenOtro": "",
      "municipioOrigenOtro": "",
      "paisDestinoOtro": None,
      "estadoDestinoOtro": "",
      "municipioDestinoOtro": "",
      "tipo": "TRATA DE BLANCAS",
      "transportacion": "MARÍTIMO"
    }
  ],
  "efectoViolencia": [
    {
      "efectoDetalle": {
        "id": 2
      }
    }
  ],
"tipoRelacionPersona": {
    "id": None,
    "tipo": "Imputado víctima delito",
    "personaCaso": {
      "id": r_idPFV
    },
    "personaCasoRelacionada": {
      "id": r_idPFI
    },
    "caso": {
      "id": resp_idCaso
    },
    "lugarTipoRelacionPersona": [
      {
        "lugar": {
          "id": r_idLugDifMX
        },
        "id": ""
      }
    ],
    "armaTipoRelacionPersona": [
      {
        "arma": {
          "id": r_idArma
        },
        "id": ""
      }
    ],
    "vehiculoTipoRelacionPersona": [
      {
        "vehiculo": {
          "id": r_idVehicle
        },
        "id": ""
      }
    ]
  }
}

  json_again = json.dumps(jsonRelacion)
  print("Datos a enviar DUMPS:: %s" % json_again)
  print("Insertando Registro en la BD (Relacion Imputado-Victima-Delito) en Caso #" +str(response_idCaso))
  self.client.headers['Content-Type'] = "application/json"
  responseRelacion = self.client.post("/v1/base/tipo-relacion-persona", data=json_again, name="Relacion Imputado-Victima-Delito: Registro en BD")
  print ("Response status code:", responseRelacion.status_code)
  print ("Response content:", responseRelacion.content)
  #r_idRelacion = json.loads(responseRelacion.text)['id'] #Cargamos el json response en una variable que puede ser parceada con json.loads
  self.wait()

#Despues del POST Carga la misma URL, desconosco el por que, consultar con DEVS *************
  print("Peticion Carga Caso "+str(response_idCaso)+ " Noticia de Hecho")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso), name="Carga Caso: Notica de Hechos")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion Carga Relaciones del Caso #"+str(response_idCaso)+ " Noticia de Hecho - Relaciones")
  response = self.client.get("/v1/base/tipo-relacion-persona/casos/" + str(response_idCaso) + "/page", name="Relacion: Carga Todas las Relaciones del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion a Todos los elementos del Caso #"+str(response_idCaso)+ " Relacion: Imputado-Victima-Delito")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/all", name="Relacion Imputado-Victima-Delito: Peticion a Todos los Elementos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

#######################################################################
### 10. Inserta Registro en la BD (Documentos)                      ###
#######################################################################

  print("Peticion para mostrar Documentos Adjuntos del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Documentos - Adjuntos")
  response = self.client.get("/v1/documentos/casos/" + str(response_idCaso) + "/page?p=0&tr=10", name="Documentos: Peticion para mostrar Documentos Adjuntos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  print("Peticion para mostrar Documentos Adjuntos y formatos Generados del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Documentos - Adjuntos y Formatos Generados")
  response = self.client.get("/v1/base/casos/" + str(response_idCaso) + "/documentos", name="Documentos: Peticion para mostrar Documentos Adjuntos del Caso")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  i = randrange(0,6)
  print("Documento a adjuntar: "+documentos[i][0]+ " en el Caso #"+str(response_idCaso)+ " Noticial de Hechos - Documentos")
  m = MultipartEncoder(
  fields={
    "caso.id" : str(response_idCaso),
    "files" : (str(documentos[i][0]), open('Files/'+documentos[i][0], 'rb'), str(documentos[i][1]))
    }
  )
  time.sleep(3)

  print("Peticion para adjuntar un Documento del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Documentos - Adjuntar Documentos")
  response = self.client.post("/v1/documentos/casos/save/"+str(response_idCaso), data=m, headers={"Content-Type": m.content_type}, name="Documentos: Adjunta Documentos al Caso")
  print ("Response status code", response.status_code)
  print ("Response content", response.content)
  self.wait()
  
  #response_uuidEcm = str(json.loads(response.text)['saved'][0]['uuidEcm'])
  #buscar = "application/" 
  #reemplazar_por = "application-" 
  #response_contentType = str(json.loads(response.text)['saved'][0]['contentType']).replace(buscar, reemplazar_por)

  #print("Peticion para Abrir Documento Adjunto del Caso #"+str(response_idCaso)+ " Noticial de Hechos - Documentos - Abrir Adjuntos")
  #r_openfile = self.client.get("/v1/documentos/documento/" + response_uuidEcm + "/" + response_contentType + "/Documento", name="Documentos: Abrir Documento")
  #print ("Response status code", r_openfile.status_code)

#################################################################################
### Predenuncia                                                               ###
#################################################################################

  # Entras a predenuncia
  print("Peticion de caso "+str(response_idCaso)+ "de Predenuncia")  
  response = self.client.get("/v1/base/predenuncias/casos/" + str(response_idCaso) + "/page", name="Predenuncia")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  # Creas el json con los datos que se van almacenar para crear la predenuncia
  jsonPredenuncia = {
  "caso": {
    "id": response_idCaso
  },
  "hablaEspanol": True,
  "comprendioDerechos": True,
  "canalizacion": True,
  "fechaCanalizacion": "2018-1-24 22:0:00.000",
  "heredarSintesisHechos": False,
  "personas": [
    {
      "id": 19
    },
    {
      "id": 19
    }
  ],
  "calidadPersonaHeredar": "",
  "tipoPersonaHeredar": "",
  "noTelefonico": None,
  "tipoLinea": {
    "id": None
  },
  "lugarLlamada": None,
  "hechosNarrados": "Hechos narrados",
  "comunicado": None,
  "horaConlcusionLlamada": None,
  "duracionLlamada": None,
  "nombreServidorPublico": None,
  "observaciones": "Observaciones",
  "noFolioConstancia": "21",
  "hablaEspaniol": True,
  "lenguaIdioma": "ALEMAN",
  "nombreInterprete": "BEN",
  "compredioDerechos": True,
  "proporcionoCopia": True,
  "autoridadOficioAsignacion": None,
  "denunciaQuerella": None,
  "ubicacionUnidadInmediata": None,
  "victimaOfendidoQuerellante": None,
  "cargoAutoridadOficioAsignacion": None,
  "calidadPersona": "Victima",
  "tipoPersona": {
    "id": 1
  },
  "lugarHechos": "Lugar en donde sucedieron los hechos",
  "conclusion": "Conclusión de los hechos enunciados",
  "institucion": "AMPAI",
  "motivoCanalizacion": "Motivo",
  "horaCanalizacion": "22:00",
  "horaConclusionLlamada": "",
  "nombreCausante": "Quien Resulte Culpable ",
  "domicilioCausante": "no lo sabe ",
  "quienRegistro": "Victor Manuel Guass",
  "oficio": None,
  "nombreAutoridadDirigeOficio": None,
  "necesidadesCubrir": None,
  "ubicacionUnidadInmediataVictima": None,
  "cargoAutoridadVictima": None,
  "tipo": "Predenuncia"
  
  }

  json_again = json.dumps(jsonPredenuncia)
  print(json_again)
  print("Insertando Registro en la BD (Nueva predenuncia)")
  self.client.headers['Content-Type'] = "application/json"
  responsePredenuncia = self.client.post("/v1/base/predenuncias", data=json_again, name="Nueva Predenuncia")
  print ("Response status code:", responsePredenuncia.status_code)
  print ("Response content:", responsePredenuncia.content)
  formatoPredenunciaId = str(json.loads(responsePredenuncia.text)['id'])
  print(formatoPredenunciaId)
  self.wait()

  #Se hace hace de nuevo una petición para asegurar que se almacenaron los datos
  print("Peticion de caso "+str(response_idCaso)+ "de Predenuncia")  
  response = self.client.get("/v1/base/predenuncias/casos/" + str(response_idCaso) + "/page", name="Predenuncia")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  #Genera formato de lectura de derechos de victima 
  time.sleep(10)
  print("Peticion para generar formato de lectura de derechos de victima")  
  response = self.client.get("/v1/documentos/formatos/save/"+formatoPredenunciaId+"/F1_003", name="Genera : Lectura de derechos de victima")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)

  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'Lectura de derechos de victima \n:' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()

  #crear un nuevo formato de Registro de recepción de llamada
  #print("Peticion para generar registro de recepción de llamadas")  
  #response = self.client.get("/v1/documentos/formatos/save/"+formatoPredenunciaId+"/F1_004", name="Recepción de llamada")
  #print ("Response status code:", response.status_code)
  #print ("Response content:", response.content)
  
  #crear un nuevo formato de Registro Presencial
  time.sleep(10)
  print("Peticion para generar registro Presencial")  
  response = self.client.get("/v1/documentos/formatos/save/"+formatoPredenunciaId+"/F1_004", name="Registro Presencial")
  print ("Response status code:", response.status_code)
  print ("Response content:", response.content)
  
  if response.status_code == 500 :
    f = open('error.txt', 'a')
    f.write('\n' + 'registro-presencial: \n' + 'Response status code: \n' + str(response.status_code) + 
      '\n' + 'Response content: \n' + str(response.content))
    f.close()

#################################################################################
### Solicitudes preliminares                                                  ###
#################################################################################
  MpiSolicitudPre.mpiSolicitudesPreliminares(self,response_idCaso)
########################################################################################
### Acuerdos: Acuerdo de Inicio                                                      ###
########################################################################################
  Mpi_Acuerdos_Entrevistas.mpiAcuerdos(self,response_idCaso,r_User)  
########################################################################################
### Entrevistas: Entrevista                                                          ###
########################################################################################
  Mpi_Acuerdos_Entrevistas.mpiEntrevistas(self,response_idCaso)

########################################################################################
### Conclusiones: Conclusiones                                                       ###
########################################################################################
  MpiConclusiones.conclusiones_mpi(self,response_idCaso)

class UserTasks(TaskSet):
  tasks = {
    getCreaNuevoCaso:2,
    index:2
  }

  def on_start(self):
   login(self)