package model.entities;

public class Operator extends Employee{

    private double hourlyRate;
	
	private int hoursWorked;
	
	public Operator(String name, double payment, double hourlyRate, int hoursWorked) {
		super(name, payment);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

    @Override
	public double calculatePayment() {  
		return getPayment() + getHourlyRate()*getHoursWorked();
	}
    
}
