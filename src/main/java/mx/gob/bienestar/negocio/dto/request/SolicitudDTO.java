package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//import mx.gob.bienestar.negocio.vo.ApoyoVO;
//import mx.gob.bienestar.negocio.vo.AuxRecibirApoyoVO;
//import mx.gob.bienestar.negocio.vo.BancoVO;
import mx.gob.bienestar.negocio.vo.DatosPersonaVO;
import mx.gob.bienestar.negocio.vo.ElaboracionVO;
import mx.gob.bienestar.negocio.vo.IncorporacionVO;
import mx.gob.bienestar.negocio.vo.PerdidasVO;

public class SolicitudDTO implements Serializable {

	private static final long serialVersionUID = -1650453974147647975L;

	private Long id;

	private String tipoSolicitud;

	private Long folio;

	private String fecha;

	private boolean firmaSolicitud;

	private boolean firmaCompromisoAuxiliar;

	private DatosPersonaVO datosPersona = new DatosPersonaVO();

//	private AuxRecibirApoyoVO auxRecibirApoyo = new AuxRecibirApoyoVO();
//
//	private BancoVO banco = new BancoVO();
//
//	private ApoyoVO apoyo = new ApoyoVO();

	private List<IncorporacionVO> incorporaciones = new ArrayList<IncorporacionVO>();

	private PerdidasVO perdidas = new PerdidasVO();

	private ElaboracionVO elaboracion = new ElaboracionVO();

	public Long getFolio() {
		return folio;
	}

	public void setFolio(Long folio) {
		this.folio = folio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public DatosPersonaVO getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersonaVO datosPersona) {
		this.datosPersona = datosPersona;
	}

	public PerdidasVO getPerdidas() {
		return perdidas;
	}

	public void setPerdidas(PerdidasVO perdidas) {
		this.perdidas = perdidas;
	}

	public List<IncorporacionVO> getIncorporaciones() {
		return incorporaciones;
	}

	public void setIncorporaciones(List<IncorporacionVO> incorporaciones) {
		this.incorporaciones = incorporaciones;
	}

//	public AuxRecibirApoyoVO getAuxRecibirApoyo() {
//		return auxRecibirApoyo;
//	}
//
//	public void setAuxRecibirApoyo(AuxRecibirApoyoVO auxRecibirApoyo) {
//		this.auxRecibirApoyo = auxRecibirApoyo;
//	}
//
//	public BancoVO getBanco() {
//		return banco;
//	}
//
//	public void setBanco(BancoVO banco) {
//		this.banco = banco;
//	}
//
//	public ApoyoVO getApoyo() {
//		return apoyo;
//	}
//
//	public void setApoyo(ApoyoVO apoyo) {
//		this.apoyo = apoyo;
//	}

	public ElaboracionVO getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(ElaboracionVO elaboracion) {
		this.elaboracion = elaboracion;
	}

//	@Override
//	public String toString() {
//		return "SolicitudDTO [id=" + id + ", tipoSolicitud=" + tipoSolicitud + ", fecha=" + fecha + ", firmaSolicitud="
//				+ firmaSolicitud + ", firmaCompromisoAuxiliar=" + firmaCompromisoAuxiliar + ", datosPersona="
//				+ datosPersona + ", auxRecibirApoyo=" + auxRecibirApoyo + ", banco=" + banco + ", apoyo=" + apoyo
//				+ ", incorporaciones=" + incorporaciones + ", perdidas=" + perdidas + ", elaboracion=" + elaboracion
//				+ "]";
//	}
	@Override
	public String toString() {
		return "SolicitudDTO [id=" + id + ", tipoSolicitud=" + tipoSolicitud + ", fecha=" + fecha + ", firmaSolicitud="
				+ firmaSolicitud + ", firmaCompromisoAuxiliar=" + firmaCompromisoAuxiliar + ", datosPersona="
				+ datosPersona + ", incorporaciones=" + incorporaciones + ", perdidas=" + perdidas + ", elaboracion=" + elaboracion
				+ "]";
	}


}
