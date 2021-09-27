package entity;

public class MethodExample {

	public static void main(String[] args) {
		tinhTong(2, 3);
		System.out.println("Đây là tích cần tìm: " + tinhTich(2, 5));
	}
	
	public static void tinhTong(int a, int b) {
		int c = a + b;
		System.out.printf("Tổng của %d và %d là: %d \n", a, b, c);
	}
	
	public static int tinhTich(int a, int b) {
		int c = a * b;
		return c;
	}

}
