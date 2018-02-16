# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table acuerdo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  nombre_persona_acepta         varchar2(255),
  presento_llamada              varchar2(255),
  manifesto                     varchar2(2000),
  sintesis_hechos               varchar2(2000),
  observaciones                 varchar2(2000),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_acuerdo primary key (id)
);
create sequence acuerdo_seq increment by 1;

create table adiccion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_adiccion primary key (id)
);
create sequence adiccion_seq increment by 1;

create table agencia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  clave                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_agencia primary key (id)
);
create sequence agencia_seq increment by 1;

create table alfabetismo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_alfabetismo primary key (id)
);
create sequence alfabetismo_seq increment by 1;

create table alias_nombre_persona (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  tipo                          varchar2(255),
  persona_id                    number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_alias_nombre_persona primary key (id)
);
create sequence alias_nombre_persona_seq increment by 1;

create table archivo_temporal (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  creado_por                    varchar2(255),
  fecha_creacion                timestamp,
  observaciones                 varchar2(255),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_archivo_temporal primary key (id)
);
create sequence archivo_temporal_seq increment by 1;

create table arma (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  notas                         varchar2(2000),
  serie                         number(10) not null,
  matricula                     varchar2(255),
  nic_id                        number(19),
  clase_arma_id                 number(19),
  calibre_mecanismo_id          number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_arma primary key (id)
);
create sequence arma_seq increment by 1;

create table arma_tipo_relacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  arma_id                       number(19),
  tipo_relacion_persona_id      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_arma_tipo_relacion primary key (id)
);
create sequence Arma_Tipo_Relacion_seq increment by 1;

create table base (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_base primary key (id)
);
create sequence base_seq increment by 1;

create table cabello (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  cantidad                      varchar2(255),
  color                         varchar2(255),
  forma                         varchar2(255),
  calvicie                      varchar2(255),
  implantacion                  varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_cabello primary key (id)
);
create sequence cabello_seq increment by 1;

create table calibre_mecanismo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  mecanismo                     varchar2(255),
  calibre                       varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_calibre_mecanismo primary key (id)
);
create sequence calibre_mecanismo_seq increment by 1;

create table cara_nariz (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  forma_cara                    varchar2(255),
  raiz_nariz                    varchar2(255),
  dorso_nariz                   varchar2(255),
  ancho_nariz                   varchar2(255),
  base_nariz                    varchar2(255),
  altura_nariz                  varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_cara_nariz primary key (id)
);
create sequence cara_nariz_seq increment by 1;

create table nic (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  titulo                        varchar2(255),
  descripcion                   varchar2(2000),
  nic                           varchar2(255),
  nuc                           varchar2(255),
  estatus_id                    number(19),
  agencia_id                    number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_nic primary key (id)
);
create sequence NIC_seq increment by 1;

create table catalogo_sincronizacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre_catalogo               varchar2(255),
  uuid                          varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_catalogo_sincronizacion primary key (id)
);
create sequence catalogo_sincronizacion_seq increment by 1;

create table ceja_boca (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  direccion_ceja                varchar2(255),
  implantacion_ceja             varchar2(255),
  forma_ceja                    varchar2(255),
  tamanio_ceja                  varchar2(255),
  tamanio_boca                  varchar2(255),
  comisuras_boca                varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_ceja_boca primary key (id)
);
create sequence ceja_boca_seq increment by 1;

create table clase_arma (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  clase_arma                    varchar2(255),
  tipo                          varchar2(255),
  subtipo                       varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_clase_arma primary key (id)
);
create sequence clase_arma_seq increment by 1;

create table clasificacion_delito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_clasificacion_delito primary key (id)
);
create sequence clasificacion_delito_seq increment by 1;

create table clasificacion_delito_orden (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_clasificacion_delito_orden primary key (id)
);
create sequence clasificacion_delito_orden_seq increment by 1;

create table colonia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  cp                            varchar2(255),
  municipio_id                  number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_colonia primary key (id)
);
create sequence colonia_seq increment by 1;

create table complexion_piel_sangre (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo_complexion               varchar2(255),
  color_piel                    varchar2(255),
  tipo_sangre                   varchar2(255),
  factor_rhsangre               varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_complexion_piel_sangre primary key (id)
);
create sequence complexion_piel_sangre_seq increment by 1;

create table concurso_delito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_concurso_delito primary key (id)
);
create sequence concurso_delito_seq increment by 1;

create table conducta_detalle (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  conducta                      varchar2(255),
  detalle                       varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_conducta_detalle primary key (id)
);
create sequence conducta_detalle_seq increment by 1;

create table delito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_delito primary key (id)
);
create sequence delito_seq increment by 1;

create table delito_caso (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  principal                     NUMBER(1,0) default 0 not null,
  nic_id                        number(19),
  delito_id                     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_delito_caso primary key (id)
);
create sequence delito_caso_seq increment by 1;

create table denuncia_querella (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_denuncia_querella primary key (id)
);
create sequence denuncia_querella_seq increment by 1;

create table desaparicion_consumacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  consumacion                   varchar2(255),
  tipo_desaparicion             varchar2(255),
  relacion_acusado              varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_desaparicion_consumacion primary key (id)
);
create sequence desaparicion_consumacion_seq increment by 1;

create table detalle_delito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  violencia_genero              NUMBER(1,0) default 0 not null,
  flagraancia                   NUMBER(1,0) default 0,
  modalidad_delito_id           number(19),
  forma_comision_id             number(19),
  concurso_delito_id            number(19),
  clasificacion_delito_orden_id number(19),
  delito_caso_id                number(19),
  elemento_comision_id          number(19),
  clasificacion_delito_id       number(19),
  forma_accion_id               number(19),
  desaparicion_consumacion_id   number(19),
  grado_participacion_id        number(19),
  forma_conducta_id             number(19),
  violencia_genero_id           number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_detalle_delito primary key (id)
);
create sequence detalle_delito_seq increment by 1;

create table detalle_detenido (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  fecha_detencion               timestamp,
  fecha_declaracion             timestamp,
  tipo_detenido_id              number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_detalle_detenido primary key (id)
);
create sequence detalle_detenido_seq increment by 1;

create table detalle_lugar (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo_lugar                    varchar2(255),
  tipo_zona                     varchar2(255),
  dia                           varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_detalle_lugar primary key (id)
);
create sequence detalle_lugar_seq increment by 1;

create table distrito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  clave                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_distrito primary key (id)
);
create sequence distrito_seq increment by 1;

create table doc_acuerdo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  acuerdo_id                    number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_acuerdo primary key (id)
);
create sequence doc_acuerdo_seq increment by 1;

create table doc_archivo_temporal (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  archivo_temporal_id           number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_archivo_temporal primary key (id)
);
create sequence doc_archivo_temporal_seq increment by 1;

create table doc_entrevista (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  entrevista_id                 number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_entrevista primary key (id)
);
create sequence doc_entrevista_seq increment by 1;

create table doc_facultad_no_investigar (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  facultad_no_investigar_id     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_facultad_no_investigar primary key (id)
);
create sequence doc_facultad_no_investigar_seq increment by 1;

create table doc_nic (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_nic primary key (id)
);
create sequence doc_nic_seq increment by 1;

create table doc_no_ejercicio_accion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  no_ejercicio_accion_penal_id  number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_no_ejercicio_accion primary key (id)
);
create sequence doc_no_ejercicio_accion_seq increment by 1;

create table doc_predenuncia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  predenuncia_id                number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_predenuncia primary key (id)
);
create sequence doc_predenuncia_seq increment by 1;

create table doc_sol_pre_acuerdo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_acuerdo_id      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_acuerdo primary key (id)
);
create sequence doc_sol_pre_acuerdo_seq increment by 1;

create table doc_sol_pre_inspeccion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_inspeccion_id   number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_inspeccion primary key (id)
);
create sequence doc_sol_pre_inspeccion_seq increment by 1;

create table doc_sol_pre_pericial (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_pericial_id     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_pericial primary key (id)
);
create sequence doc_sol_pre_pericial_seq increment by 1;

create table doc_sol_pre_policia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_policia_id      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_policia primary key (id)
);
create sequence doc_sol_pre_policia_seq increment by 1;

create table doc_sol_pre_registro (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_registro_id     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_registro primary key (id)
);
create sequence doc_sol_pre_registro_seq increment by 1;

create table doc_sol_pre_req_info (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  uuid_ecm                      varchar2(255),
  path_ecm                      varchar2(255),
  name_ecm                      varchar2(255),
  content_type                  varchar2(255),
  compartido                    NUMBER(1,0) default 0 not null,
  solicitud_pre_req_info_id     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_doc_sol_pre_req_info primary key (id)
);
create sequence doc_sol_pre_req_info_seq increment by 1;

create table efecto_detalle (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  efecto                        varchar2(255),
  detalle                       varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_efecto_detalle primary key (id)
);
create sequence efecto_detalle_seq increment by 1;

create table efecto_violencia (
  id                            number(19) not null,
  detalle_delito_id             number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  efecto_detalle_id             number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_efecto_violencia primary key (id)
);
create sequence efecto_violencia_seq increment by 1;

create table elemento_comision (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_elemento_comision primary key (id)
);
create sequence elemento_comision_seq increment by 1;

create table entrevista (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  autoridad_realiza_entrevista  varchar2(255),
  lugar_realiza_entrevista      varchar2(255),
  nombre_entrevistado           varchar2(255),
  sexo_id                       number(19),
  fecha_nacimiento              timestamp,
  edad                          number(10),
  nacionalidad                  varchar2(255),
  originario_de                 varchar2(255),
  estado_migratorio             varchar2(255),
  tipo_interviniente_id         number(19),
  tipo_identificacion           varchar2(255),
  emisor_identificacion         varchar2(255),
  no_identificacion             varchar2(255),
  curp                          varchar2(255),
  rfc                           varchar2(255),
  sabe_leer_escribir            NUMBER(1,0) default 0 not null,
  grado_escolaridad             varchar2(255),
  ocupacion                     varchar2(255),
  lugar_ocupacion               varchar2(255),
  estado_civil                  varchar2(255),
  salario_semanal               number(6,2),
  relacion_entrevistado         varchar2(255),
  calle                         varchar2(255),
  no_exterior                   varchar2(255),
  no_interior                   varchar2(255),
  colonia                       varchar2(255),
  cp                            varchar2(255),
  municipio                     varchar2(255),
  estado                        varchar2(255),
  no_telefono_particular        varchar2(255),
  no_telefono_celular           varchar2(255),
  correo_electronico            varchar2(255),
  tiene_representante_legal     NUMBER(1,0) default 0 not null,
  nombre_representante_legal    varchar2(255),
  medio_tecnologico_registro    NUMBER(1,0) default 0 not null,
  medio_tecnologico_utilizado   varchar2(255),
  medio_tecnico_registro        NUMBER(1,0) default 0 not null,
  medio_tecnico_utilizado       varchar2(255),
  narracion_hechos              varchar2(2000),
  observaciones                 varchar2(2000),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_entrevista primary key (id)
);
create sequence entrevista_seq increment by 1;

create table escolaridad (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_escolaridad primary key (id)
);
create sequence escolaridad_seq increment by 1;

create table estado (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  pais_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_estado primary key (id)
);
create sequence estado_seq increment by 1;

create table estado_civil (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_estado_civil primary key (id)
);
create sequence estado_civil_seq increment by 1;

create table estatus (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_estatus primary key (id)
);
create sequence estatus_seq increment by 1;

