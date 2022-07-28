package com.example.provajava.service;

import com.example.provajava.model.Log;
import com.example.provajava.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarLogsService {

    @Autowired
    private LogRepository logRepository;

    public List<Log> buscar() {
        return logRepository.findAll();
    }
}
