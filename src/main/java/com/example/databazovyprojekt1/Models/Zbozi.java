package com.example.databazovyprojekt1.Models;

import jakarta.persistence.*;

@Entity
public class Zbozi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zbozi;
    @Column(nullable = false)
    private String nazev;
    @Column
    private String poznamka;
    @Column(nullable = false)
    private double cena;

    public int getId_zbozi() {
        return id_zbozi;
    }

    public void setId_zbozi(int id) {
        this.id_zbozi = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
