package Exercise4;

public class Main {

	public static void main(String[] args) {
//		// Question 1
//		Student stu = new Student("Pham Cong", "Ha Noi");
//		stu.setMark(-2);
//		System.out.println(stu.getMark());
//		stu.addMark(4);
//		System.out.println(stu.getMark());
//		stu.comment();
		
		// Question 2
			// Circle
		Circle cir1 = new Circle();
		Circle cir2 = new Circle(2);
		Circle cir3 = new Circle(3, "Yellow");
		
		System.out.println(cir1.toString());
		System.out.println(cir2.toString());
		System.out.println(cir3.toString());
			// Account
		Account acc1 = new Account("1", "Nguyễn Sơn Tùng", 5000000);
		Account acc2 = new Account("2", "Nguyễn Hải Yến", 1000000);
		
		acc1.tranferTo(acc2, 1000000);
		
			// Date
		Date date1 = new Date(22, 12, 2000);
		System.out.println(date1.toString());
	}

}
