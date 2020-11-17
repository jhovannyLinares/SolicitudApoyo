package mx.gob.bienestar.persistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.gob.bienestar.persistencia.entidades.Solicitud;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Long> {

}