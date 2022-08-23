package mx.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Sarah
 */
public class EncriptarPassword {

    public static void main(String[] args) {

        var password = "123";
        System.out.println("password = " + password);
        System.out.println("password encriptado = " + encriptarPassword(password));
    }
    public static String encriptarPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //instanciamos esta clase para encriptar contraseñas
        return encoder.encode(password);
    }

}
