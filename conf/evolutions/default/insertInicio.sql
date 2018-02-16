-----------------------------------------------------
-----------------------------------------------------
---                PRINCIPALES                    ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(0,'Demanda Laboral','Demanda de un ex empleado','0A-E3-R4-G6-7U','0A-E3-R4-G6-7U','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(1,'Demanda Laboral','Demanda de un ex empleado','0A-E3-R4-G6-7U','XR-ET-YU-Q3-p0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(2,'Demanda Laboral','Demanda de un ex empleado','0A-E3-R4-G6-7U','2S-G7-ET-HJ-B6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(3,'Demanda Laboral','Demanda de un ex empleado','XR-ET-YU-Q3-p0','0A-E3-R4-G6-7U','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(4,'Demanda Laboral','Demanda de un ex empleado','XR-ET-YU-Q3-p0','XR-ET-YU-Q3-p0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(5,'Demanda Laboral','Demanda de un ex empleado','XR-ET-YU-Q3-p0','2S-G7-ET-HJ-B6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(6,'Demanda Laboral','Demanda de un ex empleado','2S-G7-ET-HJ-B6','0A-E3-R4-G6-7U','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(7,'Demanda Laboral','Demanda de un ex empleado','2S-G7-ET-HJ-B6','XR-ET-YU-Q3-p0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(8,'Demanda Laboral','Demanda de un ex empleado','2S-G7-ET-HJ-B6','2S-G7-ET-HJ-B6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NIC(id,TITULO,DESCRIPCION,NIC,NUC,created,updated) VALUES(9,'Demanda Laboral','Demanda de una organizacion gubernamental','0A-E3-R4-G6-7U','0A-E3-R4-G6-7U','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');


-----------------------------------------------------
-----------------------------------------------------
---                CATALOGOS                      ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO TIPO_EXAMEN(id,NOMBRE,created,updated) VALUES(0,'Escrito','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_EXAMEN(id,NOMBRE,created,updated) VALUES(1,'Oral','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_EXAMEN(id,NOMBRE,created,updated) VALUES(2,'Virtual','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_EXAMEN(id,NOMBRE,created,updated) VALUES(3,'Fisico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO PRESENTO_LLAMADA (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Si', TO_TIMESTAMP('2017-10-18 22:00:16.217000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:00:21.369000000', 'YYYY-MM-DD HH24:MI:SS.FF')):
INSERT INTO PRESENTO_LLAMADA (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'Se murio', TO_TIMESTAMP('2017-10-18 22:00:16.217000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:00:16.217000000', 'YYYY-MM-DD HH24:MI:SS.FF')):
INSERT INTO PRESENTO_LLAMADA (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'Se lo comió el perro', TO_TIMESTAMP('2017-10-18 22:00:16.217000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:00:16.217000000', 'YYYY-MM-DD HH24:MI:SS.FF')):

INSERT INTO TIPO_LINEA (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Escolar', TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO TIPO_LINEA (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'Privada', TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO TIPO_LINEA (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'General', TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:06:38.310000000', 'YYYY-MM-DD HH24:MI:SS.FF'));

INSERT INTO TIPO_PERSONA (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Mediana', TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO TIPO_PERSONA (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'Fisica', TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO TIPO_PERSONA (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'Moral', TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:10:40.545000000', 'YYYY-MM-DD HH24:MI:SS.FF'));

INSERT INTO DENUNCIA_QUERELLA (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Se toma', TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO DENUNCIA_QUERELLA (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'No se toma', TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO DENUNCIA_QUERELLA (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'General', TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:11:49.322000000', 'YYYY-MM-DD HH24:MI:SS.FF'));

INSERT INTO VICTIMA_QUERELLANTE (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Se murió', TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO VICTIMA_QUERELLANTE (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'Renunció', TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO VICTIMA_QUERELLANTE (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'Robo', TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:13:27.244000000', 'YYYY-MM-DD HH24:MI:SS.FF'));

INSERT INTO PERITO_MATERIA (ID, NOMBRE, CREATED, UPDATED) VALUES (1, 'Perito', TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO PERITO_MATERIA (ID, NOMBRE, CREATED, UPDATED) VALUES (2, 'Materia', TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'));
INSERT INTO PERITO_MATERIA (ID, NOMBRE, CREATED, UPDATED) VALUES (3, 'Sharingan', TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'), TO_TIMESTAMP('2017-10-18 22:24:51.321000000', 'YYYY-MM-DD HH24:MI:SS.FF'));

INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(0,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(1,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(2,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(3,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(4,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HIPOTESIS_AMBITO(id,HIPOTESIS_SOBRESEIMIENTO,AMBITO_HECHOS,created,updated) VALUES(5,'Total','deudas a gente inapropiada','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(0,'0','Demandas','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(1,'0','Ejecutivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(2,'0','Casos','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(3,'0','Totales','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(4,'0','Otros','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(5,'1','Demandas','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(6,'1','Ejecutivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(7,'1','Casos','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(8,'1','Totales','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SUBDIRECCION(id,ACTIVO,NOMBRE,created,updated) VALUES(9,'1','Otros','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(0,'234uiu23498','Matutino','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(1,'234uiu23498','Vespertino','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(2,'234uiu23498','Medio Tiempo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(3,'ERFERT0987','Matutino','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(4,'ERFERT0987','Vespertino','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TURNO(id,CLAVE,NOMBRE,created,updated) VALUES(5,'ERFERT0987','Medio Tiempo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO PAIS (id, nombre, created, updated)VALUES (0, 'MEXICO', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO PAIS (id, nombre, created, updated)VALUES (1, 'Estados Unidos', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO PAIS (id, nombre, created, updated)VALUES (2, 'Perú', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO PAIS (id, nombre, created, updated)VALUES (3, 'Argentina', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO PAIS (id, nombre, created, updated)VALUES (4, 'Mongolia', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(0,'0','Vercarux','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(1,'0','Vercarux','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(2,'0','CDMX','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(3,'0','CDMX','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(4,'0','Monterrey','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(5,'0','Monterrey','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(6,'0','Guadalajara','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(7,'0','Guadalajara','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(8,'1','Vercarux','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO(id,ACTIVO,NOMBRE,PAIS_ID,created,updated) VALUES(9,'1','Vercarux','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(0,'0','Soltero','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(1,'0','Casado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(2,'0','Divorciado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(3,'0','Viudo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(4,'1','Soltero','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(5,'1','Casado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(6,'1','Divorciado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTADO_CIVIL(id,ACTIVO,NOMBRE,created,updated) VALUES(7,'1','Viudo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(0,'0','Activo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(1,'0','Inactivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(2,'0','Procesado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(3,'0','Enjuiciado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(4,'1','Activo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(5,'1','Inactivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(6,'1','Procesado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ESTATUS(id,ACTIVO,NOMBRE,created,updated) VALUES(7,'1','Enjuiciado','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(0,'10433dwdf','Ciudad de Mexico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(1,'10433dwdf','Toluca','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(2,'10433dwdf','Tres Estados','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(3,'10433dwdf','Veracruz ','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(4,'12423dfsf','Ciudad de Mexico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(5,'12423dfsf','Toluca','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(6,'12423dfsf','Tres Estados','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FISCALIA(id,CLAVE,NOMBRE,created,updated) VALUES(7,'12423dfsf','Veracruz ','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                   DELITO                      ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (0, 'Homicidio', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (1, 'Robo Agraviado', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (2, 'Secuestro', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (3, 'Allanamiento de morada', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (4, 'Fraude', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (5, 'Violación', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (6, 'Falsificación', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (7, 'Exceso de velocidad', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (8, 'Tráfico de influencias', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (9, 'Aborto', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (10, 'Daño a la propiedad', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (11, 'Delitos contra el ambiente', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (12, 'Llamarse Lázaro', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (13, 'Ignorar al compañero', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO DELITO (id, nombre, created, updated)
    VALUES (14, 'Robo de galletas', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                    SEXO                       ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO SEXO (id, nombre, created, updated)
    VALUES (0, 'Masculino', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO SEXO (id, nombre, created, updated)
    VALUES (1, 'Femenino', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  ADICCION                     ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO ADICCION (id, nombre, created, updated)
    VALUES (0, 'Tabaco', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ADICCION (id, nombre, created, updated)
    VALUES (1, 'Alcoholismo', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ADICCION (id, nombre, created, updated)
    VALUES (2, 'Drogas', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ADICCION (id, nombre, created, updated)
    VALUES (3, 'Comida Chatarra', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ADICCION (id, nombre, created, updated)
    VALUES (4, 'Apuestas', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                 ALFABETISMO                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO ALFABETISMO (id, nombre, created, updated)
    VALUES (0, 'Leer', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ALFABETISMO (id, nombre, created, updated)
    VALUES (1, 'Escribir', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ALFABETISMO (id, nombre, created, updated)
    VALUES (2, 'Leer y Escribir', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                 ESCOLARIDAD                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO ESCOLARIDAD (id, nombre, created, updated)
    VALUES (0, 'Primaria', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ESCOLARIDAD (id, nombre, created, updated)
    VALUES (1, 'Secundaria', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ESCOLARIDAD (id, nombre, created, updated)
    VALUES (2, 'Carrera Técnica', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ESCOLARIDAD (id, nombre, created, updated)
    VALUES (3, 'Licenciatura', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO ESCOLARIDAD (id, nombre, created, updated)
    VALUES (4, 'Maestría', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  OCUPACION                    ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO OCUPACION (id, nombre, created, updated)
    VALUES (0, 'Maestr@', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO OCUPACION (id, nombre, created, updated)
    VALUES (1, 'Plomer@', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO OCUPACION (id, nombre, created, updated)
    VALUES (2, 'Am@ de casa', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO OCUPACION (id, nombre, created, updated)
    VALUES (3, 'Técnico', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO OCUPACION (id, nombre, created, updated)
    VALUES (4, 'Ingenier@', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');


-----------------------------------------------------
-----------------------------------------------------
---                  INTERPRETE                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO INTERPRETE (id, nombre, created, updated)
    VALUES (0, 'Si', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO INTERPRETE (id, nombre, created, updated)
    VALUES (1, 'No', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                 GRUPO ETNICO                  ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO GRUPO_ETNICO (id, nombre, created, updated)
    VALUES (0, 'Abenaki', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO GRUPO_ETNICO (id, nombre, created, updated)
    VALUES (1, 'Buriates', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO GRUPO_ETNICO (id, nombre, created, updated)
    VALUES (2, 'Bororos', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO GRUPO_ETNICO (id, nombre, created, updated)
    VALUES (3, 'Azeris', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO GRUPO_ETNICO (id, nombre, created, updated)
    VALUES (4, 'Apaches', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                   MUNICIPIO                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO MUNICIPIO (id, nombre, estado_id, created, updated)
    VALUES (0, 'Río Lagartos', 0, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO MUNICIPIO (id, nombre, estado_id, created, updated)
    VALUES (1, 'Missipi', 1, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO MUNICIPIO (id, nombre, estado_id, created, updated)
    VALUES (2, 'Limon', 2, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO MUNICIPIO (id, nombre, estado_id, created, updated)
    VALUES (3, 'Aires malos', 3, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO MUNICIPIO (id, nombre, estado_id, created, updated)
    VALUES (4, 'El municipio del estado de Mongolia', 4, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');


-----------------------------------------------------
-----------------------------------------------------
---                    COLONIA                    ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO COLONIA (id, nombre, cp, municipio_id, created, updated)
    VALUES (0, 'Lagarto 1', 38789, 1, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO COLONIA (id, nombre, cp, municipio_id, created, updated)
    VALUES (1, 'Missirisipi', 11145, 2, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO COLONIA (id, nombre, cp, municipio_id, created, updated)
    VALUES (2, 'Limon', 20045, 3, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                   LOCALIDAD                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO LOCALIDAD (id, nombre, colonia_id, created, updated)
    VALUES (0, 'Localidad de Lagarto 1', 0, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO LOCALIDAD (id, nombre, colonia_id, created, updated)
    VALUES (1, 'Localidad de Missirisipi', 1, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO LOCALIDAD (id, nombre, colonia_id, created, updated)
    VALUES (2, 'Localidad de Limon', 2, '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                    IDIOMA                     ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO IDIOMA_IDENTIFICACION (id, habla_espaniol, created, updated)
    VALUES (0, 'Si', '20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');
INSERT INTO IDIOMA_IDENTIFICACION (id, habla_espaniol, created, updated)
    VALUES (1, 'No','20/10/17 21:12:36.221000000', '20/10/17 21:12:36.221000000');

-----------------------------------------------------
-----------------------------------------------------
---           PROCEDENCIA ASEGURADORA             ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,CREATED,updated) VALUES(0,'mexico','patito','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,CREATED,updated) VALUES(1,'mexico','pato','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,CREATED,updated) VALUES(2,'mexico','mcqua','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,CREATED,updated) VALUES(3,'cdmx','patito','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,CREATED,updated) VALUES(4,'cdmx','pato','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---              MOTIVO COLOR CLASE               ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO MOTIVO_COLOR_CLASE(id,MOTIVO_REGISTRO,CLASE,COLOR,CREATED,updated) VALUES(0,'por obligacion','patito','azul','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MOTIVO_COLOR_CLASE(id,MOTIVO_REGISTRO,CLASE,COLOR,CREATED,updated) VALUES(1,'por obligacion','patito','rojo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MOTIVO_COLOR_CLASE(id,MOTIVO_REGISTRO,CLASE,COLOR,CREATED,updated) VALUES(2,'por obligacion','patito','verde','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MOTIVO_COLOR_CLASE(id,MOTIVO_REGISTRO,CLASE,COLOR,CREATED,updated) VALUES(3,'por obligacion','patito','blanco','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MOTIVO_COLOR_CLASE(id,MOTIVO_REGISTRO,CLASE,COLOR,CREATED,updated) VALUES(4,'por obligacion','patito','negro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---             TIPO USO TIPO VEHICULO            ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO TIPO_USO_TIPO_VEHICULO(id,TIPO_VEHICULO,TIPO_USO,DATOS_TOMADOS_DE,CREATED,UPDATED) VALUES(0,'carro','personal','azul','6/10/17 14:52:05.221000000','20/10/17 21:12:36');
INSERT INTO TIPO_USO_TIPO_VEHICULO(id,TIPO_VEHICULO,TIPO_USO,DATOS_TOMADOS_DE,CREATED,UPDATED) VALUES(1,'carro','personal','rojo','6/10/17 14:52:05.221000000','20/10/17 21:12:36');
INSERT INTO TIPO_USO_TIPO_VEHICULO(id,TIPO_VEHICULO,TIPO_USO,DATOS_TOMADOS_DE,CREATED,UPDATED) VALUES(2,'carro','personal','verde','6/10/17 14:52:05.221000000','20/10/17 21:12:36');
INSERT INTO TIPO_USO_TIPO_VEHICULO(id,TIPO_VEHICULO,TIPO_USO,DATOS_TOMADOS_DE,CREATED,UPDATED) VALUES(3,'carro','personal','blanco','6/10/17 14:52:05.221000000','20/10/17 21:12:36');
INSERT INTO TIPO_USO_TIPO_VEHICULO(id,TIPO_VEHICULO,TIPO_USO,DATOS_TOMADOS_DE,CREATED,UPDATED) VALUES(4,'carro','personal','negro', '6/10/17 14:52:05.221000000','20/10/17 21:12:36');

-----------------------------------------------------
-----------------------------------------------------
---                  NACIONALIDAD                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(0,'Mexicana','Ateo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(1,'Mexicana','Catolico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(2,'Mexicana','Cristiano','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(3,'Mexicana','Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(4,'Canadiense','Ateo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(5,'Canadiense','Catolico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(6,'Canadiense','Cristiano','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(7,'Canadiense','Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(8,'Alemana','Ateo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(9,'Alemana','Catolico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(10,'Alemana','Cristiano','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NACIONALIDAD_RELIGION(id,NACIONALIDAD,RELIGION,created,updated) VALUES(11,'Alemana','Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---               MARCA SUB-MARCA                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(0,'APROPIADA','ESTO ES BUENO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(1,'APROPIADA','ESTO ES MALO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(2,'APROPIADA','BLA BLA','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(3,'APROPIADA','JESUS COMPRO UNOS AUDIFONOS DE 2400','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(4,'INAPROPIADA','ESTO ES BUENO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(5,'INAPROPIADA','ESTO ES MALO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(6,'INAPROPIADA','BLA BLA','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MARCA_SUB_MARCA(id,MARCA,SUBMARCA,created,updated) VALUES(7,'INAPROPIADA','JESUS COMPRO UNOS AUDIFONOS DE 2400','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                     OREJA                     ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(0,'Eliptica','No','No','No','No','No','Si','No','Grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(1,'Eliptica','No','No','No','No','No','No','Si','chico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(2,'Eliptica','No','No','No','No','No','No','Si','Mediano','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(3,'Eliptica','No','No','No','No','No','No','Si','Grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(4,'Eliptica','No','No','No','No','No','No','No','chico','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(5,'Eliptica','No','No','No','No','No','No','No','Mediano','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO OREJA(id,FORMA,HELIX_ORIGINAL,HELIX_SUPERIOR,HELIX_POSTERIOR,HELIX_ADHERENCIA,LOBULO_CONTORNO,LOBULO_ADHERENCIA,LOBULO_PARTICULARIDAD,LOBULO_DIMENSION,created,updated) VALUES(6,'Eliptica','No','No','No','No','No','No','No','Grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---            COMPLEXION_PIEL_SANGRE             ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(0,'delgada','azul','O','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(1,'delgada','azul','O','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(2,'delgada','azul','O+','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(3,'delgada','azul','O+','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(4,'delgada','azul','O-','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(5,'delgada','azul','O-','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(6,'delgada','verde','O','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(7,'delgada','verde','O','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(8,'delgada','verde','O+','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO COMPLEXION_PIEL_SANGRE(id,TIPO_COMPLEXION,COLOR_PIEL,TIPO_SANGRE,FACTOR_RHSANGRE,created,updated) VALUES(9,'delgada','verde','O+','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');-----------------------------------------------------

-----------------------------------------------------
-----------------------------------------------------
---                   CABELLO                     ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(0,'POCO','AZUL','Recta','chica','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(1,'POCO','AZUL','Recta','chica','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(2,'POCO','AZUL','Recta','chica','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(3,'POCO','AZUL','Recta','mediana','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(4,'POCO','AZUL','Recta','mediana','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(5,'POCO','AZUL','Recta','mediana','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(6,'POCO','AZUL','Recta','grande','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(7,'POCO','AZUL','Recta','grande','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(8,'POCO','AZUL','Recta','grande','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CABELLO(id,CANTIDAD,COLOR,FORMA,CALVICIE,IMPLANTACION,created,updated) VALUES(9,'POCO','AZUL','S','chica','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  CEJA_BOCA.                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(0,'norte','Si','Recta','chica','chica','Si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(1,'norte','Si','Recta','chica','chica','No','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(2,'norte','Si','Recta','chica','mediana','Si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(3,'norte','Si','Recta','chica','mediana','No','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(4,'norte','Si','Recta','chica','grande','Si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(5,'norte','Si','Recta','chica','grande','No','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(6,'norte','Si','Recta','mediana','chica','Si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(7,'norte','Si','Recta','mediana','chica','No','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CEJA_BOCA(id,DIRECCION_CEJA,IMPLANTACION_CEJA,FORMA_CEJA,TAMANIO_CEJA,TAMANIO_BOCA,COMISURAS_BOCA,created,updated) VALUES(8,'norte','Si','Recta','mediana','mediana','Si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-----------------------------------------------------
-----------------------------------------------------
---                  CARA_NARIZ                   ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(0,'delgada','azul','O','si','si','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(1,'delgada','azul','O','si','si','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(2,'delgada','azul','O','si','no','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(3,'delgada','azul','O','si','no','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(4,'delgada','azul','O','no','si','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(5,'delgada','azul','O','no','si','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(6,'delgada','azul','O','no','no','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(7,'delgada','azul','O','no','no','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(8,'delgada','azul','O+','si','si','si','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CARA_NARIZ(id,FORMA_CARA,RAIZ_NARIZ,DORSO_NARIZ,ANCHO_NARIZ,BASE_NARIZ,ALTURA_NARIZ,created,updated) VALUES(9,'delgada','azul','O+','si','si','no','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                 FRENTE_MENTON                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(0,'1 DEDO','10 GRADOS','UNA CUARTA','FUERTE','10 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(1,'1 DEDO','10 GRADOS','UNA CUARTA','FUERTE','20 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(2,'1 DEDO','10 GRADOS','UNA CUARTA','FUERTE','MAS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(3,'1 DEDO','10 GRADOS','UNA CUARTA','DEVIL','10 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(4,'1 DEDO','10 GRADOS','UNA CUARTA','DEVIL','20 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(5,'1 DEDO','10 GRADOS','UNA CUARTA','DEVIL','MAS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(6,'1 DEDO','10 GRADOS','UN PIE','FUERTE','10 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(7,'1 DEDO','10 GRADOS','UN PIE','FUERTE','20 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(8,'1 DEDO','10 GRADOS','UN PIE','FUERTE','MAS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FRENTE_MENTON(id,ALTURA_FRENTE,INCLINACION_FRENTE,ANCHO_FRENTE,TIPO_MENTON,INCLINACION_MENTON,created,updated) VALUES(9,'1 DEDO','10 GRADOS','UN PIE','DEVIL','10 GRADOS','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                    LABIO_OJO                  ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(0,'POCO','1 Dedo','Si','AZUL','redondo','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(1,'POCO','1 Dedo','Si','AZUL','redondo','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(2,'POCO','1 Dedo','Si','AZUL','redondo','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(3,'POCO','1 Dedo','Si','AZUL','eliptico','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(4,'POCO','1 Dedo','Si','AZUL','eliptico','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(5,'POCO','1 Dedo','Si','AZUL','eliptico','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(6,'POCO','1 Dedo','Si','NEGRO','redondo','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(7,'POCO','1 Dedo','Si','NEGRO','redondo','mediana','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(8,'POCO','1 Dedo','Si','NEGRO','redondo','grande','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LABIO_OJO(id,ESPESOR_LABIO,ALTURA_NASO_LABIAL_LABIO,PROMINENCIA_LABIO,COLOR_OJO,FORMA_OJO,TAMANIO_OJO,created,updated) VALUES(9,'POCO','1 Dedo','Si','NEGRO','eliptico','chica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                 DETALLE_LUGAR                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(0,'POCO','AZUL','LUNES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(1,'POCO','AZUL','MARTES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(2,'POCO','AZUL','MIERCOLES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(3,'POCO','AZUL','JUEVES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(4,'POCO','AZUL','VIERNES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(5,'POCO','NEGRO','LUNES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(6,'POCO','NEGRO','MARTES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(7,'POCO','NEGRO','MIERCOLES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(8,'POCO','NEGRO','JUEVES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_LUGAR(id,TIPO_LUGAR,TIPO_ZONA,DIA,created,updated) VALUES(9,'POCO','NEGRO','VIERNES','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---               CALIBRE_MECANISMO               ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(0,'polvora','22 corto alcance','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(1,'polvora','22 largo alcance','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(2,'polvora','22 magnum','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(3,'polvora','9 mm','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(4,'polvora','10 mm','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(5,'polvora','40','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(6,'polvora','41','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(7,'polvora','44','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(8,'polvora','50','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CALIBRE_MECANISMO(id,MECANISMO,CALIBRE,created,updated) VALUES(9,'aire','22 corto alcance','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                    CLASE_ARMA                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(0,'fuego','revolver','deportiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(1,'fuego','revolver','casa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(2,'fuego','revolver','caza','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(3,'fuego','revolver','ultra ligero','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(4,'fuego','armas larga','deportiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(5,'fuego','armas larga','casa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(6,'fuego','armas larga','caza','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(7,'fuego','armas larga','ultra ligero','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(8,'fuego','diabolo','deportiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASE_ARMA(id,CLASE_ARMA,TIPO,SUBTIPO,created,updated) VALUES(9,'fuego','diabolo','casa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-----------------------------------------------------
-----------------------------------------------------
---            DESAPARICION_CONSUMACION           ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(0,'Instantaneo','Forzadas','Sustantiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(1,'Instantaneo','Forzadas','Adjetiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(2,'Instantaneo','Involuntarias','Sustantiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(3,'Instantaneo','Involuntarias','Adjetiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(4,'Instantaneo','Accidentales','Sustantiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(5,'Instantaneo','Accidentales','Adjetiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(6,'Instantaneo','Excluidas    ','Sustantiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(7,'Instantaneo','Excluidas    ','Adjetiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(8,'Permanente','Forzadas','Sustantiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DESAPARICION_CONSUMACION(id,CONSUMACION,TIPO_DESAPARICION,RELACION_ACUSADO,created,updated) VALUES(9,'Permanente','Forzadas','Adjetiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-----------------------------------------------------
-----------------------------------------------------
---                VIOLENCIA_GENERO               ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(0,'Cartel','Fisica','explotacion laboral','Sexual','Restriccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(1,'Cartel','Fisica','explotacion laboral','Sexual','Proteccion de Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(2,'Cartel','Fisica','explotacion laboral','Sexual','CAFE','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(3,'Cartel','Fisica','explotacion laboral','Sexual','ROJO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(4,'Cartel','Fisica','explotacion laboral','Fisico','Restriccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(5,'Cartel','Fisica','explotacion laboral','Fisico','Proteccion de Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(6,'Cartel','Fisica','explotacion laboral','Fisico','CAFE','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(7,'Cartel','Fisica','explotacion laboral','Fisico','ROJO','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(8,'Cartel','Fisica','explotacion laboral','Verbal','Restriccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VIOLENCIA_GENERO(id,DELINCUENCIA_ORGANIZADA,VIOLENCIA_GENERO,VICTIMA_TRATA,VICTIMA_ACOSO,ORDEN_PROTECCION,created,updated) VALUES(9,'Cartel','Fisica','explotacion laboral','Verbal','Proteccion de Testigo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                EFECTO_DETALLE                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(0,'Bienes','Materiales de construccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(1,'Bienes','Humanos','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(2,'Bienes','Articulos personales','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(3,'Cuerpo','Materiales de construccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(4,'Cuerpo','Humanos','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(5,'Cuerpo','Articulos personales','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(6,'Instrumentos','Materiales de construccion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(7,'Instrumentos','Humanos','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_DETALLE(id,EFECTO,DETALLE,created,updated) VALUES(8,'Instrumentos','Articulos personales','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---              TIPO_TRANSPORTACION              ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(0,'Instantaneo','Terrestre','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(1,'Instantaneo','Aerea','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(2,'Instantaneo','Maritima','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(3,'Instantaneo','Traccion Animal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(4,'Permanente','Terrestre','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(5,'Permanente','Aerea','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(6,'Permanente','Maritima','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(7,'Permanente','Traccion Animal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(8,'Continuado','Terrestre','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_TRANSPORTACION(id,TIPO,TRANSPORTACION,created,updated) VALUES(9,'Continuado','Aerea','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---              TIPO_INTERVINIENTE               ---
-----------------------------------------------------
-----------------------------------------------------

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(0,'Apoderado legal',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(1,'Defensor público',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(2,'Representante legal',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(3,'Asesor jurídico privado',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(4,'Imputado',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(5,'Testigo',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(6,'Asesor jurídico público',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(7,'Ofendido',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(8,'Víctima',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(9,'Defensor privado',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

insert into tipo_interviniente (ID, TIPO, CREATED, UPDATED) values(10,'Remitente (policía)',TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'));

-----------------------------------------------------
-----------------------------------------------------
---               MODALIDAD_DELITO                ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Asalto','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Asalto','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Secuestro','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Secuestro','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Asesinato','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Asesinato','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Extorcion','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Extorcion','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                TIPO_DOMICILIO                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Casa','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Casa','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Departamento','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Departamento','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Hostal','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Hostal','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Casa Hogar','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DOMICILIO(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Casa Hogar','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  CONCURSO_DELITO              ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CONCURSO_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Real','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONCURSO_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Real','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONCURSO_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Ideal','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONCURSO_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Ideal','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---               GRADO_PARTICIPACION             ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Autor','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Autor','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Complice','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Complice','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Testigo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Testigo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Victima','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO GRADO_PARTICIPACION(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Victima','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                FORMA_COMISION                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Accion','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Accion','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Omision','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Omision','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Tentativa','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Tentativa','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Consumado','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Consumado','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---              CLASIFICACION_DELITO             ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Absoluta','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Absoluta','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Reflexiva','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Reflexiva','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Ciega','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Ciega','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Relativa','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO_ORDEN(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Relativa','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  FORMA_ACCION                 ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Comision','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Comision','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Omision','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Omision','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Omision propia','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Omision propia','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Omision impropia','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_ACCION(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Omision impropia','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---             CLASIFICACION_DELITO              ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Culpabilidad','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Culpabilidad','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Accion','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Accion','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Sujeto activo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Sujeto activo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Procesal','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CLASIFICACION_DELITO(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Procesal','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                  FORMA_CONDUCTA               ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(0,'Accion','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(1,'Accion','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(2,'Omision','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(3,'Omision','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(4,'Omision Simple','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(5,'Omision Simple','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(6,'Comision por omision','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_CONDUCTA(id,NOMBRE,ACTIVO,created,updated) VALUES(7,'Comision por omision','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-----------------------------------------------------
-----------------------------------------------------
---                MODALIDAD_AMBITO               ---
-----------------------------------------------------
-----------------------------------------------------

INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(0,'Homicidio Culposo','Temporal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(1,'Homicidio Culposo','Espacial','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(2,'Homicidio Culposo','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(3,'Homicidio Culposo','Vigor','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(4,'Lesiones Culposas','Temporal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(5,'Lesiones Culposas','Espacial','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(6,'Lesiones Culposas','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(7,'Lesiones Culposas','Vigor','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(8,'Lesiones Culposas','Temporal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MODALIDAD_AMBITO(id,MODALIDAD,AMBITO,created,updated) VALUES(9,'Lesiones Culposas','Espacial','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');


INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(0,'Irracionalismo','Venia en estado incoveniente','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(1,'Irracionalismo','Trato de resistirse a su arresto','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(2,'Irracionalismo','Se entergo de manera pacifica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(3,'Anarquia','Venia en estado incoveniente','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(4,'Anarquia','Trato de resistirse a su arresto','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(5,'Anarquia','Se entergo de manera pacifica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(6,'Tranquilidas','Venia en estado incoveniente','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(7,'Tranquilidas','Trato de resistirse a su arresto','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO CONDUCTA_DETALLE(id,CONDUCTA,DETALLE,created,updated) VALUES(8,'Tranquilidas','Se entergo de manera pacifica','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(0,1,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(1,1,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(2,1,0,2,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(3,1,0,3,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(4,1,0,4,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(5,1,0,5,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(6,1,0,6,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(7,1,0,7,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(8,1,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO_CASO(id,PRINCIPAL,NIC_ID,DELITO_ID,created,updated) VALUES(9,1,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(0,1,0,0,0,0,0,0,0,0,0,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(1,1,0,0,0,0,0,0,0,0,0,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(2,1,0,0,0,0,0,0,0,0,0,0,2,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(3,1,0,0,0,0,0,0,0,0,0,0,3,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(4,1,0,0,0,0,0,0,0,0,0,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(5,1,0,0,0,0,0,0,0,0,0,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(6,1,0,0,0,0,0,0,0,0,0,1,2,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(7,1,0,0,0,0,0,0,0,0,0,1,3,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(8,1,0,0,0,0,0,0,0,0,0,2,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DELITO(id,VIOLENCIA_GENERO,FLAGRAANCIA,MODALIDAD_DELITO_ID,FORMA_COMISION_ID,CONCURSO_DELITO_ID,CLASIFICACION_DELITO_ORDEN_ID,DELITO_CASO_ID,ELEMENTO_COMISION_ID,clasifICACION_DELITO_ID,FORMA_ACCION_ID,DESAPARICION_CONSUMACION_ID,FORMA_CONDUCTA_ID,created,updated) VALUES(9,1,0,0,0,0,0,0,0,0,0,2,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(0,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(1,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(2,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(3,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(4,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(5,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(6,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(7,'6/10/17 14:52:05.221000000','18/1/17 19:20:59.221000000','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(8,'6/10/17 14:52:05.221000000','12/03/17 14:52:05.221000000','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DETALLE_DETENIDO(id,FECHA_DETENCION,FECHA_DECLARACION,TIPO_DETENIDO_ID,created,updated) VALUES(9,'6/10/17 14:52:05.221000000','12/03/17 14:52:05.221000000','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','0','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','0','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','0','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Documento.pdf','pdf','0','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Documento.pdf','pdf','0','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_FACULTAD_NO_INVESTIGAR(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,FACULTAD_NO_INVESTIGAR_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','0','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','0','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','0','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Documento.pdf','pdf','0','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Documento.pdf','pdf','0','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NIC(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,CASO_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','0','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','0','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','0','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Documento.pdf','pdf','0','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Documento.pdf','pdf','0','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_NO_EJERCICIO_ACCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,NO_EJERCICIO_ACCION_PENAL_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ELEMENTO_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(0,'0','Federal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ELEMENTO_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(1,'0','Estatal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ELEMENTO_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(2,'1','Federal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ELEMENTO_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(3,'1','Estatal','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(0,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(1,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(2,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(3,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(4,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(5,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(6,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(7,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Ninguna','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(8,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Proceso tarda mas de lo esperado','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FACULTAD_NO_INVESTIGAR(id,SINTESIS_HECHOS,DATOS_PRUEBA,MOTIVOS_ABSTUVO_INVESTIGAR,MEDIO_ALTERNATIVO_SOLUCION,DESTINATARIO_DETERMINACION,SUPERIOR_JERARQUICO,OBSERVACIONES,CASO_ID,created,updated) VALUES(9,'Robo a hogar para obtener 20,000 pesos','Testigo','El perpretador confeso su culpa','pistola','juez','total','Proceso tarda mas de lo esperado','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(0,'1','Activa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(1,'1','Inactiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(2,'1','Entera','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(3,'0','Activa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(4,'0','Inactiva','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO FORMA_COMISION(id,ACTIVO,NOMBRE,created,updated) VALUES(5,'0','Entera','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(0,'1','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(1,'1','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(2,'1','0','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(3,'1','0','0','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(4,'1','0','0','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(5,'1','0','0','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(6,'1','0','0','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(7,'1','0','0','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(8,'1','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO HOSTIGAMIENTO_ACOSO(id,MODALIDAD_AMBITO_ID,CONDUCTA_DETALLE_ID,TESTIGO_ID,DETALLE_DELITO_ID,created,updated) VALUES(9,'1','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(0,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Casa','0','Veracruz','Xalapa','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(1,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Casa','0','Veracruz','Coatepec','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(2,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Casa','0','CDMX','Xalapa','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(3,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Casa','0','CDMX','Coatepec','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(4,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Departamento','0','Veracruz','Xalapa','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(5,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Departamento','0','Veracruz','Coatepec','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(6,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Departamento','0','CDMX','Xalapa','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(7,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','correo@correo.com','Departamento','0','CDMX','Coatepec','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(8,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','nombre@correo.com','Casa','0','Veracruz','Xalapa','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LOCALIZACION_PERSONA(id,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,LOCALIDAD_ID,CALLE,NO_EXTERIOR,NO_INTERIOR,CP,TIPO_DOMICILIO_ID,REFERENCIAS,TEL_PARTICULAR,TEL_TRABAJO,EXTENSION,TEL_MOVIL,FAX,OTRO_MEDIO_CONTACTO,CORREO,TIPO_RECIDENCIA,PERSONA_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LOCALIDAD_OTRO,created,updated) VALUES(9,'0','0','1','1','1','Peral','2','5','23410','0','Niguna','124523','134523','02','2233657890','023435324','Ninguno','nombre@correo.com','Casa','0','Veracruz','Coatepec','Canon del colorado','Xalapa','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(0,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','5','Amsterdam','Luka','Tach','23.345','1.235','6/10/17 14:52:05.221','6/10/17 14:52:05.221');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(1,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','5','Amsterdam','Luka','Tach','23.345','2.235','6/10/17 14:52:05.221','6/10/17 14:52:05.221');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(2,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','20.2340','19.9018','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(3,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','20.2340','1.2359','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(4,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','20.2340','2.235','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(5,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','13.3420','19.9018','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(6,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','13.3420','1.2359','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO LUGAR(id,DETALLE_LUGAR_ID,CALLE,NUM_INTERIOR,NUM_EXTERIOR,REFERENCIAS,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,COLONIA_ID,CP,FECHA,DESCRIPCION_LUGAR,REFE_GEOGRAFICAS,NOTAS,NIC_ID,ESTADO_OTRO,MUNICIPIO_OTRO,COLONIA_OTRO,LONGITUD,LATITUD,created,updated) VALUES(7,'0','Limon','1','1','Porton negro','1','0','0','0','2','12/03/17 14:52:05.221000000','Casa Abandonada','Entre peral y castillo','El numero no esta actualizado','6','Amsterdam','Xala','Perrith','13.3420','2.2351','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(0,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,0,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(1,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,0,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(2,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,0,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(3,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,0,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(4,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,1,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(5,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,1,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(6,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,1,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(7,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,0,1,0,1,1,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(8,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,1,0,0,0,0,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA(id,NOMBRE,PATERNO,MATERNO,EDAD,CURP,RAZON_SOCIAL,RFC,NUM_HIJOS,FECHA_NACIMIENTO,LUGAR_TRABAJO,INGRESO_MENSUAL,TIPO_PERSONA,AUTORIDAD_EMISORA,FOLIO_IDENTIFICACION,NACIONALIDAD_RELIGION_ID,IDIOMA_IDENTIFICACION_ID,PAIS_ID,ESTADO_ID,MUNICIPIO_ID,INTERPRETE_ID,SEXO_ID,ESCOLARIDAD_ID,OCUPACION_ID,ESTADO_CIVIL_ID,GRUPO_ETNICO_ID,ALFABETISMO_ID,ADICCION_ID,created,updated) VALUES(9,'Jose','Perez','Vasquez','18','DFE762345SFVSV','JVasquez','DFE762345SFVSV','5','18/1/17 19:20:59.221000000','Hogar','0','Moral','Juez','02',0,0,1,0,1,1,1,0,0,0,0,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(1,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','0','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(2,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','0','1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(3,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','0','1','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(4,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','0','1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(5,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','1','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(6,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','1','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(7,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','1','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(8,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','1','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO MEDIA_FILIACION(id,USA_ANTEOJOS,CICATRICES,TATUAJES,LUNARES,DISMINUCIONES_FISICAS,PROTESIS,OTRAS,ESTATURA,PESO,PERSONA_ID,OREJA_DERECHA_ID,OREJA_IZQUIERDA_ID,COMPLEXION_PIEL_SANGRE_ID,CARA_ID,FRENTE_MENTON_ID,CEJA_ID,CABELLO_ID,LABIO_OJO_ID,created,updated) VALUES(9,'0','En el cuerpo','Medio','En el cuerpo','Problemas al caminar','En los brazos','Falla cardiaca','190','90','1','1','1','1','1','1','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(0,'0','El morro','Alias',0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(1,'0','El morro','Alias',1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(2,'0','El morro','Alias',2,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(3,'0','El morro','Alias',3,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(4,'0','El morro','Alias',4,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(5,'0','El morro','Alias',5,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(6,'0','El morro','Alias',6,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(7,'0','El morro','Alias',7,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(8,'0','El morro','Pseudonimo',0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ALIAS_NOMBRE_PERSONA(id,ACTIVO,NOMBRE,TIPO,PERSONA_ID,created,updated) VALUES(9,'0','El morro','Pseudonimo',1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(0,0,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(1,0,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(2,0,0,2,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(3,0,0,3,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(4,0,0,4,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(5,0,0,5,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(6,0,0,6,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(7,0,0,7,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(8,0,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_CASO(id,NIC_ID,PERSONA_ID,TIPO_INTERVINIENTE_ID,created,updated) VALUES(9,0,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(0,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(1,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(2,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','ninguna','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(3,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','tramite poco eficiente','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(4,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','tramite poco eficiente','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(5,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','no','tramite poco eficiente','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(6,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','si','ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(7,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','si','ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(8,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','si','ninguna','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO SOLICITUD_PRE_ACUERDO(id,FUNDAMENTO_LEGAL,CONTENIDO_ACUERDO,FINALIDAD,PLAZO,APERCIBIMIENTO,SENIALAR,OBSERVACIONES,NIC_ID,created,updated) VALUES(9,'tramite legal','no presentar cargos','Tener resolucion clara','10 dias','poco','si','tramite poco eficiente','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(0,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(1,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(2,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(3,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(4,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(5,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(6,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(7,'18/1/17 19:20:59.221000000','falta de inspeccion','Se necesita mejorar los procesos en cuanto a las inspecciones','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(8,'18/1/17 19:20:59.221000000','procesos poco claros','Se necesita mejorar los procesos en cuanto a las inspecciones','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_INSPECCION(id,FECHA_HORA_INSPECCION,ADSCRIPCION,DESCRIPCION,NIC_ID,created,updated) VALUES(9,'18/1/17 19:20:59.221000000','procesos poco claros','Se necesita mejorar los procesos en cuanto a las inspecciones','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(0,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(1,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(2,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(3,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','0','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(4,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','2','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(5,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','2','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(6,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','1','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(7,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','0','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(8,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_PERICIAL(id,TIPO,HECHOS_NARRADOS,HECHOS_DENUNCIADOS,NO_OFICIO,DIRECTOR_INSTITUTO,PERITO_MATERIA,FINALIDAD,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,MEDICO_LEGISTA,REALIZADO_A,TIPO_EXAMEN_ID,NIC_ID,created,updated) VALUES(9,'Registro','Robo agravadd','Revision de escena','34546725643','Miguel Perez','Eder Atzin','Esclarecimiento de hechos','10','Asalto agravado','Ninguna','Pedro Morales','Victima','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(0,'34546725643','Juan Perez','Revision de escena','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(1,'34546725643','Juan Perez','Revision de escena','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(2,'34546725643','Juan Perez','Revision de escena','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(3,'34546725643','Juan Perez','Revision de escena','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(4,'34546725643','Juan Perez','Revision de escena','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(5,'34546725643','Juan Perez','Revision de escena','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(6,'34546725643','Juan Perez','Revision de escena','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(7,'34546725643','Juan Perez','Revision de escena','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(8,'34546725643','Juan Perez','Presencia en juicio','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_POLICIA(id,NO_OFICIO,NOMBRE_COMISARIO,ACTUACIONES_SOLICITADAS,NIC_ID,created,updated) VALUES(9,'34546725643','Juan Perez','Presencia en juicio','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(0,'2288547638','Proceso de registro','Solicitud de prioridad','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(1,'2288547638','Proceso de registro','Solicitud de prioridad','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(2,'2288547638','Proceso de registro','Solicitud de prioridad','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(3,'2288547638','Proceso de registro','Solicitud de prioridad','3','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(4,'2288547638','Proceso de registro','Solicitud de prioridad','4','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(5,'2288547638','Proceso de registro','Solicitud de prioridad','5','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(6,'2288547638','Proceso de registro','Solicitud de prioridad','6','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(7,'2288547638','Proceso de registro','Solicitud de prioridad','7','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(8,'2288547638','Proceso de registro','Llamada con duracion mas larga de la esperada','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REGISTRO(id,NO_TELEFONICO,ATENCION_LLAMADA,OBSERVACIONES,NIC_ID,created,updated) VALUES(9,'2288547638','Proceso de registro','Llamada con duracion mas larga de la esperada','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(0,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Asalto agravado','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(1,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Asalto agravado','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(2,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Asalto agravado','Solicitud no aprovada','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(3,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Asalto agravado','Solicitud no aprovada','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(4,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Robo a mano armada','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(5,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Robo a mano armada','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(6,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Robo a mano armada','Solicitud no aprovada','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(7,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','10','Robo a mano armada','Solicitud no aprovada','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(8,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','12','Asalto agravado','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO SOLICITUD_PRE_REQ_INFO(id,NO_OFICIO,FECHA_REQ,AUTORIDAD_REQ,CARGO_TURNO_ADSCRIPCION,DOMICILIO_AUTORIDAD,INFO_REQUERIDA,PLAZO_DIAS,APERCIBIMIENTO,OBSERVACIONES,NIC_ID,created,updated) VALUES(9,'34546725643','18/1/17 19:20:59.221000000','Juez','Juez','Xalapa','Nombre de los implicados','12','Asalto agravado','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(0,'Con fuerzas especiales','Primera','Pacho','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(1,'Con fuerzas especiales','Primera','Edomex','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(2,'Con fuerzas especiales','Primera','Carcel de maxima seguridad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(3,'Con fuerzas especiales','Segunda','Pacho','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(4,'Con fuerzas especiales','Segunda','Edomex','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(5,'Con fuerzas especiales','Segunda','Carcel de maxima seguridad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(6,'Con fuerzas especiales','Mas de dos veces','Pacho','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(7,'Con fuerzas especiales','Mas de dos veces','Edomex','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(8,'Con fuerzas especiales','Mas de dos veces','Carcel de maxima seguridad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TIPO_DETENIDO(id,TIPO_DETENCION,TIPO_REINCIDENCIA,CERESO,created,updated) VALUES(9,'Pacifica','Primera','Pacho','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,0);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,1);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,2);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,3);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,4);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,0,5);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,0,6);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,0,7);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,1,0);
INSERT INTO TIPO_RELACION_PERSONA(CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,1,1);

INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(0,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(1,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(2,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(3,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(4,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(5,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(6,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','2','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(7,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','2','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(8,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','0','2','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TRATA_PERSONA(id,ESTADO_ORIGEN_OTRO,MUNICIPIO_ORIGEN_OTRO,ESTADO_DESTINO_OTRO,MUNICIPIO_DESTINO_OTRO,PAIS_ORIGEN_ID,PAIS_DESTINO_ID,ESTADO_ORIGEN_ID,ESTADO_DESTINO_ID,MUNICIPIO_ORIGEN_ID,MUNICIPIO_DESTINO_ID,TIPO_TRANSPORTACION_ID,DETALLE_DELITO_ID,created,updated) VALUES(9,'Las hayas','Corona','Montevideo','La plata','0','0','0','0','0','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(0,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(1,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(2,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(3,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(4,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(5,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(6,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','1','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(7,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','0','1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(8,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','1','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO USUARIO(id,NOMBRE,PATERNO,MATERNO,CONTRASENIA,USERNAME,NUM_CONTACTO,EMAIL,NUM_GAFETE,CARGO,INHABILITAR,SEXO_ID,DISTRITO_ID,FISCALIA_ID,AGENCIA_ID,SUBDIRECCION_ID,BASE_ID,MUNICIPIO_ID,TURNO_ID,created,updated) VALUES(9,'Juan','Perez','Perez','password1','usuario1','2143546687','nombre@correo.com','1245','Empleado','0','0','0','0','0','1','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(0,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(1,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(2,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(3,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(4,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(5,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(6,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','1','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(7,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','0','1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(8,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','1','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO VEHICULO(id,MOTIVO_REGISTRO,CAMPO_VEHICULO,TARJETA_CIRCULACION,ECONOMICO,CLASE,MARCA,SUBMARCA,COLOR,MODELO,ESTADO_ORIGEN,PLACAS,PLACAS_ADICIONALES,REGISTRO_FEDERAL,SERIE,MOTOR,ASEGURADORA,FACTURA,DATOS_TOMADOS,POLIZA,VALOR_ESTIMADO,TIPO_USO,PROCEDENCIA,PEDIMENTO_IMPORTACION,LLEVA_CARGA,ALTERADO,SENAS_PARTICULARES,NOTAS,NIC_ID,MARCA_SUB_MARCA_ID,PROCEDENCIA_ASEGURADORA_ID,MOTIVO_REGISTRO_COLOR_CLASE_ID,TIPO_USO_TIPO_VEHICULO_ID,created,updated) VALUES(9,'Vehiculo robado','Auto','013455342323','Ahorrador','Alta','Nissan','Centra','Plata','Tsuru','Nuevo','wert14','0kjrhg435','Si','02345465654','24 caballos','Santander','312434534','completos','024543','2234534','analisis','Mexico','realizado','0','0','Golpe de choque','Carro Nuevo','0','1','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','0','0');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','0','1');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','0','2');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','1','0');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','1','1');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','1','2');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','2','0');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','2','1');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','2','2');
INSERT INTO VEHICULO_TIPO_RELACION_PERSONA(VEHICULO_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','1','0','0');

------------

INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(0,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','0','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(1,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','0','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','5678543234','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(2,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','0','CDMX','Buena','usuario1','450','10','Lazaro Hernandez','Fisica','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(3,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','0','CDMX','Buena','usuario1','450','10','Lazaro Hernandez','Fisica','CDMX','Juez','Ninguna','Denuncia presetada','5678543234','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(4,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','0','CDMX','Buena','usuario1','450','10','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(5,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos menores','1','CDMX','Buena','usuario1','450','10','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','5678543234','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(6,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos mayores','1','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Fisica','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(6,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos mayores','1','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Fisica','CDMX','Juez','Ninguna','Denuncia presetada','5678543234','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(7,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos mayores','1','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(8,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos mayores','1','CDMX','Buena','usuario1','450','0','Lazaro Hernandez','Digital','CDMX','Juez','Ninguna','Denuncia presetada','5678543234','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000')
INSERT INTO PREDENUNCIA(id,TIPO,NO_FOLIO_CONSTANCIA,HABLA_ESPANOL,IDIOMA,NOMBRE_INTERPRETE,COMPRENDIO_DERECHOS,PROPORCIONO_COPIA,AUTORIDAD_JURIDICO,CARGO_ADSCRIPCION_JURIDICO,DENUNCIA_QUERELLA,VICTIMA_OFENDIDO_QUERELLANTE,UBICACION_JURIDICO,CALIDAD_PERSONA,TIPO_PERSONA_ID,LUGAR_HECHOS,HECHOS_NARRADOS,CONCLUSION,CANALIZACION,INSTITUCION,MOTIVO,FECHA_CANALIZACION,HORA_CONLCUSION_LLAMADA,AUTORIDAD_OFICIO_ASIGNACION,VICTIMA_OFENDIDO,NOMBRE_PERSONA_REGISTRO,HORA_CANALIZACION,PERSONA_CAUSOHECHO,DOMICILIO_QUIEN_CAUSO,PERSONA_REGISTRO,OFICIO,NOMBRE_AUTORIDAD,NECESIDADES_CUBRIR,UBICACION_VICTIMA,OBSERVACIONES,TIPO_LINEA_TELEFONICA_ID,LUGAR_LLAMADA,CALIDAD_USUARIO,USUARIO,DURACION_LLAMADA,NUMERO_FOLI,NOMBRE_SERVIDOR_PUBLICO,COPIA_DERECHOS,UBICACION_UNIDAD,CARGO_AUTORIDAD,CARGO_AUTORIDAD_VICTIMA,CONCLUSION_HECHOS,NUMERO_TELEFONO,CANALIZA_OTRA_AREA,INSTITUCION_CANALIZACION,MOTIVO_CANALIZACION,created,updated) VALUES(9,'Presencial','13645312','0','Ingles','Jesus Castilla','1','0','Juez','Ministro','Hecha','Miguel Arcangeli','CDMX','Saludable','0','CDMX','Robo a mano armada en metro','Deudas de juego','0','PGR','Deudas','18/1/17 19:20:59.221000000','11:50','Juez','Erick Pavon','Jesus Castilla','3:40','1','Erick Pavon','Jesus Castilla','102543DDSC','Juan Perez','Denuncia de robo','CDMX','Danos mayores','1','CDMX','Buena','usuario1','450','10','Lazaro Hernandez','Fisica','CDMX','Juez','Ninguna','Denuncia presetada','0987634562','SI','PGJ','Otro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(0,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Medio','Perpretador','Ofensiva','Ninguna','1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(1,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Medio','Perpretador','Ofensiva','Ninguna','1','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(2,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(3,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(4,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(5,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(6,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(7,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','0','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(8,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO RELACION(id,TIPO,MODALIDAD,DELITO,ARMA,VEHICULO,FORMA_COMISION,IMPUTADO,VICTIMA,LUGAR,CONCURSO_DELITO,CLASIFICACION_DELITO_ORDEN,ELEMENTOS_COMISION,CLASIFICACION,FORMA_ACCION,CONSUMACION,GRADO_PARTICIPACION,RELACION_ACUSADO_OFENDIDO,FORMA_CONDUCTA,TIPO_DESAPARICION,VIOLENCIA_GENERO,FLAGRANCIA,NIC_ID,created,updated) VALUES(9,'Delincuente-Imputado','Cerrado','Asesinato','De Fuego','Automovil','Indirecta','Jesus Castilla','Ricardo Malpica','Xalapa','Accion y resultado','Bajo','Juez','Prioridad','A largo plazo','Incompleto','Bajo','Perpretador','Ofensiva','Ninguna','1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(0,'Oficial','Oficina','Jesus Castilla','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','0','Internet','Ninguna','Ninguna','0','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(1,'Oficial','Oficina','Jesus Castilla','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','0','Internet','Ninguna','Ninguna','1','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(2,'Oficial','Oficina','Jesus Castilla','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','0','Internet','Ninguna','Ninguna','2','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(3,'Oficial','Oficina','Jesus Castilla','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','1','Internet','Ninguna','Ninguna','0','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(4,'Oficial','Oficina','Jesus Castilla','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','1','Internet','Ninguna','Ninguna','1','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(5,'Oficial','Oficina','Ricardo Malpica','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','0','Computadora','1','Internet','Ninguna','Ninguna','2','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(6,'Oficial','Oficina','Ricardo Malpica','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','1','Computadora','0','Internet','Ninguna','Ninguna','0','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(7,'Oficial','Oficina','Ricardo Malpica','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','1','Computadora','0','Internet','Ninguna','Ninguna','1','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(8,'Oficial','Oficina','Ricardo Malpica','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','1','Computadora','0','Internet','Ninguna','Ninguna','2','6/10/17','6/10/17');
INSERT INTO ENTREVISTA(id,AUTORIDAD_REALIZA_ENTREVISTA,LUGAR_REALIZA_ENTREVISTA,NOMBRE_ENTREVISTADO,SEXO_ID,FECHA_NACIMIENTO,EDAD,NACIONALIDAD,ORIGINARIO_DE,ESTADO_MIGRATORIO,TIPO_INTERVINIENTE_ID,TIPO_IDENTIFICACION,EMISOR_IDENTIFICACION,NO_IDENTIFICACION,CURP,RFC,SABE_LEER_ESCRIBIR,GRADO_ESCOLARIDAD,OCUPACION,LUGAR_OCUPACION,ESTADO_CIVIL,SALARIO_SEMANAL,RELACION_ENTREVISTADO,CALLE,NO_EXTERIOR,NO_INTERIOR,COLONIA,CP,MUNICIPIO,ESTADO,NO_TELEFONO_PARTICULAR,NO_TELEFONO_CELULAR,CORREO_ELECTRONICO,TIENE_REPRESENTANTE_LEGAL,NOMBRE_REPRESENTANTE_LEGAL,MEDIO_TECNOLOGICO_REGISTRO,MEDIO_TECNOLOGICO_UTILIZADO,MEDIO_TECNICO_REGISTRO,MEDIO_TECNICO_UTILIZADO,NARRACION_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(9,'Oficial','Oficina','Ricardo Malpica','0','18/1/17','22','Mexicana','Veracruz','Residente','0','INE','Gobierno','02342345356','ASDF3143410EFWE','AFWEF231AES','0','licenciatura','estudiante','Veracruz','Soltero','230','Niguna','Colorado','104','10','Casa Blanca','91154','Xalapa','Veracruz','3356746570','123431120','nombre@correo.com','0','Juan Pavon','1','Computadora','1','Internet','Ninguna','Ninguna','0','6/10/17','6/10/17');

INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(0,'Pre Caso','Acusado','Juez','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(1,'Pre Caso','Acusado','Juez','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(2,'Pre Caso','Acusado','Juez','Indirecto','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(3,'Pre Caso','Acusado','Juez','Indirecto','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(4,'Pre Caso','Acusado','Ministro','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(5,'Pre Caso','Acusado','Ministro','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(6,'Pre Caso','Acusado','Ministro','Indirecto','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(7,'Pre Caso','Acusado','Ministro','Indirecto','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(8,'Pre Caso','Demandante','Juez','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ACUERDO(id,TIPO,NOMBRE_PERSONA_ACEPTA,PRESENTO_LLAMADA,MANIFESTO,SINTESIS_HECHOS,OBSERVACIONES,CASO_ID,created,updated) VALUES(9,'Pre Caso','Demandante','Juez','Directo','Se retiran los cargos por dinero','No se permite reincidir en el acuerdo','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(0,'Abogados SA','23435eqwr','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(1,'Abogados SA','qwer32424','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(2,'Abogados SA','8675iuyy','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(3,'Empleados SA','23435eqwr','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(4,'Empleados SA','qwer32424','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(5,'Empleados SA','8675iuyy','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(6,'Demandas SA','23435eqwr','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(7,'Demandas SA','qwer32424','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO AGENCIA(id,NOMBRE,CLAVE,created,updated) VALUES(8,'Demandas SA','8675iuyy','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(0,'Juez','18/1/17 19:20:59.221000000','Resumen del caso','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(1,'Juez','18/1/17 19:20:59.221000000','Resumen del caso','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(2,'Juez','18/1/17 19:20:59.221000000','Cargos','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(3,'Juez','18/1/17 19:20:59.221000000','Cargos','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(4,'Juez','12/03/17 14:52:05.221000000','Resumen del caso','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(5,'Juez','12/03/17 14:52:05.221000000','Resumen del caso','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(6,'Juez','12/03/17 14:52:05.221000000','Cargos','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(7,'Juez','12/03/17 14:52:05.221000000','Cargos','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(8,'Ministro','18/1/17 19:20:59.221000000','Resumen del caso','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ARCHIVO_TEMPORAL(id,CREADO_POR,FECHA_CREACION,OBSERVACIONES,CASO_ID,created,updated) VALUES(9,'Ministro','18/1/17 19:20:59.221000000','Resumen del caso','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','0','0');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','0','1');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','1','0');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','0','1','1');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','1','0','0');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','1','0','1');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','1','1','0');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','0','1','1','1');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','1','0','0','0');
INSERT INTO ARMA_TIPO_RELACION_PERSONA(ARMA_ID,CASO,PERSONA_CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES('0','1','0','0','1');

INSERT INTO BASE(id,NOMBRE,created,updated) VALUES(0,'Electivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO BASE(id,NOMBRE,created,updated) VALUES(1,'Optativo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO BASE(id,NOMBRE,created,updated) VALUES(2,'Ejecutivo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO BASE(id,NOMBRE,created,updated) VALUES(3,'Judicial','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DELITO(id,NOMBRE,created,updated) VALUES(0,'Robo','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO(id,NOMBRE,created,updated) VALUES(1,'Asesinato','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO(id,NOMBRE,created,updated) VALUES(2,'Secuestro','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DELITO(id,NOMBRE,created,updated) VALUES(3,'Extorcion','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(0,'0','Norte','dfwe2345','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(1,'0','Norte','234543dfad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(2,'0','Norte','afds2r2423','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(3,'0','Norte','234werw','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(4,'0','Sur','dfwe2345','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(5,'0','Sur','234543dfad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(6,'0','Sur','afds2r2423','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(7,'0','Sur','234werw','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(8,'0','Este','dfwe2345','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DISTRITO(id,ACTIVO,NOMBRE,CLAVE,created,updated) VALUES(9,'0','Este','234543dfad','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
-- INSERT INTO DOC_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ACUERDO_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ARCHIVO_TEMPORAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ARCHIVO_TEMPORAL_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_ENTREVISTA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,ENTREVISTA_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_PREDENUNCIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,PREDENUNCIA_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_ACUERDO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_ACUERDO_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_INSPECCION(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_INSPECCION_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_PERICIAL(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_PERICIAL_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_POLICIA(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_POLICIA_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REGISTRO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REGISTRO_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(0,'DE100001','path/to/document/1','Documento.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(1,'DE100001','path/to/document/1','Documento.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(2,'DE100001','path/to/document/1','Documento.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(3,'DE100001','path/to/document/1','Documento.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(4,'DE100001','path/to/document/1','Documento.pdf','pdf','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(5,'DE100001','path/to/document/1','Documento.pdf','pdf','1','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(6,'DE100001','path/to/document/1','Scan.pdf','pdf','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(7,'DE100001','path/to/document/1','Scan.pdf','pdf','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(8,'DE100001','path/to/document/1','Scan.pdf','pdf','0','2','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO DOC_SOL_PRE_REQ_INFO(id,UUID_ECM,PATH_ECM,NAME_ECM,CONTENT_TYPE,COMPARTIDO,SOLICITUD_PRE_REQ_INFO_ID,created,updated) VALUES(9,'DE100001','path/to/document/1','Scan.pdf','pdf','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(0,'0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(1,'0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(2,'0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(3,'0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(4,'1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(5,'1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(6,'1','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(7,'1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(8,'2','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO EFECTO_VIOLENCIA(id,EFECTO_DETALLE_ID,VIOLENCIA_GENERO_ID,DETALLE_DELITO_ID,created,updated) VALUES(9,'2','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');



INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,0);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,0,1);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,1,0);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,0,1,1);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,1,0,0);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,1,0,1);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,1,1,0);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(0,1,1,1);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,0,0);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,0,1);
INSERT INTO LUGAR_TIPO_RELACION_PERSONA(LUGAR_ID,CASO,DETALLE_DELITO,PERSONA_CASO_RELACIONADA) VALUES(1,0,1,0);

INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(0,'0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(1,'0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(2,'1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(3,'1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(4,'2','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PROCEDENCIA_ASEGURADORA(id,PROCEDENCIA,ASEGURADORA,created,updated) VALUES(5,'2','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO ROL(id,CLAVE,created,updated) VALUES(0,'qwerq1234132','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ROL(id,CLAVE,created,updated) VALUES(1,'125341FGTRSF','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ROL(id,CLAVE,created,updated) VALUES(2,'2WERGWE12342','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO ROL(id,CLAVE,created,updated) VALUES(3,'WWFWWRE23423','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(0,'18/1/17 19:20:59.221000000','0','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(1,'18/1/17 19:20:59.221000000','0','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(2,'18/1/17 19:20:59.221000000','0','0','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(3,'18/1/17 19:20:59.221000000','0','0','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(4,'18/1/17 19:20:59.221000000','0','1','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(5,'18/1/17 19:20:59.221000000','0','1','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(6,'18/1/17 19:20:59.221000000','0','1','1','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(7,'18/1/17 19:20:59.221000000','0','1','1','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(8,'18/1/17 19:20:59.221000000','1','0','0','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO TITULARES(id,FECHA_ASIGNACION,CASO_ID,PROPIETARIO_ID,ASIGNADO_ID,ASIGNACION_ID,created,updated) VALUES(9,'18/1/17 19:20:59.221000000','1','0','0','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO USUARIOROL(USUARIO,ROL) VALUES(1,1);
INSERT INTO USUARIOROL(USUARIO,ROL) VALUES(1,0);
INSERT INTO USUARIOROL(USUARIO,ROL) VALUES(0,1);
INSERT INTO USUARIOROL(USUARIO,ROL) VALUES(0,0);

INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(0,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(1,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(2,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Proceso tarda mas de lo esperado','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(3,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Proceso tarda mas de lo esperado','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(4,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Miguel Arcangelis','Economico','Policia estatal','Niguna','Negligencia','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(5,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Miguel Arcangelis','Economico','Policia estatal','Niguna','Negligencia','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(6,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Miguel Arcangelis','Economico','Policia estatal','Niguna','Negligencia','Proceso tarda mas de lo esperado','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(7,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','asalto en movimiento','total','deudas a gente inapropiada','Miguel Arcangelis','Economico','Policia estatal','Niguna','Negligencia','Proceso tarda mas de lo esperado','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(8,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','robo cuando los duenos dejaron el hogar','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Ninguna','0','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO NO_EJERCICIO_ACCION_PENAL(id,NARRACION_HECHOS,DATOS_PRUEBA,FECHA_HECHO_DELICTIVO,ARTICULO_CPEM,HIPOTESIS_CNPP,FRACCION_ARTICULO,HIPOTESIS_SOBRESEIMIENTO,NOMBRE_PROCURADOR,AMBITO_HECHOS,AUTORIDAD_COMPETENTE,CAUSA_INCOMPETENCIA,CARGO_AUTORIDAD_COMPETENTE,OBSERVACIONES,CASO_ID,created,updated) VALUES(9,'Asalto agravado','Testigo','18/1/17 19:20:59.221000000','pistola','robo cuando los duenos dejaron el hogar','total','deudas a gente inapropiada','Juan Perez','Economico','Policia estatal','Niguna','Negligencia','Ninguna','1','6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO PERSONA_NIC(id,nic_id,persona_id,created,updated) VALUES(0,0,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_NIC(id,nic_id,persona_id,created,updated) VALUES(1,1,0,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_NIC(id,nic_id,persona_id,created,updated) VALUES(2,0,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');
INSERT INTO PERSONA_NIC(id,nic_id,persona_id,created,updated) VALUES(3,1,1,'6/10/17 14:52:05.221000000','6/10/17 14:52:05.221000000');

INSERT INTO TIPO_LINEA();

