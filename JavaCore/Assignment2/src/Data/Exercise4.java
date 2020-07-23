package Data;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		Random random = new Random();

		// Question 1
		int a = random.nextInt();
		System.out.println(a);

		// Question 2
		float b = random.nextFloat();
		System.out.println(b);

		// Question 3
		String[] students = { "Nguyễn Sơn Tùng", "Nguyễn Thạch Tú", "Nguyễn Hải Yến" };
		int i = random.nextInt(students.length);
		System.out.println(students[i]);

		// Question 4
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();

		long randomInt = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);

		System.out.println(randomDay);

		// Question 5
		minDay = (int) LocalDate
				.of(LocalDate.now().getYear() - 1, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth())
				.toEpochDay();
		maxDay = (int) LocalDate.now().toEpochDay();

		randomInt = minDay + random.nextInt(maxDay - minDay);

		randomDay = LocalDate.ofEpochDay(randomInt);

		System.out.println(randomDay);

		// Question 6
		minDay = (int) LocalDate.ofEpochDay(365).toEpochDay();
		maxDay = (int) LocalDate.now().toEpochDay();

		randomInt = minDay + random.nextInt(maxDay - minDay);

		randomDay = LocalDate.ofEpochDay(randomInt);

		System.out.println(randomDay);

		// Question 7
		int x = random.nextInt(900) + 100;
		System.out.println(x);
	}

}
