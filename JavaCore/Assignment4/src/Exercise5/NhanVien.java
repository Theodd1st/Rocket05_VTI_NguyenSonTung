package Exercise5;

public class NhanVien extends CanBo {
	private String job;

	public NhanVien() {
	}

	public NhanVien(String name, int age, Sex sex, String address, String job) {
		super(name, age, sex, address);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
