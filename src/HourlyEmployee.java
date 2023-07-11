public class HourlyEmployee extends Employee {
   private double hourlyPayRate;

	public HourlyEmployee(String name, String birthdate,long employeeId, String hireDate, double hourlyPayRate) {
		super(name, birthdate, employeeId, hireDate);
		this.hourlyPayRate = hourlyPayRate;
	}

	public double getDoublePay(){
		System.out.println(this.hourlyPayRate * 2);
		return this.hourlyPayRate * 2;
	}


}
