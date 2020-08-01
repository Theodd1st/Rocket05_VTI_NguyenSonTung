package Exercise1;

public class StudentC extends Student{
	private String khoi;

	public StudentC() {
		super();
		this.khoi = "C";
	}
	
	public StudentC(String sBD, String name, String address, int priority) {
		super(sBD, name, address, priority);
		this.khoi = "C";
	}

	@Override
	public String toString() {
		return super.toString() + " thi khối = " + khoi;
	}
}
