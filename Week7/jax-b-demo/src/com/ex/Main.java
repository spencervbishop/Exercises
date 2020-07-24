package com.ex;

import com.ex.model.Car;
import com.ex.model.Dealer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
    	ArrayList<Car> tylersStock = new ArrayList<>();
		Car c = new Car();
		Dealer d = new Dealer();
		d.setName("Tyler's");
		d.setStock(tylersStock);

		c.setManufacturer("Mazda");
		c.setModel("RX-7");
		c.setYear("1993");
		c.setPrice(20000.00);

//	JAXBContext context = JAXBContext.newInstance(Car.class);
//	Marshaller m = context.createMarshaller();
//	m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//	m.marshal(c,System.out);
		tylersStock.add(c);
		c = new Car();
		c.setManufacturer("Honda");
		c.setModel("Civic");
		c.setYear("2003");
		c.setMileage(260000);
		c.setPrice(3000.00);

		tylersStock.add(c);
		d.setStock(tylersStock);

		JAXBContext context = JAXBContext.newInstance(Dealer.class);
//		Marshaller m = context.createMarshaller();
//		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//		m.marshal(d, new File("resources/tylers.xml"));

		Unmarshaller um = context.createUnmarshaller();
		Dealer tylerIn = (Dealer)um.unmarshal(new FileReader("resources/tylers.xml"));
		ArrayList<Car> tylersInStock = tylerIn.getStock();
		for(Car x : tylersInStock){
			System.out.println(x);
		}

    }
}
