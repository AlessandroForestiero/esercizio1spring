package it.epicode.esercizio1spring;

import it.epicode.esercizio1spring.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean("margherita")
    @Scope("prototype")
    public Pizza getMargherita() {
        Pizza pizza = new Pizza();
        pizza.setNome("margherita");
        pizza.setCalorie(getMozzarella().getCalorie() + getPomodoro().getCalorie());
        pizza.setPrezzo(getMozzarella().getPrezzo() + getPomodoro().getPrezzo());
        pizza.setToppings(List.of(getPomodoro(), getMozzarella()));
        return pizza;
    }

    @Bean("diavola")

    public Pizza getDiavola() {
        Pizza pizza = getMargherita();
        pizza.setNome("diavola");
        pizza.setCalorie(pizza.getCalorie() + getSalame().getCalorie());
        pizza.setPrezzo(pizza.getPrezzo() + getSalame().getPrezzo());
        pizza.getToppings().add(getSalame());
        return pizza;
    }

    @Bean("capricciosa")

    public Pizza capricciosa() {
        Pizza pizza = getMargherita();
        pizza.setNome("capricciosa");
        pizza.setCalorie(pizza.getCalorie() + getUovo().getCalorie());
        pizza.setPrezzo(pizza.getPrezzo() + getUovo().getPrezzo());
        pizza.getToppings().add(getUovo());
        return pizza;
    }

    @Bean("bevanda1")

    public Bevanda getBevanda1() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("coca-cola");
        bevanda.setCalorie(120);
        bevanda.setPrezzo(2.5);
        return bevanda;
    }

    @Bean("bevanda2")

    public Bevanda getBevanda2() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("fanta");
        bevanda.setCalorie(150);
        bevanda.setPrezzo(2.5);
        return bevanda;
    }

    @Bean("bevanda3")

    public Bevanda getBevanda3() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("birra");
        bevanda.setCalorie(200);
        bevanda.setPrezzo(4);
        return bevanda;
    }

    @Bean("mozzarella")

    public Topping getMozzarella() {
        Topping mozzarella = new Topping();
        mozzarella.setNome("mozzarella");
        mozzarella.setCalorie(10);
        mozzarella.setPrezzo(1);
        return mozzarella;
    }

    @Bean("pomodoro")

    public Topping getPomodoro() {
        Topping pomodoro = new Topping();
        pomodoro.setNome("pomodoro");
        pomodoro.setCalorie(5);
        pomodoro.setPrezzo(0.5);
        return pomodoro;
    }

    @Bean("salame")

    public Topping getSalame() {
        Topping salame = new Topping();
        salame.setNome("salame");
        salame.setCalorie(20);
        salame.setPrezzo(2);
        return salame;
    }

    @Bean("uovo")

    public Topping getUovo() {
        Topping uovo = new Topping();
        uovo.setNome("uovo");
        uovo.setCalorie(20);
        uovo.setPrezzo(2);
        return uovo;
    }


    @Bean("menu")

    public Menu menu() {
        Menu menu = new Menu();
        menu.setBevande(List.of(getBevanda1(),getBevanda2(),getBevanda3()));
        menu.setToppings(List.of(getSalame(),getMozzarella(),getPomodoro(),getUovo()));
        menu.setPizze(List.of(getMargherita(),getDiavola(),capricciosa()));
        return menu;
    }
}
