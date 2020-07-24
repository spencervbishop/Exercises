package com.ex.Pojos;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessagePrinter defaultMessagePrinter(){
        return new MessagePrinter();
    }

    @Bean("customMessagePrinter")
    public MessagePrinter anotherMessagePrinter(){
        MessagePrinter mp = new MessagePrinter();
        mp.setMessage("this is my custom message");
        return mp;
    }

}
