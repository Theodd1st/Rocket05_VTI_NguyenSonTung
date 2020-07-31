package Exercise5;

public class Main {

	public static void main(String[] args) {
//		// Question 1
//		CanBo cn1 = new CongNhan("Nguyễn Xuân Công", 21, Sex.NAM, "Hà Nội", 2);
//		CanBo cn2 = new CongNhan("Nguyễn Đình Công", 22, Sex.NAM, "Hà Nội", 3);
//		CanBo ks1 = new KySu("Nguyễn Sơn Tùng", 21, Sex.NAM, "Hà Nội", "IT");
//		CanBo ks2 = new KySu("Nguyễn Hải Yến", 21, Sex.NỮ, "Hà Nội", "Luật");
//		CanBo nv1 = new NhanVien("Trần Văn Ninh", 23, Sex.KHÁC, "Ninh Bình", "Kiểm toán");
//		CanBo nv2 = new NhanVien("Trần Thanh Tú", 22, Sex.NỮ, "Ninh Thuận", "Biên dịch");
//		
		// Question 2
		QLCB manager = new QLCB();
		manager.addCanBo(new NhanVien("Lực", 16, Sex.KHÁC, "Ninh Bình", "Kiểm toán"));
		manager.addCanBo(new KySu("Tùng", 21, Sex.NAM, "Hà Nội", "IT"));
		manager.addCanBo(new KySu("Yến", 21, Sex.NỮ, "Hà Nội", "Luật"));
		
		manager.findCanBo("Quỳnh");
		
		manager.allInfo();
		
		manager.deleteCanbo("Lực");
		manager.allInfo();
//		// Question 3
//		HighSchoolStudent stu1 = new HighSchoolStudent("Nguyễn Sơn Tùng", 2, "12A8", "Đại học Xây Dựng");
//		System.out.println(stu1.toString());;
	}

}
