//package mx.gob.bienestar.presentacion.controlador;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import mx.gob.bienestar.negocio.servicios.ICatalogoService;
//import mx.gob.bienestar.presentacion.controlador.impl.config.IntegrationConstants;
//import mx.gob.bienestar.presentacion.controlador.impl.config.interfaces.IController;
//
//@Controller
//@RequestMapping(value = "/formulario/catalogo")
//public class CatalogoController implements IController, IntegrationConstants {
//
//	@Autowired
//	private ICatalogoService catalogoService;
//
//	@Override
//	public String init(Model model, HttpSession session) {
//		return PRINCIPAL;
//	}
//
//	@GetMapping("/regiones")
//	public String getRegiones(Model model, HttpSession session) {
//		return REGIONES;
//
//	}
//
//	@GetMapping("/regiones/{estado}")
//	public String getRegionesByEstado(Model model, @PathVariable("estado") Long estadoId) {
//
//		return catalogoService.getRegionesByEstado(model, estadoId);
//
//	}
//	
//	@GetMapping("/municipios/{estado}")
//	public String getMunicipiosByEstado(Model model, @PathVariable("estado") Long estadoId) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getMunicipiosByEstado(model, estadoId);
//
//	}
//	
//	@GetMapping("/localidades/{municipioId}")
//	public String getlocalidadesByMunicipio(Model model, @PathVariable("municipioId") Long municipioId) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getlocalidadesByMunicipio(model, municipioId);
//
//	}
//	
//	@GetMapping("/localidades2/{municipioId}")
//	public String getlocalidadesByMunicipio2(Model model, @PathVariable("municipioId") Long municipioId) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getlocalidadesByMunicipio2(model, municipioId);
//
//	}
//
//	@GetMapping("/parentesco/{idParentesco}")
//	public String getparentescoById(Model model, @PathVariable("idParentesco") Long idParentesco) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getparentescoById(model, idParentesco,1);
//
//	}
//	
//	@GetMapping("/parentesco2/{idParentesco}")
//	public String getparentesco2ById(Model model, @PathVariable("idParentesco") Long idParentesco) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getparentescoById(model, idParentesco,2);
//
//	}
//	
//	@GetMapping("/parentesco3/{idParentesco}")
//	public String getparentesco3ById(Model model, @PathVariable("idParentesco") Long idParentesco) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getparentescoById(model, idParentesco,3);
//
//	}
//	
//	@GetMapping("/tipoMedioCobro/{idmedioCobro}")
//	public String getmedioCobroById(Model model, @PathVariable("idmedioCobro") Long idmedioCobro) {
//		System.out.println("Entra a carga de catalogo");
//
//		return catalogoService.getmedioCobroById(model, idmedioCobro);
//
//	}
//}
