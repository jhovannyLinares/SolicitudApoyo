package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
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
	private String elavoracionId;
	
	@Column(name = "persona")
	private String persona;
	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "quien_Elaboro")
	private String quienElaboro;
	
	@Column(name = "dependencia")
	private String dependencia;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "paterno")
	private String paterno;
	
	@Column(name = "materno")
	private String materno;
	
	@Column(name = "is_Firma")
	private Boolean isFirma;
	
	@MapsId
	@OneToOne(fetch = FetchType.EAGER)
	private Solicitud solicitud;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getElavoracionId() {
		return elavoracionId;
	}

	public void setElavoracionId(String elavoracionId) {
		this.elavoracionId = elavoracionId;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
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

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
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

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	
	
	
}
