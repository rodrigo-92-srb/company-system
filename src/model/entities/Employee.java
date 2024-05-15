package model.entities;

public class Employee {
	
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
	
	public void calculatePayment(double payment) {
		this.payment = payment - (payment*0.02);
	}

}