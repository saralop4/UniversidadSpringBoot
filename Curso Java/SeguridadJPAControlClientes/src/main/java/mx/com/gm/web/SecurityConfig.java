package mx.com.gm.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Sarah
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
   //con este metodo se personalizara para agregar nuevos usuarios que ingresaran al sistema
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN","USER")
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("USER");
        //El concepto de agregar nuevos usuarios se le conoce
        //como autenticacion
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        
        http.authorizeRequests()
                .antMatchers("/editar/**","/agregar/**","/eliminar")
                .hasRole("ADMIN")//unicamente el admin puede entrar a todo eso
                .antMatchers("/")
                .hasAnyRole("USER","ADMIN") //el admin y el user pueden entrar al index
                .and()
                .formLogin()
                .loginPage("/login")
                .and()//para agregar otra condicion o otro path
                .exceptionHandling().accessDeniedPage("/errores/403");
        
          //El concepto de asegurar las url se le conoce
        //como autorizacion
        //aqui le decimos a dicho rol logueado que puede 
        //visualizar o ingresar a un path especifico 
    }
    
    
}
