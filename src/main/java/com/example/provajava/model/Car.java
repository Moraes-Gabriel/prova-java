package com.example.provajava.model;

import lombok.Data;

import javax.persistence.Id;

@Data

public class Car {

    private String _id;
    private String title;
    private String brand;
    private String price;
    private int age;



}
