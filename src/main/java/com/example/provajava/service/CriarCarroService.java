package com.example.provajava.service;

import com.example.provajava.controller.request.CriarCarroRequest;
import com.example.provajava.model.Car;
import com.example.provajava.model.Log;
import com.example.provajava.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CriarCarroService {

    @Value("${api.externa.url}")
    private String apiConsumir;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LogRepository logRepository;

    public void criar(CriarCarroRequest request) {

        Map<String, String> map = new HashMap<>();
        map.put("title", request.getTitle());
        map.put("price", request.getPrice());
        map.put("brand", request.getBrand());
        map.put("age", String.valueOf(request.getAge()));


        ResponseEntity<Car> response = restTemplate.postForEntity(apiConsumir, map, Car.class);

        Car car = response.getBody();

        Log log = new Log(car);
        System.out.print(car + "moraes");
        logRepository.save(log);
    }
}
