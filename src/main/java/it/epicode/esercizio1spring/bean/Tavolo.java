package it.epicode.esercizio1spring.bean;

import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int numeroMaxCoperti;
    private Double costoCoperto;
    private StatoTavolo statoTavolo;
}
