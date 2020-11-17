package mx.gob.bienestar.negocio.servicios.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.request.FolioDTO;
import mx.gob.bienestar.negocio.dto.request.SolicitudDTO;
import mx.gob.bienestar.negocio.servicios.IFormularioService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;
import mx.gob.bienestar.negocio.util.mapper.MapperUtil;
import mx.gob.bienestar.negocio.vo.IncorporacionVO;
import mx.gob.bienestar.persistencia.entidades.Configuracion;
import mx.gob.bienestar.persistencia.entidades.Folio;
import mx.gob.bienestar.persistencia.entidades.Incorporacion;
import mx.gob.bienestar.persistencia.entidades.Solicitud;
import mx.gob.bienestar.persistencia.repositorio.IConfiguracionRepository;
import mx.gob.bienestar.persistencia.repositorio.IFolioRepository;
import mx.gob.bienestar.persistencia.repositorio.ISolicitudRepository;

@Service
public class FormularioServiceImpl extends ServiceMaster implements IFormularioService {

	@Autowired
	private IConfiguracionRepository configuracionRepository;

	@Autowired
	private IFolioRepository folioRepository;
	
	@Autowired
	private ISolicitudRepository solicitudRepository;

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

			if (isValid(dto.getFolio())) {

				Folio folio = new Folio();

				folio.setFolio(dto.getFolio());
				folio.setUsuarioId(getIdSession(session));
				folio.setFecha(new Date(System.currentTimeMillis()));

				folioRepository.save(folio);

				return PAGINA1_REDIRECT.concat(dto.getFolio().toString());
			}

		}

		// Mensaje de Error

		return PRINCIPAL_REDIRECT.concat("?error=true");

	}

	private boolean isValid(long f) {

		Folio folio = folioRepository.getByFolio(f);

		if (folio == null) {
			return true;
		}

		return false;
	}

	@Override
	public String getPagina1(Model model, HttpSession session) {
		model.addAttribute("nombreCompleto", getName(session));

		SolicitudDTO dto = new SolicitudDTO();

		List<IncorporacionVO> incorporacionVOs = new ArrayList<IncorporacionVO>();

		IncorporacionVO vo;
		for (int i = 0; i < 7; i++) {
			vo = new IncorporacionVO();
			incorporacionVOs.add(vo);
		}

		dto.setIncorporaciones(incorporacionVOs);

		model.addAttribute("solicitudDTO", dto);

		return PAGINA1;
	}

	@Override
	public String postPagina1(Model model, HttpSession session, SolicitudDTO dto) {

		System.out.println(dto.toString());

		Solicitud solicitud = new Solicitud();

		MapperUtil.map(dto, solicitud);

		if (solicitud.getDatosPersona() != null && solicitud.getDatosPersona().getNombres() != null) {
			solicitud.getDatosPersona().setSolicitud(solicitud);
		} else {
			solicitud.setDatosPersona(null);
		}

		if (solicitud.getAuxRecibirApoyo() != null && solicitud.getAuxRecibirApoyo().getNombre() != null) {
			solicitud.getAuxRecibirApoyo().setSolicitud(solicitud);
		} else {
			solicitud.setAuxRecibirApoyo(null);
		}

		if (solicitud.getBanco() != null && solicitud.getBanco().getBanco() != null) {
			solicitud.getBanco().setSolicitud(solicitud);
		} else {
			solicitud.setBanco(null);
		}

		if (solicitud.getApoyo() != null) {
			solicitud.getApoyo().setSolicitud(solicitud);
		} else {
			solicitud.setApoyo(null);
		}

		if (solicitud.getIncorporaciones() != null) {

			for (Incorporacion in : solicitud.getIncorporaciones()) {
				in.setSolicitud(solicitud);
			}

		} else {
			solicitud.setIncorporaciones(null);
		}

		if (solicitud.getPerdidas() != null) {
			solicitud.getPerdidas().setSolicitud(solicitud);
		} else {
			solicitud.setPerdidas(null);
		}

		if (solicitud.getElaboracion() != null) {
			solicitud.getElaboracion().setSolicitud(solicitud);
		} else {
			solicitud.setElaboracion(null);
		}
		
		solicitudRepository.save(solicitud);

		return PRINCIPAL_REDIRECT;
	}

}
