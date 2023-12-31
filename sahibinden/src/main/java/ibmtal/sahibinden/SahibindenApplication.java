package ibmtal.sahibinden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SahibindenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SahibindenApplication.class, args);
	}
	@Bean
	public Docket sahibindenApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ibmtal.sahibinden"))
				.build()
				;
	}
//http://localhost:8080/swagger-ui.html
}
