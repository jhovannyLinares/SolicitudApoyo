package mx.gob.bienestar.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_banco")
public class Banco {

	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BANCO_SEQ")
	@SequenceGenerator(sequenceName = "banco_seq", allocationSize = 1, name = "BANCO_SEQ")
	private Long id;
	
	@Column(name = "tiene_Cuenta_Bancaria")
	private String tieneCuentaBancaria;
	
	@Column(name = "banco")
	private String banco;
	
	@Column(name = "tarjeta")
	private String tarjeta;
	
	@Column(name = "clabe")
	private String clabe;
	
	@Column(name = "cuenta")
	private String cuenta;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTieneCuentaBancaria() {
		return tieneCuentaBancaria;
	}

	public void setTieneCuentaBancaria(String tieneCuentaBancaria) {
		this.tieneCuentaBancaria = tieneCuentaBancaria;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	
	
	
	
}
