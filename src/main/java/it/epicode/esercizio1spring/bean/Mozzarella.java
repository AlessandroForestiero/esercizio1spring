package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Mozzarella extends Topping {
    private Alimento alimento;

    public Mozzarella(Alimento alimento) {
        super(alimento);
        this.alimento = alimento;
    }

    public Mozzarella() {
        this.alimento = null;
    }



}
