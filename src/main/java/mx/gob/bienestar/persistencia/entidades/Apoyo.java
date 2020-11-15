package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_apoyo")
public class Apoyo {
	
	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APOYO_SEQ")
	@SequenceGenerator(sequenceName = "apoyo_seq", allocationSize = 1, name = "APOYO_SEQ")
	private Long id;

	
	@Column(name = "apoyo")
	private String apoyo;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "cantidad")
	private String cantidad;
	
	@Column(name = "temporalidad")
	private String temporalidad;
	
	@Column(name = "dar_Seguimiento")
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
