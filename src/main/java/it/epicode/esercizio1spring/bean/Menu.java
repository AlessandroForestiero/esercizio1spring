package it.epicode.esercizio1spring.bean;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@Data
public class Menu {
    private List<Bevanda> bevande;
    private List<Topping> toppings;
    private List<Pizza> pizze;
    private Logger logger = LoggerFactory.getLogger("w5d2b");

    public void stampaMenu(){
        logger.info("PIZZE");
        pizze.stream().forEach(pizza->  logger.info(pizza.getNome() + ", calorie: " + pizza.getCalorie() + ",prezzo: " + pizza.getPrezzo()));
        logger.info("TOPPING");
        toppings.stream().forEach(topping->  logger.info(topping.getNome() + ", calorie: " + topping.getCalorie() + ",prezzo: " + topping.getPrezzo()));
        logger.info("BEVANDE");
        bevande.stream().forEach(bevande-> logger.info(bevande.getNome() + ", calorie: " + bevande.getCalorie() + ",prezzo: " + bevande.getPrezzo()));
    }

}
