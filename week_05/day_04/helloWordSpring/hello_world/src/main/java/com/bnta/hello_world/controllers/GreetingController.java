package com.bnta.hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController //can process a http request and helps with serialisation (converts java objects to JSON)
public class GreetingController {

    @GetMapping("/greeting") //route for browser, localhost:8080
     public String greeting(@RequestParam(defaultValue = "world") String name){// localhost:8080/greeting?name=Anna
         return "Hello " + name; //Hello Anna

    }
}
