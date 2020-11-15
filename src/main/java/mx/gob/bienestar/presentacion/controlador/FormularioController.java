package mx.gob.bienestar.presentacion.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.gob.bienestar.negocio.dto.FolioDTO;
import mx.gob.bienestar.negocio.servicios.IFormularioService;
import mx.gob.bienestar.presentacion.controlador.impl.config.IntegrationConstants;
import mx.gob.bienestar.presentacion.controlador.impl.config.interfaces.IController;

@Controller
@RequestMapping(value = "/formulario")
public class FormularioController implements IController, IntegrationConstants {

	@Autowired
	private IFormularioService formularioService;

	@Override
	public String init(Model model, HttpSession session) {
		return PRINCIPAL;
	}

	@GetMapping("/principal")
	public String getPrincipal(Model model, HttpSession session) {
		return formularioService.getPrincipal(model, session);
	}
	
	@PostMapping("/folio")
	public String getFolio(Model model, HttpSession session,FolioDTO dto) {
		return formularioService.getFolio(model, session,dto);
	}

//	@GetMapping("/unico")
//	public String getGeneral(Model model, HttpSession session) {
//		return formularioService.getGeneral(model, session);
//	}
//	@GetMapping("/solicitud")
//	public String getSolicitud(Model model, HttpSession session) {
//		return formularioService.getSolicitud(model, session);
//	}
//	
//	@GetMapping("/JefasdeFamilia")
//	public String getJefasFamilia(Model model, HttpSession session) {
//		return formularioService.getJefasFamilia(model, session);
//	}
//
//	@GetMapping("/registro/{id}")
//	public String getRegistro(Model model, HttpSession session, @PathVariable("id") Long idFormato) {
//
//		return formularioService.getRegistro(model, session, idFormato);
//	}
//
//	@PostMapping("/unico")
//	public String postGeneral(HttpSession session, @ModelAttribute FormatoUnicoDTO formatoUnicoDTO, final RedirectAttributes redirec) {
//
//		return formularioService.postGeneral(session, formatoUnicoDTO, redirec);
//
//	}

}
