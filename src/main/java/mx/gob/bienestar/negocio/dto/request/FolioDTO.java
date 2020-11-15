package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;

public class FolioDTO implements Serializable {


	private static final long serialVersionUID = -1650453974147647975L;

	private String folio;

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

}
