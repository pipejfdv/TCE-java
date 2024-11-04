package com.FunnyMind.SpringFunyMind.Config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean//crear objeto tipo "Bean" para filtrado de enlaces
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)//se desactiva para no activar el token que requiere adicional
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("FunnyMind/**","/css/**", "/js/**", "/imagenes/**").permitAll() // permitir todas las rutas libres
//                        .requestMatchers("/v1/Plataforma/Admin").hasRole("ADIMINISTRADOR") // autenticación rol ADMIN
//                        .requestMatchers("/v1/Plataforma/Paciente").hasRole("PACIENTE") // autenticación rol PACIENTE
                        .requestMatchers("/v1/PlataformaDoctor/**").hasAnyAuthority("TERAPEUTA") // autenticación rol MEDIC
                        .requestMatchers("/v1/Plataforma/**").authenticated() // requiere autenticación para acceso a la plataforma
                )
               .formLogin( form ->
                        form.loginPage("/FunnyMind/login")//pagina a la que debe dirigirse
                                .loginProcessingUrl("/FunnyMind/login")//proceso del controller el que debe realizar despues de ingresar credenciales
                                .defaultSuccessUrl("/v1/Plataforma/home",true)//pagina por defecto a la cual lo redirige
                                //.failureUrl("/FunnyMind/login?error")//permite ver log de seguridad
                                .permitAll()//permite que todos los usuarias tengan acceso al login
                )
                .logout(LogoutConfigurer::permitAll)//permitir salir de la sesión
                .build();//construye todo el objeto http
    }

    @Bean//permite que Security interprete la ecriptación de la contraseña
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

