package excercise5a;

public class Application {

	public static void main(String[] args) {
		try {
			Circle circles[] = new Circle[6];
			circles[0] = new Circle(0, 0, 5);
			circles[1] = new Circle(new Point(-1, 3), 0.8);
			circles[2] = new Cylinder(1, 1, 3, -8);
			circles[3] = new Cylinder(-5, 6, 2, 1.8);
			circles[4] = new Cone(1.33, 2.9, 4, 6);
			circles[5] = new Cone(-0.13, 12.4, 2, 1);

			for (int i = 0; i < circles.length; i++) {
				if (circles[i] instanceof Cylinder) {
					System.out.println(((Cylinder) circles[i]).volume());
				}
				if (circles[i] instanceof Cone) {
					System.out.println(((Cone) circles[i]).volume());
				}
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
