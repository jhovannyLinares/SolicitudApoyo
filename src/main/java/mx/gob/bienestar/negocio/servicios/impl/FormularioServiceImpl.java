package mx.gob.bienestar.negocio.servicios.impl;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.request.FolioDTO;
import mx.gob.bienestar.negocio.servicios.IFormularioService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;
import mx.gob.bienestar.persistencia.entidades.Configuracion;
import mx.gob.bienestar.persistencia.entidades.Folio;
import mx.gob.bienestar.persistencia.repositorio.IConfiguracionRepository;
import mx.gob.bienestar.persistencia.repositorio.IFolioRepository;

@Service
public class FormularioServiceImpl extends ServiceMaster implements IFormularioService {

	@Autowired
	private IConfiguracionRepository configuracionRepository;

	@Autowired
	private IFolioRepository folioRepository;

	@Override
	public String getPrincipal(Model model, HttpSession session) {

		model.addAttribute("nombreCompleto", getName(session));

		model.addAttribute("folioDTO", new FolioDTO());

		return PRINCIPAL;
	}

	@Override
	public String getFolio(Model model, HttpSession session, FolioDTO dto) {

		Configuracion configuration = configuracionRepository.findOne(1L);

		if (configuration.getFolioMinimo() <= dto.getFolio() && configuration.getFolioMaximo() >= dto.getFolio()) {

			Folio folio = new Folio();

			folio.setFolio(dto.getFolio());
			folio.setUsuarioId(getIdSession(session));
			folio.setFecha(new Date(System.currentTimeMillis()));

			folioRepository.save(folio);

			return PAGINA1_REDIRECT;

		}

		// Mensaje de Error

		return PRINCIPAL_REDIRECT.concat("?error=true");

	}

}
