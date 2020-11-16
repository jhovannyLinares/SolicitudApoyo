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
@Table(name = "m_Perdidas")
public class DaniosPerdidas {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PER_SEQ")
	@SequenceGenerator(sequenceName = "perdidas_seq", allocationSize = 1, name = "PER_SEQ")
	private Long id;

	@Column(name = "Cantidad_Vacuno")
	private String cantidadVacuno;

	@Column(name = "Cantidad_Caprino")
	private String cantidadCaprino;

	@Column(name = "Cantidad_Ovino")
	private String cantidadOvino;

	@Column(name = "Cantidad_Porcino")
	private String CantidadPorcino;

	@Column(name = "Cantidad_Equino")
	private String CantidadEquino;

	@Column(name = "Cantidad_Avicola")
	private String CantidadAvicola;

	@Column(name = "Is_Maiz")
	private boolean isMaiz;
	
	@Column(name = "Is_Frijol")
	private boolean isFrijol;
	
	@Column(name = "Is_Arroz")
	private boolean isArroz;
	
	@Column(name = "Is_Citricos")
	private boolean isCitricos;
	
	@Column(name = "Is_Cacao")
	private boolean isCacao;
	
	@Column(name = "Is_Coco")
	private boolean isCoco;
	
	@Column(name = "Is_Cana")
	private boolean isCana;
	
	@Column(name = "Is_Sorgo")
	private boolean isSorgo;
	
	@Column(name = "Cultivo_Otro")
	private String CultivoOtro;

	@Column(name = "Cultivo_Superficie")
	private String CultivoSuperficie;

	@Column(name = "Is_Colchon")
	private boolean isColchon;
	
	@Column(name = "Is_Cama")
	private boolean isCama;
	
	@Column(name = "Is_Comedor")
	private boolean isComedor;
	
	@Column(name = "Is_Sala")
	private boolean isSala;
	
	@Column(name = "Is_Estufa")
	private boolean isEstufa;
	
	@Column(name = "Is_Refrigerador")
	private boolean isRefrigerador;
	
	@Column(name = "Is_Lavadora")
	private boolean isLavadora;
	
	@Column(name = "Is_Radio")
	private boolean isRadio;
	
	@Column(name = "Is_Television")
	private boolean isTelevision;
	
	@Column(name = "Is_Microondas")
	private boolean isMicroondas;
	
	@Column(name = "Is_Computadora")
	private boolean isComputadora;
	
	@Column(name = "Otros_Mobiliario")
	private String otrosMobiliario;
	
	@Column(name = "Is_Dano_Parcial")
	private boolean danoParcial;
	
	@Column(name = "Is_Dano_Total")
	private boolean danoTotal;
	
	@Column(name = "Is_Adobe")
	private boolean isAdobe;
	
	@Column(name = "Is_Cemento")
	private boolean isCemento;
	
	@Column(name = "Is_Ladrillo")
	private boolean isladrillo;
	
	@Column(name = "Is_Madera")
	private boolean isMadera;
	
	@Column(name = "Otros_Material")
	private String otrosMaterial;

	@Column(name = "Is_Energia_Electrica")
	private boolean isenergiaElectrica;
	
	@Column(name = "Is_Agua")
	private boolean isAgua;
	
	@Column(name = "Is_Gas")
	private boolean isGas;
	
	@Column(name = "Is_Drenaje")
	private boolean isDrenaje;
	
	@Column(name = "Is_Vialidad")
	private boolean isVialidad;
	
	@Column(name = "Is_Telefono")
	private boolean isTelefono;
	
	@Column(name = "Otros_Servicios")
	private String otrosServicios;
	
	@MapsId
	@OneToOne(fetch = FetchType.EAGER)
	private Solicitud solicitud;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCantidadVacuno() {
		return cantidadVacuno;
	}

	public void setCantidadVacuno(String cantidadVacuno) {
		this.cantidadVacuno = cantidadVacuno;
	}

	public String getCantidadCaprino() {
		return cantidadCaprino;
	}

	public void setCantidadCaprino(String cantidadCaprino) {
		this.cantidadCaprino = cantidadCaprino;
	}

	public String getCantidadOvino() {
		return cantidadOvino;
	}

	public void setCantidadOvino(String cantidadOvino) {
		this.cantidadOvino = cantidadOvino;
	}

	public String getCantidadPorcino() {
		return CantidadPorcino;
	}

	public void setCantidadPorcino(String cantidadPorcino) {
		CantidadPorcino = cantidadPorcino;
	}

	public String getCantidadEquino() {
		return CantidadEquino;
	}

	public void setCantidadEquino(String cantidadEquino) {
		CantidadEquino = cantidadEquino;
	}

	public String getCantidadAvicola() {
		return CantidadAvicola;
	}

	public void setCantidadAvicola(String cantidadAvicola) {
		CantidadAvicola = cantidadAvicola;
	}

	public boolean isMaiz() {
		return isMaiz;
	}

	public void setMaiz(boolean isMaiz) {
		this.isMaiz = isMaiz;
	}

	public boolean isFrijol() {
		return isFrijol;
	}

	public void setFrijol(boolean isFrijol) {
		this.isFrijol = isFrijol;
	}

	public boolean isArroz() {
		return isArroz;
	}

	public void setArroz(boolean isArroz) {
		this.isArroz = isArroz;
	}

