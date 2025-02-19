package com.example.databazovyprojekt1.Models;

import jakarta.persistence.*;

@Entity
public class Platba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_platba;

    @Column(nullable = false)
    private double hodnota;

    @Column(nullable = false)
    private String datum_platba;

    @Column(nullable = false)
    private String TypPlatby;

    @Column(nullable = false)
    private boolean zaplaceno;

    public int getId_platba() {
        return id_platba;
    }

    public void setId_platba(int id_platba) {
        this.id_platba = id_platba;
    }

    public boolean isZaplaceno() {
        return zaplaceno;
    }

    public void setZaplaceno(boolean zaplaceno) {
        this.zaplaceno = zaplaceno;
    }

    public String getTypPlatby() {
        return TypPlatby;
    }

    public void setTypPlatby(String typPlatby) {
        if (typPlatby.equals("KARTA")||typPlatby.equals("DOBIRKA")||typPlatby.equals("PREVOD")) {
            TypPlatby = typPlatby;
        }else {
            TypPlatby=null;
        }

    }

    public String getDatum_platba() {
        return datum_platba;
    }

    public void setDatum_platba(String datum_platba) {
        this.datum_platba = datum_platba;
    }

    public double getHodnota() {
        return hodnota;
    }

    public void setHodnota(double hodnota) {
        this.hodnota = hodnota;
    }
}
