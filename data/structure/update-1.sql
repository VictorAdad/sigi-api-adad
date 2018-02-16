--describe predenuncia;

ALTER TABLE predenuncia DROP COLUMN hora_conclusion_llamada;
alter table predenuncia ADD hora_conclusion_llamada varchar2(255);

--describe titulares;

ALTER TABLE titulares DROP COLUMN propietario_id;
alter table titulares ADD user_name_propietario varchar2(255);

ALTER TABLE titulares DROP COLUMN asignado_id;
alter table titulares ADD user_name_asignado varchar2(255);

ALTER TABLE titulares DROP COLUMN asignacion_id;
alter table titulares ADD user_name_asignacion varchar2(255);

alter table titulares add vigente number(1) default 0 not null;
