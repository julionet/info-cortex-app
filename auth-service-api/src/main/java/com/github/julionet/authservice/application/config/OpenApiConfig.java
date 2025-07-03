package com.github.julionet.authservice.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Auth Service API")
                        .version("1.0.0")
                        .description("API para autenticação Data Cortex")
                        .termsOfService("https://chronustecnologia.com.br/terms")
                        .contact(new Contact()
                                .name("Equipe de Desenvolvimento")
                                .email("dev@chronustecnologia.com.br")
                                .url("https://chronustecnologia.com.br/devs"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")));
    }
}
