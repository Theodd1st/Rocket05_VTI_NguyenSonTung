package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		// Question 1
//		System.out.print("Nhập số có 3 chữ số nguyên: ");
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
//		int z = scanner.nextInt();
//		System.out.printf("Bạn vừa nhập 3 số nguyên là %d, %d, %d", x, y, z);
//
//		// Question 2
//		System.out.print("\nNhập vào 1 số thực: ");
//		float f = scanner.nextFloat();
//		System.out.print("Nhập vào số thực thứ 2: ");
//		if (scanner.hasNextFloat()) {
//			float f2 = scanner.nextFloat();
//			System.out.println("Bạn vừa nhập và 2 số thực là: " + f + " và " + f2);
//		}
//
//		// Question 3
//		// Solution 1
//		System.out.print("Mời bạn nhập họ: ");
//		String a = scanner.next();
//		System.out.print("Mời bạn nhập tên đệm(1): ");
//		String b = scanner.next();
//		System.out.print("Bạn có tên đệm 2 không(1 là có 0 là không): ");
//		int check = scanner.nextInt();
//		if (check == 1) {
//			System.out.print("Mời bạn nhập tên đệm thứ 2: ");
//			String c = scanner.next();
//			System.out.print("Mời bạn nhập tên: ");
//			String d = scanner.next();
//			System.out.println("Tên bạn nhập vào là: " + a + " " + b + " " + c + " " + d);
//		} else if (check == 0) {
//			System.out.print("Mời bạn nhập tên: ");
//			String d = scanner.next();
//			System.out.println("Tên bạn nhập vào là: " + a + " " + b + " " + d);
//		} else {
//			System.out.println("Bạn đã nhập sai giá trị yêu cầu!! Dừng chương trình và chạy lại");
//		}
//		// Solution 2
//		System.out.print("Mời bạn nhập tên: ");
//		String g = scanner.nextLine();
//		System.out.println("Tên bạn nhập vào là: " + g);
//
//		// Question 4
//		// Solution 1
//		System.out.print("Mời bạn nhập ngày sinh: ");
//		int day = scanner.nextInt();
//		System.out.print("Mời bạn nhập tháng sinh: ");
//		int month = scanner.nextInt();
//		System.out.print("Mời bạn nhập năm sinh: ");
//		int year = scanner.nextInt();
//		System.out.printf("Ngày sinh bạn nhập là: %d/%d/%d", day, month, year);
//
//		// Solution 2
//		System.out.print("\nMời bạn nhập ngày sinh theo dạng ngày/tháng/năm: ");
//		String dateInput = scanner.next();
//		String pattern = "dd/MM/yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//		Date date = dateFormat.parse(dateInput);
//		System.out.println("Ngày bạn đã nhập là: " + date);
//
//		// Question 5
//		createAccount();
//
//		// Question 6
//		createDepartment();
//
//		// Question 7
//		System.out.println("Nhập số chẵn: ");
//		int e = scanner.nextInt();
//		do {
//			if (e % 2 == 0) {
//				System.out.println("Bạn vừa nhập số chẵn: " + e);
//			} else {
//				System.out.println("Bạn vừa nhập 1 số lẻ");
//			}
//		} while (e % 2 == 0);
//
		// Question 8, 10, 11
		System.out.print("Mời bạn nhập vào chức năng muốn sử dụng(1: create account or 2: create department): ");
		int methodNumber = scanner.nextInt();
		do {
			switch (methodNumber) {
			case 1:
				createAccount();
				break;
			case 2:
				createDepartment();
				break;
			case 3:
				addGroup();
				break;
			default:
				System.out.println("Mời bạn nhập lại");
			}
		} while (methodNumber == 1 || methodNumber == 2);
		scanner.close();
		
	}

	static void createAccount() throws ParseException {
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
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập ID: ");
		int id = scanner.nextInt();
		System.out.print("Nhập Email: ");
		String email = scanner.next();
		System.out.print("Nhập UserName: ");
		String userName = scanner.next();
		System.out.print("Nhập Position: ");
		int x = scanner.nextInt();
		PositionName y = null;
		if (x == 1) {
			y = position1.name;
		} else if (x == 2) {
			y = position2.name;
		} else if (x == 3) {
			y = position3.name;
		} else if (x == 4) {
			y = position4.name;
		} else {
			System.out.println("Bạn đã nhập sai giá trị yêu cầu!! Dừng chương trình và chạy lại");
		}
		System.out.print("Nhập CreateDate: ");
		String dateInput = scanner.next();
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date createDate = dateFormat.parse(dateInput);

		System.out.println("Account mới nhập vào có");
		System.out.println("	ID: " + id);
		System.out.println("	Email: " + email);
		System.out.println("	UserName: " + userName);
		System.out.println("	Position: " + y);
		System.out.println("	CreateDate: " + createDate);
	}

	static void createDepartment() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập ID: ");
		int id = scanner.nextInt();
		System.out.print("Nhập Name: ");
		String name = scanner.next();

		System.out.println("Department mới nhập vào có");
		System.out.println("	ID: " + id);
		System.out.println("	Name: " + name);
	}

	static void addGroup() {
		Scanner scanner = new Scanner(System.in);

		// create account
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

		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Dream Team";
		group1.createDate = LocalDate.of(2019, 1, 13);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Just Us";
		group2.createDate = LocalDate.of(2019, 1, 13);

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "The Three Amigos";
		group3.createDate = LocalDate.of(2019, 1, 13);

		Group[] groups = { group1, group2, group3 };

		Group[] groupsOfAccount1 = { group1, group3 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group1, group2 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group2, group3 };
		account3.groups = groupsOfAccount3;

		Account[] accountOfGroup1 = { account1, account2 };
		group1.accounts = accountOfGroup1;

		Account[] accountOfGroup2 = { account2, account3 };
		group2.accounts = accountOfGroup2;

		Account[] accountOfGroup3 = { account1, account2 };
		group3.accounts = accountOfGroup3;

		System.out.println("Các UserName đã tồn tại");
		for (Account acc : accs) {
			System.out.println("	" + acc.userName);
		}
		System.out.print("Nhập vào User cần sử dụng: ");
		String x = scanner.nextLine();		

		System.out.println("Các Group đã tồn tại");
		for (Group group: groups) {
			System.out.println("	" + group.name);
		}
		System.out.print("Nhập vào Group cần sử dụng: ");		
		String y = scanner.nextLine();
		
		for (Account needAccount : accs) {
			if (x == needAccount.userName) {
				for (Group needGroup : groups) {
					if (y == needGroup.name) {
						insert(needAccount.groups, needGroup);
					}
				}
			}
		}
	}
	
	private static Group[] insert(Group[] groupOfAccount, Group group1) {
		int arrIndex = groupOfAccount.length - 1;
        int tempIndex = groupOfAccount.length;
        Group [] tempArr = new Group [tempIndex + 1];
        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1) {
                tempArr[i] = groupOfAccount[arrIndex--];
            } 
            else {
                tempArr[i] = group1;
            }
        }
        return tempArr;
	}
}
