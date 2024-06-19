package com.programarcomvoce.vielas_backend.model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false,nullable = false)
    private UUID id;

    @Column(name = "title", updatable = false, nullable = false)
    private String title;

    @Column(name = "description", updatable = false, nullable = false)
    private String description;

    @Column(name = "licence", updatable = false, nullable = false)
    private String licence;

    @Column(name = "location", updatable = false, nullable = false)
    private String location;

    @Column(name = "pictureDate", updatable = false, nullable = false)
    private Date pictureDate;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
