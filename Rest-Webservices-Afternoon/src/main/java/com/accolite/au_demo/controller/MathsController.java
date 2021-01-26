package com.accolite.au_demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/maths")
public class MathsController {

    @GetMapping("/add")
    public Integer add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){

        return num1+num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public Integer multiply(@PathVariable Integer num1, @PathVariable Integer num2){

        return num1*num2;
    }
}
