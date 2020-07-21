import java.time.LocalDate;

public class Program {

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
		account1.position = position2;
		account1.createDate = LocalDate.of(2017, 1, 13);

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "theodd1st@gmail.com";
		account2.userName = "The Odd";
		account2.fullName = "Nguyen Son Tung";
		account2.department = department2;
		account2.position = position2;
		account2.createDate = LocalDate.of(2017, 1, 13);

		Account account3 = new Account();
		account3.id = 3;
		account3.email = "theInnatetricker@gmail.com";
		account3.userName = "Theo";
		account3.fullName = "Nguyen Xuan The";
		account3.department = department3;
		account3.position = position1;
		account3.createDate = LocalDate.of(2017, 1, 13);

		Account account4 = new Account();
		account4.id = 4;
		account4.email = "theImaginary@gmail.com";
		account4.userName = "Transer";
		account4.fullName = "Pham Xuan Cong";
		account4.department = department3;
		account4.position = position3;
		account4.createDate = LocalDate.of(2017, 1, 13);

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "TheSlipperyGamer@gmail.com";
		account5.userName = "Enseptypt";
		account5.fullName = "Phan Thi Anh Ngoc";
		account5.department = department2;
		account5.position = position4;
		account5.createDate = LocalDate.of(2017, 1, 13);

		Account account6 = new Account();
		account6.id = 6;
		account6.email = "Abackhustle@gmail.com";
		account6.userName = "Fatas";
		account6.fullName = "Tran Van Khai";
		account6.department = department1;
		account6.position = position1;
		account6.createDate = LocalDate.of(2017, 1, 13);

		Account account7 = new Account();
		account7.id = 7;
		account7.email = "KiiroshiNuxi@gmail.com";
		account7.userName = "Kiiroshi";
		account7.fullName = "Nguyen Hai Yen";
		account7.department = department2;
		account7.position = position4;
		account7.createDate = LocalDate.of(2017, 1, 13);

		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Dream Team";
		group1.creator = account2;
		group1.createDate = LocalDate.of(2019, 1, 13);

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Just Us";
		group2.creator = account7;
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

		// create type_question
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeName.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = TypeName.MULTIPLE_CHOICE;

		// create category_question
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = ".NET";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "SQL";

		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "Postman";

		// create question
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Dinh nghia ve Java";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion2;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2018, 7, 13);

		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Ly thuyet Java";
		question2.category = categoryQuestion1;
		question2.type = typeQuestion1;
		question2.creator = account1;
		question2.createDate = LocalDate.of(2018, 7, 13);

		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Dinh nghia ve .NET";
		question3.category = categoryQuestion2;
		question3.type = typeQuestion2;
		question3.creator = account1;
		question3.createDate = LocalDate.of(2018, 7, 13);

		Question question4 = new Question();
		question4.id = 4;
		question4.content = "Ly thuyet .NET";
		question4.category = categoryQuestion2;
		question4.type = typeQuestion1;
		question4.creator = account1;
		question4.createDate = LocalDate.of(2018, 7, 13);

		Question question5 = new Question();
		question5.id = 5;
		question5.content = "Dinh nghia ve SQL";
		question5.category = categoryQuestion2;
		question5.type = typeQuestion2;
		question5.creator = account2;
		question5.createDate = LocalDate.of(2018, 7, 13);

		Question question6 = new Question();
		question6.id = 6;
		question6.content = "Ly thuyet Postman";
		question6.category = categoryQuestion2;
		question6.type = typeQuestion1;
		question6.creator = account7;
		question6.createDate = LocalDate.of(2018, 7, 13);

		// create answer
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.content = "La 1 cai gi do";
		answer1.question = question1;
		answer1.isCorrect = true;

		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.content = "Khong biet";
		answer2.question = question1;
		answer2.isCorrect = false;

		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.content = "B";
		answer3.question = question2;
		answer3.isCorrect = true;

		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.content = "A";
		answer4.question = question2;
		answer4.isCorrect = false;

		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.content = "B";
		answer5.question = question2;
		answer5.isCorrect = true;

		Answer answer6 = new Answer();
		answer6.id = 6;
		answer6.content = "A";
		answer6.question = question3;
		answer6.isCorrect = false;

		Answer answer7 = new Answer();
		answer7.id = 7;
		answer7.content = "La 1 cai gi do";
		answer7.question = question3;
		answer7.isCorrect = false;

		Answer answer8 = new Answer();
		answer8.id = 8;
		answer8.content = "Khong biet";
		answer8.question = question3;
		answer8.isCorrect = false;

		Answer answer9 = new Answer();
		answer9.id = 9;
		answer9.content = "C";
		answer9.question = question4;
		answer9.isCorrect = false;

		Answer answer10 = new Answer();
		answer10.id = 10;
		answer10.content = "B";
		answer10.question = question4;
		answer10.isCorrect = true;

		Answer answer11 = new Answer();
		answer11.id = 11;
		answer11.content = "Khong biet";
		answer11.question = question5;
		answer11.isCorrect = false;

		Answer answer12 = new Answer();
		answer12.id = 12;
		answer12.content = "A";
		answer12.question = question6;
		answer12.isCorrect = false;

		Answer answer13 = new Answer();
		answer13.id = 13;
		answer13.content = "B";
		answer13.question = question6;
		answer13.isCorrect = false;

