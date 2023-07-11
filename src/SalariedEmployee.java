public class SalariedEmployee extends Employee{
	private double annualSalary;
	boolean isRetired;

	public SalariedEmployee(String name, String birthdate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
		super(name, birthdate, employeeId, hireDate);
		this.annualSalary = annualSalary;
		this.isRetired = isRetired;
	}

	public void retire(){
		this.isRetired = true;
	}
}
