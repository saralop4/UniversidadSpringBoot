package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Sarah
 */

public interface IPersonaDao extends CrudRepository<Persona,Long>{
    /* esta clase al extender de la interfaz CrudRepository
    entonces de esta forma ya tendriamos todos los metodos
    para poder trabajar con el obejto  de tipo persona.*/
    
    //adicional a eso, se puede crear en esta interfaz metodo personalizados
    // por ejemplo un query que regrese todos los datos ordenados por el apellido
    
    
    
    
}
