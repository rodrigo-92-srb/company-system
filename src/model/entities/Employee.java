package model.entities;

public abstract class Employee {
	
	private String name;
	
	private double payment;
	
	public Employee(String name, double payment){
		this.name=name;
		this.payment=payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public abstract double calculatePayment();

}