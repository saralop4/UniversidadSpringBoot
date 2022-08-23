package mx.com.gm.web;

import javax.validation.*;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Sarah
 */
@Slf4j //permite usar la variable log
@Controller
public class ControladorInicio {

//    @Value("${index.saludo}")
//    private String saludo;
    @Autowired // con esta anotacion inyectamos la interfaz IPersonaDao a este controlador
    private IPersonaService personaService;

    @GetMapping("/") // se crea un mapeo para que el programa responda por la ruta localhost:8080
    public String inicio(Model model, @AuthenticationPrincipal User user) {
//        var persona = new Persona();
//        persona.setNombre("Sarah");
//        persona.setApellido("Lopez");
//        persona.setEmail("saralopez@gmail.com");
//        persona.setTelefono("3024057006");

        //List<Persona> personas = new ArrayList();
//       var personas = new ArrayList();
//       personas.add(persona);
//       personas.add(persona2);
//        var personas = Arrays.asList(persona, persona2);
        // var personas = Arrays.asList();
        var personas = personaService.listarPersonas();
        log.info("Ejecutando el controlador Spring MVC");
        log.info("Usuario que hizo login: "+ user); //log.info para imprimir en la consola
        //log.debug("mas detalle del controlador");
        // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas); // mapa clave valor
        return "index"; // devuelve la pagina del navegador html

    }

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores) {
      if(errores.hasErrors()){
              return "modificar";
              }
        personaService.guardar(persona);
        return "redirect:/";

    }

    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);
        return "redirect:/";
    }

}
