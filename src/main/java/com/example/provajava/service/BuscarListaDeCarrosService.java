package com.example.provajava.service;

import com.example.provajava.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BuscarListaDeCarrosService {

    @Value("${api.externa.url}")
    private String apiConsumir;

    @Autowired
    private RestTemplate restTemplate;

    public List<Car> buscar() {

        ResponseEntity<List<Car>> rateResponse =
                restTemplate.exchange(apiConsumir,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Car>>() {
                        });
        List<Car> cars = rateResponse.getBody();

        return cars;
    }
}
