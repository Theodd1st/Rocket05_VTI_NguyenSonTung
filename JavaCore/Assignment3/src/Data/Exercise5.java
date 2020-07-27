package Data;

public class Exercise5 {

	public static void main(String[] args) {
		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Waiting room";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Boss of director";

		Department department4 = new Department();
		department4.id = 4;
		department4.name = "Sale";

		Department department5 = new Department();
		department5.id = 5;
		department5.name = "Accounting";
		
		Department[] departments = {department1,department2,department3,department4,department5};
		
		Question1(department2);
		Question2(departments);
		Question3(department2);
		Question4(department2);
		Question5(department1, department2);
		Question6(departments);
		Question7(departments);
	}
	
	// Question 1
	public static void Question1(Department depart) {
		System.out.println(depart);
	}
	
	// Question 2
	public static void Question2(Department[] departs) {
		for (Department depart : departs) {
			System.out.println(depart);
		}
	}
	
	// Question 3
	public static void Question3(Department depart) {
		System.out.println(depart.hashCode());
	}
	
	// Question 4
	public static void Question4(Department depart) {
		if (depart.name.equals("Sale")) {
			System.out.println("Phòng ban có tên đúng như tên cần kiểm tra!");
		} else {
			System.out.println("Phòng ban có tên khác");
		}
	}
	
	// Question 5
	public static void Question5(Department depart1,Department depart2) {
		if (depart1.name.equals(depart2.name)) {
			System.out.println("Hai phòng ban này bằng nhau");
		} else {
			System.out.println("Hai phòng ban này không bằng nhau");
		}
	}
	
	// Question 6
	public static void Question6(Department[] departs) {
		for (int i = 0; i < departs.length; i++) {
			for (int j = 0; j < departs.length - 1; j++) {
				if (departs[i].name.compareToIgnoreCase(departs[j].name) < 0) {
					Department sheep = departs[i];
					departs[i] = departs[j];
					departs[j] = sheep;
				}
			}
		}
		for (Department depart : departs) {
			System.out.println(depart.name);
		}
	}
	
	
	// Question 7
	public static void Question7(Department[] departs) {
		for (int i = 0; i < departs.length; i++) {
			String reverse1 = reverseWords(departs[i].name);
			for (int j = 0; j < departs.length - 1; j++) {
				String reverse2 = reverseWords(departs[j].name);
				if (reverse1.compareToIgnoreCase(reverse2) < 0) {
					Department sheep = departs[i];
					departs[i] = departs[j];
					departs[j] = sheep;
				}
			}
		}
		for (Department depart : departs) {
			System.out.println(depart.name);
		}
	}

	private static String reverseWords(String str) {
		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		String[] words = str.split(" ");

		str = "";
		for (int i = words.length - 1; i >= 0; i--) {
			str += words[i] + " ";
		}

		return str.substring(0, str.length() - 2);
	}
}
