package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Wurstel extends Topping{
    private Alimento alimento;

    public Wurstel(Alimento alimento) {
        super(alimento);
        this.alimento=alimento;
    }

    @Override
    public String toString() {
        if (alimento != null) {
            return getNome() + alimento.getNome();
        } else return getNome();
    }
}
