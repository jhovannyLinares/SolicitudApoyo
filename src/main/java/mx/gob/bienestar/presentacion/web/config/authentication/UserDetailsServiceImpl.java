package mx.gob.bienestar.presentacion.web.config.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import mx.gob.bienestar.negocio.util.mapper.MapperUtil;
import mx.gob.bienestar.negocio.vo.UsuarioResponse;
import mx.gob.bienestar.persistencia.entidades.Usuario;
import mx.gob.bienestar.persistencia.repositorio.IUsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	IUsuarioRepository usuarioRepository;

	public static void main(String[] args) {

		RestTemplate plantilla = new RestTemplate();
		UsuarioResponse resultado = plantilla.getForObject(
				"http://172.25.39.67:8080/API-QA.PERSONALSB/api-personal.activo/bienestar/usuarios/09/6/MAEM950621HDFRSR07",
				UsuarioResponse.class);
		System.out.println(resultado.toString());

	}

	@Override
	public UserDetails loadUserByUsername(String curp) throws UsernameNotFoundException {

		Usuario usuario = usuarioRepository.findByCurp(curp);

		if (usuario == null) {
			usuario = getArgos(curp);
		}

		if (usuario == null) {
			throw new BadCredentialsException("usernameNotFound");
//		} else if (usuario.getActivo() == 0) {
//			throw new CredentialsExpiredException("usernameInvalid");
		} else {

			UserBuilder builder = null;

			builder = User.withUsername(curp);
			builder.password(usuario.getPassword());
			builder.roles("USER");
			return builder.build();
		}
	}

	private Usuario getArgos(String curp) {

		Usuario usuario = null;
		try {

			RestTemplate plantilla = new RestTemplate();
			UsuarioResponse resultado = plantilla.getForObject(
					"http://172.25.39.67:8080/API-QA.PERSONALSB/api-personal.activo/bienestar/usuarios/09/6/" + curp,
					UsuarioResponse.class);

			usuario = new Usuario();
			MapperUtil.map(resultado, usuario);

			usuario.setPassword("ddfd7b29c07b1bae219fa9725902e368");

			usuarioRepository.save(usuario);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;

	}

}