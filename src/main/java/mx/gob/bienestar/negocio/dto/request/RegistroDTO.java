package mx.gob.bienestar.negocio.dto.request;

import java.io.Serializable;

public class RegistroDTO implements Serializable {

	private static final long serialVersionUID = -1650453974147647975L;

	private String curp;

	private String nombre;

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
