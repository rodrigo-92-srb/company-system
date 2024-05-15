package application;

import model.entities.Employee;

public class Company {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jack", 1000.00);
		
		System.out.println("Name: "+e1.getName()+" - Payment: "+e1.getPayment());

	}

}