		// create exam
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = "A1";
		exam1.title = "Giua ky";
		exam1.category = categoryQuestion1;
		exam1.duration = 30;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2018, 7, 17);

		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = "A2";
		exam2.title = "Giua ky";
		exam2.category = categoryQuestion1;
		exam2.duration = 30;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2018, 7, 17);

		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = "A3";
		exam3.title = "Giua ky";
		exam3.category = categoryQuestion1;
		exam3.duration = 30;
		exam3.creator = account1;
		exam3.createDate = LocalDate.of(2018, 7, 17);

		Exam exam4 = new Exam();
		exam4.id = 4;
		exam4.code = "B1";
		exam4.title = "Cuoi ky";
		exam4.category = categoryQuestion2;
		exam4.duration = 90;
		exam4.creator = account2;
		exam4.createDate = LocalDate.of(2018, 7, 17);

		Exam exam5 = new Exam();
		exam5.id = 5;
		exam5.code = "B1";
		exam5.title = "Cuoi ky";
		exam5.category = categoryQuestion3;
		exam5.duration = 90;
		exam5.creator = account2;
		exam5.createDate = LocalDate.of(2018, 7, 17);

		Exam exam6 = new Exam();
		exam6.id = 6;
		exam6.code = "B1";
		exam6.title = "Cuoi ky";
		exam6.category = categoryQuestion4;
		exam6.duration = 90;
		exam6.creator = account2;
		exam6.createDate = LocalDate.of(2018, 7, 17);
		
		// foreign key
		Group[] groupsOfAccount1 = { group1, group3 };
		account1.groups = groupsOfAccount1;
		
		Group[] groupsOfAccount2 = { group2 };
		account2.groups = groupsOfAccount2;
		
		Group[] groupsOfAccount3 = { group3, group4 };
		account3.groups = groupsOfAccount3;
		
		Group[] groupsOfAccount4 = { group1, group4 };
		account4.groups = groupsOfAccount4;
		
		Group[] groupsOfAccount5 = { group1, group3 };
		account5.groups = groupsOfAccount5;
		
		Group[] groupsOfAccount6 = { group1 };
		account6.groups = groupsOfAccount6;
		
		Group[] groupsOfAccount7 = { group2, group3 };
		account7.groups = groupsOfAccount7;
		
		Account[] accountsOfGroup1 = { account1 };
		group1.accounts = accountsOfGroup1;
		
		Account[] accountsOfGroup2 = { account2, account7 };
		group2.accounts = accountsOfGroup2;
		
		Account[] accountsOfGroup3 = { account1, account6 };
		group3.accounts = accountsOfGroup3;
		
		Account[] accountsOfGroup4 = { account1, account2, account5 };
		group4.accounts = accountsOfGroup4;

		// print out
		System.out.println("Department 2: ");
		System.out.println("	ID: " + department2.id);
		System.out.println("	Name: " + department2.name);
		System.out.println("\n");

		System.out.println("Position 2: ");
		System.out.println("	ID: " + position2.id);
		System.out.println("	Name: " + position2.name);
		System.out.println("\n");

		System.out.println("Account 2: ");
		System.out.println("	ID: " + account2.id);
		System.out.println("	Email: " + account2.email);
		System.out.println("	UserName: " + account2.userName);
		System.out.println("	FullName: " + account2.fullName);
		System.out.println("	DepartmentName: " + account2.department.name);
		System.out.println("	PositionName: " + account2.position.name);
		System.out.println("	CreateDate: " + account2.createDate);
		System.out.println("	Groups: " + account2.groups);
		System.out.println("\n");

		System.out.println("Group 2: ");
		System.out.println("	ID: " + group2.id);
		System.out.println("	Name: " + group2.name);
		System.out.println("	CreatorName: " + group2.creator.userName);
		System.out.println("	CreateDate: " + group2.createDate);
		System.out.println("	Accounts: " + group2.accounts);
		System.out.println("\n");

		System.out.println("Type Question 2: ");
		System.out.println("	ID: " + typeQuestion2.id);
		System.out.println("	Name: " + typeQuestion2.name);
		System.out.println("\n");

		System.out.println("Category Question 2: ");
		System.out.println("	ID: " + categoryQuestion2.id);
		System.out.println("	Name: " + categoryQuestion2.name);
		System.out.println("\n");

		System.out.println("Question 2: ");
		System.out.println("	ID: " + question2.id);
		System.out.println("	Content: " + question2.content);
		System.out.println("	Category: " + question2.category.name);
		System.out.println("	Type: " + question2.type.name);
		System.out.println("	Creator: " + question2.creator.userName);
		System.out.println("	CreateDate: " + question2.createDate);
		System.out.println("\n");

		System.out.println("Answer 2: ");
		System.out.println("	ID: " + answer2.id);
		System.out.println("	Content: " + answer2.content);
		System.out.println("	Question: " + answer2.question.content);
		System.out.println("	Correct? " + answer2.isCorrect);
		System.out.println("\n");

		System.out.println("Exam 2: ");
		System.out.println("	ID: " + exam2.id);
		System.out.println("	Code: " + exam2.code);
		System.out.println("	Title: " + exam2.title);
		System.out.println("	Category: " + exam2.category.name);
		System.out.println("	Duration: " + exam2.duration);
		System.out.println("	Creator: " + exam2.creator.userName);
		System.out.println("	CreateDate: " + exam2.createDate);
		System.out.println("\n");

	}
}
