package Exercise2;

public abstract class Phone implements Weapon {
	public void answer() {
		System.out.println("Nghe điện thoại");
	}
	
	public void call() {
		System.out.println("Gọi điện thoại");
	}
	
	public void messOut() {
		System.out.println("Chuyển tin nhắn");
	}
	
	public void messIn() {
		System.out.println("Nhận tin nhắn");
	}
	
	public void attack() {
		System.out.println("Tấn công!");
	}
}
