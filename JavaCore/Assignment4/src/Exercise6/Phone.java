package Exercise6;

import java.util.ArrayList;

public abstract class Phone {

	ArrayList<Contact> contacts = null;

	public Phone() {
	}

	public abstract void insertContact(String name, String phone);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, String newPhone);

	public abstract void searchContact(String name);
}
