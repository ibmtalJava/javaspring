package ibmtal.trendyol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ibmtal.trendyol.core.result.Result;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TrendyolApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrendyolApplication.class, args);
	}
	@Bean
	public Docket trendyolApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("ibmtal.trendyol"))
				.build()
				;
	}
	 
	
}
