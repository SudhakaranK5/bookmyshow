package com.sudhakar.bookmyshow.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_db")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;

    @Column(name="phone")
    private int phone;

    @Column(name="name")
    private String name;
}