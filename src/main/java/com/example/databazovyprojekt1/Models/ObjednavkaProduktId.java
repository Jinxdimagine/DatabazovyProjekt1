package com.example.databazovyprojekt1.Models;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class ObjednavkaProduktId {
    private Long orderId;
    private Long productId;

    // Gettery a settery
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    // equals a hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjednavkaProduktId that = (ObjednavkaProduktId) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}
