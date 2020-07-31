package Exercise5;

import java.util.ArrayList;

public class QLCB {
	private ArrayList<CanBo> canBos;

	public QLCB() {
		canBos = new ArrayList<CanBo>();
	}

	public void addCanBo(CanBo canBo) {
		canBos.add(canBo);
	}

	public void findCanBo(String needName) {
		boolean isFound = false;
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i).getName() == needName) {
				isFound = true;
				System.out.println(canBos.get(i));
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + needName + " trong danh sách");
		}
	}

	public void allInfo() {
		for (int i = 0; i < canBos.size(); i++) {
			System.out.println(canBos.get(i));
		}
	}
	
	public void deleteCanbo(String needName) {
		boolean isFound = false;
		for (int i = 0; i < canBos.size(); i++) {
			if (canBos.get(i).getName() == needName) {
				isFound = true;
				canBos.remove(i);
				i--;
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + needName + " trong danh sách");
		}
	}
}
