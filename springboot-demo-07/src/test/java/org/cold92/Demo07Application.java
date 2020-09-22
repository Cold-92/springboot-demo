package org.cold92;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cold92.dao")
public class Demo07Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo07Application.class, args);
	}

}
