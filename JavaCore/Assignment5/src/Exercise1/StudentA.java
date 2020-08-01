package Exercise1;

public class StudentA extends Student {
	private String khoi;
	
	public StudentA() {
		super();
		this.khoi = "A";
	}
	
	public StudentA(String sBD, String name, String address, int priority) {
		super(sBD, name, address, priority);
		this.khoi = "A";
	}

	@Override
	public String toString() {
		return super.toString() + " thi khối = " + khoi;
	}
}
