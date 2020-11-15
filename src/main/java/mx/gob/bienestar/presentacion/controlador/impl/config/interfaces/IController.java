package mx.gob.bienestar.presentacion.controlador.impl.config.interfaces;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface IController {
	
	@GetMapping
	public String init(Model model, HttpSession session);

}
