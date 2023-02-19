package excercise2;

public class Automobile {
	private String model;
	private int year;
	private int capacity;
	
	private static double taxBase;
	
	Automobile()
	{
		//this.model = null;
		//this.year = 0;
		//this.capacity = 0;
	}
	Automobile(String model, int year, int capacity)
	{
		this.model = model;
		this.year = year;
		this.capacity = capacity;
	}
	
	public String toString()
	{
		return String.format("%-25s%-15s%-10s\n", year,
				model, capacity);
	}
	
	public double calculateTax()
	{
		return taxBase * capacity / 10;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static double getTaxBase() {
		return taxBase;
	}

	public static void setTaxBase(double taxBase) {
		Automobile.taxBase = taxBase;
	}
	
	

}
