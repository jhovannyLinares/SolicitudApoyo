package mx.gob.bienestar.negocio.servicios.config;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import mx.gob.bienestar.negocio.servicios.IUsuarioService;
import mx.gob.bienestar.negocio.vo.UsuarioVO;
import mx.gob.bienestar.presentacion.controlador.impl.config.IntegrationConstants;

public class ServiceMaster implements IntegrationConstants {

	protected final Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	protected IUsuarioService usuarioService;

	/**
	 * Metodo para obtener los datos completos del usuario, dependiente de
	 * setSession(HttpSession session)
	 * 
	 * @param session
	 * 
	 */
	protected UsuarioVO getUser(HttpSession session) {

		return usuarioService.getCurp(session.getAttribute(USERNAME).toString());

	}

	/**
	 * Metodo para obtener el id del usuario logeado, dependiente de
	 * setSession(HttpSession session)
	 * 
	 */
	protected Long getIdSession(HttpSession session) {
		return getUser(session).getId();
	}

	/**
	 * Metodo para obtener el userName del usuario logeado, dependiente de
	 * setSession(HttpSession session)
	 * 
	 */
	protected String getName(HttpSession session) {

		UsuarioVO usuario = getUser(session);

		StringBuilder builder = new StringBuilder();

		builder.append(usuario.getNombre());

		if (usuario.getPaterno() != null) {
			builder.append(" ");
			builder.append(usuario.getPaterno());
		}

		if (usuario.getMaterno() != null) {
			builder.append(" ");
			builder.append(usuario.getMaterno());
		}

		return builder.toString();
	}

	/**
	 * Metodo para obtener el idEstado del usuario logeado, dependiente de
	 * setSession(HttpSession session)
	 * 
	 * @param session
	 * 
	 */
//	protected Long getEstado(HttpSession session) {
//		return getUser(session).getEstado().getId();
//	}

}
