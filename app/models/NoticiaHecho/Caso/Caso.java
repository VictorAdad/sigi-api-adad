package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import io.ebean.Finder;

import java.util.Objects;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import io.ebean.Model;
import play.Logger;

import javax.persistence.Lob;

import javax.persistence.OneToMany;

import play.data.validation.Constraints;

@Entity
@Table(name="NIC")
public class Caso extends Model {

    public static interface Started { }
    public static interface Get extends Started { }
    public static interface Page extends Started { }
    public static interface Complete extends Page { }
    public static interface SaveStep { }
    public static interface UpdateStep { }

    @Id
    @SequenceGenerator(name = "gen" ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    @JsonView(Caso.Started.class)
    public Long id;

    @JsonView(Caso.Page.class)
    @WhenCreated
    public Timestamp created;

    @JsonView(Caso.Complete.class)
    @WhenModified
    public Timestamp updated;

    @JsonView(Caso.Complete.class)
    public Long createdBy;

    @JsonView(Caso.Complete.class)
    public Long updatedBy;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(200 Char)")
    @JsonView(Caso.Started.class)
    public String titulo;

    @Lob
    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="CLOB")
    @JsonView(Caso.Started.class)
    public String descripcion;

    @Constraints.Required(groups = SaveStep.class)
    @Column(columnDefinition="Varchar2(30 Char)")
    @JsonView(Caso.Started.class)
    public String nic;

    @JsonView(Caso.Page.class)
    public Usuario nicCreated;

    @JsonView(Caso.Complete.class)
    public Usuario nicCreatedBy;

    @Column(columnDefinition="Varchar2(28 Char)")
    @JsonView(Caso.Started.class)
    public String nuc;

    @JsonView(Caso.Complete.class)
    public Usuario nucCreated;

    @JsonView(Caso.Complete.class)
    public Usuario nucCreatedBy;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JsonView(Caso.Complete.class)
    public Estatus estatus;

    @ManyToOne
    @Constraints.Required(groups = SaveStep.class)
    @JsonView(Caso.Complete.class)
    public Agencia agencia;

    @Column(columnDefinition="Varchar2(50 Char)")
    public String distrito;

    @OneToMany(mappedBy = "caso", targetEntity = DocNic.class)
    public List <DocNic> documentos;

    @OneToMany(mappedBy = "caso", targetEntity = Predenuncia.class)
    public List <Predenuncia> predenuncia;

    @JsonIgnore
    @OneToMany(mappedBy = "caso", targetEntity = TipoRelacionPersona.class)
    public List <TipoRelacionPersona> relaciones;

    @OneToMany(mappedBy = "caso", targetEntity = Entrevista.class)
    public List <Entrevista> entrevistas;

    @JsonIgnore
    @OneToMany(mappedBy = "caso", targetEntity = Titular.class, cascade = CascadeType.ALL)
    public List <Titular> titulares;

    @JsonIgnore
    @OneToMany(mappedBy = "caso", targetEntity = Acuerdo.class, cascade = CascadeType.ALL)
    public List <Acuerdo> acuerdos;

    @JsonIgnore
    @OneToMany(mappedBy = "caso", targetEntity = PersonaCaso.class)
    public List <PersonaCaso> personasCasos;

    @JsonIgnore
    @OneToMany(mappedBy = "caso", targetEntity = DelitoCaso.class)
    public List <DelitoCaso> delitosCaso;

    public Date fechaAtencion;

    public String horaAtencion;

    @Column(columnDefinition="NUMBER(1,0) default 0")
    public boolean detenido;

    @Column(columnDefinition="Varchar2(250 Char)")
    public String fiscalia;

    // Finder para uso de la super class y sus accesos mas sencillos
    public static final Finder<Long, Caso> find = new Finder<>(Caso.class);

    @JsonView(Caso.Get.class)
    public Delito getDelitoPrincipal(){
        DelitoCaso delitoCaso = DelitoCaso.find.query().where().eq("caso.id", this.id).isNotNull("caso.id").eq("principal", true).findUnique();
        Delito dlt = null;
        if(delitoCaso != null)
            dlt = delitoCaso.delito;
        return dlt;
    }

