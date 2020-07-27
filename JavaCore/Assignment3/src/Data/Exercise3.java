package Data;

public class Exercise3 {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
	}
	
	// Question 1
	public static void Question1() {
		Integer x = 5000;
		System.out.printf("%2.2f \n" , (float)x);
	}
	
	// Question 2
	public static void Question2() {
		String x = "1234567";
		int a = Integer.parseInt(x);
		System.out.println(a);
	}
	
	// Question 3
	public static void Question3() {
		Integer x = 1234567;
		int a = x.intValue();
		System.out.println(a);
	}
}
