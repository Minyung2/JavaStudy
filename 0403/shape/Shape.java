package jun.shape;

//	4.다음 코드에서, 인터페이스를 이용하여 Shape 인터페이스를 만들고, 이를 구현하는 Rectangle 클래스와 Circle 클래스를 만들어보세요.

// 여기에 Shape 인터페이스를 작성해보세요.
public interface Shape {

	public abstract double areaCalculate();

	public class Rectangle implements Shape {
		@Override
		public double areaCalculate() {
			double width = 3;
			double height = 7;
			return width*height;
		}
	
	}

	public class Circle implements Shape {
		@Override
		public double areaCalculate() {
			final double PI=3.14;
			double radius = 3.5;
			return Math.pow(radius, 2)*PI;
		}
	}
}
