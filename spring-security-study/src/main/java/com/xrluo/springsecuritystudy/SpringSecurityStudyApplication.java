package com.xrluo.springsecuritystudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xrluo.springsecuritystudy.mapper")
public class SpringSecurityStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityStudyApplication.class, args);
	}

}
