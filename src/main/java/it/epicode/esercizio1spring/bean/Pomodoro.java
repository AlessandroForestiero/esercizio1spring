package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Pomodoro extends Topping {
    private Alimento alimento;

    public Pomodoro(Alimento alimento) {
        super(alimento);
        this.alimento = alimento;
    }

    public Pomodoro() {
        setNome("pomodoro");
        setCalorie(50);
        setPrezzo(1);
    }

    @Override
    public String toString() {
        if (alimento != null) {
            return getNome() + alimento.getNome();
        } else return getNome();
    }
}

