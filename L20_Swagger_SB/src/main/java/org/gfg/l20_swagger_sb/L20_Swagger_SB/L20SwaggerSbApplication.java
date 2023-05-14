package org.gfg.l20_swagger_sb.L20_Swagger_SB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class L20SwaggerSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(L20SwaggerSbApplication.class, args);
	}
	
	@Bean
	public Docket productAPI() {
		
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("org.gfg.l20_swagger_sb.L20_Swagger_SB")).build();
	}

}
