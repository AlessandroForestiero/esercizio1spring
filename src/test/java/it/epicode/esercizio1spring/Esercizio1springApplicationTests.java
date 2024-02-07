package it.epicode.esercizio1spring;

import it.epicode.esercizio1spring.bean.Bevanda;
import it.epicode.esercizio1spring.bean.Menu;
import it.epicode.esercizio1spring.bean.Pizza;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Esercizio1springApplicationTests {
	static AnnotationConfigApplicationContext ctx;
	@BeforeAll
	static void accediAlContesto(){
		ctx = new AnnotationConfigApplicationContext(Esercizio1springApplication.class);
	}

	@Test
	void testMenuCreation() {
		Menu menu = new Menu();
		assertEquals(3, menu.getPizze().size());
		assertEquals(3, menu.getBevande().size());
		assertEquals(4, menu.getToppings().size());
	}
	@ParameterizedTest
	@ValueSource(strings = {"margherita", "diavola", "capricciosa"})
	void testPizzaNames(String pizzaName) {
		Pizza pizza = ctx.getBean(pizzaName, Pizza.class);
		assertEquals(pizzaName, pizza.getNome());
	}
	@ParameterizedTest
	@CsvSource({"bevanda1, 2.5", "bevanda2, 2.5", "bevanda3, 4"})
	void testBevandaPrezzo(String bevandaName, double expectedPrezzo) {
		Bevanda bevanda = ctx.getBean(bevandaName, Bevanda.class);
		assertEquals(expectedPrezzo, bevanda.getPrezzo());
	}
}
