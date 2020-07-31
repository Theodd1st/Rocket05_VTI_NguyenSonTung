package Exercise6;

public class Main {

	public static void main(String[] args) {
		// Question 1
		Phone phone = new VietnamesePhone();
		phone.insertContact("Tùng", "0936352212");
		phone.insertContact("Yến", "0912385494");
		phone.insertContact("Tú", "0126389998");
		phone.removeContact("Tú");
		phone.updateContact("Yến", "0902235520");
		phone.searchContact("Yến");
		
		// Question 2, 3
//		User user1 = new Employee();
//		user1.setName("Nguyễn Sơn Tùng");
//		user1.setSalaryRatio(2.5);
//		user1.displayInfo();
//		User user2 = new Manager();
//		user2.setName("Nguyễn Hải Yến");
//		user2.setSalaryRatio(2.5);
//		user2.displayInfo();
	}

}
