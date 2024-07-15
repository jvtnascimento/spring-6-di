package com.jvtnascimento.spring6di;

import com.jvtnascimento.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(Spring6DiApplication.class, args);
		var controller = context.getBean(MyController.class);

		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
	}
}
