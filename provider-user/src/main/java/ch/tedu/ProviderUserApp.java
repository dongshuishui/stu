package ch.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient//EureKa的客户端
public class ProviderUserApp {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApp.class, args);
	}

}
