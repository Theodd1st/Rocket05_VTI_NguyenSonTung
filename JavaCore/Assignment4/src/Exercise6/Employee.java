package Exercise6;

public class Employee extends User {

	@Override
	public double calculatePay() {
		return this.salaryRatio * 420;
	}

	@Override
	public void displayInfo() {
		System.out.println("Tên là " + this.name + " có lương " + calculatePay());		
	}
}
