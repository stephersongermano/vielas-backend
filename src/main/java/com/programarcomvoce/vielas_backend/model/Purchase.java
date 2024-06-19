package com.programarcomvoce.vielas_backend.model;

import java.util.Date;
import java.util.UUID;

import com.programarcomvoce.vielas_backend.enums.PaymentMethod;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id",nullable = false)
    private UUID id;

    @Column(name = "price", nullable = false, scale = 2)
    private double price;

    @Column(name = "purchase_date", nullable = false)
    private Date date;

    @Enumerated(EnumType.STRING)
    @Column(name = "paymentMethod", nullable = false )
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Purchase(UUID id, double price, Date date, PaymentMethod paymentMethod, Customer customer) {
        this.id = id;
        this.price = price;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
    }

    
}
