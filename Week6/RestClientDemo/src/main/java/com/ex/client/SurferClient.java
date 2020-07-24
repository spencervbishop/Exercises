package com.ex.client;

import com.ex.beans.Message;
import com.ex.beans.Surfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("surferClient")
public class SurferClient {

    private String resourceUrl= "http://localhost:8080/surfers";

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    @Autowired
    private RestTemplate restTemplate;

    public void getSurfer() {
        ResponseEntity<Surfer> response = restTemplate.getForEntity(resourceUrl + "/1", Surfer.class);
        System.out.println(response);
    }
    public void postSurfer(){
        Surfer dude = new Surfer();
        dude.setName("The Dude");
        dude.setNumOfBoards(0);
        Message response = restTemplate.postForObject(resourceUrl + "/addSurfer", dude, Message.class);
        System.out.println(response);

    }
}
