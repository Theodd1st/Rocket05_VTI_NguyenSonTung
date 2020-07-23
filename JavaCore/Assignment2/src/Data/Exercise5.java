package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);

		// Question 1
		System.out.print("Nhập số có 3 chữ số nguyên: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		System.out.printf("Bạn vừa nhập 3 số nguyên là %d, %d, %d", x, y, z);

		// Question 2
		System.out.print("\nNhập vào 1 số thực: ");
		float f = scanner.nextFloat();
		System.out.print("Nhập vào số thực thứ 2: ");
		if (scanner.hasNextFloat()) {
			float f2 = scanner.nextFloat();
			System.out.println("Bạn vừa nhập và 2 số thực là: " + f + " và " + f2);
		}

		// Question 3
		System.out.print("Mời bạn nhập họ: ");
		String a = scanner.next();
		System.out.print("Mời bạn nhập tên đệm(1): ");
		String b = scanner.next();
		System.out.print("Bạn có tên đệm 2 không(1 là có 0 là không): ");
		int check = scanner.nextInt();
		if (check == 1) {
			System.out.print("Mời bạn nhập tên đệm thứ 2: ");
			String c = scanner.next();
			System.out.print("Mời bạn nhập tên: ");
			String d = scanner.next();
			System.out.println("Tên bạn nhập vào là: " + a + " " + b + " " + c + " " + d);
		} else if (check == 0) {
			System.out.print("Mời bạn nhập tên: ");
			String d = scanner.next();
			System.out.println("Tên bạn nhập vào là: " + a + " " + b + " " + d);
		} else {
			System.out.println("Bạn đã nhập sai giá trị yêu cầu!! Dừng chương trình và chạy lại");
		}

		// Question 4
		// Solution 1
		System.out.print("Mời bạn nhập ngày sinh: ");
		int day = scanner.nextInt();
		System.out.print("Mời bạn nhập tháng sinh: ");
		int month = scanner.nextInt();
		System.out.print("Mời bạn nhập năm sinh: ");
		int year = scanner.nextInt();
		System.out.printf("Ngày sinh bạn nhập là: %d/%d/%d", day, month, year);

		// Solution 2
		System.out.print("\nMời bạn nhập ngày sinh theo dạng ngày/tháng/năm: ");
		String dateInput = scanner.next();
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dateInput);
		System.out.println("Ngày bạn đã nhập là: " + date);

		// Question 5
		createAccount();

		// Question 6
		createDepartment();

		// Question 7
		System.out.println("Nhập số chẵn: ");
		int e = scanner.nextInt();
		if (e % 2 == 0) {
			System.out.println("Bạn vừa nhập số chẵn: " + e);
		} else {
			System.out.println("Bạn vừa nhập 1 số lẻ");
		}

		// Question 8
		System.out.print("Mời bạn nhập vào chức năng muốn sử dụng(1: create account or 2: create department): ");
		int methodNumber = scanner.nextInt();

		switch (methodNumber) {
		case 1:
			createAccount();
			break;
		case 2:
			createDepartment();
			break;
		default:
			System.out.println("Mời bạn nhập lại");
		}
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
}
