package mx.gob.bienestar.presentacion.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.gob.bienestar.negocio.dto.request.RegistroDTO;
import mx.gob.bienestar.negocio.servicios.ISeguridadService;
import mx.gob.bienestar.presentacion.controlador.impl.config.IntegrationConstants;
import mx.gob.bienestar.presentacion.controlador.impl.config.interfaces.IController;

@Controller
@RequestMapping(value = "/seguridad")
public class SeguridadController implements IController, IntegrationConstants {

	@Autowired
	ISeguridadService seguridadService;

	@Override
	public String init(Model model, HttpSession session) {
		return LOGIN;
	}

	@GetMapping("/login")
	public String getLogin(HttpSession session) {
		return seguridadService.getLogin(session);
	}

	@GetMapping("/registrar")
	public String registrar(Model model) {
		return seguridadService.registrar(model);
	}

	@PostMapping("/registrar")
	public String registrar(Model model, RegistroDTO dto) {
		return seguridadService.registrar(model, dto);
	}

}
