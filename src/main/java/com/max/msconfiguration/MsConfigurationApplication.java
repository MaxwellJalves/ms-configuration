package com.max.msconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class MsConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigurationApplication.class, args);
	}

}
