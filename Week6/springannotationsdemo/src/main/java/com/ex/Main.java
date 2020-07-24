package com.ex;


import com.ex.Pojos.Counter;
import com.ex.Pojos.MessagePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com")
@PropertySource("classpath:props.properties")
public class Main {

    @Value("${app.main.message}")
    private String message;

    private MessagePrinter messagePrinter;

    private Counter c;
    private Counter cpp;

    @Autowired
    public void setMessagePrinter(MessagePrinter customMessagePrinter){
        this.messagePrinter = customMessagePrinter;
    }

    @Autowired
    public void setCpp(Counter cpp){
        this.cpp=cpp;
    }

    @Autowired
    public Main(Counter c,Environment env){
        this.c=c;
        System.out.println(env.getProperty("app.main.message"));
    }

    public static void main(String[] args) {
        //create a new Context

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Main.class);
        //context.register(MessagePrinter.class);
        context.refresh();

        Main app = context.getBean("main", Main.class);
        //System.out.println(app.message);
        app.messagePrinter.printMessage();


        System.out.println("The current value of c is " + app.c.getValue());
        System.out.println("The incremented value of c is " + app.c.increment());
        System.out.println("_____________________________________\n");

        app.cpp.setStep(2);
        System.out.println("The current value of cpp is " + app.cpp.getValue());
        System.out.println("The incremented value of cpp is " + app.cpp.increment());
        System.out.println("_____________________________________\n");


    }


}
