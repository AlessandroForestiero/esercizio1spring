package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Salame extends Topping {
    private Alimento alimento;

    public Salame(Alimento alimento) {
        super(alimento);
        this.alimento = alimento;
    }

    public Salame() {
    }

    @Override
    public String toString() {
        if (alimento != null) {
            return getNome() + alimento.getNome();
        } else return getNome();
    }
}
