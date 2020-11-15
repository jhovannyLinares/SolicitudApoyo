package mx.gob.bienestar.negocio.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.gob.bienestar.negocio.servicios.IUsuarioService;
import mx.gob.bienestar.negocio.servicios.config.ServiceMaster;
import mx.gob.bienestar.negocio.util.mapper.MapperUtil;
import mx.gob.bienestar.negocio.vo.UsuarioVO;
import mx.gob.bienestar.persistencia.entidades.Usuario;
import mx.gob.bienestar.persistencia.repositorio.IUsuarioRepository;

@Service
public class UsuarioServiceImpl extends ServiceMaster implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

//	@Override
//	public UsuarioVO getUsuarioByUserName(String userName) {
//		UsuarioVO usuarioVO = new UsuarioVO();
//		Usuario usuario = usuarioRepository.findByUserName(userName);
//		MapperUtil.map(usuario, usuarioVO);
//		return usuarioVO;
//	}

	@Override
	public UsuarioVO save(UsuarioVO usuarioVO) {

		Usuario usuario = new Usuario();
		MapperUtil.map(usuarioVO, usuario);
		usuarioRepository.save(usuario);
		MapperUtil.map(usuario, usuarioVO);

		return usuarioVO;
	}

	@Override
	public UsuarioVO getCurp(String curp) {
		UsuarioVO usuarioVO = new UsuarioVO();
		Usuario usuario = usuarioRepository.findByCurp(curp);
		if (usuario != null)
			MapperUtil.map(usuario, usuarioVO);
		return usuarioVO;
	}

}
