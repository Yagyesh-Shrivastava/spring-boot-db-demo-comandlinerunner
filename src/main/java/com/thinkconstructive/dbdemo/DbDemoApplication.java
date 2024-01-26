package com.thinkconstructive.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thinkconstructive.dbdemo.entity.StoreInformation;
import com.thinkconstructive.dbdemo.repository.StoreInformationRepository;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {
	
	@Autowired
	StoreInformationRepository storeInformationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
		System.out.println("Hello");
	}
	@Override
	public void run(String... args) {
		StoreInformation storeInformationOne = new StoreInformation("Amazon", "All type of bags are available", "8431218434");
		storeInformationRepository.save(storeInformationOne);
		
		StoreInformation storeInformationTwo = new StoreInformation("Flipkart", "All type of books are available", "716816887");
		storeInformationRepository.save(storeInformationTwo);
		
		StoreInformation storeInformationThree = new StoreInformation("Meesho", "All type of fashion are available", "984547135");
		storeInformationRepository.save(storeInformationThree);
		
		StoreInformation storeInformationFour = new StoreInformation("Myntra", "All type of fashion are available", "8747951841");
		storeInformationRepository.save(storeInformationFour);
		
		storeInformationRepository.findByStoreName("Amazon").forEach(val -> System.out.println(val));
		
		storeInformationRepository.findByStoreDetail("All type of fashion are available").forEach(val -> System.out.println(val));
		
		storeInformationRepository.findByStorePhoneNumber("8747951841").forEach(val-> System.out.println(val));
		
		storeInformationRepository.findById(2).ifPresent(val-> System.out.println(val));
		
		System.out.println(storeInformationRepository.count());
		
		storeInformationRepository.deleteById(3);
		System.out.println(storeInformationRepository.count());
	}

}
