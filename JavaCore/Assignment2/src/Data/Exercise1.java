package Data;

import java.time.LocalDate;
import java.util.Date;

public class Exercise1 {

	public static void main(String[] args) {
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

		// create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.DEV;

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.PM;

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCRUM_MASTER;

		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.TEST;

		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "oneWastefultrick@gmail.com";
		account1.userName = "Atus";
		account1.fullName = "Nguyen Thach Tu";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = new Date(2017/1/13);
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "theodd1st@gmail.com";
		account2.userName = "The Odd";
		account2.fullName = "Nguyen Son Tung";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date(2017/1/13);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "theInnatetricker@gmail.com";
		account3.userName = "Theo";
		account3.fullName = "Nguyen Xuan The";
		account3.department = department3;
		account3.position = position4;
		account3.createDate = new Date(2017/1/13);

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "KiiroshiNuxi@gmail.com";
		account4.userName = "Kiiroshi";
		account4.fullName = "Nguyen Hai Yen";
		account4.department = department2;
		account4.position = position3;
		account4.createDate = new Date(2017/1/13);

		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Dream Team";
		group1.creator = account2;
		group1.createDate = LocalDate.of(2019, 1, 13);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Just Us";
		group2.creator = account1;
		group2.createDate = LocalDate.of(2019, 1, 13);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "The Three Amigos";
		group3.creator = account1;
		group3.createDate = LocalDate.of(2019, 1, 13);

		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Pen Pals";
		group4.creator = account3;
		group4.createDate = LocalDate.of(2019, 1, 13);

		// foreign key
		Group[] groupsOfAccount1 = { group1, group3 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group1, group2, group3 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group4 };
		account3.groups = groupsOfAccount3;

		Group[] groupsOfAccount4 = { group1, group2 };
		account4.groups = groupsOfAccount4;

		Account[] accountOfGroup1 = { account1, account2, account3, account4 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account2, account4 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account1, account2 };
		group3.accounts = accountOfGroup3;

		Account[] accountOfGroup4 = { account3 };
		group4.accounts = accountOfGroup4;

		System.out.println("(IF)");
		System.out.println("Thông tin về nhân viên 2(The Odd): ");
		// Question 1
		if (account2.department == null) {
			System.out.println("	Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("	Phòng ban của nhân viên này là " + account2.department.name);
		}

		// Question 2
		if (account2.groups == null || account2.groups.length == 0) {
			System.out.println("	Nhân viên này chưa có group");
		} else if (account2.groups.length == 1) {
			System.out.println("	Group nhân viên này tham gia là " + account2.groups[0].name);
		} else if (account2.groups.length == 2) {
			System.out.println(
					"	Group nhân viên này tham gia là " + account2.groups[0].name + ", " + account2.groups[1].name);
		} else if (account2.groups.length == 3) {
			System.out.println("	Nhân viên này quan trọng nên tham gia nhiều group");
		} else {
			System.out.println("	Nhân viên này hóng chuyện nên tham gia tất cả group");
		}

		// Question 3
		System.out.println(account2.department == null ? "	Nhân viên này chưa có phòng ban"
				: "	Phòng ban của nhân viên này là " + account2.department.name);

		// Question 4
		System.out.println(account2.position.name == PositionName.DEV ? "	Đây là Developer"
				: "	Người này không phải là Devepoler");

		System.out.println("\n(SWITCH CASE)");
		System.out.println("Thông tin về group 1(Dream Team): ");
		// Question 5
		int x = group1.accounts.length;

		switch (x) {

		case 1:
			System.out.println("	Nhóm có 1 thành viên");
			break;
		case 2:
			System.out.println("	Nhóm có 2 thành viên");
			break;
		case 3:
			System.out.println("	Nhóm có 3 thành viên");
			break;
		default:
			System.out.println("	Nhóm có nhiều thành viên");
			break;
		}

		System.out.println("\nCập nhật lại thông tin về nhân viên 2(The Odd): ");
		// Question 6
		int y = account2.groups.length + 1;

		switch (y) {

		case 1:
			System.out.println("	Nhân viên này chưa có group");
			break;
		case 2:
			System.out.println("	Group nhân viên này tham gia là " + account2.groups[0].name);
			break;
		case 3:
			System.out.println(
					"	Group nhân viên này tham gia là " + account2.groups[0].name + ", " + account2.groups[1].name);
			break;
		case 4:
			System.out.println("	Nhân viên này quan trọng nên tham gia nhiều group ");
			break;
		default:
			System.out.println("	Nhân viên này hóng chuyện nên tham gia tất cả group");
			break;
		}

		// Question 7
		PositionName z = account2.position.name;

		switch (z) {

		case DEV:
			System.out.println("	Đây là Developer");
			break;
		default:
			System.out.println("	Người này không phải là Devepoler");
			break;
		}

		System.out.println("\n(FOR EACH)");
		// Question 8
		Account[] accs = { account1, account2, account3, account4 };

		for (Account acc : accs) {
			System.out.println("Thông tin về nhân viên " + acc.userName);
			System.out.println("	Email: " + acc.email);
			System.out.println("	FullName: " + acc.fullName);
			System.out.println("	Department: " + acc.department.name + "\n");
		}

		// Question 9
		Department[] deps = { department1, department2, department3 };

		for (Department dep : deps) {
			System.out.println("Thông tin về phòng ban " + dep.name);
			System.out.println("	ID: " + dep.id);
			System.out.println("	Name: " + dep.name + "\n");
		}

		System.out.println("(FOR)");
		// Question 10
		for (int i = 0; i < accs.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
		}

		// Question 11
		for (int i = 0; i < deps.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("	ID: " + deps[i].id);
			System.out.println("	Name: " + deps[i].name + "\n");
		}

		// Question 12
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("	ID: " + deps[i].id);
			System.out.println("	Name: " + deps[i].name + "\n");
		}

		// Question 13
		for (int i = 0; i < accs.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
		}

		// Question 14
		for (int i = 0; i < accs.length; i++) {
			if (accs[i].id > 3) {
				continue;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
		}

		// Question 15
		System.out.println("Dãy số chẵn nhỏ hơn 20");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(" " + i);
		}

		System.out.println("\n\n(WHILE)");
		// Question 16
		// 16.10
		int i = 0;
		while (i < accs.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
			i++;
		}

		// 16.11
		i = 0;
		while (i < deps.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("	ID: " + deps[i].id);
			System.out.println("	Name: " + deps[i].name + "\n");
			i++;
		}

		// 16.12
		i = 0;
		while (i < 2) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("	ID: " + deps[i].id);
			System.out.println("	Name: " + deps[i].name + "\n");
			i++;
		}

		// 16.13
		i = 0;
		while (i < accs.length) {
			if (i == 1) {
				i++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
			i++;
		}

		// 16.14
		i = 0;
		while (i < accs.length) {
			if (accs[i].id > 3) {
				i++;
				continue;
			}
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("	Email: " + accs[i].email);
			System.out.println("	FullName: " + accs[i].fullName);
			System.out.println("	Department: " + accs[i].department.name + "\n");
			i++;
		}

		// 16.15
		System.out.println("Dãy số chẵn nhỏ hơn 20");
		i = 0;
		while (i <= 20) {
			System.out.print(" " + i);
			i += 2;
		}
	}
}
