package Exercise6;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
	
	public VietnamesePhone() {
		contacts = new ArrayList<Contact>();
	}

	@Override
	public void insertContact(String name, String phone) {
		contacts.add(new Contact(name, phone));
		System.out.println("Thêm thành công!");
	}

	@Override
	public void removeContact(String removeName) {
		boolean isFound = false;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).name.equals(removeName)) {
				isFound = true;
				contacts.remove(i);
				i--;
				System.out.println("Xóa thành công!");
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + removeName + " trong danh bạ");
		}
	}

	@Override
	public void updateContact(String name, String newPhone) {
		boolean isFound = false;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).name.equals(name)) {
				isFound = true;
				contacts.get(i).setName(name);
				contacts.get(i).setPhone(newPhone);
				System.out.println("Cập nhật thành công!");
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + name + " trong danh bạ");
		}
	}

	@Override
	public void searchContact(String searchName) {
		boolean isFound = false;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).name.equals(searchName)) {
				isFound = true;
				System.out.println(contacts.get(i).toString());
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + searchName + " trong danh bạ");
		}
	}
}
