package Exercise5;

public class KySu extends CanBo {
	private String branch;

	public KySu() {
	}

	public KySu(String name, int age, Sex sex, String address, String branch) {
		super(name, age, sex, address);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String toString() {
		return super.toString() + " " + branch;
	}
}
