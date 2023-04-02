package jun.shape;

import jun.shape.Shape.Circle;
import jun.shape.Shape.Rectangle;

public class ShapeRun {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println(rec.areaCalculate());
		Circle cir = new Circle();
		System.out.println(cir.areaCalculate());
	}

}
