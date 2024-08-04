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

        // Permitir el origen de tu frontend
        config.addAllowedOrigin("http://127.0.0.1:5500");

        // Permitir todos los headers y métodos que necesites
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");

        // Permitir credenciales
        config.setAllowCredentials(true);

        // Registrar la configuración global para todas las rutas
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}

