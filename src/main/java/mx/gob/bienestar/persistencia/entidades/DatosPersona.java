package mx.gob.bienestar.persistencia.entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_datosPersona")
public class DatosPersona {
	
	@Id
	@Column(unique = true, name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SEQ")
	@SequenceGenerator(sequenceName = "datos_seq", allocationSize = 1, name = "DAT_SEQ")
	private Long id;
	
	@Column(name = "Estado")
	private String estado;
	
	@Column(name = "Region")
	private String region;
	
	@Column(name = "Municipio")
	private String municipio;
	
	@Column(name = "Area")
	private String area;
	
	@Column(name = "Nombres")
	private String nombres;
	
	@Column(name = "Paterno")
	private String paterno;
	
	@Column(name = "Materno")
	private String materno;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "Edad")
	private String edad;
	
	@Column(name = "Fecha_Nacimiento")
	private Date fechaNacimiento;
	
	@Column(name = "Estado_Nacimiento")
	private String estadoNacimiento;
	
	@Column(name = "Telefono_Fijo")
	private String telfonoFijo;
	
	@Column(name = "Celular")
	private String celular;
	
	@Column(name = "Clave_Electoral")
	private String claveElectoral;
	
	@Column(name = "CURP", unique = true)
	private String curp;
	
	@Column(name = "Localidad")
	private String localidad;
	
	@Column(name = "Colonia")
	private String colonia;
	
	@Column(name = "Calle")
	private String calle;
	
	@Column(name = "Num_Ext")
	private String numExt;
	
	@Column(name = "Num_Int")
	private String numInt;
	
	@Column(name = "Manzana")
	private String manzana;
	
	@Column(name = "Lote")
	private String lote;
	
	@Column(name = "Codigo_Postal")
	private String codigoPostal;
	
	@Column(name = "Referencia1")
	private String referencia1;
	
	@Column(name = "Referencia2")
	private String referencia2;
	
	@Column(name = "Is_Pueblo_Indigena")
	private String isPuebloIndigena;
	
	@Column(name = "Pueblo_Indigena")
	private String puebloIndigena;
	
	@Column(name = "Is_Idioma_Indigena")
	private String isIdiomaIndigena;
	
	@Column(name = "Idioma_Indigena")
	private String idiomaIndigena;
	
	@Column(name = "Ingreso_Mensual")
	private String ingresoMensual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstadoNacimiento() {
		return estadoNacimiento;
	}

	public void setEstadoNacimiento(String estadoNacimiento) {
		this.estadoNacimiento = estadoNacimiento;
	}

	public String getTelfonoFijo() {
		return telfonoFijo;
	}

	public void setTelfonoFijo(String telfonoFijo) {
		this.telfonoFijo = telfonoFijo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getClaveElectoral() {
		return claveElectoral;
	}

	public void setClaveElectoral(String claveElectoral) {
		this.claveElectoral = claveElectoral;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumExt() {
		return numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getReferencia1() {
		return referencia1;
	}

	public void setReferencia1(String referencia1) {
		this.referencia1 = referencia1;
	}

	public String getReferencia2() {
		return referencia2;
	}

	public void setReferencia2(String referencia2) {
		this.referencia2 = referencia2;
	}

	public String getIsPuebloIndigena() {
		return isPuebloIndigena;
	}

	public void setIsPuebloIndigena(String isPuebloIndigena) {
		this.isPuebloIndigena = isPuebloIndigena;
	}

	public String getPuebloIndigena() {
		return puebloIndigena;
	}

	public void setPuebloIndigena(String puebloIndigena) {
		this.puebloIndigena = puebloIndigena;
	}

	public String getIsIdiomaIndigena() {
		return isIdiomaIndigena;
	}

	public void setIsIdiomaIndigena(String isIdiomaIndigena) {
		this.isIdiomaIndigena = isIdiomaIndigena;
	}

	public String getIdiomaIndigena() {
		return idiomaIndigena;
	}

	public void setIdiomaIndigena(String idiomaIndigena) {
		this.idiomaIndigena = idiomaIndigena;
	}

	public String getIngresoMensual() {
		return ingresoMensual;
	}

	public void setIngresoMensual(String ingresoMensual) {
		this.ingresoMensual = ingresoMensual;
	}
	
}
