package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public abstract class Topping extends Alimento {
    public Topping() {
    }
    public Topping(Alimento alimento) {

    }

    @Override
    public String toString() {
        return getNome();
    }
}
