package mx.gob.bienestar.negocio.servicios.impl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import mx.gob.bienestar.negocio.servicios.ISeguridadService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;

@Service
public class SeguridadServiceImpl extends ServiceMaster implements ISeguridadService {

	@Override
	public String getLogin(HttpSession session) {

		if (session.getAttribute(USERNAME) != null) {
			
			return PRINCIPAL_REDIRECT;
		}

		return LOGIN;

	}
}
