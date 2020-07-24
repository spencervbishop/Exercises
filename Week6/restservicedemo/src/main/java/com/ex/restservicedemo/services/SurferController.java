package com.ex.restservicedemo.services;

import com.ex.restservicedemo.beans.Message;
import com.ex.restservicedemo.beans.Surfer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/surfers")
public class SurferController {

    @GetMapping("/all")
    public ResponseEntity<List<Surfer>> getAllSurfers(){
        List<Surfer> surfList = new ArrayList<>();
        Surfer coolJoe = new Surfer();
        coolJoe.setName("Cool Joe");
        coolJoe.setNumOfBoards(8);

        Surfer me = new Surfer();
        me.setNumOfBoards(200);
        me.setName("Spencer");
        surfList.add(coolJoe);
        surfList.add(me);

        return new ResponseEntity<>(surfList, HttpStatus.OK);
    }

    @RequestMapping(path="/{id}", method={RequestMethod.GET},
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Surfer> getOneSurfer(@PathVariable("id") int id){
        Surfer guy = new Surfer();
        guy.setName("Spencer Saunders");
        guy.setNumOfBoards(2);
        System.out.println(id);
        return new ResponseEntity<>(guy, HttpStatus.OK);
    }

//    @RequestMapping(path="/new", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Object> addNewSurfer(@RequestBody Surfer guy){
//        System.out.println(guy);
//        return new ResponseEntity<>(guy, HttpStatus.CREATED);
//    }

    @PostMapping("/addSurfer")
    public ResponseEntity<Message> addSurfer(@RequestBody Surfer surfer){
        ResponseEntity<Message> resp = null;
        try{
            //call methods from DAO
            System.out.println(surfer);
            resp = new ResponseEntity<>(new Message("You have added the new surfer" + surfer.toString()), HttpStatus.OK);
        }catch(Exception e){
            resp = new ResponseEntity<>(new Message("FAILED TO CREATE SURFER"), HttpStatus.BAD_REQUEST);
        }
        return resp;
    }

}
