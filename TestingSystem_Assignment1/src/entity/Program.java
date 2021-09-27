package entity;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		// Create Data
		Department department1 = new Department();	// tạo 1 object mới (department1)
		department1.departmentId = 1;				// Nhập thuộc tính cho Obj	//Thuộc tính Id
		department1.departmentName = "Sale";									//Thuộc tính Name
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketing";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Maneging";
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.DEV;
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.TEST;
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = PositionName.SCRUM_MASTER;
		
		Position position4 = new Position();
		position4.positionId = 4;
		position4.positionName = PositionName.PM;
		
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "ee@1";
		account1.userName = "1u";
		account1.fullName = "1f";
		account1.department = department1;
		account1.position = position1;
		account1.createDate = new Date("2020/01/22");
		
		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "ee@2";
		account2.userName = "2u";
		account2.fullName = "2f";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = new Date("2020/02/22");
		
		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "ee@3";
		account3.userName = "3u";
		account3.fullName = "3f";
		account3.department = department3;
		account3.position = position3;
		account3.createDate = new Date("2020/03/22");

		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "g1";
		group1.creator = account1;
		group1.createDate = new Date("2020/01/22");
		Account[] accOfGroup1 = {account1, account2};
		group1.accounts = accOfGroup1;
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "g2";
		group2.creator = account2;
		group2.createDate = new Date("2020/02/22");
		Account[] accOfGroup2 = {account2};
		group2.accounts = accOfGroup2;

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "g3";
		group3.creator = account3;
		group3.createDate = new Date("2020/03/22");
		
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.group = group1;
		groupAccount1.account = account1;
		groupAccount1.joinDate = new Date("2020/01/22");
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.group = group2;
		groupAccount2.account = account2;
		groupAccount2.joinDate = new Date("2020/02/22");
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.group = group3;
		groupAccount3.account = account3;
		groupAccount3.joinDate = new Date("2020/03/22");
		
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = TypeName.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "Java";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = ".NET";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "SQL";
		
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "aa1";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator = account1;
		question1.createDate = new Date("2020/01/22");
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "aa2";
		question2.category = categoryQuestion2;
		question2.type = typeQuestion2;
		question2.creator = account1;
		question2.createDate = new Date("2020/01/22");
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "aa3";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion1;
		question3.creator = account1;
		question3.createDate = new Date("2020/01/22");
		
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "1";
		answer1.question = question1;
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "2";
		answer2.question = question2;
		answer2.isCorrect = true;
		
		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = "3";
		answer3.question = question3;
		answer3.isCorrect = true;
		
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = "c1";
		exam1.title = "1t";
		exam1.category = categoryQuestion1;
		exam1.duration = 30;
		exam1.creator = account1;
		exam1.createDate = new Date("2020/01/22");
		
		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = "c2";
		exam2.title = "2t";
		exam2.category = categoryQuestion2;
		exam2.duration = 90;
		exam2.creator = account2;
		exam2.createDate = new Date("2020/01/22");
		
		Exam exam3 = new Exam();
		exam3.examId = 3;
		exam3.code = "c3";
		exam3.title = "3t";
		exam3.category = categoryQuestion3;
		exam3.duration = 30;
		exam3.creator = account1;
		exam3.createDate = new Date("2020/01/22");
		
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;
		
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;
		
		// Print out
//		System.out.println("Department 1:");
//		System.out.println(department1.departmentId);
//		System.out.println(department1.departmentName);
//		
//		System.out.println("Position 1:");
//		System.out.println(position1.positionId);
//		System.out.println(position1.positionName);
//		
//		System.out.println("Account 1:");
//		System.out.println(account1.accountId);
//		System.out.println(account1.email);
//		System.out.println(account1.userName);
//		System.out.println(account1.fullName);
//		System.out.println(account1.department.departmentId);
//		System.out.println(account1.position.positionName);
//		System.out.println(account1.createDate);
//		
//		System.out.println("Group 1:");
//		System.out.println(group1.groupId);
//		System.out.println(group1.groupName);
//		System.out.println(group1.creator.accountId);
//		System.out.println(group1.createDate);
//		
//		System.out.println("Group Account 1:");
//		System.out.println(groupAccount1.group.groupId);
//		System.out.println(groupAccount1.account.accountId);
//		System.out.println(groupAccount1.joinDate);
//		
//		System.out.println("Type Question 1:");
//		System.out.println(typeQuestion1.typeId);
//		System.out.println(typeQuestion1.typeName);
//		
//		System.out.println("Category Question 1:");
//		System.out.println(categoryQuestion1.categoryId);
//		System.out.println(categoryQuestion1.categoryName);
//		
//		System.out.println("Question 1:");
//		System.out.println(question1.questionId);
//		System.out.println(question1.content);
//		System.out.println(question1.category.categoryId);
//		System.out.println(question1.type.typeId);
//		System.out.println(question1.creator.accountId);
//		System.out.println(question1.createDate);
//		
//		System.out.println("Answer 1:");
//		System.out.println(answer1.answerId);
//		System.out.println(answer1.content);
//		System.out.println(answer1.question.questionId);
//		System.out.println(answer1.isCorrect);
//		
//		System.out.println("Exam 1:");
//		System.out.println(exam1.examId);
//		System.out.println(exam1.code);
//		System.out.println(exam1.title);
//		System.out.println(exam1.category.categoryId);
//		System.out.println(exam1.duration);
//		System.out.println(exam1.creator.accountId);
//		System.out.println(exam1.createDate);
//		
//		System.out.println("Exam Question 1:");
//		System.out.println(examQuestion1.exam.examId);
//		System.out.println(examQuestion1.question.questionId);
		
//		Locale locale = new Locale("jp", "JP");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(new Date(2020/01/22));
//		System.out.println(date);
		
//		String pattern = "dd-MM-yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date);
		
//		System.out.println("Xong sẽ tự xuống dòng");
//		System.out.print("Xong sẽ không tự xuống, muốn xuống thì có \n");
//		System.out.printf("%s %s", account1.accountId, account1.email);
		
		// Khởi tạo Scanner
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Hãy nhập vào dãy a: ");
//		String a = scanner.next();
//		System.out.print("Hãy nhập vào dãy b: ");
//		String b = scanner.next();
//		System.out.println("Số vừa nhập là: " + a + b);
		
		// Đổi từ dạng String -> Date
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Mời nhập vào ngày dạng ngày-tháng-năm: ");
//		String dateInput = scanner.next();
//		String pattern = "dd-MM-yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		Date date = simpleDateFormat.parse(dateInput);
//		System.out.println(date);
	}
}
