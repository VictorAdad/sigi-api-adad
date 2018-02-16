-----------------------------------------------------
-----------------------------------------------------
--- INTERPRETE
--- Catálogo de interoperabilidad
--- http://sigejupe2.pjedomex.gob.mx/sigejupe/catalogos/interpretes.json
--- ID homologados de acuerdo a TSJ (21/12/17)
-----------------------------------------------------
-----------------------------------------------------
INSERT INTO INTERPRETE (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (1,'SI',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO INTERPRETE (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (2,'NO',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO INTERPRETE (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (3,'NO ESPECIFICADO',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
INSERT INTO INTERPRETE (ID,NOMBRE,ACTIVO,CREATED,UPDATED) VALUES (4,'NO APLICA',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP);
ALTER SEQUENCE INTERPRETE_SEQ INCREMENT BY 4;
