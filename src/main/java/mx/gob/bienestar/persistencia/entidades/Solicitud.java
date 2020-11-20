package mx.gob.bienestar.persistencia.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_solicitud")
public class Solicitud {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOLICITUD_SEQ")
	@SequenceGenerator(sequenceName = "SOLICITUD_SEQ", allocationSize = 1, name = "SOLICITUD_SEQ")
	private Long id;
	
	@Column(name = "folio")
	private Long folio;

	@Column(name = "tipo_Solicitud")
	private String tipoSolicitud;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "firma_Solicitud")
	private boolean firmaSolicitud;

	@Column(name = "firma_Compromiso_Auxiliar")
	private boolean firmaCompromisoAuxiliar;

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DatosPersona datosPersona = new DatosPersona();

//	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private AuxRecibirApoyo auxRecibirApoyo = new AuxRecibirApoyo();
//
//	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Banco banco = new Banco();
//
//	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Apoyo apoyo = new Apoyo();

	@OneToMany(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Incorporacion> incorporaciones = new ArrayList<Incorporacion>();

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DaniosPerdidas perdidas = new DaniosPerdidas();

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Elaboracion elaboracion = new Elaboracion();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public Long getFolio() {
		return folio;
	}

	public void setFolio(Long folio) {
		this.folio = folio;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isFirmaSolicitud() {
		return firmaSolicitud;
	}

	public void setFirmaSolicitud(boolean firmaSolicitud) {
		this.firmaSolicitud = firmaSolicitud;
	}

	public boolean isFirmaCompromisoAuxiliar() {
		return firmaCompromisoAuxiliar;
	}

	public void setFirmaCompromisoAuxiliar(boolean firmaCompromisoAuxiliar) {
		this.firmaCompromisoAuxiliar = firmaCompromisoAuxiliar;
	}

	public DatosPersona getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersona datosPersona) {
		this.datosPersona = datosPersona;
	}

//	public AuxRecibirApoyo getAuxRecibirApoyo() {
//		return auxRecibirApoyo;
//	}
//
//	public void setAuxRecibirApoyo(AuxRecibirApoyo auxRecibirApoyo) {
//		this.auxRecibirApoyo = auxRecibirApoyo;
//	}
//
//	public Banco getBanco() {
//		return banco;
//	}
//
//	public void setBanco(Banco banco) {
//		this.banco = banco;
//	}
//
//	public Apoyo getApoyo() {
//		return apoyo;
//	}
//
//	public void setApoyo(Apoyo apoyo) {
//		this.apoyo = apoyo;
//	}

	public List<Incorporacion> getIncorporaciones() {
		return incorporaciones;
	}

	public void setIncorporaciones(List<Incorporacion> incorporaciones) {
		this.incorporaciones = incorporaciones;
	}

	public DaniosPerdidas getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(DaniosPerdidas perdidas) {
		this.perdidas = perdidas;
	}

	public Elaboracion getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(Elaboracion elaboracion) {
		this.elaboracion = elaboracion;
	}

}
