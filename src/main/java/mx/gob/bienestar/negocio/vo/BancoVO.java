package mx.gob.bienestar.negocio.vo;

public class BancoVO {

	private Long id;
	
	private String tieneCuentaBancaria;
		
	private String banco;
		
	private String tarjeta;
		
	private String clabe;
		
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
