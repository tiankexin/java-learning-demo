package com.tkx.tian_demo;

import com.tkx.tian_demo.models.Person;
import com.tkx.tian_demo.repository.dev.PersonRepository;
import com.tkx.tian_demo.repository.test.CustomerRepository;
import com.tkx.tian_demo.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TianDemoApplication {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/initialize")
	String index(){
		customerRepository.deleteAll();

		// save a couple of customers
		customerRepository.save(new Customer("Alice", "Smith"));
		customerRepository.save(new Customer("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : customerRepository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(customerRepository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : customerRepository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		Customer lastCustomer = customerRepository.findByLastName("Smith").get(0);
		return lastCustomer.getId();
	}

	@RequestMapping("/person/add")
	String addPerson (String name, Integer age){
		Person p = new Person(name, age);
		personRepository.save(p);
		return p.toString();
	}

	@RequestMapping("/customer/add")
	String addCustomer(String firstName, String lastName){
		Customer c = new Customer(firstName, lastName);
		customerRepository.save(c);
		return c.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(TianDemoApplication.class, args);
	}
}
