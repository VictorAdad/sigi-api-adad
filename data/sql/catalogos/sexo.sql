-----------------------------------------------------
-----------------------------------------------------
--- SEXO
--- Catálogo de interoperabilidad
--- http://sigejupe2.pjedomex.gob.mx/sigejupe/catalogos/generos.json
--- ID homologados de acuerdo a TSJ (21/12/17)
-----------------------------------------------------
-----------------------------------------------------
INSERT INTO SEXO (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (1,'HOMBRE',1,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO SEXO (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (2,'MUJER',1,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO SEXO (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (3,'NO IDENTIFICADO',1,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO SEXO (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (4,'NO APLICA',1,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
alter sequence SEXO_SEQ increment by 4;
