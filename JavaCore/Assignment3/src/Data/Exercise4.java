package Data;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Question1();
		Question2();
		Question3();
		Question4();
		Question5();
		Question6();
		Question7();
		Question8();
		Question9();
		Question10();
		Question11();
		Question12();
		Question13();
		Question14();
		Question15();
		Question16();
	}

	// Question 1
	public static void Question1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập chuỗi: ");
		String a = scanner.nextLine();
		char[] s = a.toCharArray();
		int i = 0, count = 1;
		while (s[i] == ' ') {
			i++;
		}

		for (int j = i; j < s.length - 1; j++) {
			if (s[j] == ' ' && s[j + 1] != ' ') {
				count++;
			}
		}
		System.out.println("Số từ trong chuỗi vừa nhập là: " + count);
	}

	// Question 2
	public static void Question2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập vào chuỗi thứ 1(s1): ");
		String s1 = scanner.nextLine();
		System.out.print("Mời bạn nhập vào chuỗi thứ 2(s2): ");
		String s2 = scanner.nextLine();
		System.out.println("Chuỗi tổng hợp: " + s1 + " " + s2);
	}

	// Question 3
	public static void Question3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập tên vào: ");
		String a = scanner.nextLine();
		char[] s = a.toLowerCase().toCharArray();
		boolean x = false;
		for (int i = 0; i < s.length; i++) {
			if (!x && Character.isLetter(s[i])) {
				s[i] = Character.toUpperCase(s[i]);
				x = true;
			} else if (Character.isWhitespace(s[i])) { 
				x = false;
			}
		}
		System.out.println("Tên bạn vừa nhập vào là: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
	
	// Question 4
	public static void Question4() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\nMời bạn nhập tên vào: ");
		String a = scanner.next();
		char[] s = a.toUpperCase().toCharArray();
		for (int i = 0; i < s.length; i++) {
			System.out.print("Ký tự thứ " + (i+1) + " là: ");
			System.out.println(s[i]);
		}
	}
	
	//Question 5
	public static void Question5() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập họ: ");
		String a = scanner.nextLine();
		System.out.println("Mời bạn nhập nốt tên: ");
		String b = scanner.nextLine();
		System.out.println("Tên bạn đã nhập là: " + a + " " + b);
	}
	
	//Question 6
	public static void Question6() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mời bạn nhập tên đầy đủ vào: ");
		String x = scanner.nextLine();
		x = x.trim();
		String[] word = x.split(" ");
		String a = word[0];
		String c = word[word.length - 1];
		String b = "";
		for (int i = 1; i <= word.length - 2; i++) {
			b += word[i] + " ";
		}
		System.out.println("Họ: " + a);
		System.out.println("Tên đệm: " + b);
		System.out.println("Tên: " + c);
	}
	
	// Question 7
	public static void Question7() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập tên vào: ");
		String a = scanner.nextLine();
		a = a.trim();
		a = a.replaceAll("\\s+", " ");
		char[] s = a.toLowerCase().toCharArray();
		boolean x = false;
		for (int i = 0; i < s.length; i++) {
			if (!x && Character.isLetter(s[i])) {
				s[i] = Character.toUpperCase(s[i]);
				x = true;
			} else if (Character.isWhitespace(s[i])) { 
				x = false;
			}
		}
		System.out.println("Tên bạn vừa nhập vào là: ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}
	
	// Question 8
	public static void Question8() {
		String[] groupNames = { "Java with Love", "C++ Time", "Real Java team" };
		System.out.println("Tên các Group có chữ Java:");
		for (String groupName : groupNames) {
			if (groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}
	
	// Question 9
	public static void Question9() {
		String[] groupNames = { "Java", "C#", "C++" };

		for (String groupName : groupNames) {
			if (groupName.equals("Java")) {
				System.out.println(groupName);
			}
		}
	}
	
	// Question 10
	public static void Question10() {
		Scanner scanner = new Scanner(System.in);
		
		String s1, s2, reverseS1 = "";
		System.out.print("Chữ thứ 1: ");
		s1 = scanner.nextLine();
		System.out.print("Chữ thứ 2: ");
		s2 = scanner.nextLine();
		for (int i = s1.length() - 1; i >= 0; i--) {
			reverseS1 += s1.substring(i, i + 1);
		}
		if (s2.equals(reverseS1)) {
			System.out.println(s1 + " có chữ ngược lại là " + s2);
		} else {
			System.out.println("2 chuỗi trên không phải đảo ngược của nhau");
		}
	}
	
	// Question 11
	public static void Question11() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập chuỗi vào: ");
		String a = scanner.nextLine();
		char[] s = a.toCharArray();
		char x = 'a';
		int counter = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == x) {
				counter++;
			} 
		}
		System.out.println(counter);
	}
	
	// Question 12
	public static void Question12() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mời bạn nhập chuỗi vào: ");
		String a = scanner.nextLine();
		String reverse = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reverse += a.substring(i, i + 1);
		}
		System.out.println("Chuỗi sau khi đảo ngược là: " + reverse);
	}
	
	// Question 13
	public static void Question13() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập chuỗi vào: ");
		String a = scanner.nextLine();
		char[] s = a.toCharArray();
		boolean x = false;
		for (int i = 0; i < s.length; i++) {
			if (!x && Character.isDigit(s[i])) {
				x = true;
			}
		}
		System.out.println("Chuỗi vừa nhập có số?(Kết quả ngược) " + !x);
	}
	
	// Question 14
	public static void Question14() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mời bạn nhập chuỗi đầu vào: ");
		String a = scanner.nextLine();
		System.out.print("Nhập ký tự muốn thay đổi: ");
		char b = scanner.next().charAt(0);
		System.out.print("Nhập ký tự sau khi thay đổi: ");
		char c = scanner.next().charAt(0);
		a = a.trim();
		a = a.replace(b, c);
		System.out.println("Chuỗi sau khi thay đổi là: " + a);
	}
	
	// Question 15
	public static void Question15() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập chuỗi vào: ");
		String a = scanner.nextLine();
		a = a.trim();
		a = a.replaceAll("\\s+", " ");
		String[] word = a.split(" ");
		System.out.print("Chuỗi đảo ngược là: ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
	}
	
	// Question 16
	public static void Question16() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Mời bạn nhập chuỗi vào: ");
		String a = scanner.nextLine();
		System.out.print("Mời bạn nhập số nguyên vào: ");
		int b = scanner.nextInt();
		a = a.trim();
		a = a.replaceAll("\\s+", "");
		char[] s = a.toCharArray();
		if (s.length % b == 0) {
			System.out.print("Trả ra chuỗi mới: ");
			for (int i = 0; i < s.length; i += b) {
				System.out.print(a.substring(i, i + b) + " ");
			}
		} else {
			System.out.println("KO");
		}
	}
}
