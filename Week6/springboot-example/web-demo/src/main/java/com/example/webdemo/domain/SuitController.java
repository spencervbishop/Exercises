package com.example.webdemo.domain;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/suits")
public class SuitController {

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST},
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Suit>> getAllSuits(){
        List<Suit> suits = new ArrayList<>();
        Suit s = new Suit();
        s.setColor("blue");
        s.setNumButtons(2);
        s.setFabric("mohair");
        s.setSize("40R");

        suits.add(s);

        Suit b = new Suit();
        b.setColor("gray");
        b.setNumButtons(4);
        b.setFabric("mohair");
        b.setSize("38R");

        suits.add(b);
        return new ResponseEntity<>(suits, HttpStatus.I_AM_A_TEAPOT);
    }

    @RequestMapping(path="/new", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addNewSuit(@RequestBody Suit s, HttpServletResponse response){
        System.out.println(s);
        response.setHeader("Location", "http://localhost:8080/suits/get/" + 4);
        return new ResponseEntity<>((Object)null, HttpStatus.CREATED);
    }

    @RequestMapping(path="/get/{id}", method={RequestMethod.GET, RequestMethod.POST},
            produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Suit> getOneSuit(@PathVariable("id") int suitId){
        System.out.println("Get suit with id=" + suitId);
        Suit b = new Suit();
        b.setColor("gray");
        b.setNumButtons(4);
        b.setFabric("mohair");
        b.setSize("38R");

        return new ResponseEntity<>(b, HttpStatus.OK);
    }
}
