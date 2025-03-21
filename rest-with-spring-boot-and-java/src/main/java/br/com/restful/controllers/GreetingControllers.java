package br.com.restful.controllers;

import br.com.restful.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingControllers {

    private static final String template = "Hello Javeiro, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World")String name){

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
