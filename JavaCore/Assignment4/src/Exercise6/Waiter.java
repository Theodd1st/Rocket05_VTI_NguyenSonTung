package Exercise6;

public class Waiter extends User {

	@Override
	public double calculatePay() {
		return this.salaryRatio * 220;
	}

	@Override
	public void displayInfo() {
		System.out.println("Tên là " + this.name + " có lương " + calculatePay());		
	}
}
