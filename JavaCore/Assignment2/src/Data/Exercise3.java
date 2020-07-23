package Data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Exercise3 {

	public static void main(String[] args) {

		// create question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Dinh nghia ve Java";
		question1.createDate = LocalDate.of(2018, 7, 13);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Ly thuyet Java";
		question2.createDate = LocalDate.of(2018, 7, 13);
		
		// create exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A1";
		exam1.title = "Giua ky";
		exam1.duration = 30;
		exam1.createDate = LocalDate.of(1999, 12, 22);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "A2";
		exam2.title = "Giua ky";
		exam2.duration = 30;
		exam2.createDate = LocalDate.of(1999, 12, 22);

		// Question 2
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Exam[] exams = {exam1, exam2};
		for (Exam exa : exams) {
			System.out.printf("Exam %d đã được tạo vào ngày: ", exa.id);
			Date date = Date.from(exa.createDate.atStartOfDay(defaultZoneId).toInstant());
			String pattern = "yyyy-MM-dd--HH-mm-ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String day = simpleDateFormat.format(date);
			System.out.println(day);
		}
		
		// Question 3
		for (Exam exa : exams) {
			System.out.printf("Exam %d đã được tạo vào năm: ", exa.id);
			Date date = Date.from(exa.createDate.atStartOfDay(defaultZoneId).toInstant());
			String pattern = "yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String day = simpleDateFormat.format(date);
			System.out.println(day);
		}
		
		// Question 4
		for (Exam exa : exams) {
			System.out.printf("Exam %d đã được tạo vào: ", exa.id);
			Date date = Date.from(exa.createDate.atStartOfDay(defaultZoneId).toInstant());
			String pattern = "yyyy-MM";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String day = simpleDateFormat.format(date);
			System.out.println(day);
		}
		
		// Question 5
		for (Exam exa : exams) {
			System.out.printf("Exam %d đã được tạo vào: ", exa.id);
			Date date = Date.from(exa.createDate.atStartOfDay(defaultZoneId).toInstant());
			String pattern = "MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String day = simpleDateFormat.format(date);
			System.out.println(day);
		}
	}
}
