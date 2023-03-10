package excercise5a;

import static java.lang.Math.PI;

public class Cylinder extends Circle {
	private double height;

	Cylinder(double x, double y, double radius, double height) {
		super(x, y, radius);
		setHeight(height);
	}

	Cylinder(Point point, double radius, double height) {
		super(point, radius);
		setHeight(height);
	}

	public double getHeight() {
		return height;
	}

	private void setHeight(double height) {
		if (height < 0)
			throw new IllegalArgumentException();
		this.height = height;
	}

	@Override
	public double area() {
		return 2 * super.area() + 2 * PI * getRadius() * height;
	}

	public double volume() {
		return super.area() * height;
	}

	public String toString() {
		return String.format("Cylinder centered in %s with height: %f", getCenter(), height);
	}

}
