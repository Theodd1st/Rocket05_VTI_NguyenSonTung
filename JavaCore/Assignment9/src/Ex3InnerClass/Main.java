package Ex3InnerClass;

public class Main {

	public static void main(String[] args) {
		// Question 1
		CPU cpu = new CPU((float) 3.5);
		CPU.Processor proc = cpu.new Processor();
		CPU.Ram ram =cpu.new Ram();
		System.out.println(proc.getCache());
		System.out.println(ram.getClockSpeed());
		
		// Question 2
		Car car = new Car("Mazda", "8WD");
		Car.Engine engi = car.new Engine();
		engi.setEngineType("Crysler");
		System.out.println("Tên car: " + car.name);
		System.out.println("Loại car: " + car.type);
		System.out.println("Loại động cơ: " + engi.engineType);
	}

}
