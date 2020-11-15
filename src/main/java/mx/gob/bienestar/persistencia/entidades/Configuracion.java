package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_configuracion")
public class Configuracion {

	@Id
	@Column(unique = true, name = "id")
	private Long id;

	@Column(name = "concepto")
	private String concepto;

	@Column(name = "folio_Minimo")
	private long folioMinimo;

	@Column(name = "folio_Maximo")
	private long folioMaximo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public long getFolioMinimo() {
		return folioMinimo;
	}

	public void setFolioMinimo(long folioMinimo) {
		this.folioMinimo = folioMinimo;
	}

	public long getFolioMaximo() {
		return folioMaximo;
	}

	public void setFolioMaximo(long folioMaximo) {
		this.folioMaximo = folioMaximo;
	}

}
