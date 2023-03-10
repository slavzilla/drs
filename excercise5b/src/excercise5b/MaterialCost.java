package excercise5b;

public class MaterialCost implements Expense {
	private String description;
	private float quantity;
	private float unitPrice;

	public MaterialCost(String description, float quantity, float unitPrice) {
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public float amount() {
		return quantity * unitPrice;
	}

	@Override
	public String expenseType() {
		return "Materijalni troskovi";
	}

	@Override
	public String expensePurpose() {
		return description;
	}
}
