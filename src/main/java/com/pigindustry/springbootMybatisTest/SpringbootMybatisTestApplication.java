package com.pigindustry.springbootMybatisTest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pigindustry.springbootMybatisTest.mapper")
public class SpringbootMybatisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisTestApplication.class, args);
	}

}