    @JsonView(DelitoCaso.Get.class)
    public DelitoCaso getDelitoCaso(){
        DelitoCaso delitoCaso = DelitoCaso.find.query().where().eq("caso.id", this.id).isNotNull("caso.id").eq("principal", true).findUnique();
        if(delitoCaso != null)
            return delitoCaso;
        else
            return null;
    }

    public String getAllDelitos(){
        List <DelitoCaso> delitosCaso = DelitoCaso.find.query().where().eq("caso.id", this.id).isNotNull("caso.id").eq("principal",false).findList();
        DelitoCaso delitoCaso = DelitoCaso.find.query().where().eq("caso.id", this.id).isNotNull("caso.id").eq("principal", true).findUnique();
        String delitos="";
        Logger.debug("delitoCaso:"+delitoCaso);
        if(delitoCaso!=null){
            delitos=delitoCaso.delito.nombre+", ";
            if(delitosCaso.size()==0){
                delitos=delitos.substring(0, delitos.length()-2);
            }
        }
        for(int i=0; i<=delitosCaso.size()-1;i++){
            if(delitosCaso.get(i).delito.nombre!=null){
                delitos+=delitosCaso.get(i).delito.nombre;
                if(delitosCaso.size()==2 && delitosCaso.size()!=i+1){
                    delitos+=" y ";
                } else if(delitosCaso.size()>2 && delitosCaso.size()!=i+1){
                    delitos+=", ";
                }
            }
        }
        return delitos;
    }

    @JsonView(Caso.Started.class)
    public boolean getHasRelacionVictimaImputado()
    {
        List<TipoRelacionPersona> relacionesImputados = this.relaciones.stream()
        .filter(object -> object.tipo.equals("Imputado víctima delito"))
        .collect(Collectors.toList());

        return relacionesImputados.size() > 0;
    }

    @JsonView(Caso.Started.class)
    public boolean getHasPredenuncia()
    {
        return this.predenuncia.size() > 0;
    }

    @JsonView(Caso.Started.class)
    public boolean getHasAcuerdoInicio()
    {
        List<Acuerdo> acuerdos = this.acuerdos.stream()
        .filter(object -> object.tipo.equals("Acuerdo Inicio"))
        .collect(Collectors.toList());

        return acuerdos.size() > 0;
    }

    public Titular currentTitular(){
        List<Titular> titulares = this.titulares.stream()
        .filter(object -> object.vigente)
        .collect(Collectors.toList());

        return titulares.get(0);
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 453 * hash + Objects.hashCode(this.titulo);
        hash = 453 * hash + Objects.hashCode(this.descripcion);
        hash = 453 * hash + Objects.hashCode(this.nic);
        hash = 453 * hash + Objects.hashCode(this.nicCreated);
        hash = 453 * hash + Objects.hashCode(this.nicCreatedBy);
        hash = 453 * hash + Objects.hashCode(this.nuc);
        hash = 453 * hash + Objects.hashCode(this.nucCreated);
        hash = 453 * hash + Objects.hashCode(this.nucCreatedBy);
        hash = 453 * hash + Objects.hashCode(this.estatus);
        hash = 453 * hash + Objects.hashCode(this.agencia);
        hash = 453 * hash + Objects.hashCode(this.distrito);
        hash = 453 * hash + Objects.hashCode(this.documentos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caso other = (Caso) obj;

        return (
            !Objects.equals(this.titulo, other.titulo) ||
            !Objects.equals(this.descripcion, other.descripcion) ||
            !Objects.equals(this.nic, other.nic) ||
            !Objects.equals(this.nicCreated, other.nicCreated) ||
            !Objects.equals(this.nicCreatedBy, other.nicCreatedBy) ||
            !Objects.equals(this.nuc, other.nuc) ||
            !Objects.equals(this.nucCreated, other.nucCreated) ||
            !Objects.equals(this.nucCreatedBy, other.nucCreatedBy) ||
            !Objects.equals(this.estatus, other.estatus) ||
            !Objects.equals(this.documentos, other.documentos) ||
            !Objects.equals(this.distrito, other.distrito) ||
            !Objects.equals(this.agencia, other.agencia)
        ) ? false : true;
    }
}
