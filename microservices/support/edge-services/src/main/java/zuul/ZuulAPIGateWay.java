package zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@EnableZuulProxy
@EntityScan(basePackageClasses = {
		ZuulAPIGateWay.class,
		Jsr310JpaConverters.class
},basePackages = "com.aibless.model")
public class ZuulAPIGateWay {

	public static void main(String[] args) { SpringApplication.run(ZuulAPIGateWay.class, args); }

	@PostConstruct
	void  init(){
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	@Bean
	UiConfiguration uiConfig() {
		return new UiConfiguration("validatorUrl", "list", "alpha", "schema",
				UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
	}
}
