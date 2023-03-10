package excercise5a;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Cone extends Circle {
	private double height;

	Cone(double x, double y, double radius, double height) {
		super(x, y, radius);
		setHeight(height);
	}

	Cone(Point point, double radius, double height) {
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
		return super.area() + PI * getRadius() * slant();
	}

	public double volume() {
		return super.area() * height / 3;
	}

	public double slant() {
		return sqrt(height * height + getRadius() * getRadius());
	}

	public String toString() {
		return String.format("Cone centered in %s with height: %f", getCenter(), height);
	}

}
