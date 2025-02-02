package com.bootcamp.web.demo_springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  //also is controller
// = @SpringBootConfiguration + @EnableAutoCOnfiguration + @ComponentScan

// 1.ComponentScan -> Scan @Controller, @Service, @Repository, @Configuration  (when run main ,scan subfolder)
// Scan Process -> Create object for those class with the above Annotation
public class DemoSpringwebApplication {

	public static ApplicationContext context; //儲存context address

	public static void main(String[] args) {
		/* ConfigurableApplicationContext context =
		 SpringApplication.run(DemoSpringwebApplication.class, args); */
		 //SpringApplication.run(DemoSpringwebApplication.class, args); //only write this just save but cannot check controller in terminal
		 context =
		 SpringApplication.run(DemoSpringwebApplication.class, args);
		 for (String beanName : context.getBeanDefinitionNames()){
			System.out.println(beanName);
		 }
	
	}
	//add @controller will idenify this class as spring context object => bean
	//without @contoller will disappear spring context object
}
