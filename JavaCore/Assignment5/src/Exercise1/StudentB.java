package Exercise1;

public class StudentB extends Student{
	private String khoi;
	
	public StudentB() {
		super();
		this.khoi = "B";
	}
	
	public StudentB(String sBD, String name, String address, int priority) {
		super(sBD, name, address, priority);
		this.khoi = "B";
	}

	@Override
	public String toString() {
		return super.toString() + " thi khối = " + khoi;
	}
}
