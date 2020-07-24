package com.ex.datademo;

import com.ex.datademo.dao.DroidRepo;
import com.ex.datademo.model.Droid;
import com.ex.datademo.model.DroidType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@Transactional
public class DataDemoApplication {

	private DroidRepo repo;

	@Autowired
	public DataDemoApplication(DroidRepo repo){
		this.repo=repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DataDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args	-> {
			Optional<Droid> d = repo.findById(1);

			if(d.isPresent()){
				System.out.println(d.get());
			}else{
				System.out.println("No droid with id " + 1);
			}

//			List<Droid> droids = (List<Droid>)repo.findAll();
//			for(final Droid droid: droids){
//				System.out.println(droid);
//			}

		List<Droid> r = repo.findAllByDroidType(DroidType.ASTROMECH);
			for(final Droid x : r){
				System.out.println(x);
			}

			Optional<Droid> r2 = repo.findByName("R2-D2");
			if(r2.isPresent()){
				System.out.println(r2);
			}else{
				System.out.println("these are not the droids you are looking for.");
			}
		};
	}
}
