package com.female.andolol.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Seccion de las variables
    private int id;
    private String name_pro, descrption_pro;
    private double price;

    // Constructor
    public Producto(int id, String name_pro, String description_pro, double price) {
        this.id = id;
        this.name_pro = name_pro;
        this.descrption_pro = description_pro;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName_pro() {
        return name_pro;
    }

    public String getDescrption_pro() {
        return descrption_pro;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public void setDescrption_pro(String descrption_pro) {
        this.descrption_pro = descrption_pro;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
