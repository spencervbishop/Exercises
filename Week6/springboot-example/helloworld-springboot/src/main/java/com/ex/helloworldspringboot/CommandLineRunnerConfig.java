package com.ex.helloworldspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CommandLineRunnerConfig {

    @Bean
    public CommandLineRunner runner(){
        return args -> System.out.println("Hello, World!"); //this takes in the args of the main method,
        //a commandlinerunner usually takes precedence.
    }

    @Bean
    public CommandLineRunner runner2(){
        return args -> System.out.println("This is another runner.");
    }
}
