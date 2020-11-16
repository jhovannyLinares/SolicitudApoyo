package mx.gob.bienestar.negocio.vo;

public class ApoyoVO {

	private Long id;
	
	private String apoyo;
		
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

	public String getApoyo() {
		return apoyo;
	}

	public void setApoyo(String apoyo) {
		this.apoyo = apoyo;
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
