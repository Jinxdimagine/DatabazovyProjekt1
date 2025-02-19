package com.example.databazovyprojekt1.Models;

import jakarta.persistence.*;

public class ObjednavkaProdukt {
    @EmbeddedId
    private ObjednavkaProduktId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Objednavka objednavka;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Zbozi Zbozi;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    public ObjednavkaProduktId getId() {
        return id;
    }

    public void setId(ObjednavkaProduktId id) {
        this.id = id;
    }

    public Objednavka getObjednavka() {
        return objednavka;
    }

    public void setObjednavka(Objednavka objednavka) {
        this.objednavka = objednavka;
    }

    public Zbozi getZbozi() {
        return Zbozi;
    }

    public void setZbozi(Zbozi zbozi) {
        Zbozi = zbozi;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
