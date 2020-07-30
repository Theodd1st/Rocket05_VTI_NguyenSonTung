package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private ArrayList<CanBo> canBos;

	public QLCB() {
		canBos = new ArrayList<>();
	}

	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào kiểu cán bộ");
		System.out.println("1: Công nhân  2: Kỹ sư  3: Nhân viên");
		int x = scanner.nextInt();
		CanBo canbo = new CanBo();
		switch (x) {
		case 1:
			canbo = new CongNhan();
			break;
		case 2:
			canbo = new KySu();
			break;
		case 3:
			canbo = new NhanVien();
			break;
		default:
			System.out.println("Bạn đã nhập sai");
			break;
		}
		canbo.input();
		canBos.add(canbo);
	}

	public void findCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên người cần tìm: ");
		String needName = scanner.nextLine();
		for (CanBo canBo : canBos) {
			if (canBo.name.equals(needName)) {
				canBo.info();
			}
		}
	}

	public void allInfo() {
		for (CanBo canBo : canBos) {
			canBo.info();
		}
	}
	
	public void deleteCanbo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên người cần tìm: ");
		String needName = scanner.nextLine();
		canBos.removeIf(canBo -> needName.equals(canBo.getName()));
	}
}
