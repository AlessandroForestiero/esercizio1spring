package it.epicode.esercizio1spring.bean;

import lombok.Data;

import java.util.List;

@Data
public abstract class Alimento {
    private String nome;
    private double calorie;
    private double prezzo;

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
