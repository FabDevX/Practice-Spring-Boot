package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		//BinarySearch b = applicationContext.getBean(BinarySearch.class);
		BinarySearch b=new BinarySearch(new quitshort()); //AQUI SE HACE EL CAMBIA QUIEN LO ESTA CREANTO
		int number = b.search(new int[]{2,2,64,1},64);
		//SpringApplication.run(DemoApplication.class, args);
		System.out.print(number);
	}

}
