package dev.authorises.jSpecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import oshi.SystemInfo;

@SpringBootApplication
public class JSpecsApplication {

	public static SystemInfo systemInfo;

	public static void main(String[] args) {
		systemInfo = new SystemInfo();
		SpringApplication.run(JSpecsApplication.class, args);

	}

}
