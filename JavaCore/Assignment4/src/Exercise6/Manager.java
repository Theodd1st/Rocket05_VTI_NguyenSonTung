package Exercise6;

public class Manager extends User{

	@Override
	public double calculatePay() {
		return this.salaryRatio * 520;
	}

	@Override
	public void displayInfo() {
		System.out.println("Tên là " + this.name + " có lương " + calculatePay());		
	}

}
