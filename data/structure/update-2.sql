ALTER TABLE entrevista DROP COLUMN salario_semanal;
alter table entrevista ADD salario_semanal number(6,2);

-- Se obtienen los valores del campo salario_semanal de la tabla entrevista
-- select 'UPDATE ENTREVISTA SET SALARIO_SEMANAL = '||salario_semanal||' WHERE ID = '||id from entrevista where salario_semanal is not null;

--- sigi_backend_test
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 10 WHERE ID = 2;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 300 WHERE ID = 43;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 678 WHERE ID = 60;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 678 WHERE ID = 59;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 900 WHERE ID = 42;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 999 WHERE ID = 62;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 150 WHERE ID = 63;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 300 WHERE ID = 53;

-- sigi_backend
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 500 WHERE ID = 1;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 108 WHERE ID = 11;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 3 WHERE ID = 9;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 100 WHERE ID = 10;
UPDATE ENTREVISTA SET SALARIO_SEMANAL = 500 WHERE ID = 2;

