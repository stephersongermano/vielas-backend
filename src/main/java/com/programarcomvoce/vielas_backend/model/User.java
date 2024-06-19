package com.programarcomvoce.vielas_backend.model;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    // @Enumerated(EnumType.STRING)
    // @Column(name = "role_user", nullable = false)
    // private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public User(UUID id, String name, String email, String password, Customer customer) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.customer = customer;
    }
   
}
