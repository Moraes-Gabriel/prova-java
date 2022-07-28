package com.example.provajava.controller;

import com.example.provajava.controller.request.CriarCarroRequest;
import com.example.provajava.model.Car;
import com.example.provajava.model.Log;
import com.example.provajava.service.BuscarListaDeCarrosService;
import com.example.provajava.service.BuscarLogsService;
import com.example.provajava.service.CriarCarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private BuscarListaDeCarrosService buscarListaDeCarrosService;

    @Autowired
    private CriarCarroService criarCarroService;

    @Autowired
    private BuscarLogsService buscarLogsService;

    @GetMapping("/listCars")
    public List<Car> listAllCars(){
        return buscarListaDeCarrosService.buscar();
    }

    @PostMapping("/createCar")
    public void createCar(@RequestBody CriarCarroRequest request){
        criarCarroService.criar(request);
    }

    @GetMapping("/logs")
    public List<Log> retornarLogs(){
        return buscarLogsService.buscar();
    }
}
