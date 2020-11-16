package mx.gob.bienestar.negocio.vo;

public class ElaboracionVO {

	private Long id;

	private String persona;

	private String lugar;

	private String quienElaboro;

	private String dependencia;

	private String nombre;

	private String paterno;

	private String materno;

	private Boolean isFirma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
