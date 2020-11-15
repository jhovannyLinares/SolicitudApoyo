package mx.gob.bienestar.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.bienestar.persistencia.entidades.Configuracion;

@Repository
public interface IConfiguracionRepository extends JpaRepository<Configuracion, Long> {

	@Override
	Configuracion findOne(Long id);
	
}