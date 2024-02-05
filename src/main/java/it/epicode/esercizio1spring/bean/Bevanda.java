package it.epicode.esercizio1spring.bean;

import lombok.Data;


public class Bevanda extends Alimento {

    @Override
    public String toString() {
        return "Bevanda{}" + super.toString();
    }
}
