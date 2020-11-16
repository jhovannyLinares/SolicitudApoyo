package mx.gob.bienestar.negocio.servicios;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.request.RegistroDTO;

public interface ISeguridadService {

	String getLogin(HttpSession session);

	String registrar(Model model);
	
	String registrar(Model model, RegistroDTO dto);
}
