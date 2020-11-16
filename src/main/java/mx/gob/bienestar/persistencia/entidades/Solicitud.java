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

	@Column(name = "firmaSolicitud")
	private boolean firmaSolicitud;

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private DatosPersona datosPersona = new DatosPersona();

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private AuxRecibirApoyo auxiliar = new AuxRecibirApoyo();

	@OneToOne(mappedBy = "solicitud", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Banco banco = new Banco();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean isFirmaSolicitud() {
		return firmaSolicitud;
	}

	public void setFirmaSolicitud(boolean firmaSolicitud) {
		this.firmaSolicitud = firmaSolicitud;
	}

	public DatosPersona getDatosPersona() {
		return datosPersona;
	}

	public void setDatosPersona(DatosPersona datosPersona) {
		this.datosPersona = datosPersona;
	}

	public AuxRecibirApoyo getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(AuxRecibirApoyo auxiliar) {
		this.auxiliar = auxiliar;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	
	

}
