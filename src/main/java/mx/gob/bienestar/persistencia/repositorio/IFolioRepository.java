package mx.gob.bienestar.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.bienestar.persistencia.entidades.Folio;

@Repository
public interface IFolioRepository extends JpaRepository<Folio, Long> {

	@Override
	Folio getOne(Long f);

	Folio getByFolio(long f);

}