create table facultad_no_investigar (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  sintesis_hechos               varchar2(2000),
  datos_prueba                  varchar2(2000),
  motivos_abstuvo_investigar    varchar2(2000),
  medio_alternativo_solucion    varchar2(2000),
  destinatario_determinacion    varchar2(2000),
  superior_jerarquico           varchar2(2000),
  observaciones                 varchar2(2000),
  nombre_denunciante            varchar2(255),
  originario_denunciante        varchar2(255),
  edad_denunciante              Number(3),
  domicilio_denunciante         varchar2(255),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_facultad_no_investigar primary key (id)
);
create sequence facultad_no_investigar_seq increment by 1;

create table fiscalia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  clave                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_fiscalia primary key (id)
);
create sequence fiscalia_seq increment by 1;

create table forma_accion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_forma_accion primary key (id)
);
create sequence forma_accion_seq increment by 1;

create table forma_comision (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_forma_comision primary key (id)
);
create sequence forma_comision_seq increment by 1;

create table forma_conducta (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_forma_conducta primary key (id)
);
create sequence forma_conducta_seq increment by 1;

create table frente_menton (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  altura_frente                 varchar2(255),
  inclinacion_frente            varchar2(255),
  ancho_frente                  varchar2(255),
  tipo_menton                   varchar2(255),
  forma_menton                  varchar2(255),
  inclinacion_menton            varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_frente_menton primary key (id)
);
create sequence frente_menton_seq increment by 1;

create table grado_participacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_grado_participacion primary key (id)
);
create sequence grado_participacion_seq increment by 1;

create table grupo_etnico (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_grupo_etnico primary key (id)
);
create sequence grupo_etnico_seq increment by 1;

create table hipotesis_ambito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  hipotesis_sobreseimiento      varchar2(2000),
  ambito_hechos                 varchar2(2000),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_hipotesis_ambito primary key (id)
);
create sequence hipotesis_ambito_seq increment by 1;

create table hostigamiento_acoso (
  id                            number(19) not null,
  detalle_delito_id             number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  modalidad_ambito_id           number(19),
  conducta_detalle_id           number(19),
  testigo_id                    number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_hostigamiento_acoso primary key (id)
);
create sequence hostigamiento_acoso_seq increment by 1;

create table idioma_identificacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  habla_espaniol                varchar2(255),
  lengua_indigena               varchar2(255),
  familia_linguistica           varchar2(255),
  identificacion                varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_idioma_identificacion primary key (id)
);
create sequence idioma_identificacion_seq increment by 1;

create table interprete (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_interprete primary key (id)
);
create sequence interprete_seq increment by 1;

create table labio_ojo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  espesor_labio                 varchar2(255),
  altura_naso_labial_labio      varchar2(255),
  prominencia_labio             varchar2(255),
  color_ojo                     varchar2(255),
  forma_ojo                     varchar2(255),
  tamanio_ojo                   varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_labio_ojo primary key (id)
);
create sequence labio_ojo_seq increment by 1;

create table localidad (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  colonia_id                    number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_localidad primary key (id)
);
create sequence localidad_seq increment by 1;

create table localizacion_persona (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  pais_id                       number(19),
  estado_id                     number(19),
  municipio_id                  number(19),
  colonia_id                    number(19),
  localidad_id                  number(19),
  calle                         varchar2(255),
  no_exterior                   varchar2(255),
  no_interior                   varchar2(255),
  cp                            number(10),
  tipo_domicilio_id             number(19),
  referencias                   varchar2(2000),
  tel_particular                varchar2(255),
  tel_trabajo                   varchar2(255),
  extension                     number(10),
  tel_movil                     varchar2(255),
  fax                           varchar2(255),
  otro_medio_contacto           varchar2(255),
  correo                        varchar2(255),
  tipo_recidencia               varchar2(255),
  persona_id                    number(19),
  estado_otro                   varchar2(255),
  municipio_otro                varchar2(255),
  colonia_otro                  varchar2(255),
  localidad_otro                varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_localizacion_persona primary key (id)
);
create sequence localizacion_persona_seq increment by 1;

create table lugar (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  detalle_lugar_id              number(19),
  calle                         varchar2(255),
  no_interior                   varchar2(255),
  no_exterior                   varchar2(255),
  referencias                   varchar2(2000),
  pais_id                       number(19),
  estado_id                     number(19),
  municipio_id                  number(19),
  colonia_id                    number(19),
  cp                            number(10),
  fecha                         timestamp,
  descripcion_lugar             varchar2(2000),
  refe_geograficas              varchar2(2000),
  notas                         varchar2(2000),
  nic_id                        number(19),
  estado_otro                   varchar2(255),
  municipio_otro                varchar2(255),
  colonia_otro                  varchar2(255),
  longitud                      number(10,8),
  latitud                       number(10,8),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_lugar primary key (id)
);
create sequence lugar_seq increment by 1;

create table lugar_tipo_relacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  lugar_id                      number(19),
  tipo_relacion_persona_id      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_lugar_tipo_relacion primary key (id)
);
create sequence Lugar_Tipo_Relacion_seq increment by 1;

create table marca_sub_marca (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  marca                         varchar2(255),
  submarca                      varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_marca_sub_marca primary key (id)
);
create sequence marca_sub_marca_seq increment by 1;

create table media_filiacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  usa_anteojos                  NUMBER(1,0) default 0 not null,
  cicatrices                    varchar2(255),
  tatuajes                      varchar2(255),
  lunares                       varchar2(255),
  disminuciones_fisicas         varchar2(255),
  protesis                      varchar2(255),
  otras                         varchar2(255),
  estatura                      varchar2(255),
  peso                          varchar2(255),
  persona_id                    number(19),
  oreja_derecha_id              number(19),
  oreja_izquierda_id            number(19),
  complexion_piel_sangre_id     number(19),
  cara_nariz_id                 number(19),
  frente_menton_id              number(19),
  ceja_boca_id                  number(19),
  cabello_id                    number(19),
  labio_ojo_id                  number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint uq_media_filiacion_persona_id unique (persona_id),
  constraint pk_media_filiacion primary key (id)
);
create sequence media_filiacion_seq increment by 1;

create table modalidad_ambito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  modalidad                     varchar2(255),
  ambito                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_modalidad_ambito primary key (id)
);
create sequence modalidad_ambito_seq increment by 1;

create table modalidad_delito (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_modalidad_delito primary key (id)
);
create sequence modalidad_delito_seq increment by 1;

create table motivo_color_clase (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  motivo_registro               varchar2(255),
  clase                         varchar2(255),
  color                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_motivo_color_clase primary key (id)
);
create sequence motivo_color_clase_seq increment by 1;

create table municipio (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  estado_id                     number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_municipio primary key (id)
);
create sequence municipio_seq increment by 1;

create table nacionalidad_religion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  religion                      varchar2(255),
  nacionalidad                  varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_nacionalidad_religion primary key (id)
);
create sequence nacionalidad_religion_seq increment by 1;

create table no_ejercicio_accion_penal (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  narracion_hechos              varchar2(2000),
  datos_prueba                  varchar2(2000),
  fecha_hecho_delictivo         timestamp,
  articulo_cpem                 varchar2(255),
  hipotesis_cnpp                varchar2(2000),
  fraccion_articulo             varchar2(255),
  hipotesis_sobreseimiento      varchar2(255),
  nombre_procurador             varchar2(255),
  ambito_hechos                 varchar2(255),
  autoridad_competente          varchar2(255),
  causa_incompetencia           varchar2(2000),
  cargo_autoridad_competente    varchar2(255),
  observaciones                 varchar2(2000),
  caso_id                       number(19),
  hipotesis_ambito_id           number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_no_ejercicio_accion_penal primary key (id)
);
create sequence no_ejercicio_accion_penal_seq increment by 1;

create table ocupacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_ocupacion primary key (id)
);
create sequence ocupacion_seq increment by 1;

create table oreja (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  forma                         varchar2(255),
  helix_original                varchar2(255),
  helix_superior                varchar2(255),
  helix_posterior               varchar2(255),
  helix_adherencia              varchar2(255),
  lobulo_contorno               varchar2(255),
  lobulo_adherencia             varchar2(255),
  lobulo_particularidad         varchar2(255),
  lobulo_dimension              varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_oreja primary key (id)
);
create sequence oreja_seq increment by 1;

create table pais (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_pais primary key (id)
);
create sequence pais_seq increment by 1;

create table perito_materia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_perito_materia primary key (id)
);
create sequence perito_materia_seq increment by 1;

create table persona (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  paterno                       varchar2(255),
  materno                       varchar2(255),
  edad                          number(10) not null,
  curp                          varchar2(255),
  razon_social                  varchar2(255),
  rfc                           varchar2(255),
  num_hijos                     varchar2(255),
  fecha_nacimiento              timestamp,
  lugar_trabajo                 varchar2(255),
  ingreso_mensual               number(19,4),
  tipo_persona                  varchar2(255),
  autoridad_emisora             varchar2(255),
  folio_identificacion          varchar2(255),
  nacionalidad_religion_id      number(19),
  idioma_identificacion_id      number(19),
  pais_id                       number(19),
  estado_id                     number(19),
  municipio_id                  number(19),
  interprete_id                 number(19),
  sexo_id                       number(19),
  escolaridad_id                number(19),
  ocupacion_id                  number(19),
  estado_civil_id               number(19),
  grupo_etnico_id               number(19),
  alfabetismo_id                number(19),
  adiccion_id                   number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_persona primary key (id)
);
create sequence persona_seq increment by 1;

create table persona_nic (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nic_id                        number(19),
  persona_id                    number(19),
  tipo_interviniente_id         number(19),
  detalle_detenido_id           number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_persona_nic primary key (id)
);
create sequence PERSONA_NIC_seq increment by 1;

create table predenuncia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  no_folio_constancia           varchar2(255),
  habla_espaniol                NUMBER(1,0) default 0 not null,
  lengua_idioma                 varchar2(255),
  nombre_interprete             varchar2(255),
  compredio_derechos            NUMBER(1,0) default 0 not null,
  proporciono_copia             NUMBER(1,0) default 0 not null,
  calidad_persona               varchar2(255),
  lugar_hechos                  varchar2(2000),
  hechos_narrados               varchar2(2000),
  conclusion                    varchar2(2000),
  canalizacion                  NUMBER(1,0) default 0 not null,
  institucion                   varchar2(255),
  motivo_canalizacion           varchar2(2000),
  fecha_canalizacion            timestamp,
  domicilio_causante            varchar2(255),
  nombre_causante               varchar2(255),
  quien_registro                varchar2(255),
  no_telefonico                 varchar2(255),
  lugar_llamada                 varchar2(255),
  comunicado                    varchar2(2000),
  hora_conclusion_llamada       varchar2(255),
  duracion_llamada              varchar2(255),
  observaciones                 varchar2(2000),
  tipo_persona_id               number(19),
  tipo_linea_id                 number(19),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_predenuncia primary key (id)
);
create sequence predenuncia_seq increment by 1;

create table presento_llamada (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_presento_llamada primary key (id)
);
create sequence presento_llamada_seq increment by 1;

create table procedencia_aseguradora (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  procedencia                   varchar2(255),
  aseguradora                   varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_procedencia_aseguradora primary key (id)
);
create sequence procedencia_aseguradora_seq increment by 1;

