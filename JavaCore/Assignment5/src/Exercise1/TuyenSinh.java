package Exercise1;

import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh {

	private ArrayList<Student> stus;
	
	public TuyenSinh() {
		stus = new ArrayList<Student>();
	} 
	
	public void addStudent(Student newStu) {
		stus.add(newStu);
	}

	public void allInfo() {
		for (int i = 0; i < stus.size(); i++) {
			System.out.println(stus.get(i));
		}
	}

	public void searchStudent(String needSBD) {
		boolean isFound = false;
		for (int i = 0; i < stus.size(); i++) {
			if (stus.get(i).getsBD() == needSBD) {
				isFound = true;
				System.out.println(stus.get(i));
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy SBD " + needSBD + " trong danh sách");
		}
	}
}
