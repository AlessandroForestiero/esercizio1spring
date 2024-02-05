package it.epicode.esercizio1spring;

import it.epicode.esercizio1spring.bean.Alimento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class Esercizio1springApplication {

	public static void main(String[] args) {

		SpringApplication.run(Esercizio1springApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		List<Alimento> menu = (List<Alimento>) ctx.getBean("menu");
		System.out.println(menu);
	}

}
