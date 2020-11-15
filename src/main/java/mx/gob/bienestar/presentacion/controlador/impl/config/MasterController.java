//package mx.gob.bienestar.presentacion.controlador.impl.config;
//
//import javax.servlet.http.HttpSession;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import mx.gob.bienestar.negocio.dto.FormatoUnicoDTO;
//import mx.gob.bienestar.negocio.servicios.IUsuarioService;
//import mx.gob.bienestar.negocio.vo.EstadoVO;
//import mx.gob.bienestar.negocio.vo.UsuarioVO;
//
//public abstract class MasterController implements IntegrationConstants {
//
//	protected final Logger logger = Logger.getLogger(this.getClass());
//
//	protected HttpSession session;
//
//	protected UsuarioVO usuarioVO;
//
//	@Autowired
//	protected IUsuarioService usuarioService;
//
//	/**
//	 * Metodo para asignar HttpSession a MasterController, necesaria para lograr
//	 * funcionamiento de metodos extras
//	 * 
//	 * @param session proveniente de HttpSession
//	 * 
//	 */
//	protected void setSession(HttpSession session) {
//		this.session = session;
//	}
//
//	/**
//	 * Metodo para obtener los datos completos del usuario, dependiente de
//	 * setSession(HttpSession session)
//	 * 
//	 */
//	protected UsuarioVO getUser() {
//
//		if (usuarioVO == null) {
//			usuarioVO = usuarioService.getUsuarioByUserName(session.getAttribute(USERNAME).toString());
//		}
//
//		return usuarioVO;
//
//	}
//
//	/**
//	 * Metodo para obtener el id del usuario logeado, dependiente de
//	 * setSession(HttpSession session)
//	 * 
//	 */
//	protected Long getIdSession() {
//		return getUser().getId();
//	}
//
//	/**
//	 * Metodo para obtener el userName del usuario logeado, dependiente de
//	 * setSession(HttpSession session)
//	 * 
//	 */
//	protected String getUserName() {
//		return getUser().getUserName();
//	}
//
//	/**
//	 * Metodo para obtener el idEstado del usuario logeado, dependiente de
//	 * setSession(HttpSession session)
//	 * 
//	 */
//	protected Long getEstado() {
//		return getUser().getEstado().getId();
//	}
//	
//	/**
//	 * Metodo para inicializar un formato nuevo, dependiente de
//	 * setSession(HttpSession session)
//	 * 
//	 */
//	protected FormatoUnicoDTO newFormato() {
//		FormatoUnicoDTO FormatoUnicoDTO = new FormatoUnicoDTO();
//		EstadoVO estado = new EstadoVO();
//		estado.setId(getEstado());
//		FormatoUnicoDTO.setEstado(estado);
//		return FormatoUnicoDTO;
//		
//	}
//
//}
