public class Employee  extends Worker{
	private long employeeId;
	private String hireDate;

	public Employee(String name, String birthdate, long employeeId, String hireDate) {
		super(name, birthdate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}




}