create table relacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  modalidad                     varchar2(255),
  delito                        varchar2(255),
  arma                          varchar2(255),
  vehiculo                      varchar2(255),
  forma_comision                varchar2(255),
  imputado                      varchar2(255),
  victima                       varchar2(255),
  lugar                         varchar2(255),
  concurso_delito               varchar2(255),
  clasificacion_delito_orden    varchar2(255),
  elementos_comision            varchar2(255),
  clasificacion                 varchar2(255),
  forma_accion                  varchar2(255),
  consumacion                   varchar2(255),
  grado_participacion           varchar2(255),
  relacion_acusado_ofendido     varchar2(255),
  forma_conducta                varchar2(255),
  tipo_desaparicion             varchar2(255),
  violencia_genero              NUMBER(1,0) default 0,
  flagrancia                    NUMBER(1,0) default 0,
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_relacion primary key (id)
);
create sequence relacion_seq increment by 1;

create table rol (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  clave                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_rol primary key (id)
);
create sequence rol_seq increment by 1;

create table sexo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_sexo primary key (id)
);
create sequence sexo_seq increment by 1;

create table solicitud_pre_acuerdo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  fundamento_legal              varchar2(255),
  contenido_acuerdo             varchar2(255),
  finalidad                     varchar2(255),
  plazo                         varchar2(255),
  apercibimiento                varchar2(255),
  senialar                      varchar2(255),
  observaciones                 varchar2(2000),
  no_oficio_atencion            varchar2(2000),
  cargo_adscripcion_atencion    varchar2(2000),
  necesidades                   varchar2(2000),
  ubicacion_atencion            varchar2(2000),
  autoridad_juridico            varchar2(2000),
  cargo_adscripcion_juridico    varchar2(2000),
  ubicacion_juridico            varchar2(2000),
  denuncia_querella_id          number(19),
  victima_quellerante_id        number(19),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_acuerdo primary key (id)
);
create sequence solicitud_pre_acuerdo_seq increment by 1;

create table solicitud_pre_inspeccion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  fecha_hora_inspeccion         timestamp,
  adscripcion                   varchar2(255),
  descripcion                   varchar2(2000),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_inspeccion primary key (id)
);
create sequence solicitud_pre_inspeccion_seq increment by 1;

create table solicitud_pre_pericial (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  hechos_narrados               varchar2(2000),
  hechos_denunciados            varchar2(2000),
  no_oficio                     varchar2(255),
  director_instituto            varchar2(255),
  finalidad                     varchar2(255),
  plazo_dias                    varchar2(255),
  apercibimiento                varchar2(255),
  observaciones                 varchar2(2000),
  medico_legista                varchar2(255),
  realizado_a                   varchar2(255),
  tipo_examen_id                number(19),
  perito_materia_id             number(19),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_pericial primary key (id)
);
create sequence solicitud_pre_pericial_seq increment by 1;

create table solicitud_pre_policia (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  no_oficio                     varchar2(255),
  nombre_comisario              varchar2(255),
  actuaciones_solicitadas       varchar2(255),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_policia primary key (id)
);
create sequence solicitud_pre_policia_seq increment by 1;

create table solicitud_pre_registro (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  contenido_constancia          varchar2(2000),
  no_telefonico                 varchar2(255),
  atencion_llamada              varchar2(255),
  observaciones                 varchar2(2000),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_registro primary key (id)
);
create sequence solicitud_pre_registro_seq increment by 1;

create table solicitud_pre_req_info (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  no_oficio                     varchar2(255),
  fecha_req                     timestamp,
  autoridad_req                 varchar2(255),
  cargo_turno_adscripcion       varchar2(255),
  domicilio_autoridad           varchar2(255),
  info_requerida                varchar2(255),
  plazo_dias                    varchar2(255),
  apercibimiento                varchar2(255),
  observaciones                 varchar2(2000),
  nic_id                        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_solicitud_pre_req_info primary key (id)
);
create sequence solicitud_pre_req_info_seq increment by 1;

create table subdireccion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_subdireccion primary key (id)
);
create sequence subdireccion_seq increment by 1;

create table tipo_detenido (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo_detencion                varchar2(255),
  tipo_reincidencia             varchar2(255),
  cereso                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_detenido primary key (id)
);
create sequence tipo_detenido_seq increment by 1;

create table tipo_domicilio (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  activo                        NUMBER(1,0) default 1 not null,
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_domicilio primary key (id)
);
create sequence tipo_domicilio_seq increment by 1;

create table tipo_examen (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_examen primary key (id)
);
create sequence tipo_examen_seq increment by 1;

create table tipo_interviniente (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_interviniente primary key (id)
);
create sequence tipo_interviniente_seq increment by 1;

create table tipo_linea (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_linea primary key (id)
);
create sequence tipo_linea_seq increment by 1;

create table tipo_persona (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_persona primary key (id)
);
create sequence tipo_persona_seq increment by 1;

create table tipo_relacion_persona (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  caso_id                       number(19),
  persona_caso_id               number(19),
  detalle_delito_id             number(19),
  persona_caso_relacionada_id   number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint uq_tp_rlcn_prsn_dtll_dlt_d unique (detalle_delito_id),
  constraint pk_tipo_relacion_persona primary key (id)
);
create sequence tipo_relacion_persona_seq increment by 1;

create table tipo_transportacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo                          varchar2(255),
  transportacion                varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_transportacion primary key (id)
);
create sequence tipo_transportacion_seq increment by 1;

create table tipo_uso_tipo_vehiculo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tipo_uso                      varchar2(255),
  datos_tomados_de              varchar2(255),
  tipo_vehiculo                 varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_tipo_uso_tipo_vehiculo primary key (id)
);
create sequence tipo_uso_tipo_vehiculo_seq increment by 1;

create table titulares (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  fecha_asignacion              timestamp,
  caso_id                       number(19),
  user_name_propietario         varchar2(255),
  user_name_asignado            varchar2(255),
  user_name_asignacion          varchar2(255),
  vigente                       number(1) default 0 not null,
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_titulares primary key (id)
);
create sequence Titulares_seq increment by 1;

create table trata_persona (
  id                            number(19) not null,
  detalle_delito_id             number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  estado_origen_otro            varchar2(255),
  municipio_origen_otro         varchar2(255),
  estado_destino_otro           varchar2(255),
  municipio_destino_otro        varchar2(255),
  pais_origen_id                number(19),
  pais_destino_id               number(19),
  estado_origen_id              number(19),
  estado_destino_id             number(19),
  municipio_origen_id           number(19),
  municipio_destino_id          number(19),
  tipo_transportacion_id        number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_trata_persona primary key (id)
);
create sequence trata_persona_seq increment by 1;

create table turno (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  clave                         varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_turno primary key (id)
);
create sequence turno_seq increment by 1;

create table usuario (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  paterno                       varchar2(255),
  materno                       varchar2(255),
  contrasenia                   varchar2(255),
  username                      varchar2(255),
  num_contacto                  varchar2(255),
  email                         varchar2(255),
  num_gafete                    varchar2(255),
  cargo                         varchar2(255),
  inhabilitar                   NUMBER(1,0) default 0 not null,
  sexo_id                       number(19),
  distrito_id                   number(19),
  fiscalia_id                   number(19),
  agencia_id                    number(19),
  subdireccion_id               number(19),
  base_id                       number(19),
  municipio_id                  number(19),
  turno_id                      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_usuario primary key (id)
);
create sequence usuario_seq increment by 1;

create table usuariorol (
  usuario                       number(19) not null,
  rol                           number(19) not null,
  constraint pk_usuariorol primary key (usuario,rol)
);

create table vehiculo (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  tarjeta_circulacion           varchar2(255),
  no_economico                  varchar2(255),
  modelo                        varchar2(255),
  placas                        varchar2(255),
  placas_adicionales            varchar2(255),
  registro_federal_vehiculo     varchar2(255),
  no_serie                      varchar2(255),
  no_motor                      varchar2(255),
  factura                       varchar2(255),
  no_poliza                     varchar2(255),
  valor_estimado                number(10) not null,
  pedimento_importancia         varchar2(255),
  lleva_carga                   NUMBER(1,0) default 0 not null,
  alterado                      NUMBER(1,0) default 0 not null,
  senias_particulares           varchar2(2000),
  notas                         varchar2(2000),
  motivo_registro_color_clase_id number(19),
  marca_submarca_id             number(19),
  tipo_uso_tipo_vehiculo_id     number(19),
  estado_origen_placas_id       number(19),
  procedencia_aseguradora_id    number(19),
  caso_id                       number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_vehiculo primary key (id)
);
create sequence vehiculo_seq increment by 1;

create table vehiculo_tipo_relacion (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  vehiculo_id                   number(19),
  tipo_relacion_persona_id      number(19),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_vehiculo_tipo_relacion primary key (id)
);
create sequence Vehiculo_Tipo_Relacion_seq increment by 1;

create table victima_querellante (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  nombre                        varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_victima_querellante primary key (id)
);
create sequence victima_querellante_seq increment by 1;

create table violencia_genero (
  id                            number(19) not null,
  created_by                    number(19),
  updated_by                    number(19),
  delincuencia_organizada       varchar2(255),
  violencia_genero              varchar2(255),
  victima_trata                 varchar2(255),
  victima_acoso                 varchar2(255),
  orden_proteccion              varchar2(255),
  created                       timestamp not null,
  updated                       timestamp not null,
  constraint pk_violencia_genero primary key (id)
);
create sequence violencia_genero_seq increment by 1;

alter table acuerdo add constraint fk_acuerdo_caso_id foreign key (caso_id) references nic (id);
create index ix_acuerdo_caso_id on acuerdo (caso_id);

alter table alias_nombre_persona add constraint fk_als_nmbr_prsn_prsn_d foreign key (persona_id) references persona (id);
create index ix_als_nmbr_prsn_prsn_d on alias_nombre_persona (persona_id);

alter table archivo_temporal add constraint fk_archivo_temporal_caso_id foreign key (caso_id) references nic (id);
create index ix_archivo_temporal_caso_id on archivo_temporal (caso_id);

alter table arma add constraint fk_arma_nic_id foreign key (nic_id) references nic (id);
create index ix_arma_nic_id on arma (nic_id);

alter table arma add constraint fk_arma_clase_arma_id foreign key (clase_arma_id) references clase_arma (id);
create index ix_arma_clase_arma_id on arma (clase_arma_id);

alter table arma add constraint fk_arma_calibre_mecanismo_id foreign key (calibre_mecanismo_id) references calibre_mecanismo (id);
create index ix_arma_calibre_mecanismo_id on arma (calibre_mecanismo_id);

alter table arma_tipo_relacion add constraint fk_arma_tipo_relacion_arma_id foreign key (arma_id) references arma (id);
create index ix_arma_tipo_relacion_arma_id on arma_tipo_relacion (arma_id);

alter table arma_tipo_relacion add constraint fk_arm_tp_rlcn_tp_rlcn_prsn_d foreign key (tipo_relacion_persona_id) references tipo_relacion_persona (id);
create index ix_arm_tp_rlcn_tp_rlcn_prsn_d on arma_tipo_relacion (tipo_relacion_persona_id);

alter table nic add constraint fk_nic_estatus_id foreign key (estatus_id) references estatus (id);
create index ix_nic_estatus_id on nic (estatus_id);

alter table nic add constraint fk_nic_agencia_id foreign key (agencia_id) references agencia (id);
create index ix_nic_agencia_id on nic (agencia_id);

alter table colonia add constraint fk_colonia_municipio_id foreign key (municipio_id) references municipio (id);
create index ix_colonia_municipio_id on colonia (municipio_id);

