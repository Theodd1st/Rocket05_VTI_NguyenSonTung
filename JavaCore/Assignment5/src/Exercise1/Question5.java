package Exercise1;

public class Question5 {

	public static void main(String[] args) {
		TuyenSinh dot1 = new TuyenSinh();
		dot1.addStudent(new StudentA("00001", "Tùng", "Hà Nội", 1));
		dot1.addStudent(new StudentA("00002", "Yến", "Hà Nội", 1));
		dot1.addStudent(new StudentB("00003", "Quang", "Thái Bình", 2));
		dot1.addStudent(new StudentC("00004", "Minh", "Hà Nội", 1));
		dot1.addStudent(new StudentC("00005", "Nam", "Lào Cai", 3));
		dot1.allInfo();
		dot1.searchStudent("00005");
	}

}
