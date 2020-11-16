package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;

import mx.gob.bienestar.negocio.vo.DatosPersonaVO;

public class SolicitudDTO implements Serializable {

	private static final long serialVersionUID = -1650453974147647975L;

	private long folio;

	private String tipoSolicitud;

	private String fecha;

	private DatosPersonaVO datosPersona = new DatosPersonaVO();

	public long getFolio() {
		return folio;
	}

	public void setFolio(long folio) {
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

	public DatosPersonaVO getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersonaVO datosPersona) {
		this.datosPersona = datosPersona;
	}

}
