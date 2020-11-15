package mx.gob.bienestar.negocio.servicios.impl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.FolioDTO;
import mx.gob.bienestar.negocio.servicios.IFormularioService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;

@Service
public class FormularioServiceImpl extends ServiceMaster implements IFormularioService {

	@Override
	public String getPrincipal(Model model, HttpSession session) {

		model.addAttribute("nombreCompleto", getName(session));
		model.addAttribute("folioDTO", new FolioDTO());

		return PRINCIPAL;
	}

	@Override
	public String getFolio(Model model, HttpSession session, FolioDTO dto) {
		
		System.out.println(dto.getFolio());
		
		return PRINCIPAL_REDIRECT;
	}

}
