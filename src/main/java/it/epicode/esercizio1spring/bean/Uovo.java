package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Uovo extends Topping{
    private Alimento alimento;

    public Uovo(Alimento alimento) {
        super(alimento);
        this.alimento = alimento;
    }

    public Uovo() {
    }

    @Override
    public String toString() {
        if (alimento != null) {
            return getNome() + alimento.getNome();
        } else return getNome();
    }
}
