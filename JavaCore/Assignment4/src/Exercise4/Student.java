package Exercise4;

// Question 1
public class Student {
	private int id;
	private String name;
	private String homeTown;
	private int mark;

	public Student(String name, String homeTown) {
		super();
		this.name = name;
		this.homeTown = homeTown;
		this.mark = 0;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark > 0 && mark < 10) {
			this.mark = mark;
		} else {
			System.out.println("Nhập sai điểm rồi :3");
		}
	}

	public void addMark(int plusMark) {
		this.mark += plusMark;
	}

	public void comment() {
		System.out.print("H�?c sinh ");
		if (this.mark < 4) {
			System.out.println("Yếu");
		} else if (4 <= this.mark && this.mark <= 6) {
			System.out.println("Trung bình");
		} else if (6 <= this.mark && this.mark <= 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Gi�?i");
		}
	}
}
