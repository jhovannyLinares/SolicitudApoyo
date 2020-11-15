package mx.gob.bienestar.negocio.vo;

import java.io.Serializable;

public class UsuarioVO implements Serializable {

	private static final long serialVersionUID = -4333478719569722638L;

	private Long id;

	private String idPersonal;

	private String curp;

	private String paterno;

	private String materno;

	private String nombre;

	private String tipoContratacionId;

	private String contratacion;

	private String puestoId;

	private String puesto;

	private String entidadID;

	private String entidad;

	private String claveRegion;

	private String region;

	private String cup;

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

}
