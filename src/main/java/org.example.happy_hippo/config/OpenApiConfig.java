package org.example.happy_hippo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class OpenApiConfig {
    
    @Value("${springdoc.version}") 
    String appVersion;

    @Bean
    public GroupedOpenApi helloOpenApi() {
        String[] paths = { "/hello/**", "/k8s/**" };
        return GroupedOpenApi.builder()
        .group(appVersion)
        .addOpenApiCustomiser(openApi -> openApi.info(new Info().title("Lazy Koala API").version(appVersion)))
        .pathsToMatch(paths)
        .build();
    }

}
