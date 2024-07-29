package com.MimitosShop.API.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permitir todos los orígenes necesarios para desarrollo y despliegue
        config.addAllowedOrigin("http://localhost");
        config.addAllowedOrigin("*"); // Agregar el origen de tu frontend
        // config.addAllowedOrigin("*"); // Permitir todos los orígenes (opcional, para pruebas). Úsalo con precaución.

        // Permitir todos los headers y métodos que necesites
        config.addAllowedHeader("*"); // Permitir todos los headers
        config.addAllowedMethod("*"); // Permitir todos los métodos HTTP

        config.setAllowCredentials(true); // Permitir credenciales si es necesario

        // Registrar la configuración global para todas las rutas
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
