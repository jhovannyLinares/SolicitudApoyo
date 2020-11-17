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
	private String isMaiz;

	@Column(name = "Is_Frijol")
	private String isFrijol;

	@Column(name = "Is_Arroz")
	private String isArroz;

	@Column(name = "Is_Citricos")
	private String isCitricos;

	@Column(name = "Is_Cacao")
	private String isCacao;

	@Column(name = "Is_Coco")
	private String isCoco;

	@Column(name = "Is_Cana")
	private String isCana;

	@Column(name = "Is_Sorgo")
	private String isSorgo;

	@Column(name = "Cultivo_Otro")
	private String CultivoOtro;

	@Column(name = "Cultivo_Superficie")
	private String CultivoSuperficie;

	@Column(name = "Is_Colchon")
	private String isColchon;

	@Column(name = "Is_Cama")
	private String isCama;

	@Column(name = "Is_Comedor")
	private String isComedor;

	@Column(name = "Is_Sala")
	private String isSala;

	@Column(name = "Is_Estufa")
	private String isEstufa;

	@Column(name = "Is_Refrigerador")
	private String isRefrigerador;

	@Column(name = "Is_Lavadora")
	private String isLavadora;

	@Column(name = "Is_Radio")
	private String isRadio;

	@Column(name = "Is_Television")
	private String isTelevision;

	@Column(name = "Is_Microondas")
	private String isMicroondas;

	@Column(name = "Is_Computadora")
	private String isComputadora;

	@Column(name = "Otros_Mobiliario")
	private String otrosMobiliario;

	@Column(name = "Is_Dano_Parcial")
	private String danoParcial;

	@Column(name = "Is_Dano_Total")
	private String danoTotal;

	@Column(name = "Is_Adobe")
	private String isAdobe;

	@Column(name = "Is_Cemento")
	private String isCemento;

	@Column(name = "Is_Ladrillo")
	private String isladrillo;

	@Column(name = "Is_Madera")
	private String isMadera;

	@Column(name = "Otros_Material")
	private String otrosMaterial;

	@Column(name = "Is_Energia_Electrica")
	private String isenergiaElectrica;

	@Column(name = "Is_Agua")
	private String isAgua;

	@Column(name = "Is_Gas")
	private String isGas;

	@Column(name = "Is_Drenaje")
	private String isDrenaje;

	@Column(name = "Is_Vialidad")
	private String isVialidad;

	@Column(name = "Is_Telefono")
	private String isTelefono;

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

	public String getIsMaiz() {
		return isMaiz;
	}

	public void setIsMaiz(String isMaiz) {
		this.isMaiz = isMaiz;
	}

	public String getIsFrijol() {
		return isFrijol;
	}

	public void setIsFrijol(String isFrijol) {
		this.isFrijol = isFrijol;
	}

	public String getIsArroz() {
		return isArroz;
	}

	public void setIsArroz(String isArroz) {
		this.isArroz = isArroz;
	}

	public String getIsCitricos() {
		return isCitricos;
	}

	public void setIsCitricos(String isCitricos) {
		this.isCitricos = isCitricos;
	}

	public String getIsCacao() {
		return isCacao;
	}

	public void setIsCacao(String isCacao) {
		this.isCacao = isCacao;
	}

	public String getIsCoco() {
		return isCoco;
	}

	public void setIsCoco(String isCoco) {
		this.isCoco = isCoco;
	}

	public String getIsCana() {
		return isCana;
	}

	public void setIsCana(String isCana) {
		this.isCana = isCana;
	}

	public String getIsSorgo() {
		return isSorgo;
	}

	public void setIsSorgo(String isSorgo) {
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

	public String getIsColchon() {
		return isColchon;
	}

	public void setIsColchon(String isColchon) {
		this.isColchon = isColchon;
	}

	public String getIsCama() {
		return isCama;
	}

	public void setIsCama(String isCama) {
		this.isCama = isCama;
	}

	public String getIsComedor() {
		return isComedor;
	}

	public void setIsComedor(String isComedor) {
		this.isComedor = isComedor;
	}

	public String getIsSala() {
		return isSala;
	}

	public void setIsSala(String isSala) {
		this.isSala = isSala;
	}

	public String getIsEstufa() {
		return isEstufa;
	}

	public void setIsEstufa(String isEstufa) {
		this.isEstufa = isEstufa;
	}

	public String getIsRefrigerador() {
		return isRefrigerador;
	}

	public void setIsRefrigerador(String isRefrigerador) {
		this.isRefrigerador = isRefrigerador;
	}

	public String getIsLavadora() {
		return isLavadora;
	}

	public void setIsLavadora(String isLavadora) {
		this.isLavadora = isLavadora;
	}

	public String getIsRadio() {
		return isRadio;
	}

	public void setIsRadio(String isRadio) {
		this.isRadio = isRadio;
	}

	public String getIsTelevision() {
		return isTelevision;
	}

	public void setIsTelevision(String isTelevision) {
		this.isTelevision = isTelevision;
	}

	public String getIsMicroondas() {
		return isMicroondas;
	}

	public void setIsMicroondas(String isMicroondas) {
		this.isMicroondas = isMicroondas;
	}

	public String getIsComputadora() {
		return isComputadora;
	}

	public void setIsComputadora(String isComputadora) {
		this.isComputadora = isComputadora;
	}

	public String getOtrosMobiliario() {
		return otrosMobiliario;
	}

	public void setOtrosMobiliario(String otrosMobiliario) {
		this.otrosMobiliario = otrosMobiliario;
	}

	public String getDanoParcial() {
		return danoParcial;
	}

	public void setDanoParcial(String danoParcial) {
		this.danoParcial = danoParcial;
	}

	public String getDanoTotal() {
		return danoTotal;
	}

	public void setDanoTotal(String danoTotal) {
		this.danoTotal = danoTotal;
	}

	public String getIsAdobe() {
		return isAdobe;
	}

	public void setIsAdobe(String isAdobe) {
		this.isAdobe = isAdobe;
	}

	public String getIsCemento() {
		return isCemento;
	}

	public void setIsCemento(String isCemento) {
		this.isCemento = isCemento;
	}

	public String getIsladrillo() {
		return isladrillo;
	}

	public void setIsladrillo(String isladrillo) {
		this.isladrillo = isladrillo;
	}

	public String getIsMadera() {
		return isMadera;
	}

	public void setIsMadera(String isMadera) {
		this.isMadera = isMadera;
	}

	public String getOtrosMaterial() {
		return otrosMaterial;
	}

	public void setOtrosMaterial(String otrosMaterial) {
		this.otrosMaterial = otrosMaterial;
	}

	public String getIsenergiaElectrica() {
		return isenergiaElectrica;
	}

	public void setIsenergiaElectrica(String isenergiaElectrica) {
		this.isenergiaElectrica = isenergiaElectrica;
	}

	public String getIsAgua() {
		return isAgua;
	}

	public void setIsAgua(String isAgua) {
		this.isAgua = isAgua;
	}

	public String getIsGas() {
		return isGas;
	}

	public void setIsGas(String isGas) {
		this.isGas = isGas;
	}

	public String getIsDrenaje() {
		return isDrenaje;
	}

	public void setIsDrenaje(String isDrenaje) {
		this.isDrenaje = isDrenaje;
	}

	public String getIsVialidad() {
		return isVialidad;
	}

	public void setIsVialidad(String isVialidad) {
		this.isVialidad = isVialidad;
	}

	public String getIsTelefono() {
		return isTelefono;
	}

	public void setIsTelefono(String isTelefono) {
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
