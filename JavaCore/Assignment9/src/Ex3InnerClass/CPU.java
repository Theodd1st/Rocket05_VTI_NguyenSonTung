package Ex3InnerClass;

public class CPU {
	float price;
	
	public CPU(float price) {
		super();
		this.price = price;
	}

	public class Processor {
		String coreAmount;
		String menuFacturer;
		
		public float getCache() {
			return (float) 4.3;
		}
	}
	
	public class Ram {
		String memoru;
		String menuFacturer;
		
		public float getClockSpeed() {
			return (float) 5.5;
		}
	}

}
