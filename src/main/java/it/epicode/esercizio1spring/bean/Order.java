package it.epicode.esercizio1spring.bean;

import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private static int contatore = 1;
    private int numeroOrdine;
    private int numeroCoperti;
    private StatoOrdine statoOrdine;
    private LocalTime oraOrdine;
    private Tavolo tavolo;
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private List<Topping> topping;


    public Order(Tavolo tavolo, int numeroCoperti) throws Exception {
        if (numeroCoperti <= tavolo.getNumeroMaxCoperti())
            this.numeroCoperti = numeroCoperti;
        else
            throw new Exception("Numero max coperti del tavolo superato");
        if (tavolo.getStatoTavolo().equals(StatoTavolo.LIBERO))
            this.tavolo = tavolo;
        else throw new Exception("tavolo occupato");

        numeroOrdine = contatore++;
        statoOrdine = StatoOrdine.IN_CORSO;
        oraOrdine = LocalTime.now();
        pizze = new ArrayList<>();
        bevande = new ArrayList<>();
    }

    public double totaleOrdine() {
        double totale = tavolo.getCostoCoperto()*numeroCoperti;
        totale=totale+pizze.stream().mapToDouble(pizza->pizza.getPrezzo()).sum() +
        bevande.stream().mapToDouble(bevanda->bevanda.getPrezzo()).sum();
        return totale;
    }

}
