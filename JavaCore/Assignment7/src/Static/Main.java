package Static;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws ShapesException {
		ArrayList<Shapes> shapes = new ArrayList<Shapes>();
		shapes.add(new Rectangle());
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		if (shapes.size() > 5) {
			throw new ShapesException("Max shapes is " + Configs.max_shapes);
		} else {
			System.out.println(shapes.size());
		}
	}

}
