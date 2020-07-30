package Exercise6;

public class Main {

	public static void main(String[] args) {
		// Question 1
		Phone phone1 = new VietnamesePhone();
		phone1.insertContact("Nguyễn Sơn Tùng", "0936352212");
		phone1.removeContact("Nguyễn Thanh Tú");
		phone1.updateContact("Nguyễn Hải Yến", "0902235520");
		phone1.searchContact("Nguyễn Sơn Tùng");
		
		// Question 2, 3
		User user1 = new Employee();
		user1.setName("Nguyễn Sơn Tùng");
		user1.setSalaryRatio(2.5);
		user1.displayInfo();
		User user2 = new Manager();
		user2.setName("Nguyễn Hải Yến");
		user2.setSalaryRatio(2.5);
		user2.displayInfo();
	}

}
