package br.ucsal.demoappb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoAppBApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppBApplication.class, args);
	}

}
