package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;

import mx.gob.bienestar.persistencia.entidades.DatosPersona;

public class FolioDTO implements Serializable {

	private static final long serialVersionUID = -1650453974147647975L;

	private Long folio;

	private DatosPersona datosPersona = new DatosPersona();

	public Long getFolio() {
		return folio;
	}

	public void setFolio(Long folio) {
		this.folio = folio;
	}

	public DatosPersona getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersona datosPersona) {
		this.datosPersona = datosPersona;
	}

}
