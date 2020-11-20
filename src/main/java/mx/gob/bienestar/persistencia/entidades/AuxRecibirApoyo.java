//package mx.gob.bienestar.persistencia.entidades;
//
//import java.sql.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "m_aux_Recibir_Apoyo")
//public class AuxRecibirApoyo {
//
//	@Id
//	@Column(unique = true, name = "id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUXAPOYO_SEQ")
//	@SequenceGenerator(sequenceName = "auxRecibirApoyo_seq", allocationSize = 1, name = "AUXAPOYO_SEQ")
//	private Long id;
//
//	@Column(name = "nombre")
//	private String nombre;
//
//	@Column(name = "paterno")
//	private String paterno;
//
//	@Column(name = "materno")
//	private String materno;
//
//	@Column(name = "sexo")
//	private String sexo;
//
//	@Column(name = "edad")
//	private String edad;
//
//	@Column(name = "fecha_nacimiento")
//	private String fechaNacimiento;
//
//	@Column(name = "estado_nacimiento")
//	private String estadoNacimiento;
//
//	@Column(name = "telefono_fijo")
//	private String telefonoFijo;
//
//	@Column(name = "celular")
//	private String celular;
//
//	@Column(name = "clave_elector")
//	private String claveElector;
//
//	@Column(name = "curp")
//	private String curp;
//
//	@Column(name = "localidad")
//	private String localidad;
//
//	@Column(name = "colonia")
//	private String colonia;
//
//	@Column(name = "calle")
//	private String calle;
//
//	@Column(name = "num_ext")
//	private String numExt;
//
//	@Column(name = "num_int")
//	private String numInt;
//
//	@Column(name = "manzana")
//	private String manzana;
//
//	@Column(name = "lote")
//	private String lote;
//
//	@Column(name = "codigo_postal")
//	private String codigoPostal;
//
//	@Column(name = "parentezco")
//	private String parentezco;
//	
//	@Column(name = "documento_uno")
//	private String documentoUno;
//	
//	@Column(name = "documento_dos")
//	private String documentoDos;
//	
//	@Column(name = "documento_tres")
//	private String documentoTres;
//
//	@MapsId
//	@OneToOne(fetch = FetchType.EAGER)
//	private Solicitud solicitud;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getPaterno() {
//		return paterno;
//	}
//
//	public void setPaterno(String paterno) {
//		this.paterno = paterno;
//	}
//
//	public String getMaterno() {
//		return materno;
//	}
//
//	public void setMaterno(String materno) {
//		this.materno = materno;
//	}
//
//	public String getSexo() {
//		return sexo;
//	}
//
//	public void setSexo(String sexo) {
//		this.sexo = sexo;
//	}
//
//	public String getEdad() {
//		return edad;
//	}
//
//	public void setEdad(String edad) {
//		this.edad = edad;
//	}
//
//	public String getFechaNacimiento() {
//		return fechaNacimiento;
//	}
//
//	public void setFechaNacimiento(String fechaNacimiento) {
//		this.fechaNacimiento = fechaNacimiento;
//	}
//
//	public String getEstadoNacimiento() {
//		return estadoNacimiento;
//	}
//
//	public void setEstadoNacimiento(String estadoNacimiento) {
//		this.estadoNacimiento = estadoNacimiento;
//	}
//
//	public String getTelefonoFijo() {
//		return telefonoFijo;
//	}
//
//	public void setTelefonoFijo(String telefonoFijo) {
//		this.telefonoFijo = telefonoFijo;
//	}
//
//	public String getCelular() {
//		return celular;
//	}
//
//	public void setCelular(String celular) {
//		this.celular = celular;
//	}
//
//	public String getClaveElector() {
//		return claveElector;
//	}
//
//	public void setClaveElector(String claveElector) {
//		this.claveElector = claveElector;
//	}
//
//	public String getCurp() {
//		return curp;
//	}
//
//	public void setCurp(String curp) {
//		this.curp = curp;
//	}
//
//	public String getLocalidad() {
//		return localidad;
//	}
//
//	public void setLocalidad(String localidad) {
//		this.localidad = localidad;
//	}
//
//	public String getColonia() {
//		return colonia;
//	}
//
//	public void setColonia(String colonia) {
//		this.colonia = colonia;
//	}
//
//	public String getCalle() {
//		return calle;
//	}
//
//	public void setCalle(String calle) {
//		this.calle = calle;
//	}
//
//	public String getNumExt() {
//		return numExt;
//	}
//
//	public void setNumExt(String numExt) {
//		this.numExt = numExt;
//	}
//
//	public String getNumInt() {
//		return numInt;
//	}
//
//	public void setNumInt(String numInt) {
//		this.numInt = numInt;
//	}
//
//	public String getManzana() {
//		return manzana;
//	}
//
//	public void setManzana(String manzana) {
//		this.manzana = manzana;
//	}
//
//	public String getLote() {
//		return lote;
//	}
//
//	public void setLote(String lote) {
//		this.lote = lote;
//	}
//
//	public String getCodigoPostal() {
//		return codigoPostal;
//	}
//
//	public void setCodigoPostal(String codigoPostal) {
//		this.codigoPostal = codigoPostal;
//	}
//
//	public String getParentezco() {
//		return parentezco;
//	}
//
//	public void setParentezco(String parentezco) {
//		this.parentezco = parentezco;
//	}
//
//	public String getDocumentoUno() {
//		return documentoUno;
//	}
//
//	public void setDocumentoUno(String documentoUno) {
//		this.documentoUno = documentoUno;
//	}
//
//	public String getDocumentoDos() {
//		return documentoDos;
//	}
//
//	public void setDocumentoDos(String documentoDos) {
//		this.documentoDos = documentoDos;
//	}
//
//	public String getDocumentoTres() {
//		return documentoTres;
//	}
//
//	public void setDocumentoTres(String documentoTres) {
//		this.documentoTres = documentoTres;
//	}
//
//
//		
//
//	public Solicitud getSolicitud() {
//		return solicitud;
//	}
//
//	public void setSolicitud(Solicitud solicitud) {
//		this.solicitud = solicitud;
//	}
//
//}
