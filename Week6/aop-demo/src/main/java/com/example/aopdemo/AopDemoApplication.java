package com.example.aopdemo;

import com.example.aopdemo.domain.*;
import com.example.aopdemo.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

	private EventService eventService;
//
//	@Autowired
//	public AopDemoApplication(EventService service){
//		this.eventService = service;
//	}
	private Maths maths;

	@Autowired
	public AopDemoApplication(Maths maths, EventService service){
		this.maths = maths;
		this.eventService = service;
	}



	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(){
//		return args -> {
//			Play p = new Play("Hamilton");
//			eventService.playPlay(p);
//
//			Concert c = new Concert("TwentyOnePilots");
//			eventService.playConcert(c);
//
//			AmusementPark a = new AmusementPark("Disney World");
//			eventService.runAmusementPark(a);
//
//			NonEvent myLife = new NonEvent();
//			eventService.doEvent(myLife);
//		};
//	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			maths.doShortMethod("spencer");

			maths.doMediumMethod(24);

			maths.doLongMethod(16);
		};
	}
}
