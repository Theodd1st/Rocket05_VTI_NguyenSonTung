package Ex3InnerClass;

public class Car {
	String name;
	String type;

	public Car(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public class Engine {
		String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
	}
}
