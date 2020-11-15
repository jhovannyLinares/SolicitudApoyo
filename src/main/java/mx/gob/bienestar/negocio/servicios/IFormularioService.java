package mx.gob.bienestar.negocio.servicios;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.FolioDTO;

public interface IFormularioService {

	String getPrincipal(Model model, HttpSession session);

	String getFolio(Model model, HttpSession session, FolioDTO dto);

}
