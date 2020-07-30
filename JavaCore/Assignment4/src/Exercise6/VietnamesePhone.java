package Exercise6;

public class VietnamesePhone extends Phone {
		
	@Override
	public void insertContact(String name, String phone) {
		System.out.println("Thêm vào contact " + name + " có sđt là " + phone);
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Xóa đi contact " + name);
	}

	@Override
	public void updateContact(String name, String newPhone) {
		System.out.println("Cập nhật contact " + name + " có sđt mới là " + newPhone);
	}

	@Override
	public void searchContact(String name) {
		System.out.println("Tìm kiếm contact " + name);
	}
}
