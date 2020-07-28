package Data;

public class Exercise6 {

	public static void main(String[] args) {
		Question1();
		System.out.println("");
		Question2();
		Question3();
	}
	
	// Question 1
	public static void Question1() {
		System.out.print("Các số chẵn nguyên dương nhỏ hơn 10 là:");
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(" " + i);
		}
		System.out.println("");
	}
	
	// Question 2
	public static void Question2() {
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "oneWastefultrick@gmail.com";
		account1.userName = "Atus";
		account1.fullName = "Nguyen Thach Tu";

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "theodd1st@gmail.com";
		account2.userName = "The Odd";
		account2.fullName = "Nguyen Son Tung";

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "theInnatetricker@gmail.com";
		account3.userName = "Theo";
		account3.fullName = "Nguyen Xuan The";
		
		Account[] accs = { account1, account2, account3 };
		
		System.out.println("Thông tin các account");
		for (Account acc : accs) {
			System.out.println("	Id: " + acc.id);
			System.out.println("	Email: " + acc.email);
			System.out.println("	User Name: " + acc.userName);
			System.out.println("	Full Name: " + acc.fullName);
			System.out.println("");
		}
	}
	
	// Question 3
	public static void Question3() {
		System.out.print("Các số nguyên dương nhỏ hơn 10 là:");
		for (int i = 1; i <= 10; i ++) {
			System.out.print(" " + i);
		}
	}
}
