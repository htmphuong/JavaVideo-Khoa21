package Business;

public class Students extends Person {
	String program;
	int year;
	double fee;
	public Students() {
		
	}
	public Students(String name, String address,String program, int year, double fee) {
		super(name, address);
		this.name = name;
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
