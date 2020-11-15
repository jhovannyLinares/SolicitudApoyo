package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_daniosPerdidas")
public class DaniosPerdidas {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAN_SEQ")
	@SequenceGenerator(sequenceName = "danios_seq", allocationSize = 1, name = "DAN_SEQ")
	private Long id;

	@Column(name = "idDanios")
	private String idDanios;
	
	@Column(name = "Ganado")
	private String ganado;
	
	@Column(name = "CantidadG")
	private String cantidadG;
	
	@Column(name = "Cultivo")
	private String cultivo;
	
	@Column(name = "Otro")
	private String otro;
	
	@Column(name = "Cantidad")
	private String cantidad;
	
	@Column(name = "Superficie")
	private String superficie;
	
	@Column(name = "Mobiliario")
	private String mobiliario;
	
	@Column(name = "OtrosM")
	private String otrosM;
	
	@Column(name = "Vienda")
	private String vienda;
	
	@Column(name = "Material")
	private String material;
	
	@Column(name = "OtrosMat")
	private String otrosMat;
	
	@Column(name = "Servicios")
	private String servicios;
	
	@Column(name = "OtrosS")
	private String otrosS;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdDanios() {
		return idDanios;
	}

	public void setIdDanios(String idDanios) {
		this.idDanios = idDanios;
	}

	public String getGanado() {
		return ganado;
	}

	public void setGanado(String ganado) {
		this.ganado = ganado;
	}

	public String getCantidadG() {
		return cantidadG;
	}

	public void setCantidadG(String cantidadG) {
		this.cantidadG = cantidadG;
	}

	public String getCultivo() {
		return cultivo;
	}

	public void setCultivo(String cultivo) {
		this.cultivo = cultivo;
	}

	public String getOtro() {
		return otro;
	}

	public void setOtro(String otro) {
		this.otro = otro;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getMobiliario() {
		return mobiliario;
	}

	public void setMobiliario(String mobiliario) {
		this.mobiliario = mobiliario;
	}

	public String getOtrosM() {
		return otrosM;
	}

	public void setOtrosM(String otrosM) {
		this.otrosM = otrosM;
	}

	public String getVienda() {
		return vienda;
	}

	public void setVienda(String vienda) {
		this.vienda = vienda;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getOtrosMat() {
		return otrosMat;
	}

	public void setOtrosMat(String otrosMat) {
		this.otrosMat = otrosMat;
	}

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	public String getOtrosS() {
		return otrosS;
	}

	public void setOtrosS(String otrosS) {
		this.otrosS = otrosS;
	}
	
}
