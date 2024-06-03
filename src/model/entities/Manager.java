package model.entities;

public class Manager extends Employee{
    
    private int kpi;
	
	private int level;

    public Manager(String name, double payment, int kpi, int level) {
		super(name, payment);
		this.kpi=kpi;
		this.level=level;
	}

    public int getKpi() {
		return kpi;
	}

	public void setKpi(int kpi) {
		this.kpi = kpi;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

    @Override
	public double calculatePayment() {
		return getPayment() + getPayment()*getLevel()*getKpi()/1000;
	}

}
