package Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {

	public static void main(String[] args) {
		// Question 1
		int i = 5;
		System.out.printf("%d\n", i);

		// Question 2
		i = 100000000;
		System.out.printf(Locale.US, "%,d\n", i);

		// Question 3
		double f = 5.567098;
		System.out.printf("%.4f\n", f);

		// Question 4
		String s = "Nguyễn Sơn Tùng";
		System.out.printf("Tên tôi là %s và tôi không độc thân :3\n", s);

		// Question 5
		LocalDateTime date = LocalDateTime.of(2020, 04, 24, 11, 16, 20);
		System.out.printf("%d/%d/%d %d:%d:%d\n", date.getDayOfMonth(), date.getMonthValue(), date.getYear(),
				date.getHour(), date.getMinute(), date.getSecond());

		// Question 6
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Maneging";

		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "oneWastefultrick@gmail.com";
		account1.userName = "Atus";
		account1.fullName = "Nguyen Thach Tu";
		account1.department = department1;
		account1.createDate = new Date(2017/1/13);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "theodd1st@gmail.com";
		account2.userName = "The Odd";
		account2.fullName = "Nguyen Son Tung";
		account2.department = department2;
		account2.createDate = new Date(2017/1/13);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "theInnatetricker@gmail.com";
		account3.userName = "Theo";
		account3.fullName = "Nguyen Xuan The";
		account3.department = department3;
		account3.createDate = new Date(2017/1/13);

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "KiiroshiNuxi@gmail.com";
		account4.userName = "Kiiroshi";
		account4.fullName = "Nguyen Hai Yen";
		account4.department = department2;
		account4.createDate = new Date(2017/1/13);

		// data out
		Account[] accs = { account1, account2, account3, account4 };
		System.out.println("Thông tin về nhân viên");
		for (Account acc : accs) {
			System.out.printf("Thông tin về nhân viên %s\n", acc.userName);
			System.out.printf("	Email: %s\n", acc.email);
			System.out.printf("	FullName: %s\n", acc.fullName);
			System.out.printf("	Department: %s\n", acc.department.name);
		}
	}
}