package com.FunnyMind.SpringFunyMind.config;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //archivo de configuración para el programa
@EnableWebSecurity //se escifica que se requiere seguridad en toda la aplicación
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    @Bean //especificar mis objetos de configuración
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("FunnyMind/**", "/css/**", "/js/**", "/imagenes/**").permitAll() // permitir todas las rutas libres
                        .requestMatchers("/v1/Plataforma/Admin").hasRole("ADMIN") // autenticación rol ADMIN
                        .requestMatchers("/v1/Plataforma/Paciente").hasRole("PACIENTE") // autenticación rol PACIENTE
                        .requestMatchers("/v1/Plataforma/Medic").hasRole("MEDIC") // autenticación rol MEDIC
                        .requestMatchers("/v1/Plataforma/**").authenticated() // requiere autenticación para acceso a la plataforma
                )
                .formLogin(form ->
                        form.loginPage("/FunnyMind/logeo")
                                .permitAll()
                )
                .logout(LogoutConfigurer::permitAll)
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
