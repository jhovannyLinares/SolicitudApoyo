package mx.gob.bienestar.negocio.servicios;

import mx.gob.bienestar.negocio.vo.UsuarioVO;

public interface IUsuarioService {

	public UsuarioVO save(UsuarioVO usuarioVO);

	public UsuarioVO getCurp(String string);

}
