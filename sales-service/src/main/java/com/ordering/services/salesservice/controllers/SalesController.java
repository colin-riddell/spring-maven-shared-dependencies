package com.ordering.services.salesservice.controllers;

import com.ordering.services.common.payloads.Monkey;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SalesController {

    @GetMapping("/monkeys")
    public ResponseEntity<Monkey> getMonkey(){
        return new ResponseEntity<>(new Monkey("George"), HttpStatus.OK);
    }
}
