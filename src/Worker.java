import java.time.LocalDate;
import java.time.Period;

public class Worker {

	private String name;
	private String birthdate;
	private String endDate;

	public Worker ( String name,  String birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public int getAge(){
		LocalDate today = LocalDate.now();
		LocalDate birthdayFormat = LocalDate.parse(this.birthdate);
		System.out.println(Period.between(birthdayFormat,today).getYears());
		return Period.between(birthdayFormat,today).getYears();
	}

	public double collectPay(){
		return 0.0;
	}

	public void terminate(){
		LocalDate today = LocalDate.now();
		 this.endDate = today.toString();

	}

}


