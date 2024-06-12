package org.umss.spring_course.Restful_web_service_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude= {DataSourceAutoConfiguration.class})
public class RestfulWebServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServiceExampleApplication.class, args);
	}

}
