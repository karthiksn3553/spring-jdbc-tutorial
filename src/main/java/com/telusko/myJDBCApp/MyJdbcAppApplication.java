package com.telusko.myJDBCApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyJdbcAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyJdbcAppApplication.class, args);

		Aliens obj1 = context.getBean(Aliens.class);
		AlienRepo obj2 = context.getBean(AlienRepo.class);

		obj1.setId(130);
		obj1.setName("Vishnu");
		obj1.setTech("Blockchain");


		obj2.insert(obj1);
		System.out.println(obj2.select());
	}

}
