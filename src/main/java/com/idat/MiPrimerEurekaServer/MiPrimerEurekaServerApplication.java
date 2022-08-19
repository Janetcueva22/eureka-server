package com.idat.MiPrimerEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MiPrimerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerEurekaServerApplication.class, args);
	}

}
