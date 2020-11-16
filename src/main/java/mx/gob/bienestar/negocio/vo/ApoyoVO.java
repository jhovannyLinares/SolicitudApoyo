package mx.gob.bienestar.negocio.vo;

public class ApoyoVO {

	private Long id;

	private String alimentario;

	private String especie;

	private String transfEcono;

	private String otro;

	private String tipo;

	private String cantidad;

	private String temporalidad;

	private Boolean darSeguimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlimentario() {
		return alimentario;
	}

	public void setAlimentario(String alimentario) {
		this.alimentario = alimentario;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTransfEcono() {
		return transfEcono;
	}

	public void setTransfEcono(String transfEcono) {
		this.transfEcono = transfEcono;
	}

	public String getOtro() {
		return otro;
	}

	public void setOtro(String otro) {
		this.otro = otro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getTemporalidad() {
		return temporalidad;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	public Boolean getDarSeguimiento() {
		return darSeguimiento;
	}

	public void setDarSeguimiento(Boolean darSeguimiento) {
		this.darSeguimiento = darSeguimiento;
	}


	
}
