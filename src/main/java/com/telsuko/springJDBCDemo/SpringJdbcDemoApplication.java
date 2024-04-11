package com.telsuko.springJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telsuko.springJDBCDemo.model.Alien;
import com.telsuko.springJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringJdbcDemoApplication.class, args);
		
		Alien alien=context.getBean(Alien.class);
		alien.setId(119);
		alien.setName("liidya");
		alien.setTech("java");
		alien.setId(189);
		alien.setName("sam");
		alien.setTech("php");
		AlienRepo repo=context.getBean(AlienRepo.class);
		repo.save(alien);
		System.out.println(repo.findall());
		
				
		
		
	}

}
