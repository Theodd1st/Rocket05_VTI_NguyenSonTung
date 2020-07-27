package Data;

import java.time.LocalDate;

public class Exercise2 {

	public static void main(String[] args) {

		Account[] accs = new Account[5];
		// insert account
		for (int i = 0; i < 5; i++) {
			Account account = new Account();
			account.id = i + 1;
			account.email = "	Email " + (i + 1);
			account.userName = "	Username " + (i + 1);
			account.fullName = "	Full name " + (i + 1);
			account.createDate = LocalDate.now();

			accs[i] = account;
		}

		// print accounts
		for (Account account : accs) {
			System.out.println("Account " + account.id + ": ");
			System.out.println(account.email);
			System.out.println(account.userName);
			System.out.println(account.fullName);
			System.out.println("	" + account.createDate);
		}
	}

}
