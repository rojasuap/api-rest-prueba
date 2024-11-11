package com.nttdata.api_rest_prueba.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false, length = 250)
    private String name;

    @Column(name="email", nullable = false, length = 250)
    private String email;

    @Column(name="phone", nullable = false, length = 20)
    private String phone;
}
