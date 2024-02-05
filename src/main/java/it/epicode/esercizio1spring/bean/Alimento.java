package it.epicode.esercizio1spring.bean;

import lombok.Data;

import java.util.List;

@Data
public abstract class Alimento {
    private String nome;
    private double calorie;
    private double prezzo;

}
