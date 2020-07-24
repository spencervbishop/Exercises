package com.example.aopdemo.services;

import com.example.aopdemo.domain.*;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    public EventService(){}

    public void playConcert(Concert c) throws Exception {
        c.doEvent();
    }

    public void playPlay(Play p) throws Exception {
        p.doEvent();
    }

    public void runAmusementPark(AmusementPark a) throws Exception {
        a.doEvent();
    }

    public void doEvent(Event e)throws Exception{
        e.doEvent();
    }
}
