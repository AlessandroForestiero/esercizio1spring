package it.epicode.esercizio1spring.bean;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import lombok.Data;

import java.util.List;
@Data
public class Menu {
    private List<Bevanda> bevande;
    private List<Topping> toppings;
    private List<Pizza> pizze;
    public void stampaMenu(){
        System.out.println("PIZZE");
        pizze.stream().forEach(pizza-> System.out.println(pizza.getNome() + ", calorie: " + pizza.getCalorie() + ",prezzo: " + pizza.getPrezzo()));
        System.out.println();
        toppings.stream().forEach(topping-> System.out.println(topping.getNome() + ", calorie: " + topping.getCalorie() + ",prezzo: " + topping.getPrezzo()));
        System.out.println();
        bevande.stream().forEach(bevande-> System.out.println(bevande.getNome() + ", calorie: " + bevande.getCalorie() + ",prezzo: " + bevande.getPrezzo()));
    }

}
