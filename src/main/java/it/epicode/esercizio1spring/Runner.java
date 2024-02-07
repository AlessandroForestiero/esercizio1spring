package it.epicode.esercizio1spring;

import it.epicode.esercizio1spring.bean.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger("w5d2b");

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Tavolo t1 = (Tavolo) ctx.getBean("tavolo1");
        logger.info("il tavolo 1 è: " + t1);
        Menu menu = ctx.getBean("menu", Menu.class);
        menu.stampaMenu();
        Order order = new Order(t1, 6);
        List<Pizza> pizze = menu.getPizze();
        List<Bevanda> bevande = menu.getBevande();
        order.setPizze(pizze);
        order.setBevande(bevande);
        logger.info("l'ordine è : "+ order);
        logger.info("il totale è :"+order.totaleOrdine());

    }
}
