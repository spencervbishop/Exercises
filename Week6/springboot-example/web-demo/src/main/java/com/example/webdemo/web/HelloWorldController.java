package com.example.webdemo.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

@Controller
@ResponseBody
//@RequestMapping("/api")
public class HelloWorldController {

    //WILL RESPOND TO ANY GET OR POST METHOD TO /hello world and will send me anything as long as
    //it is prepared to read plain text must put @ResponseBody either here or above the class
    @RequestMapping(path="/helloworld", method={RequestMethod.GET, RequestMethod.POST},
        consumes="*/*", produces= MediaType.TEXT_PLAIN_VALUE)
    public String sayHello(HttpServletRequest req){
        System.out.println(req.getRequestURI());
        return "hello world!";
    }

}
