package com.sratech.shahspringbootdemowebapi.controller;

import com.sratech.shahspringbootdemowebapi.model.Snack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SnackController {

    private final AtomicInteger atomicInteger = new AtomicInteger();

    @GetMapping("/snack")
    public Snack getSnack(@RequestParam(value = "name", defaultValue = "crisp") String name) {
        return new Snack(atomicInteger.incrementAndGet(), name);
    }
}
