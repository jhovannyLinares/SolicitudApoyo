package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_usuarios")
public class Usuario {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUA_SEQ")
	@SequenceGenerator(sequenceName = "usuarios_seq", allocationSize = 1, name = "USUA_SEQ")
	private Long id;

	@Column(name = "idPersonal")
	private String idPersonal;

	@Column(name = "curp", unique = true)
	private String curp;

	@Column(name = "paterno")
	private String paterno;

	@Column(name = "materno")
	private String materno;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "tipoContratacionId")
	private String tipoContratacionId;

	@Column(name = "contratacion")
	private String contratacion;

	@Column(name = "puestoId")
	private String puestoId;

	@Column(name = "puesto")
	private String puesto;

	@Column(name = "entidadID")
	private String entidadID;

	@Column(name = "entidad")
	private String entidad;

	@Column(name = "claveRegion")
	private String claveRegion;

	@Column(name = "region")
	private String region;

	@Column(name = "cup")
	private String cup;

	@Column(name = "pwd")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(String idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoContratacionId() {
		return tipoContratacionId;
	}

	public void setTipoContratacionId(String tipoContratacionId) {
		this.tipoContratacionId = tipoContratacionId;
	}

	public String getContratacion() {
		return contratacion;
	}

	public void setContratacion(String contratacion) {
		this.contratacion = contratacion;
	}

	public String getPuestoId() {
		return puestoId;
	}

	public void setPuestoId(String puestoId) {
		this.puestoId = puestoId;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getEntidadID() {
		return entidadID;
	}

	public void setEntidadID(String entidadID) {
		this.entidadID = entidadID;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getClaveRegion() {
		return claveRegion;
	}

	public void setClaveRegion(String claveRegion) {
		this.claveRegion = claveRegion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//
////	@OneToOne(fetch = FetchType.LAZY)
////	@JoinColumn(name = "Estado.id")
////	private Estado estado;
//

}
