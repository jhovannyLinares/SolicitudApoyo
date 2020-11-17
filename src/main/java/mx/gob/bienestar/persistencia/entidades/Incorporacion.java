package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_incorporacion")
public class Incorporacion {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Incorp_SEQ")
	@SequenceGenerator(sequenceName = "Incorp_SEQ", allocationSize = 1, name = "Incorp_SEQ")
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "paterno")
	private String paterno;

	@Column(name = "materno")
	private String materno;

	@Column(name = "edad")
	private String edad;

	@Column(name = "parentesco")
	private String parentesco;

	@Column(name = "programa")
	private String programa;

////	@MapsId
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Solicitud solicitud;

	@ManyToOne
	@JoinColumn(name = "solicitud_id", nullable = false)
	private Solicitud solicitud;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

}
