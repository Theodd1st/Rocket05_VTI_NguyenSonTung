package Ex2Annotations;

import java.util.Date;

public class Q1Main {

	public static void main(String[] args) {
		System.out.println(getsomeDate());
	}

	@SuppressWarnings("deprecation")
	public static Date getsomeDate() {
		Date date = new Date(2020, 5, 18);
		return date;
	}

}
