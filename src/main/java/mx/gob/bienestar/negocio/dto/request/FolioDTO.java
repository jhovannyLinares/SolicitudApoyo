package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;

import mx.gob.bienestar.persistencia.entidades.DatosPersona;

public class FolioDTO implements Serializable {

	private static final long serialVersionUID = -1650453974147647975L;

	private long folio;

	private DatosPersona datosPersona = new DatosPersona();

	public long getFolio() {
		return folio;
	}

	public void setFolio(long folio) {
		this.folio = folio;
	}

	public DatosPersona getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersona datosPersona) {
		this.datosPersona = datosPersona;
	}

}
