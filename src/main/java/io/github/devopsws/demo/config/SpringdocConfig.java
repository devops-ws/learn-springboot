package io.github.devopsws.demo.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(info = @Info(title = "Demo Project for API Testing"),
    externalDocs = @ExternalDocumentation(
        description = "Read more from the offical document.",
        url = "https://linuxsuren.github.io/api-testing/"
    ),
    security = {
        @SecurityRequirement(name = "basicAuth")
    })
@Configuration
@SecurityScheme(
  type = SecuritySchemeType.HTTP,
  in = SecuritySchemeIn.HEADER,
  name = "basicAuth",
  scheme = "basic")
public class SpringdocConfig {}
