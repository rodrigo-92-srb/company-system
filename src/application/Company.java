package application;

import model.entities.Manager;
import model.entities.Operator;

public class Company {

	public static void main(String[] args) {
		
		Operator operator = new Operator("John Doe", 2000, 168, 18);
		System.out.println(operator.calculatePayment());
		System.out.println(operator.getPayment());

		Manager manager = new Manager("Jack", 8000, 380, 2);
		System.out.println(manager.calculatePayment());
		System.out.println(manager.getPayment());
	}

}