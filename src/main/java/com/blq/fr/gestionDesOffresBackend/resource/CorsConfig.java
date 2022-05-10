package com.blq.fr.gestionDesOffresBackend.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * A garder si le problème de Access-Control-Allow-Origin repose un problème
 * @author Clement
 *
 */

@Configuration
public class CorsConfig {
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings( CorsRegistry registry ) {
				registry.addMapping("/**")
					.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
					.allowedHeaders("*")
					.allowedOrigins("http://localhost:4200");
			}
		};
	}
}
