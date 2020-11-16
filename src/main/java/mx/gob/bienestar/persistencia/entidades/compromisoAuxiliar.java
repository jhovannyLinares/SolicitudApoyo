package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_compromiso_Auxiliar")
public class compromisoAuxiliar {
	
	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMPAUXILIAR_SEQ")
	@SequenceGenerator(sequenceName = "compromisoAuxiliar_seq", allocationSize = 1, name = "COMPAUXILIAR_SEQ")
	private Long id;
	
	@Column(name = "is_firma")
	private String isFirma;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsFirma() {
		return isFirma;
	}

	public void setIsFirma(String isFirma) {
		this.isFirma = isFirma;
	}

	
}