	public boolean isCitricos() {
		return isCitricos;
	}

	public void setCitricos(boolean isCitricos) {
		this.isCitricos = isCitricos;
	}

	public boolean isCacao() {
		return isCacao;
	}

	public void setCacao(boolean isCacao) {
		this.isCacao = isCacao;
	}

	public boolean isCoco() {
		return isCoco;
	}

	public void setCoco(boolean isCoco) {
		this.isCoco = isCoco;
	}

	public boolean isCana() {
		return isCana;
	}

	public void setCana(boolean isCana) {
		this.isCana = isCana;
	}

	public boolean isSorgo() {
		return isSorgo;
	}

	public void setSorgo(boolean isSorgo) {
		this.isSorgo = isSorgo;
	}

	public String getCultivoOtro() {
		return CultivoOtro;
	}

	public void setCultivoOtro(String cultivoOtro) {
		CultivoOtro = cultivoOtro;
	}

	public String getCultivoSuperficie() {
		return CultivoSuperficie;
	}

	public void setCultivoSuperficie(String cultivoSuperficie) {
		CultivoSuperficie = cultivoSuperficie;
	}

	public boolean isColchon() {
		return isColchon;
	}

	public void setColchon(boolean isColchon) {
		this.isColchon = isColchon;
	}

	public boolean isCama() {
		return isCama;
	}

	public void setCama(boolean isCama) {
		this.isCama = isCama;
	}

	public boolean isComedor() {
		return isComedor;
	}

	public void setComedor(boolean isComedor) {
		this.isComedor = isComedor;
	}

	public boolean isSala() {
		return isSala;
	}

	public void setSala(boolean isSala) {
		this.isSala = isSala;
	}

	public boolean isEstufa() {
		return isEstufa;
	}

	public void setEstufa(boolean isEstufa) {
		this.isEstufa = isEstufa;
	}

	public boolean isRefrigerador() {
		return isRefrigerador;
	}

	public void setRefrigerador(boolean isRefrigerador) {
		this.isRefrigerador = isRefrigerador;
	}

	public boolean isLavadora() {
		return isLavadora;
	}

	public void setLavadora(boolean isLavadora) {
		this.isLavadora = isLavadora;
	}

	public boolean isRadio() {
		return isRadio;
	}

	public void setRadio(boolean isRadio) {
		this.isRadio = isRadio;
	}

	public boolean isTelevision() {
		return isTelevision;
	}

	public void setTelevision(boolean isTelevision) {
		this.isTelevision = isTelevision;
	}

	public boolean isMicroondas() {
		return isMicroondas;
	}

	public void setMicroondas(boolean isMicroondas) {
		this.isMicroondas = isMicroondas;
	}

	public boolean isComputadora() {
		return isComputadora;
	}

	public void setComputadora(boolean isComputadora) {
		this.isComputadora = isComputadora;
	}

	public String getOtrosMobiliario() {
		return otrosMobiliario;
	}

	public void setOtrosMobiliario(String otrosMobiliario) {
		this.otrosMobiliario = otrosMobiliario;
	}

	public boolean isDanoParcial() {
		return danoParcial;
	}

	public void setDanoParcial(boolean danoParcial) {
		this.danoParcial = danoParcial;
	}

	public boolean isDanoTotal() {
		return danoTotal;
	}

	public void setDanoTotal(boolean danoTotal) {
		this.danoTotal = danoTotal;
	}

	public boolean isAdobe() {
		return isAdobe;
	}

	public void setAdobe(boolean isAdobe) {
		this.isAdobe = isAdobe;
	}

	public boolean isCemento() {
		return isCemento;
	}

	public void setCemento(boolean isCemento) {
		this.isCemento = isCemento;
	}

	public boolean isIsladrillo() {
		return isladrillo;
	}

	public void setIsladrillo(boolean isladrillo) {
		this.isladrillo = isladrillo;
	}

	public boolean isMadera() {
		return isMadera;
	}

	public void setMadera(boolean isMadera) {
		this.isMadera = isMadera;
	}

	public String getOtrosMaterial() {
		return otrosMaterial;
	}

	public void setOtrosMaterial(String otrosMaterial) {
		this.otrosMaterial = otrosMaterial;
	}

	public boolean isIsenergiaElectrica() {
		return isenergiaElectrica;
	}

	public void setIsenergiaElectrica(boolean isenergiaElectrica) {
		this.isenergiaElectrica = isenergiaElectrica;
	}

	public boolean isAgua() {
		return isAgua;
	}

	public void setAgua(boolean isAgua) {
		this.isAgua = isAgua;
	}

	public boolean isGas() {
		return isGas;
	}

	public void setGas(boolean isGas) {
		this.isGas = isGas;
	}

	public boolean isDrenaje() {
		return isDrenaje;
	}

	public void setDrenaje(boolean isDrenaje) {
		this.isDrenaje = isDrenaje;
	}

	public boolean isVialidad() {
		return isVialidad;
	}

	public void setVialidad(boolean isVialidad) {
		this.isVialidad = isVialidad;
	}

	public boolean isTelefono() {
		return isTelefono;
	}

	public void setTelefono(boolean isTelefono) {
		this.isTelefono = isTelefono;
	}

	public String getOtrosServicios() {
		return otrosServicios;
	}

	public void setOtrosServicios(String otrosServicios) {
		this.otrosServicios = otrosServicios;
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}
	
	
}
