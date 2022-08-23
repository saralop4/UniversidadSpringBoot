package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Sarah
 */
@Slf4j //permite usar la variable log
@Controller
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/") // se crea un mapeo para que el programa responda por la ruta localhost:8080
    public String inicio(Model model) {
        var persona = new Persona();
        persona.setNombre("Sarah");
        persona.setApellido("Lopez");
        persona.setEmail("saralopez@gmail.com");
        persona.setTelefono("3024057006");

        var persona2 = new Persona();
        persona2.setNombre("Howard");
        persona2.setApellido("Tafur");
        persona2.setEmail("howardtafur@gmail.com");
        persona2.setTelefono("3023918538");
        //List<Persona> personas = new ArrayList();
//       var personas = new ArrayList();
//       personas.add(persona);
//       personas.add(persona2);
        var personas = Arrays.asList(persona, persona2);
        // var personas = Arrays.asList();
        var mensaje = "Hola mundo con thymeleaf";
        log.info("Ejecutando el controlador Spring MVC");
        //log.debug("mas detalle del controlador");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index"; // devuelve la pagina del navegador html

    }

}
