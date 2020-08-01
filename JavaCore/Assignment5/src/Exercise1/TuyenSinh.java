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

	public void searchStudent(String needName) {
		boolean isFound = false;
		for (int i = 0; i < stus.size(); i++) {
			if (stus.get(i).getName() == needName) {
				isFound = true;
				System.out.println(stus.get(i));
			}
		}
		if(!isFound) {
			System.out.println("Không tìm thấy " + needName + " trong danh sách");
		}
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudent() {
		// TODO Auto-generated method stub
		
	}
	
}
