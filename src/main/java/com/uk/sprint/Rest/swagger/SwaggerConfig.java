package com.uk.sprint.Rest.swagger;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    private URI swaggerURL = URI.create("http://localhost:8080/api/v1/");

    @Bean
    public Docket getApi() {
        return (new Docket(DocumentationType.SWAGGER_2)).securityContexts(this.getSecurityContext()).securitySchemes(this.getSecuritySchemes()).host(this.swaggerURL.getAuthority()).select().apis(RequestHandlerSelectors.basePackage("org.springframework")).build().produces(Sets.newHashSet(new String[]{"application/json"})).apiInfo(this.apiInfo()).select().paths(this.postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return Predicates.or(PathSelectors.regex("/api/.*"), PathSelectors.regex("/api/rest.*"));
    }

    private List<SecurityContext> getSecurityContext() {
        SecurityReference securityReference = SecurityReference.builder().reference("basicAuth").scopes(new AuthorizationScope[0]).build();
        List<SecurityReference> reference = new ArrayList(1);
        reference.add(securityReference);
        List<SecurityContext> securityContexts = new ArrayList(1);
        securityContexts.add(SecurityContext.builder().securityReferences(reference).build());
        return securityContexts;
    }

    private List<SecurityScheme> getSecuritySchemes() {
        ArrayList<SecurityScheme> auth = new ArrayList(1);
        auth.add(new BasicAuth("basicAuth"));
        return auth;
    }

    @Bean
    public ApiInfo apiInfo() {
        return (new ApiInfoBuilder()).title("Swagger Spring Boot").
                description("Swagger Spring boot API reference for developers").
               version("1.0").build();
    }
}
