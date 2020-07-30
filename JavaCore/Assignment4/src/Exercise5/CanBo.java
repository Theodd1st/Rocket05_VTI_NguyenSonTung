package Exercise5;

import java.util.Scanner;

public class CanBo {
	protected String name;
	protected int age;
	protected Sex sex;
	protected String address;

	public CanBo() {
	}

	public CanBo(String name, int age, Sex sex, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập họ tên: ");
		name = scanner.nextLine();

		System.out.println("Nhập tuổi: ");
		age = scanner.nextInt();

		System.out.println("Nhập giới tính (0:Nam, 1:Nữ, khác: Unknown): ");
		int x = scanner.nextInt();
		if (x == 0) {
			sex = Sex.NAM;
		} else if (x == 1) {
			sex = Sex.NỮ;
		} else {
			sex = Sex.KHÁC;
		}

		System.out.println("Nhập địa chỉ: ");
		address = scanner.nextLine();
	}
	
	public void info() {
		System.out.println(" Tên " + name);
		System.out.println(" Tuổi " + age);
		System.out.println(" Giới tính " + sex);
		System.out.println(" Địa chỉ " + address);
	}

}
