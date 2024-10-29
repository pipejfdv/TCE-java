package com.FunnyMind.SpringFunyMind.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("FunnyMind/**", "/logeo","/css/**", "/js/**", "/imagenes/**").permitAll() // permitir todas las rutas libres
                        .requestMatchers("/v1/Plataforma/Admin").hasRole("ADIMINISTRADOR") // autenticación rol ADMIN
                        .requestMatchers("/v1/Plataforma/Paciente").hasRole("PACIENTE") // autenticación rol PACIENTE
                        .requestMatchers("/v1/Plataforma/Medic").hasRole("TERAPEUTA") // autenticación rol MEDIC
                        .requestMatchers("/v1/Plataforma/**").authenticated() // requiere autenticación para acceso a la plataforma
                )
                .formLogin(form ->
                        form.loginPage("/FunnyMind/logeo")
                                .permitAll()
                )
                .logout(logout -> logout.permitAll())
                .build();
    }
}

