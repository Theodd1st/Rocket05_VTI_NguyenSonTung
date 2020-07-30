package Exercise4;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void credit(int amount) {

	}

	public void debit(int amount) {

	}

	public void tranferTo(Account account, int amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			account.balance += amount;
			System.out.println("Chuyển tiền thành công!");
		} else {
			System.out.println("Không đủ tiền để thực hiện giao dịch này!");
		}
	}
}
