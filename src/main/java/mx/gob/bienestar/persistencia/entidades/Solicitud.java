package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_solicitud")
public class Solicitud {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOLICITUD_SEQ")
	@SequenceGenerator(sequenceName = "SOLICITUD_SEQ", allocationSize = 1, name = "SOLICITUD_SEQ")
	private Long id;

	@Column(name = "tipo_Solicitud")
	private String tipoSolicitud;

	@Column(name = "fecha")
	private String fecha;

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DatosPersona datosPersona = new DatosPersona();

}
