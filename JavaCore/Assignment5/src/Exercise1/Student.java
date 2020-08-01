package Exercise1;

public abstract class Student {
	String sBD;
	String name;
	String address;
	int priority;
	
	public Student() {
	}

	public Student(String sBD, String name, String address, int priority) {
		this.sBD = sBD;
		this.name = name;
		this.address = address;
		this.priority = priority;
	}

	public String getsBD() {
		return sBD;
	}

	public void setsBD(String sBD) {
		this.sBD = sBD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student có SBD = " + sBD + " tên = " + name + " mức ưu tiên = " + priority;
	}
	
}
