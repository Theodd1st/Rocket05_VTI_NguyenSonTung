package Exercise5;

public class CongNhan extends CanBo {
	private int rank = 1;

	public CongNhan() {
	}

	public CongNhan(String name, int age, Sex sex, String address, int rank) {
		super(name, age, sex, address);
		if (rank > 0 && rank <= 10) {
			this.rank = rank;
		} else {
			System.out.println(this.name + " bị nhập sai bậc rồi :3");
		}
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
