package com.example.provajava.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Document
public class Log {

    @Id
    private String _id;
    private LocalDate data_hora;
    private Car car;

    public Log( Car car) {
        this.data_hora = LocalDate.now();
        this.car = car;
    }
}
