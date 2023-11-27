package com.green;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class Chapter01ApplicationTests {

	@Test
	void contextLoads() {
//		System.out.print(obj);
	}
	
	
	@Autowired
	Environment environment;
	
	@Test
	public void test1(){
		
//		System.out.print(environment.getProperty("author.name"));
//		System.out.print(environment.getProperty("author.age"));
		log.info(environment.getProperty("author.name"));
		log.info(environment.getProperty("author.age"));
	}
	
	
	
	
	
	

}
