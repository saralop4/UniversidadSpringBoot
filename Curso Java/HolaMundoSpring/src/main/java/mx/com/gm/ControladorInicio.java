package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sarah
 */
@Slf4j //permite usar la variable log
@RestController
public class ControladorInicio {
    @GetMapping("/") // se crea un mapeo para que el programa responda por la ruta localhost:8080
    public String inicio(){
        log.info("Ejecutando el controlador rest");
        log.debug("mas detalle del controlador");
        return "hola mundo con spring";
    }
    
    
}