alter table delito_caso add constraint fk_delito_caso_nic_id foreign key (nic_id) references nic (id);
create index ix_delito_caso_nic_id on delito_caso (nic_id);

alter table delito_caso add constraint fk_delito_caso_delito_id foreign key (delito_id) references delito (id);
create index ix_delito_caso_delito_id on delito_caso (delito_id);

alter table detalle_delito add constraint fk_dtll_dlt_mdldd_dlt_d foreign key (modalidad_delito_id) references modalidad_delito (id);
create index ix_dtll_dlt_mdldd_dlt_d on detalle_delito (modalidad_delito_id);

alter table detalle_delito add constraint fk_dtll_dlt_frm_cmsn_d foreign key (forma_comision_id) references forma_comision (id);
create index ix_dtll_dlt_frm_cmsn_d on detalle_delito (forma_comision_id);

alter table detalle_delito add constraint fk_dtll_dlt_cncrs_dlt_d foreign key (concurso_delito_id) references concurso_delito (id);
create index ix_dtll_dlt_cncrs_dlt_d on detalle_delito (concurso_delito_id);

alter table detalle_delito add constraint fk_dtll_dlt_clsfccn_dlt_rdn_d foreign key (clasificacion_delito_orden_id) references clasificacion_delito_orden (id);
create index ix_dtll_dlt_clsfccn_dlt_rdn_d on detalle_delito (clasificacion_delito_orden_id);

alter table detalle_delito add constraint fk_dtll_dlt_dlt_cs_d foreign key (delito_caso_id) references delito_caso (id);
create index ix_dtll_dlt_dlt_cs_d on detalle_delito (delito_caso_id);

alter table detalle_delito add constraint fk_dtll_dlt_lmnt_cmsn_d foreign key (elemento_comision_id) references elemento_comision (id);
create index ix_dtll_dlt_lmnt_cmsn_d on detalle_delito (elemento_comision_id);

alter table detalle_delito add constraint fk_dtll_dlt_clsfccn_dlt_d foreign key (clasificacion_delito_id) references clasificacion_delito (id);
create index ix_dtll_dlt_clsfccn_dlt_d on detalle_delito (clasificacion_delito_id);

alter table detalle_delito add constraint fk_dtll_dlt_frm_ccn_d foreign key (forma_accion_id) references forma_accion (id);
create index ix_dtll_dlt_frm_ccn_d on detalle_delito (forma_accion_id);

alter table detalle_delito add constraint fk_dtll_dlt_dsprcn_cnsmcn_d foreign key (desaparicion_consumacion_id) references desaparicion_consumacion (id);
create index ix_dtll_dlt_dsprcn_cnsmcn_d on detalle_delito (desaparicion_consumacion_id);

alter table detalle_delito add constraint fk_dtll_dlt_grd_prtcpcn_d foreign key (grado_participacion_id) references grado_participacion (id);
create index ix_dtll_dlt_grd_prtcpcn_d on detalle_delito (grado_participacion_id);

alter table detalle_delito add constraint fk_dtll_dlt_frm_cndct_d foreign key (forma_conducta_id) references forma_conducta (id);
create index ix_dtll_dlt_frm_cndct_d on detalle_delito (forma_conducta_id);

alter table detalle_delito add constraint fk_dtll_dlt_vlnc_gnr_d foreign key (violencia_genero_id) references violencia_genero (id);
create index ix_dtll_dlt_vlnc_gnr_d on detalle_delito (violencia_genero_id);

alter table detalle_detenido add constraint fk_dtll_dtnd_tp_dtnd_d foreign key (tipo_detenido_id) references tipo_detenido (id);
create index ix_dtll_dtnd_tp_dtnd_d on detalle_detenido (tipo_detenido_id);

alter table doc_acuerdo add constraint fk_doc_acuerdo_acuerdo_id foreign key (acuerdo_id) references acuerdo (id);
create index ix_doc_acuerdo_acuerdo_id on doc_acuerdo (acuerdo_id);

alter table doc_archivo_temporal add constraint fk_dc_rchv_tmprl_rchv_tmprl_d foreign key (archivo_temporal_id) references archivo_temporal (id);
create index ix_dc_rchv_tmprl_rchv_tmprl_d on doc_archivo_temporal (archivo_temporal_id);

alter table doc_entrevista add constraint fk_dc_ntrvst_ntrvst_d foreign key (entrevista_id) references entrevista (id);
create index ix_dc_ntrvst_ntrvst_d on doc_entrevista (entrevista_id);

alter table doc_facultad_no_investigar add constraint fk_dc_fcltd_n_nvstgr_fcltd__1 foreign key (facultad_no_investigar_id) references facultad_no_investigar (id);
create index ix_dc_fcltd_n_nvstgr_fcltd__1 on doc_facultad_no_investigar (facultad_no_investigar_id);

alter table doc_nic add constraint fk_doc_nic_caso_id foreign key (caso_id) references nic (id);
create index ix_doc_nic_caso_id on doc_nic (caso_id);

alter table doc_no_ejercicio_accion add constraint fk_dc_n_jrcc_ccn_n_jrcc_ccn_1 foreign key (no_ejercicio_accion_penal_id) references no_ejercicio_accion_penal (id);
create index ix_dc_n_jrcc_ccn_n_jrcc_ccn_1 on doc_no_ejercicio_accion (no_ejercicio_accion_penal_id);

alter table doc_predenuncia add constraint fk_dc_prdnnc_prdnnc_d foreign key (predenuncia_id) references predenuncia (id);
create index ix_dc_prdnnc_prdnnc_d on doc_predenuncia (predenuncia_id);

alter table doc_sol_pre_acuerdo add constraint fk_dc_sl_pr_crd_slctd_pr_cr_1 foreign key (solicitud_pre_acuerdo_id) references solicitud_pre_acuerdo (id);
create index ix_dc_sl_pr_crd_slctd_pr_cr_1 on doc_sol_pre_acuerdo (solicitud_pre_acuerdo_id);

alter table doc_sol_pre_inspeccion add constraint fk_dc_sl_pr_nspccn_slctd_pr_1 foreign key (solicitud_pre_inspeccion_id) references solicitud_pre_inspeccion (id);
create index ix_dc_sl_pr_nspccn_slctd_pr_1 on doc_sol_pre_inspeccion (solicitud_pre_inspeccion_id);

alter table doc_sol_pre_pericial add constraint fk_dc_sl_pr_prcl_slctd_pr_p_1 foreign key (solicitud_pre_pericial_id) references solicitud_pre_pericial (id);
create index ix_dc_sl_pr_prcl_slctd_pr_p_1 on doc_sol_pre_pericial (solicitud_pre_pericial_id);

alter table doc_sol_pre_policia add constraint fk_dc_sl_pr_plc_slctd_pr_pl_1 foreign key (solicitud_pre_policia_id) references solicitud_pre_policia (id);
create index ix_dc_sl_pr_plc_slctd_pr_pl_1 on doc_sol_pre_policia (solicitud_pre_policia_id);

alter table doc_sol_pre_registro add constraint fk_dc_sl_pr_rgstr_slctd_pr__1 foreign key (solicitud_pre_registro_id) references solicitud_pre_registro (id);
create index ix_dc_sl_pr_rgstr_slctd_pr__1 on doc_sol_pre_registro (solicitud_pre_registro_id);

alter table doc_sol_pre_req_info add constraint fk_dc_sl_pr_rq_nf_slctd_pr__1 foreign key (solicitud_pre_req_info_id) references solicitud_pre_req_info (id);
create index ix_dc_sl_pr_rq_nf_slctd_pr__1 on doc_sol_pre_req_info (solicitud_pre_req_info_id);

alter table efecto_violencia add constraint fk_efct_vlnc_dtll_dlt_d foreign key (detalle_delito_id) references detalle_delito (id);
create index ix_efct_vlnc_dtll_dlt_d on efecto_violencia (detalle_delito_id);

alter table efecto_violencia add constraint fk_efct_vlnc_fct_dtll_d foreign key (efecto_detalle_id) references efecto_detalle (id);
create index ix_efct_vlnc_fct_dtll_d on efecto_violencia (efecto_detalle_id);

alter table entrevista add constraint fk_entrevista_sexo_id foreign key (sexo_id) references sexo (id);
create index ix_entrevista_sexo_id on entrevista (sexo_id);

alter table entrevista add constraint fk_entrvst_tp_ntrvnnt_d foreign key (tipo_interviniente_id) references tipo_interviniente (id);
create index ix_entrvst_tp_ntrvnnt_d on entrevista (tipo_interviniente_id);

alter table entrevista add constraint fk_entrevista_caso_id foreign key (caso_id) references nic (id);
create index ix_entrevista_caso_id on entrevista (caso_id);

alter table estado add constraint fk_estado_pais_id foreign key (pais_id) references pais (id);
create index ix_estado_pais_id on estado (pais_id);

alter table facultad_no_investigar add constraint fk_fcltd_n_nvstgr_cs_d foreign key (caso_id) references nic (id);
create index ix_fcltd_n_nvstgr_cs_d on facultad_no_investigar (caso_id);

alter table hostigamiento_acoso add constraint fk_hstgmnt_cs_dtll_dlt_d foreign key (detalle_delito_id) references detalle_delito (id);
create index ix_hstgmnt_cs_dtll_dlt_d on hostigamiento_acoso (detalle_delito_id);

alter table hostigamiento_acoso add constraint fk_hstgmnt_cs_mdldd_mbt_d foreign key (modalidad_ambito_id) references modalidad_ambito (id);
create index ix_hstgmnt_cs_mdldd_mbt_d on hostigamiento_acoso (modalidad_ambito_id);

alter table hostigamiento_acoso add constraint fk_hstgmnt_cs_cndct_dtll_d foreign key (conducta_detalle_id) references conducta_detalle (id);
create index ix_hstgmnt_cs_cndct_dtll_d on hostigamiento_acoso (conducta_detalle_id);

alter table hostigamiento_acoso add constraint fk_hstgmnt_cs_tstg_d foreign key (testigo_id) references persona (id);
create index ix_hstgmnt_cs_tstg_d on hostigamiento_acoso (testigo_id);

