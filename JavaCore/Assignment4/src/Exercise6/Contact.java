package Exercise6;

public class Contact {
	String phone;
	String name;

	public Contact(String name, String phone) {
		super();
		this.phone = phone;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", name=" + name + "]";
	}

}
