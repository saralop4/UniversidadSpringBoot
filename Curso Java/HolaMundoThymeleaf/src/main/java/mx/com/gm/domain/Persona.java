package mx.com.gm.domain;

import lombok.Data;

/**
 *
 * @author Sarah
 */
@Data //esta annotacion crea los metodos getter y setter de manera automatica
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    
}
