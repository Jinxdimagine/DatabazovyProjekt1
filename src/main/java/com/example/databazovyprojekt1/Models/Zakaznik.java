package com.example.databazovyprojekt1.Models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Zakaznik {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_zakaznik;

   @Column(nullable = false)
   private String jmeno;

   @Column(nullable = false)
   private String telefon;

   @Column(nullable = false)
   private String email;
   @OneToMany(mappedBy = "Zakaznik")
   private ArrayList<Objednavka> orders=new ArrayList<>();

    public int getId_zakaznik() {
        return id_zakaznik;
    }

    public void setId_zakaznik(int id) {
        this.id_zakaznik = id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String name) {
        this.jmeno = name;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String phone) {
        this.telefon = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
