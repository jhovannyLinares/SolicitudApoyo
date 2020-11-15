package mx.gob.bienestar.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.bienestar.persistencia.entidades.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

//	Usuario findByUserName(String userName);
	
	Usuario findByCurp(String curp);

}