package mx.gob.bienestar.presentacion.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.gob.bienestar.presentacion.controlador.impl.config.IntegrationConstants;
import mx.gob.bienestar.presentacion.controlador.impl.config.interfaces.IController;

@Controller
@RequestMapping(value = "/")
public class HomeController implements IController, IntegrationConstants {
	

	@Override
	public String init(Model model, HttpSession session) {
		return INDEX;
	}

}
