package Data;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Question1();
		Question2_3();
		Question4();
	}
	
	// Question 1
	public static void Question1() {
		float salary1 = new Float(5240.5);
		float salary2 = new Float(10970.055);
		System.out.println("Salary 1: " + salary1);
		System.out.println("Salary 2: " + salary2);
		
		int roundSalary1 = (int) (salary1);
		int roundSalary2 = (int) (salary2);
		
		if (salary1 - roundSalary1 >= 0.5) {
			roundSalary1 += 1;
		}
		if (salary2 - roundSalary2 >= 0.5) {
			roundSalary2 += 1;
		}
		
		System.out.println("Salary 1: " + roundSalary1);
		System.out.println("Salary 2: " + roundSalary2);
	}
	
	// Question 2, 3
	public static void Question2_3() {
		Random random = new Random();
		int a = random.nextInt(100000);
		String format = String.format("%05d", a);
		System.out.println("Một số có 5 chữ số ngẫu nhiên: " + format);
		int b = a%100;
		format = String.format("%02d", b);
		System.out.println("Lấy ra 2 số cuối của số ngẫu nhiên ở trên: " + format);
	}
	
	// Question 4
	public static void Question4() {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập giá trị a = ");
		a = scanner.nextInt();
		do {
			System.out.print("Nhập giá trị b = ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Nhập số dưới mẫu phải khác 0!");
			}
		} while (b == 0);

		scanner.close();

		System.out.println("Thương của a / b là: " + (float) a / (int) b);
	}
}
