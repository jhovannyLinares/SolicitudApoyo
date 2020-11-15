package mx.gob.bienestar.negocio.servicios;

import javax.servlet.http.HttpSession;

public interface ISeguridadService {

	String getLogin(HttpSession session);
}
