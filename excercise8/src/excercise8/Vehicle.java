package excercise8;

public class Vehicle {
	private String brand;
	private String model;
	private int productionYear;
	private int capacity;
	private double mileage;
	private int price;

	public Vehicle(String brand, String model, int productionYear, int capacity, double mileage, int price) {
		this.brand = brand;
		this.model = model;
		setProductionYear(productionYear);
		setCapacity(capacity);
		setMileage(mileage);
		setPrice(price);
	}

	public Vehicle(String[] args) throws IndexOutOfBoundsException {
		this(args[0], args[1], Integer.parseInt(args[2]), Integer.parseInt(args[3]), Double.parseDouble(args[4]),
				Integer.parseInt(args[5]));
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		if (productionYear < 1950 || productionYear > 2023)
			throw new IllegalArgumentException("Production year must be within the 1950-2023 range.");
		this.productionYear = productionYear;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Capacity must be a positive value.");
		this.capacity = capacity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		if (mileage < 0)
			throw new IllegalArgumentException("Mileage must be a positive value.");
		this.mileage = mileage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0)
			throw new IllegalArgumentException("Price must be a positive value.");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", productionYear=" + productionYear + ", capacity="
				+ capacity + ", mileage=" + mileage + ", price=" + price + "]";
	}

}
