package jeny.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@Admin")
	public void forAdmin() {
		System.out.println("****I am Admin****");
	}
	
	@After("@Customer")
	public void forCustomer() {
		System.out.println("****I am Customer****");
	}
}
