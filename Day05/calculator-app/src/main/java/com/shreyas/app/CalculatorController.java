package com.shreyas.app;


import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public long add(@RequestParam("a") long a, @RequestParam("b") long b){
        return a+b;
    }

    @PutMapping("/sub")
    public long sub(@RequestParam("a") long a, @RequestParam("b") long b){
        return a-b;
    }

    @PostMapping("/mul")
    public long mul(@RequestParam("a") long a, @RequestParam("b") long b){
        return a*b;
    }

    @DeleteMapping("/div")
    public long div(@RequestParam("a") long a, @RequestParam("b") long b){
        return a/b;
    }
}
