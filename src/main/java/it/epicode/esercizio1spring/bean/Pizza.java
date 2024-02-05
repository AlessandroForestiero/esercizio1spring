package it.epicode.esercizio1spring.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizza extends Alimento {
   private List<Topping> toppings;
    @Override
    public String toString() {
        return getNome() + super.toString();
    }
}
