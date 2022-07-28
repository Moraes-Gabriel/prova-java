package com.example.provajava.repository;

import com.example.provajava.model.Car;
import com.example.provajava.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends MongoRepository<Log, String> {
}
