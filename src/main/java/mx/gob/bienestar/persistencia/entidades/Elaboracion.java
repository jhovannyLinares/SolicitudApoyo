package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_elaboracion")
public class Elaboracion {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELABORACION_SEQ")
	@SequenceGenerator(sequenceName = "elaboracion_seq", allocationSize = 1, name = "ELABORACION_SEQ")
	private Long id;
	
	@Column(name = "id_Elaboracion")
	private String elaboracion;
	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "quien_Elaboro")
	private String quienElaboro;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "paterno")
	private String paterno;
	
	@Column(name = "materno")
	private String materno;
	
	@Column(name = "is_Firma")
	private Boolean isFirma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(String elaboracion) {
		this.elaboracion = elaboracion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getQuienElaboro() {
		return quienElaboro;
	}

	public void setQuienElaboro(String quienElaboro) {
		this.quienElaboro = quienElaboro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public Boolean getIsFirma() {
		return isFirma;
	}

	public void setIsFirma(Boolean isFirma) {
		this.isFirma = isFirma;
	}
}