package mx.gob.bienestar.negocio.servicios.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import mx.gob.bienestar.negocio.dto.request.RegistroDTO;
import mx.gob.bienestar.negocio.servicios.ISeguridadService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;
import mx.gob.bienestar.negocio.util.mapper.MapperUtil;
import mx.gob.bienestar.persistencia.entidades.Usuario;
import mx.gob.bienestar.persistencia.repositorio.IUsuarioRepository;

@Service
public class SeguridadServiceImpl extends ServiceMaster implements ISeguridadService {

	@Autowired
	IUsuarioRepository usuarioRepository;

	@Override
	public String getLogin(HttpSession session) {

		if (session.getAttribute(USERNAME) != null) {

			return PRINCIPAL_REDIRECT;
		}

		return LOGIN;

	}

	@Override
	public String registrar(Model model) {

		model.addAttribute("registroDTO", new RegistroDTO());

		return REGISTRO;
	}

	@Override
	public String registrar(Model model, RegistroDTO dto) {

		Usuario usuario = new Usuario();
		MapperUtil.map(dto, usuario);

		Usuario find = usuarioRepository.findByCurp(dto.getCurp());

		if (find == null) {
			usuario.setPassword("ddfd7b29c07b1bae219fa9725902e368");
			usuarioRepository.save(usuario);
		}

		return LOGIN_REDIRECT;
	}
}
