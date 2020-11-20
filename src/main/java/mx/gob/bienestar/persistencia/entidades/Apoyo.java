//package mx.gob.bienestar.persistencia.entidades;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "m_apoyo")
//public class Apoyo {
//
//	@Id
//	@Column(unique = true, name = "id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APOYO_SEQ")
//	@SequenceGenerator(sequenceName = "apoyo_seq", allocationSize = 1, name = "APOYO_SEQ")
//	private Long id;
//
//	@Column(name = "alimentario")
//	private String alimentario;
//
//	@Column(name = "especie")
//	private String especie;
//
//	@Column(name = "transferencia_Economica")
//	private String transferenciaEconomica;
//
//	@Column(name = "otro")
//	private String otro;
//
//	@Column(name = "tipo")
//	private String tipo;
//
//	@Column(name = "cantidad")
//	private String cantidad;
//
//	@Column(name = "temporalidad")
//	private String temporalidad;
//
//	@Column(name = "dar_Seguimiento")
//	private Boolean darSeguimiento;
//
//	@MapsId
//	@OneToOne(fetch = FetchType.EAGER)
//	private Solicitud solicitud;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//
//	public String getCantidad() {
//		return cantidad;
//	}
//
//	public void setCantidad(String cantidad) {
//		this.cantidad = cantidad;
//	}
//
//	public String getTemporalidad() {
//		return temporalidad;
//	}
//
//	public void setTemporalidad(String temporalidad) {
//		this.temporalidad = temporalidad;
//	}
//
//	public Boolean getDarSeguimiento() {
//		return darSeguimiento;
//	}
//
//	public void setDarSeguimiento(Boolean darSeguimiento) {
//		this.darSeguimiento = darSeguimiento;
//	}
//
//	public Solicitud getSolicitud() {
//		return solicitud;
//	}
//
//	public void setSolicitud(Solicitud solicitud) {
//		this.solicitud = solicitud;
//	}
//
//	public String getAlimentario() {
//		return alimentario;
//	}
//
//	public void setAlimentario(String alimentario) {
//		this.alimentario = alimentario;
//	}
//
//	public String getEspecie() {
//		return especie;
//	}
//
//	public void setEspecie(String especie) {
//		this.especie = especie;
//	}
//
//	public String getTransferenciaEconomica() {
//		return transferenciaEconomica;
//	}
//
//	public void setTransferenciaEconomica(String transferenciaEconomica) {
//		this.transferenciaEconomica = transferenciaEconomica;
//	}
//
//	public String getOtro() {
//		return otro;
//	}
//
//	public void setOtro(String otro) {
//		this.otro = otro;
//	}
//
//}
