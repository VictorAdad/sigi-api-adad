package models;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import play.data.validation.Constraints;

@Entity
public class CaraNariz extends BaseModel implements BaseModel.Catalogo{


    @Column(columnDefinition="Varchar2(30 Char)")
    public String formaCara;

	@Column(columnDefinition="Varchar2(30 Char)")
	public String raizNariz;

	@Column(columnDefinition="Varchar2(30 Char)")
	public String dorsoNariz;

	@Column(columnDefinition="Varchar2(30 Char)")
	public String anchoNariz;

	@Column(columnDefinition="Varchar2(30 Char)")
	public String baseNariz;

	@Column(columnDefinition="Varchar2(30 Char)")
	public String alturaNariz;

    @Override
    public int hashCode() {
        int hash = 3;
		hash = 71 * hash + Objects.hashCode(this.formaCara);
		hash = 71 * hash + Objects.hashCode(this.raizNariz);
		hash = 71 * hash + Objects.hashCode(this.dorsoNariz);
		hash = 71 * hash + Objects.hashCode(this.anchoNariz);
		hash = 71 * hash + Objects.hashCode(this.baseNariz);
		hash = 71 * hash + Objects.hashCode(this.alturaNariz);
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

        final CaraNariz other =  (CaraNariz) obj;
        return (
			!Objects.equals(this.formaCara, other.formaCara) ||
			!Objects.equals(this.raizNariz, other.raizNariz) ||
			!Objects.equals(this.dorsoNariz, other.dorsoNariz) ||
			!Objects.equals(this.anchoNariz, other.anchoNariz) ||
			!Objects.equals(this.baseNariz, other.baseNariz) ||
			!Objects.equals(this.alturaNariz, other.alturaNariz)
            ) ? false : true;

    }
}