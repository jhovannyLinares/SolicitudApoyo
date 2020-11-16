package mx.gob.bienestar.negocio.servicios;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.request.FolioDTO;
import mx.gob.bienestar.negocio.dto.request.SolicitudDTO;

public interface IFormularioService {

	String getPrincipal(Model model, HttpSession session);

	String getFolio(Model model, HttpSession session, FolioDTO dto);

	String getPagina1(Model model, HttpSession session);

	String postPagina1(Model model, HttpSession session, SolicitudDTO dto);

}
