package com.zalostation.docean;

import com.zalostation.docean.employee.Employee;
import com.zalostation.docean.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoDoceanApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoDoceanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (repository.findAll().isEmpty()) {
			System.out.print("Initial data was empty. Data is seeding...");
			Employee emp1 = new Employee(101, "Tester one", "testerone@mail.com");
			Employee emp2 = new Employee(102, "Tester two", "testertwo@mail.com");
			Employee emp3 = new Employee(103, "Tester three", "testerthree@mail.com");
			Employee emp4 = new Employee(104, "Tester four", "testerfour@mail.com");
			repository.saveAll(Arrays.asList(emp1, emp2, emp3, emp4));
		}
	}
}