alter table localidad add constraint fk_localidad_colonia_id foreign key (colonia_id) references colonia (id);
create index ix_localidad_colonia_id on localidad (colonia_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_ps_d foreign key (pais_id) references pais (id);
create index ix_lclzcn_prsn_ps_d on localizacion_persona (pais_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_std_d foreign key (estado_id) references estado (id);
create index ix_lclzcn_prsn_std_d on localizacion_persona (estado_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_mncp_d foreign key (municipio_id) references municipio (id);
create index ix_lclzcn_prsn_mncp_d on localizacion_persona (municipio_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_cln_d foreign key (colonia_id) references colonia (id);
create index ix_lclzcn_prsn_cln_d on localizacion_persona (colonia_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_lcldd_d foreign key (localidad_id) references localidad (id);
create index ix_lclzcn_prsn_lcldd_d on localizacion_persona (localidad_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_tp_dmcl_d foreign key (tipo_domicilio_id) references tipo_domicilio (id);
create index ix_lclzcn_prsn_tp_dmcl_d on localizacion_persona (tipo_domicilio_id);

alter table localizacion_persona add constraint fk_lclzcn_prsn_prsn_d foreign key (persona_id) references persona (id);
create index ix_lclzcn_prsn_prsn_d on localizacion_persona (persona_id);

alter table lugar add constraint fk_lugar_detalle_lugar_id foreign key (detalle_lugar_id) references detalle_lugar (id);
create index ix_lugar_detalle_lugar_id on lugar (detalle_lugar_id);

alter table lugar add constraint fk_lugar_pais_id foreign key (pais_id) references pais (id);
create index ix_lugar_pais_id on lugar (pais_id);

alter table lugar add constraint fk_lugar_estado_id foreign key (estado_id) references estado (id);
create index ix_lugar_estado_id on lugar (estado_id);

alter table lugar add constraint fk_lugar_municipio_id foreign key (municipio_id) references municipio (id);
create index ix_lugar_municipio_id on lugar (municipio_id);

alter table lugar add constraint fk_lugar_colonia_id foreign key (colonia_id) references colonia (id);
create index ix_lugar_colonia_id on lugar (colonia_id);

alter table lugar add constraint fk_lugar_nic_id foreign key (nic_id) references nic (id);
create index ix_lugar_nic_id on lugar (nic_id);

alter table lugar_tipo_relacion add constraint fk_lgr_tp_rlcn_lgr_d foreign key (lugar_id) references lugar (id);
create index ix_lgr_tp_rlcn_lgr_d on lugar_tipo_relacion (lugar_id);

alter table lugar_tipo_relacion add constraint fk_lgr_tp_rlcn_tp_rlcn_prsn_d foreign key (tipo_relacion_persona_id) references tipo_relacion_persona (id);
create index ix_lgr_tp_rlcn_tp_rlcn_prsn_d on lugar_tipo_relacion (tipo_relacion_persona_id);

alter table media_filiacion add constraint fk_media_filiacion_persona_id foreign key (persona_id) references persona (id);

alter table media_filiacion add constraint fk_md_flcn_rj_drch_d foreign key (oreja_derecha_id) references oreja (id);
create index ix_md_flcn_rj_drch_d on media_filiacion (oreja_derecha_id);

alter table media_filiacion add constraint fk_md_flcn_rj_zqrd_d foreign key (oreja_izquierda_id) references oreja (id);
create index ix_md_flcn_rj_zqrd_d on media_filiacion (oreja_izquierda_id);

alter table media_filiacion add constraint fk_md_flcn_cmplxn_pl_sngr_d foreign key (complexion_piel_sangre_id) references complexion_piel_sangre (id);
create index ix_md_flcn_cmplxn_pl_sngr_d on media_filiacion (complexion_piel_sangre_id);

alter table media_filiacion add constraint fk_md_flcn_cr_nrz_d foreign key (cara_nariz_id) references cara_nariz (id);
create index ix_md_flcn_cr_nrz_d on media_filiacion (cara_nariz_id);

alter table media_filiacion add constraint fk_md_flcn_frnt_mntn_d foreign key (frente_menton_id) references frente_menton (id);
create index ix_md_flcn_frnt_mntn_d on media_filiacion (frente_menton_id);

alter table media_filiacion add constraint fk_md_flcn_cj_bc_d foreign key (ceja_boca_id) references ceja_boca (id);
create index ix_md_flcn_cj_bc_d on media_filiacion (ceja_boca_id);

alter table media_filiacion add constraint fk_media_filiacion_cabello_id foreign key (cabello_id) references cabello (id);
create index ix_media_filiacion_cabello_id on media_filiacion (cabello_id);

alter table media_filiacion add constraint fk_md_flcn_lb_j_d foreign key (labio_ojo_id) references labio_ojo (id);
create index ix_md_flcn_lb_j_d on media_filiacion (labio_ojo_id);

alter table municipio add constraint fk_municipio_estado_id foreign key (estado_id) references estado (id);
create index ix_municipio_estado_id on municipio (estado_id);

alter table no_ejercicio_accion_penal add constraint fk_n_jrcc_ccn_pnl_cs_d foreign key (caso_id) references nic (id);
create index ix_n_jrcc_ccn_pnl_cs_d on no_ejercicio_accion_penal (caso_id);

alter table no_ejercicio_accion_penal add constraint fk_n_jrcc_ccn_pnl_hptss_mbt_d foreign key (hipotesis_ambito_id) references hipotesis_ambito (id);
create index ix_n_jrcc_ccn_pnl_hptss_mbt_d on no_ejercicio_accion_penal (hipotesis_ambito_id);

alter table persona add constraint fk_prsn_ncnldd_rlgn_d foreign key (nacionalidad_religion_id) references nacionalidad_religion (id);
create index ix_prsn_ncnldd_rlgn_d on persona (nacionalidad_religion_id);

alter table persona add constraint fk_prsn_dm_dntfccn_d foreign key (idioma_identificacion_id) references idioma_identificacion (id);
create index ix_prsn_dm_dntfccn_d on persona (idioma_identificacion_id);

alter table persona add constraint fk_persona_pais_id foreign key (pais_id) references pais (id);
create index ix_persona_pais_id on persona (pais_id);

alter table persona add constraint fk_persona_estado_id foreign key (estado_id) references estado (id);
create index ix_persona_estado_id on persona (estado_id);

alter table persona add constraint fk_persona_municipio_id foreign key (municipio_id) references municipio (id);
create index ix_persona_municipio_id on persona (municipio_id);

alter table persona add constraint fk_persona_interprete_id foreign key (interprete_id) references interprete (id);
create index ix_persona_interprete_id on persona (interprete_id);

alter table persona add constraint fk_persona_sexo_id foreign key (sexo_id) references sexo (id);
create index ix_persona_sexo_id on persona (sexo_id);

alter table persona add constraint fk_persona_escolaridad_id foreign key (escolaridad_id) references escolaridad (id);
create index ix_persona_escolaridad_id on persona (escolaridad_id);

alter table persona add constraint fk_persona_ocupacion_id foreign key (ocupacion_id) references ocupacion (id);
create index ix_persona_ocupacion_id on persona (ocupacion_id);

alter table persona add constraint fk_persona_estado_civil_id foreign key (estado_civil_id) references estado_civil (id);
create index ix_persona_estado_civil_id on persona (estado_civil_id);

alter table persona add constraint fk_persona_grupo_etnico_id foreign key (grupo_etnico_id) references grupo_etnico (id);
create index ix_persona_grupo_etnico_id on persona (grupo_etnico_id);

alter table persona add constraint fk_persona_alfabetismo_id foreign key (alfabetismo_id) references alfabetismo (id);
create index ix_persona_alfabetismo_id on persona (alfabetismo_id);

alter table persona add constraint fk_persona_adiccion_id foreign key (adiccion_id) references adiccion (id);
create index ix_persona_adiccion_id on persona (adiccion_id);

alter table persona_nic add constraint fk_persona_nic_nic_id foreign key (nic_id) references nic (id);
create index ix_persona_nic_nic_id on persona_nic (nic_id);

alter table persona_nic add constraint fk_persona_nic_persona_id foreign key (persona_id) references persona (id);
create index ix_persona_nic_persona_id on persona_nic (persona_id);

alter table persona_nic add constraint fk_prsn_nc_tp_ntrvnnt_d foreign key (tipo_interviniente_id) references tipo_interviniente (id);
create index ix_prsn_nc_tp_ntrvnnt_d on persona_nic (tipo_interviniente_id);

alter table persona_nic add constraint fk_prsn_nc_dtll_dtnd_d foreign key (detalle_detenido_id) references detalle_detenido (id);
create index ix_prsn_nc_dtll_dtnd_d on persona_nic (detalle_detenido_id);

alter table predenuncia add constraint fk_prdnnc_tp_prsn_d foreign key (tipo_persona_id) references tipo_persona (id);
create index ix_prdnnc_tp_prsn_d on predenuncia (tipo_persona_id);

alter table predenuncia add constraint fk_predenuncia_tipo_linea_id foreign key (tipo_linea_id) references tipo_linea (id);
create index ix_predenuncia_tipo_linea_id on predenuncia (tipo_linea_id);

alter table predenuncia add constraint fk_predenuncia_caso_id foreign key (caso_id) references nic (id);
create index ix_predenuncia_caso_id on predenuncia (caso_id);

alter table relacion add constraint fk_relacion_nic_id foreign key (nic_id) references nic (id);
create index ix_relacion_nic_id on relacion (nic_id);

alter table solicitud_pre_acuerdo add constraint fk_slctd_pr_crd_dnnc_qrll_d foreign key (denuncia_querella_id) references denuncia_querella (id);
create index ix_slctd_pr_crd_dnnc_qrll_d on solicitud_pre_acuerdo (denuncia_querella_id);

alter table solicitud_pre_acuerdo add constraint fk_slctd_pr_crd_vctm_qllrnt_d foreign key (victima_quellerante_id) references victima_querellante (id);
create index ix_slctd_pr_crd_vctm_qllrnt_d on solicitud_pre_acuerdo (victima_quellerante_id);

alter table solicitud_pre_acuerdo add constraint fk_slctd_pr_crd_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_crd_nc_d on solicitud_pre_acuerdo (nic_id);

alter table solicitud_pre_inspeccion add constraint fk_slctd_pr_nspccn_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_nspccn_nc_d on solicitud_pre_inspeccion (nic_id);

alter table solicitud_pre_pericial add constraint fk_slctd_pr_prcl_tp_xmn_d foreign key (tipo_examen_id) references tipo_examen (id);
create index ix_slctd_pr_prcl_tp_xmn_d on solicitud_pre_pericial (tipo_examen_id);

alter table solicitud_pre_pericial add constraint fk_slctd_pr_prcl_prt_mtr_d foreign key (perito_materia_id) references perito_materia (id);
create index ix_slctd_pr_prcl_prt_mtr_d on solicitud_pre_pericial (perito_materia_id);

alter table solicitud_pre_pericial add constraint fk_slctd_pr_prcl_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_prcl_nc_d on solicitud_pre_pericial (nic_id);

alter table solicitud_pre_policia add constraint fk_slctd_pr_plc_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_plc_nc_d on solicitud_pre_policia (nic_id);

alter table solicitud_pre_registro add constraint fk_slctd_pr_rgstr_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_rgstr_nc_d on solicitud_pre_registro (nic_id);

alter table solicitud_pre_req_info add constraint fk_slctd_pr_rq_nf_nc_d foreign key (nic_id) references nic (id);
create index ix_slctd_pr_rq_nf_nc_d on solicitud_pre_req_info (nic_id);

alter table tipo_relacion_persona add constraint fk_tp_rlcn_prsn_cs_d foreign key (caso_id) references nic (id);
create index ix_tp_rlcn_prsn_cs_d on tipo_relacion_persona (caso_id);

alter table tipo_relacion_persona add constraint fk_tp_rlcn_prsn_prsn_cs_d foreign key (persona_caso_id) references persona_nic (id);
create index ix_tp_rlcn_prsn_prsn_cs_d on tipo_relacion_persona (persona_caso_id);

alter table tipo_relacion_persona add constraint fk_tp_rlcn_prsn_dtll_dlt_d foreign key (detalle_delito_id) references detalle_delito (id);

alter table tipo_relacion_persona add constraint fk_tp_rlcn_prsn_prsn_cs_rlc_4 foreign key (persona_caso_relacionada_id) references persona_nic (id);
create index ix_tp_rlcn_prsn_prsn_cs_rlc_4 on tipo_relacion_persona (persona_caso_relacionada_id);

alter table titulares add constraint fk_titulares_caso_id foreign key (caso_id) references nic (id);
create index ix_titulares_caso_id on titulares (caso_id);

alter table trata_persona add constraint fk_trt_prsn_dtll_dlt_d foreign key (detalle_delito_id) references detalle_delito (id);
create index ix_trt_prsn_dtll_dlt_d on trata_persona (detalle_delito_id);

alter table trata_persona add constraint fk_trt_prsn_ps_rgn_d foreign key (pais_origen_id) references pais (id);
create index ix_trt_prsn_ps_rgn_d on trata_persona (pais_origen_id);

alter table trata_persona add constraint fk_trt_prsn_ps_dstn_d foreign key (pais_destino_id) references pais (id);
create index ix_trt_prsn_ps_dstn_d on trata_persona (pais_destino_id);

alter table trata_persona add constraint fk_trt_prsn_std_rgn_d foreign key (estado_origen_id) references estado (id);
create index ix_trt_prsn_std_rgn_d on trata_persona (estado_origen_id);

alter table trata_persona add constraint fk_trt_prsn_std_dstn_d foreign key (estado_destino_id) references estado (id);
create index ix_trt_prsn_std_dstn_d on trata_persona (estado_destino_id);

alter table trata_persona add constraint fk_trt_prsn_mncp_rgn_d foreign key (municipio_origen_id) references municipio (id);
create index ix_trt_prsn_mncp_rgn_d on trata_persona (municipio_origen_id);

alter table trata_persona add constraint fk_trt_prsn_mncp_dstn_d foreign key (municipio_destino_id) references municipio (id);
create index ix_trt_prsn_mncp_dstn_d on trata_persona (municipio_destino_id);

alter table trata_persona add constraint fk_trt_prsn_tp_trnsprtcn_d foreign key (tipo_transportacion_id) references tipo_transportacion (id);
create index ix_trt_prsn_tp_trnsprtcn_d on trata_persona (tipo_transportacion_id);

alter table usuario add constraint fk_usuario_sexo_id foreign key (sexo_id) references sexo (id);
create index ix_usuario_sexo_id on usuario (sexo_id);

alter table usuario add constraint fk_usuario_distrito_id foreign key (distrito_id) references distrito (id);
create index ix_usuario_distrito_id on usuario (distrito_id);

alter table usuario add constraint fk_usuario_fiscalia_id foreign key (fiscalia_id) references fiscalia (id);
create index ix_usuario_fiscalia_id on usuario (fiscalia_id);

alter table usuario add constraint fk_usuario_agencia_id foreign key (agencia_id) references agencia (id);
create index ix_usuario_agencia_id on usuario (agencia_id);

alter table usuario add constraint fk_usuario_subdireccion_id foreign key (subdireccion_id) references subdireccion (id);
create index ix_usuario_subdireccion_id on usuario (subdireccion_id);

alter table usuario add constraint fk_usuario_base_id foreign key (base_id) references base (id);
create index ix_usuario_base_id on usuario (base_id);

alter table usuario add constraint fk_usuario_municipio_id foreign key (municipio_id) references municipio (id);
create index ix_usuario_municipio_id on usuario (municipio_id);

alter table usuario add constraint fk_usuario_turno_id foreign key (turno_id) references turno (id);
create index ix_usuario_turno_id on usuario (turno_id);

alter table usuariorol add constraint fk_usuariorol_usuario foreign key (usuario) references usuario (id);
create index ix_usuariorol_usuario on usuariorol (usuario);

alter table usuariorol add constraint fk_usuariorol_rol foreign key (rol) references rol (id);
create index ix_usuariorol_rol on usuariorol (rol);

alter table vehiculo add constraint fk_vhcl_mtv_rgstr_clr_cls_d foreign key (motivo_registro_color_clase_id) references motivo_color_clase (id);
create index ix_vhcl_mtv_rgstr_clr_cls_d on vehiculo (motivo_registro_color_clase_id);

alter table vehiculo add constraint fk_vehiculo_marca_submarca_id foreign key (marca_submarca_id) references marca_sub_marca (id);
create index ix_vehiculo_marca_submarca_id on vehiculo (marca_submarca_id);

alter table vehiculo add constraint fk_vhcl_tp_s_tp_vhcl_d foreign key (tipo_uso_tipo_vehiculo_id) references tipo_uso_tipo_vehiculo (id);
create index ix_vhcl_tp_s_tp_vhcl_d on vehiculo (tipo_uso_tipo_vehiculo_id);

alter table vehiculo add constraint fk_vhcl_std_rgn_plcs_d foreign key (estado_origen_placas_id) references estado (id);
create index ix_vhcl_std_rgn_plcs_d on vehiculo (estado_origen_placas_id);

alter table vehiculo add constraint fk_vhcl_prcdnc_sgrdr_d foreign key (procedencia_aseguradora_id) references procedencia_aseguradora (id);
create index ix_vhcl_prcdnc_sgrdr_d on vehiculo (procedencia_aseguradora_id);

alter table vehiculo add constraint fk_vehiculo_caso_id foreign key (caso_id) references nic (id);
create index ix_vehiculo_caso_id on vehiculo (caso_id);

alter table vehiculo_tipo_relacion add constraint fk_vhcl_tp_rlcn_vhcl_d foreign key (vehiculo_id) references vehiculo (id);
create index ix_vhcl_tp_rlcn_vhcl_d on vehiculo_tipo_relacion (vehiculo_id);

alter table vehiculo_tipo_relacion add constraint fk_vhcl_tp_rlcn_tp_rlcn_prs_2 foreign key (tipo_relacion_persona_id) references tipo_relacion_persona (id);
create index ix_vhcl_tp_rlcn_tp_rlcn_prs_2 on vehiculo_tipo_relacion (tipo_relacion_persona_id);


# --- !Downs

alter table acuerdo drop constraint fk_acuerdo_caso_id;
drop index ix_acuerdo_caso_id;

alter table alias_nombre_persona drop constraint fk_als_nmbr_prsn_prsn_d;
drop index ix_als_nmbr_prsn_prsn_d;

alter table archivo_temporal drop constraint fk_archivo_temporal_caso_id;
drop index ix_archivo_temporal_caso_id;

alter table arma drop constraint fk_arma_nic_id;
drop index ix_arma_nic_id;

alter table arma drop constraint fk_arma_clase_arma_id;
drop index ix_arma_clase_arma_id;

alter table arma drop constraint fk_arma_calibre_mecanismo_id;
drop index ix_arma_calibre_mecanismo_id;

alter table arma_tipo_relacion drop constraint fk_arma_tipo_relacion_arma_id;
drop index ix_arma_tipo_relacion_arma_id;

alter table arma_tipo_relacion drop constraint fk_arm_tp_rlcn_tp_rlcn_prsn_d;
drop index ix_arm_tp_rlcn_tp_rlcn_prsn_d;

alter table nic drop constraint fk_nic_estatus_id;
drop index ix_nic_estatus_id;

alter table nic drop constraint fk_nic_agencia_id;
drop index ix_nic_agencia_id;

alter table colonia drop constraint fk_colonia_municipio_id;
drop index ix_colonia_municipio_id;

alter table delito_caso drop constraint fk_delito_caso_nic_id;
drop index ix_delito_caso_nic_id;

alter table delito_caso drop constraint fk_delito_caso_delito_id;
drop index ix_delito_caso_delito_id;

alter table detalle_delito drop constraint fk_dtll_dlt_mdldd_dlt_d;
drop index ix_dtll_dlt_mdldd_dlt_d;

alter table detalle_delito drop constraint fk_dtll_dlt_frm_cmsn_d;
drop index ix_dtll_dlt_frm_cmsn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_cncrs_dlt_d;
drop index ix_dtll_dlt_cncrs_dlt_d;

alter table detalle_delito drop constraint fk_dtll_dlt_clsfccn_dlt_rdn_d;
drop index ix_dtll_dlt_clsfccn_dlt_rdn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_dlt_cs_d;
drop index ix_dtll_dlt_dlt_cs_d;

alter table detalle_delito drop constraint fk_dtll_dlt_lmnt_cmsn_d;
drop index ix_dtll_dlt_lmnt_cmsn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_clsfccn_dlt_d;
drop index ix_dtll_dlt_clsfccn_dlt_d;

alter table detalle_delito drop constraint fk_dtll_dlt_frm_ccn_d;
drop index ix_dtll_dlt_frm_ccn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_dsprcn_cnsmcn_d;
drop index ix_dtll_dlt_dsprcn_cnsmcn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_grd_prtcpcn_d;
drop index ix_dtll_dlt_grd_prtcpcn_d;

alter table detalle_delito drop constraint fk_dtll_dlt_frm_cndct_d;
drop index ix_dtll_dlt_frm_cndct_d;

alter table detalle_delito drop constraint fk_dtll_dlt_vlnc_gnr_d;
drop index ix_dtll_dlt_vlnc_gnr_d;

alter table detalle_detenido drop constraint fk_dtll_dtnd_tp_dtnd_d;
drop index ix_dtll_dtnd_tp_dtnd_d;

alter table doc_acuerdo drop constraint fk_doc_acuerdo_acuerdo_id;
drop index ix_doc_acuerdo_acuerdo_id;

alter table doc_archivo_temporal drop constraint fk_dc_rchv_tmprl_rchv_tmprl_d;
drop index ix_dc_rchv_tmprl_rchv_tmprl_d;

alter table doc_entrevista drop constraint fk_dc_ntrvst_ntrvst_d;
drop index ix_dc_ntrvst_ntrvst_d;

alter table doc_facultad_no_investigar drop constraint fk_dc_fcltd_n_nvstgr_fcltd__1;
drop index ix_dc_fcltd_n_nvstgr_fcltd__1;

alter table doc_nic drop constraint fk_doc_nic_caso_id;
drop index ix_doc_nic_caso_id;

alter table doc_no_ejercicio_accion drop constraint fk_dc_n_jrcc_ccn_n_jrcc_ccn_1;
drop index ix_dc_n_jrcc_ccn_n_jrcc_ccn_1;

alter table doc_predenuncia drop constraint fk_dc_prdnnc_prdnnc_d;
drop index ix_dc_prdnnc_prdnnc_d;

alter table doc_sol_pre_acuerdo drop constraint fk_dc_sl_pr_crd_slctd_pr_cr_1;
drop index ix_dc_sl_pr_crd_slctd_pr_cr_1;

alter table doc_sol_pre_inspeccion drop constraint fk_dc_sl_pr_nspccn_slctd_pr_1;
drop index ix_dc_sl_pr_nspccn_slctd_pr_1;

alter table doc_sol_pre_pericial drop constraint fk_dc_sl_pr_prcl_slctd_pr_p_1;
drop index ix_dc_sl_pr_prcl_slctd_pr_p_1;

alter table doc_sol_pre_policia drop constraint fk_dc_sl_pr_plc_slctd_pr_pl_1;
drop index ix_dc_sl_pr_plc_slctd_pr_pl_1;

alter table doc_sol_pre_registro drop constraint fk_dc_sl_pr_rgstr_slctd_pr__1;
drop index ix_dc_sl_pr_rgstr_slctd_pr__1;

alter table doc_sol_pre_req_info drop constraint fk_dc_sl_pr_rq_nf_slctd_pr__1;
drop index ix_dc_sl_pr_rq_nf_slctd_pr__1;

alter table efecto_violencia drop constraint fk_efct_vlnc_dtll_dlt_d;
drop index ix_efct_vlnc_dtll_dlt_d;

alter table efecto_violencia drop constraint fk_efct_vlnc_fct_dtll_d;
drop index ix_efct_vlnc_fct_dtll_d;

alter table entrevista drop constraint fk_entrevista_sexo_id;
drop index ix_entrevista_sexo_id;

alter table entrevista drop constraint fk_entrvst_tp_ntrvnnt_d;
drop index ix_entrvst_tp_ntrvnnt_d;

alter table entrevista drop constraint fk_entrevista_caso_id;
drop index ix_entrevista_caso_id;

alter table estado drop constraint fk_estado_pais_id;
drop index ix_estado_pais_id;

alter table facultad_no_investigar drop constraint fk_fcltd_n_nvstgr_cs_d;
drop index ix_fcltd_n_nvstgr_cs_d;

alter table hostigamiento_acoso drop constraint fk_hstgmnt_cs_dtll_dlt_d;
drop index ix_hstgmnt_cs_dtll_dlt_d;

alter table hostigamiento_acoso drop constraint fk_hstgmnt_cs_mdldd_mbt_d;
drop index ix_hstgmnt_cs_mdldd_mbt_d;

alter table hostigamiento_acoso drop constraint fk_hstgmnt_cs_cndct_dtll_d;
drop index ix_hstgmnt_cs_cndct_dtll_d;

alter table hostigamiento_acoso drop constraint fk_hstgmnt_cs_tstg_d;
drop index ix_hstgmnt_cs_tstg_d;

alter table localidad drop constraint fk_localidad_colonia_id;
drop index ix_localidad_colonia_id;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_ps_d;
drop index ix_lclzcn_prsn_ps_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_std_d;
drop index ix_lclzcn_prsn_std_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_mncp_d;
drop index ix_lclzcn_prsn_mncp_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_cln_d;
drop index ix_lclzcn_prsn_cln_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_lcldd_d;
drop index ix_lclzcn_prsn_lcldd_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_tp_dmcl_d;
drop index ix_lclzcn_prsn_tp_dmcl_d;

alter table localizacion_persona drop constraint fk_lclzcn_prsn_prsn_d;
drop index ix_lclzcn_prsn_prsn_d;

alter table lugar drop constraint fk_lugar_detalle_lugar_id;
drop index ix_lugar_detalle_lugar_id;

alter table lugar drop constraint fk_lugar_pais_id;
drop index ix_lugar_pais_id;

alter table lugar drop constraint fk_lugar_estado_id;
drop index ix_lugar_estado_id;

alter table lugar drop constraint fk_lugar_municipio_id;
drop index ix_lugar_municipio_id;

alter table lugar drop constraint fk_lugar_colonia_id;
drop index ix_lugar_colonia_id;

alter table lugar drop constraint fk_lugar_nic_id;
drop index ix_lugar_nic_id;

alter table lugar_tipo_relacion drop constraint fk_lgr_tp_rlcn_lgr_d;
drop index ix_lgr_tp_rlcn_lgr_d;

alter table lugar_tipo_relacion drop constraint fk_lgr_tp_rlcn_tp_rlcn_prsn_d;
drop index ix_lgr_tp_rlcn_tp_rlcn_prsn_d;

alter table media_filiacion drop constraint fk_media_filiacion_persona_id;

alter table media_filiacion drop constraint fk_md_flcn_rj_drch_d;
drop index ix_md_flcn_rj_drch_d;

alter table media_filiacion drop constraint fk_md_flcn_rj_zqrd_d;
drop index ix_md_flcn_rj_zqrd_d;

alter table media_filiacion drop constraint fk_md_flcn_cmplxn_pl_sngr_d;
drop index ix_md_flcn_cmplxn_pl_sngr_d;

alter table media_filiacion drop constraint fk_md_flcn_cr_nrz_d;
drop index ix_md_flcn_cr_nrz_d;

alter table media_filiacion drop constraint fk_md_flcn_frnt_mntn_d;
drop index ix_md_flcn_frnt_mntn_d;

alter table media_filiacion drop constraint fk_md_flcn_cj_bc_d;
drop index ix_md_flcn_cj_bc_d;

alter table media_filiacion drop constraint fk_media_filiacion_cabello_id;
drop index ix_media_filiacion_cabello_id;

alter table media_filiacion drop constraint fk_md_flcn_lb_j_d;
drop index ix_md_flcn_lb_j_d;

alter table municipio drop constraint fk_municipio_estado_id;
drop index ix_municipio_estado_id;

alter table no_ejercicio_accion_penal drop constraint fk_n_jrcc_ccn_pnl_cs_d;
drop index ix_n_jrcc_ccn_pnl_cs_d;

alter table no_ejercicio_accion_penal drop constraint fk_n_jrcc_ccn_pnl_hptss_mbt_d;
drop index ix_n_jrcc_ccn_pnl_hptss_mbt_d;

alter table persona drop constraint fk_prsn_ncnldd_rlgn_d;
drop index ix_prsn_ncnldd_rlgn_d;

alter table persona drop constraint fk_prsn_dm_dntfccn_d;
drop index ix_prsn_dm_dntfccn_d;

alter table persona drop constraint fk_persona_pais_id;
drop index ix_persona_pais_id;

alter table persona drop constraint fk_persona_estado_id;
drop index ix_persona_estado_id;

alter table persona drop constraint fk_persona_municipio_id;
drop index ix_persona_municipio_id;

alter table persona drop constraint fk_persona_interprete_id;
drop index ix_persona_interprete_id;

alter table persona drop constraint fk_persona_sexo_id;
drop index ix_persona_sexo_id;

alter table persona drop constraint fk_persona_escolaridad_id;
drop index ix_persona_escolaridad_id;

alter table persona drop constraint fk_persona_ocupacion_id;
drop index ix_persona_ocupacion_id;

alter table persona drop constraint fk_persona_estado_civil_id;
drop index ix_persona_estado_civil_id;

alter table persona drop constraint fk_persona_grupo_etnico_id;
drop index ix_persona_grupo_etnico_id;

alter table persona drop constraint fk_persona_alfabetismo_id;
drop index ix_persona_alfabetismo_id;

alter table persona drop constraint fk_persona_adiccion_id;
drop index ix_persona_adiccion_id;

alter table persona_nic drop constraint fk_persona_nic_nic_id;
drop index ix_persona_nic_nic_id;

alter table persona_nic drop constraint fk_persona_nic_persona_id;
drop index ix_persona_nic_persona_id;

alter table persona_nic drop constraint fk_prsn_nc_tp_ntrvnnt_d;
drop index ix_prsn_nc_tp_ntrvnnt_d;

alter table persona_nic drop constraint fk_prsn_nc_dtll_dtnd_d;
drop index ix_prsn_nc_dtll_dtnd_d;

alter table predenuncia drop constraint fk_prdnnc_tp_prsn_d;
drop index ix_prdnnc_tp_prsn_d;

alter table predenuncia drop constraint fk_predenuncia_tipo_linea_id;
drop index ix_predenuncia_tipo_linea_id;

alter table predenuncia drop constraint fk_predenuncia_caso_id;
drop index ix_predenuncia_caso_id;

alter table relacion drop constraint fk_relacion_nic_id;
drop index ix_relacion_nic_id;

alter table solicitud_pre_acuerdo drop constraint fk_slctd_pr_crd_dnnc_qrll_d;
drop index ix_slctd_pr_crd_dnnc_qrll_d;

alter table solicitud_pre_acuerdo drop constraint fk_slctd_pr_crd_vctm_qllrnt_d;
drop index ix_slctd_pr_crd_vctm_qllrnt_d;

alter table solicitud_pre_acuerdo drop constraint fk_slctd_pr_crd_nc_d;
drop index ix_slctd_pr_crd_nc_d;

alter table solicitud_pre_inspeccion drop constraint fk_slctd_pr_nspccn_nc_d;
drop index ix_slctd_pr_nspccn_nc_d;

alter table solicitud_pre_pericial drop constraint fk_slctd_pr_prcl_tp_xmn_d;
drop index ix_slctd_pr_prcl_tp_xmn_d;

alter table solicitud_pre_pericial drop constraint fk_slctd_pr_prcl_prt_mtr_d;
drop index ix_slctd_pr_prcl_prt_mtr_d;

alter table solicitud_pre_pericial drop constraint fk_slctd_pr_prcl_nc_d;
drop index ix_slctd_pr_prcl_nc_d;

alter table solicitud_pre_policia drop constraint fk_slctd_pr_plc_nc_d;
drop index ix_slctd_pr_plc_nc_d;

alter table solicitud_pre_registro drop constraint fk_slctd_pr_rgstr_nc_d;
drop index ix_slctd_pr_rgstr_nc_d;

alter table solicitud_pre_req_info drop constraint fk_slctd_pr_rq_nf_nc_d;
drop index ix_slctd_pr_rq_nf_nc_d;

alter table tipo_relacion_persona drop constraint fk_tp_rlcn_prsn_cs_d;
drop index ix_tp_rlcn_prsn_cs_d;

alter table tipo_relacion_persona drop constraint fk_tp_rlcn_prsn_prsn_cs_d;
drop index ix_tp_rlcn_prsn_prsn_cs_d;

alter table tipo_relacion_persona drop constraint fk_tp_rlcn_prsn_dtll_dlt_d;

alter table tipo_relacion_persona drop constraint fk_tp_rlcn_prsn_prsn_cs_rlc_4;
drop index ix_tp_rlcn_prsn_prsn_cs_rlc_4;

alter table titulares drop constraint fk_titulares_caso_id;
drop index ix_titulares_caso_id;

alter table trata_persona drop constraint fk_trt_prsn_dtll_dlt_d;
drop index ix_trt_prsn_dtll_dlt_d;

alter table trata_persona drop constraint fk_trt_prsn_ps_rgn_d;
drop index ix_trt_prsn_ps_rgn_d;

alter table trata_persona drop constraint fk_trt_prsn_ps_dstn_d;
drop index ix_trt_prsn_ps_dstn_d;

alter table trata_persona drop constraint fk_trt_prsn_std_rgn_d;
drop index ix_trt_prsn_std_rgn_d;

alter table trata_persona drop constraint fk_trt_prsn_std_dstn_d;
drop index ix_trt_prsn_std_dstn_d;

alter table trata_persona drop constraint fk_trt_prsn_mncp_rgn_d;
drop index ix_trt_prsn_mncp_rgn_d;

alter table trata_persona drop constraint fk_trt_prsn_mncp_dstn_d;
drop index ix_trt_prsn_mncp_dstn_d;

alter table trata_persona drop constraint fk_trt_prsn_tp_trnsprtcn_d;
drop index ix_trt_prsn_tp_trnsprtcn_d;

alter table usuario drop constraint fk_usuario_sexo_id;
drop index ix_usuario_sexo_id;

alter table usuario drop constraint fk_usuario_distrito_id;
drop index ix_usuario_distrito_id;

alter table usuario drop constraint fk_usuario_fiscalia_id;
drop index ix_usuario_fiscalia_id;

alter table usuario drop constraint fk_usuario_agencia_id;
drop index ix_usuario_agencia_id;

alter table usuario drop constraint fk_usuario_subdireccion_id;
drop index ix_usuario_subdireccion_id;

alter table usuario drop constraint fk_usuario_base_id;
drop index ix_usuario_base_id;

alter table usuario drop constraint fk_usuario_municipio_id;
drop index ix_usuario_municipio_id;

alter table usuario drop constraint fk_usuario_turno_id;
drop index ix_usuario_turno_id;

alter table usuariorol drop constraint fk_usuariorol_usuario;
drop index ix_usuariorol_usuario;

alter table usuariorol drop constraint fk_usuariorol_rol;
drop index ix_usuariorol_rol;

alter table vehiculo drop constraint fk_vhcl_mtv_rgstr_clr_cls_d;
drop index ix_vhcl_mtv_rgstr_clr_cls_d;

alter table vehiculo drop constraint fk_vehiculo_marca_submarca_id;
drop index ix_vehiculo_marca_submarca_id;

alter table vehiculo drop constraint fk_vhcl_tp_s_tp_vhcl_d;
drop index ix_vhcl_tp_s_tp_vhcl_d;

alter table vehiculo drop constraint fk_vhcl_std_rgn_plcs_d;
drop index ix_vhcl_std_rgn_plcs_d;

alter table vehiculo drop constraint fk_vhcl_prcdnc_sgrdr_d;
drop index ix_vhcl_prcdnc_sgrdr_d;

alter table vehiculo drop constraint fk_vehiculo_caso_id;
drop index ix_vehiculo_caso_id;

alter table vehiculo_tipo_relacion drop constraint fk_vhcl_tp_rlcn_vhcl_d;
drop index ix_vhcl_tp_rlcn_vhcl_d;

alter table vehiculo_tipo_relacion drop constraint fk_vhcl_tp_rlcn_tp_rlcn_prs_2;
drop index ix_vhcl_tp_rlcn_tp_rlcn_prs_2;

drop table acuerdo cascade constraints purge;
drop sequence acuerdo_seq;

drop table adiccion cascade constraints purge;
drop sequence adiccion_seq;

drop table agencia cascade constraints purge;
drop sequence agencia_seq;

drop table alfabetismo cascade constraints purge;
drop sequence alfabetismo_seq;

drop table alias_nombre_persona cascade constraints purge;
drop sequence alias_nombre_persona_seq;

drop table archivo_temporal cascade constraints purge;
drop sequence archivo_temporal_seq;

drop table arma cascade constraints purge;
drop sequence arma_seq;

drop table arma_tipo_relacion cascade constraints purge;
drop sequence Arma_Tipo_Relacion_seq;

drop table base cascade constraints purge;
drop sequence base_seq;

drop table cabello cascade constraints purge;
drop sequence cabello_seq;

drop table calibre_mecanismo cascade constraints purge;
drop sequence calibre_mecanismo_seq;

drop table cara_nariz cascade constraints purge;
drop sequence cara_nariz_seq;

drop table nic cascade constraints purge;
drop sequence NIC_seq;

drop table catalogo_sincronizacion cascade constraints purge;
drop sequence catalogo_sincronizacion_seq;

drop table ceja_boca cascade constraints purge;
drop sequence ceja_boca_seq;

drop table clase_arma cascade constraints purge;
drop sequence clase_arma_seq;

drop table clasificacion_delito cascade constraints purge;
drop sequence clasificacion_delito_seq;

drop table clasificacion_delito_orden cascade constraints purge;
drop sequence clasificacion_delito_orden_seq;

drop table colonia cascade constraints purge;
drop sequence colonia_seq;

drop table complexion_piel_sangre cascade constraints purge;
drop sequence complexion_piel_sangre_seq;

drop table concurso_delito cascade constraints purge;
drop sequence concurso_delito_seq;

drop table conducta_detalle cascade constraints purge;
drop sequence conducta_detalle_seq;

drop table delito cascade constraints purge;
drop sequence delito_seq;

drop table delito_caso cascade constraints purge;
drop sequence delito_caso_seq;

drop table denuncia_querella cascade constraints purge;
drop sequence denuncia_querella_seq;

drop table desaparicion_consumacion cascade constraints purge;
drop sequence desaparicion_consumacion_seq;

drop table detalle_delito cascade constraints purge;
drop sequence detalle_delito_seq;

drop table detalle_detenido cascade constraints purge;
drop sequence detalle_detenido_seq;

drop table detalle_lugar cascade constraints purge;
drop sequence detalle_lugar_seq;

drop table distrito cascade constraints purge;
drop sequence distrito_seq;

drop table doc_acuerdo cascade constraints purge;
drop sequence doc_acuerdo_seq;

drop table doc_archivo_temporal cascade constraints purge;
drop sequence doc_archivo_temporal_seq;

drop table doc_entrevista cascade constraints purge;
drop sequence doc_entrevista_seq;

drop table doc_facultad_no_investigar cascade constraints purge;
drop sequence doc_facultad_no_investigar_seq;

drop table doc_nic cascade constraints purge;
drop sequence doc_nic_seq;

drop table doc_no_ejercicio_accion cascade constraints purge;
drop sequence doc_no_ejercicio_accion_seq;

drop table doc_predenuncia cascade constraints purge;
drop sequence doc_predenuncia_seq;

drop table doc_sol_pre_acuerdo cascade constraints purge;
drop sequence doc_sol_pre_acuerdo_seq;

drop table doc_sol_pre_inspeccion cascade constraints purge;
drop sequence doc_sol_pre_inspeccion_seq;

drop table doc_sol_pre_pericial cascade constraints purge;
drop sequence doc_sol_pre_pericial_seq;

drop table doc_sol_pre_policia cascade constraints purge;
drop sequence doc_sol_pre_policia_seq;

drop table doc_sol_pre_registro cascade constraints purge;
drop sequence doc_sol_pre_registro_seq;

drop table doc_sol_pre_req_info cascade constraints purge;
drop sequence doc_sol_pre_req_info_seq;

drop table efecto_detalle cascade constraints purge;
drop sequence efecto_detalle_seq;

drop table efecto_violencia cascade constraints purge;
drop sequence efecto_violencia_seq;

drop table elemento_comision cascade constraints purge;
drop sequence elemento_comision_seq;

drop table entrevista cascade constraints purge;
drop sequence entrevista_seq;

drop table escolaridad cascade constraints purge;
drop sequence escolaridad_seq;

drop table estado cascade constraints purge;
drop sequence estado_seq;

drop table estado_civil cascade constraints purge;
drop sequence estado_civil_seq;

drop table estatus cascade constraints purge;
drop sequence estatus_seq;

drop table facultad_no_investigar cascade constraints purge;
drop sequence facultad_no_investigar_seq;

drop table fiscalia cascade constraints purge;
drop sequence fiscalia_seq;

drop table forma_accion cascade constraints purge;
drop sequence forma_accion_seq;

drop table forma_comision cascade constraints purge;
drop sequence forma_comision_seq;

drop table forma_conducta cascade constraints purge;
drop sequence forma_conducta_seq;

drop table frente_menton cascade constraints purge;
drop sequence frente_menton_seq;

drop table grado_participacion cascade constraints purge;
drop sequence grado_participacion_seq;

drop table grupo_etnico cascade constraints purge;
drop sequence grupo_etnico_seq;

drop table hipotesis_ambito cascade constraints purge;
drop sequence hipotesis_ambito_seq;

drop table hostigamiento_acoso cascade constraints purge;
drop sequence hostigamiento_acoso_seq;

drop table idioma_identificacion cascade constraints purge;
drop sequence idioma_identificacion_seq;

drop table interprete cascade constraints purge;
drop sequence interprete_seq;

drop table labio_ojo cascade constraints purge;
drop sequence labio_ojo_seq;

drop table localidad cascade constraints purge;
drop sequence localidad_seq;

drop table localizacion_persona cascade constraints purge;
drop sequence localizacion_persona_seq;

drop table lugar cascade constraints purge;
drop sequence lugar_seq;

drop table lugar_tipo_relacion cascade constraints purge;
drop sequence Lugar_Tipo_Relacion_seq;

drop table marca_sub_marca cascade constraints purge;
drop sequence marca_sub_marca_seq;

drop table media_filiacion cascade constraints purge;
drop sequence media_filiacion_seq;

drop table modalidad_ambito cascade constraints purge;
drop sequence modalidad_ambito_seq;

drop table modalidad_delito cascade constraints purge;
drop sequence modalidad_delito_seq;

drop table motivo_color_clase cascade constraints purge;
drop sequence motivo_color_clase_seq;

drop table municipio cascade constraints purge;
drop sequence municipio_seq;

drop table nacionalidad_religion cascade constraints purge;
drop sequence nacionalidad_religion_seq;

drop table no_ejercicio_accion_penal cascade constraints purge;
drop sequence no_ejercicio_accion_penal_seq;

drop table ocupacion cascade constraints purge;
drop sequence ocupacion_seq;

drop table oreja cascade constraints purge;
drop sequence oreja_seq;

drop table pais cascade constraints purge;
drop sequence pais_seq;

drop table perito_materia cascade constraints purge;
drop sequence perito_materia_seq;

drop table persona cascade constraints purge;
drop sequence persona_seq;

drop table persona_nic cascade constraints purge;
drop sequence PERSONA_NIC_seq;

drop table predenuncia cascade constraints purge;
drop sequence predenuncia_seq;

drop table presento_llamada cascade constraints purge;
drop sequence presento_llamada_seq;

drop table procedencia_aseguradora cascade constraints purge;
drop sequence procedencia_aseguradora_seq;

drop table relacion cascade constraints purge;
drop sequence relacion_seq;

drop table rol cascade constraints purge;
drop sequence rol_seq;

drop table sexo cascade constraints purge;
drop sequence sexo_seq;

drop table solicitud_pre_acuerdo cascade constraints purge;
drop sequence solicitud_pre_acuerdo_seq;

drop table solicitud_pre_inspeccion cascade constraints purge;
drop sequence solicitud_pre_inspeccion_seq;

drop table solicitud_pre_pericial cascade constraints purge;
drop sequence solicitud_pre_pericial_seq;

drop table solicitud_pre_policia cascade constraints purge;
drop sequence solicitud_pre_policia_seq;

drop table solicitud_pre_registro cascade constraints purge;
drop sequence solicitud_pre_registro_seq;

drop table solicitud_pre_req_info cascade constraints purge;
drop sequence solicitud_pre_req_info_seq;

drop table subdireccion cascade constraints purge;
drop sequence subdireccion_seq;

drop table tipo_detenido cascade constraints purge;
drop sequence tipo_detenido_seq;

drop table tipo_domicilio cascade constraints purge;
drop sequence tipo_domicilio_seq;

drop table tipo_examen cascade constraints purge;
drop sequence tipo_examen_seq;

drop table tipo_interviniente cascade constraints purge;
drop sequence tipo_interviniente_seq;

drop table tipo_linea cascade constraints purge;
drop sequence tipo_linea_seq;

drop table tipo_persona cascade constraints purge;
drop sequence tipo_persona_seq;

drop table tipo_relacion_persona cascade constraints purge;
drop sequence tipo_relacion_persona_seq;

drop table tipo_transportacion cascade constraints purge;
drop sequence tipo_transportacion_seq;

drop table tipo_uso_tipo_vehiculo cascade constraints purge;
drop sequence tipo_uso_tipo_vehiculo_seq;

drop table titulares cascade constraints purge;
drop sequence Titulares_seq;

drop table trata_persona cascade constraints purge;
drop sequence trata_persona_seq;

drop table turno cascade constraints purge;
drop sequence turno_seq;

drop table usuario cascade constraints purge;
drop sequence usuario_seq;

drop table usuariorol cascade constraints purge;

drop table vehiculo cascade constraints purge;
drop sequence vehiculo_seq;

drop table vehiculo_tipo_relacion cascade constraints purge;
drop sequence Vehiculo_Tipo_Relacion_seq;

drop table victima_querellante cascade constraints purge;
drop sequence victima_querellante_seq;

drop table violencia_genero cascade constraints purge;
drop sequence violencia_genero_seq;
