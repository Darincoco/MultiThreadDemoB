package com.example.serviceb;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Random;

@RestController
public class Controller {

    @PostMapping("/consume")
    public ResponseEntity<String> consume(@RequestBody String message) {
        System.out.println("Received message: " + message);
        return ResponseEntity.ok("Message received successfully!");
    }
}

