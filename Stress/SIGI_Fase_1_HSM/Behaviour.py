#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Añado aquí una linea

from locust import HttpLocust, TaskSet, task
import Mpi

import variables


hostValue = variables.host

class Mpi(HttpLocust):
  host = hostValue
  weight = 5
  min_wait = 3000
  max_wait = 5000
  task_set = Mpi.UserTasks

#class AsesorJuridico(HttpLocust):
#  host = hostValue
#  weight = 3
#  min_wait = 10000
# max_wait = 20000
#  task_set = AsesorJuridico.UserTasks

#class TurnadorRepresentacion(HttpLocust):
#  host = hostValue
#  weight = 2
#  min_wait = 10000
#  max_wait = 20000
#  task_set = TurnadorRepresentacion.UserTasks

#class DefensorRepresentacion(HttpLocust):
#  host = hostValue
#  weight = 2
#  min_wait = 20000
#  max_wait = 35000
#  task_set = DefensorRepresentacion.UserTasks

#class Ws(HttpLocust):
#  host = hostValue
#  weight = 2
#  min_wait = 10000
#  max_wait = 20000
#  task_set = Ws.UserTasks

# class TurnadorDefensa(HttpLocust):
#   host = hostValue
#   weight = 1
#   min_wait = 10000
#   max_wait = 20000
#   task_set = TurnadorDefensa.UserTasks

# class Defensor(HttpLocust):
#   host = hostValue
#   weight = 2
#   min_wait = 10000
#   max_wait = 20000
#   task_set = Defensor.UserTasks

