package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Pizza extends Alimento {
    @Override
    public String toString() {
        return getNome() + super.toString();
    }
}
