package it.epicode.esercizio1spring;

import it.epicode.esercizio1spring.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean("pizza1")
    @Scope("prototype")
    public Alimento getPizza1() {
        Alimento pizza = new Pizza();
        pizza.setNome("margherita");
        pizza.setCalorie(300);
        pizza.setPrezzo(10);
       // pizza=new Pomodoro(new Mozzarella(pizza));
        Pomodoro pomodoro=new Pomodoro();
        pomodoro.setNome("pomodoro");
        System.out.println(pomodoro);
        return pizza;
    }

    @Bean("pizza2")
    @Scope("prototype")
    public Alimento getPizza2() {
        Alimento pizza = new Pizza();
        pizza.setNome("diavola");
        pizza.setCalorie(400);
        pizza.setPrezzo(20);
        pizza=new Pomodoro(new Mozzarella(new Salame(pizza)));
        return pizza;
    }

    @Bean("pizza3")
    @Scope("prototype")
    public Alimento getPizza3() {
        Alimento pizza = new Pizza();
        pizza.setNome("capricciosa");
        pizza.setCalorie(500);
        pizza.setPrezzo(30);
        pizza=new Pomodoro(new Mozzarella(new Salame(new Uovo(pizza))));
        return pizza;
    }

    @Bean("bevanda1")
    @Scope("prototype")
    public Bevanda getBevanda1() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("coca-cola");
        bevanda.setCalorie(120);
        bevanda.setPrezzo(2.5);
        return bevanda;
    }

    @Bean("bevanda2")
    @Scope("prototype")
    public Bevanda getBevanda2() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("fanta");
        bevanda.setCalorie(150);
        bevanda.setPrezzo(2.5);
        return bevanda;
    }

    @Bean("bevanda1")
    @Scope("prototype")
    public Bevanda getBevanda3() {
        Bevanda bevanda = new Bevanda();
        bevanda.setNome("birra");
        bevanda.setCalorie(200);
        bevanda.setPrezzo(4);
        return bevanda;
    }

    @Bean("mozzarella")
    @Scope("prototype")
    public Alimento getMozzarella() {
        Alimento mozzarella = new Mozzarella();
        mozzarella.setNome("mozzarella");
        mozzarella.setCalorie(10);
        mozzarella.setPrezzo(1);
        return mozzarella;
    }

    @Bean("pomodoro")
    @Scope("prototype")
    public Alimento getPomodoro() {
        Alimento pomodoro = new Pomodoro();
        pomodoro.setNome("pomodoro");
        pomodoro.setCalorie(5);
        pomodoro.setPrezzo(0.5);
        return pomodoro;
    }

    @Bean("salame")
    @Scope("prototype")
    public Alimento getSalame() {
        Alimento salame = new Salame();
        salame.setNome("salame");
        salame.setCalorie(20);
        salame.setPrezzo(2);
        return salame;
    }
    @Bean("uovo")
    @Scope("prototype")
    public Alimento getUovo() {
        Alimento uovo = new Uovo();
        uovo.setNome("uovo");
        uovo.setCalorie(20);
        uovo.setPrezzo(2);
        return uovo;
    }


    @Bean("menu")
    @Scope("prototype")
    public List<Alimento> menu() {

        List<Alimento> menu = List.of(getPizza1(), getPizza2(), getPizza3(), getBevanda1(), getBevanda2(), getBevanda3(), getUovo(), getSalame(), getMozzarella(),getPomodoro());

        return menu;
    }
}
