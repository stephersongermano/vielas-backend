package com.programarcomvoce.vielas_backend.model;

import java.sql.Date;

import com.programarcomvoce.vielas_backend.enums.SubscriptionType;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private String id;

    @Column(name = "limit_download",nullable = false)
    private int limitDownload;

    @Column(name = "price",nullable = false)
    private double price;

    @Column(name = "sub_date", nullable = false)
    private Date subscriptionDate;

    @Column(name = "sub_final_date", nullable = false)
    private Date subscriptionFinalDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "subscription", nullable = false)
    private SubscriptionType subscription = SubscriptionType.FREE;

    @OneToOne(mappedBy = "customer")
    private Customer customer;
}