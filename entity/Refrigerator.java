package by.htp.part03.block11.criteria.task01.entity;

public class Refrigerator extends Appliance{
	
	private int power;
	private int weight;
	private int freezer_capacity;
	private float overall_capacity;
	private int height;
	private int width;
	
	public Refrigerator(String name, int power, int weight, int freezer_capacity, float overall_capacity,
			int height, int width) {
		super(name);
		this.power = power;
		this.weight = weight;
		this.freezer_capacity = freezer_capacity;
		this.overall_capacity = overall_capacity;
		this.height = height;
		this.width = width;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezer_capacity() {
		return freezer_capacity;
	}

	public void setFreezer_capacity(int freezer_capacity) {
		this.freezer_capacity = freezer_capacity;
	}

	public float getOverall_capacity() {
		return overall_capacity;
	}

	public void setOverall_capacity(float overall_capacity) {
		this.overall_capacity = overall_capacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + freezer_capacity;
		result = prime * result + height;
		result = prime * result + Float.floatToIntBits(overall_capacity);
		result = prime * result + power;
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Refrigerator other = (Refrigerator) obj;
		if (this.getName() != other.getName()) {
			return false;
		}
		if (freezer_capacity != other.freezer_capacity) {
			return false;
		}
		if (height != other.height) {
			return false;
		}
		if (Float.floatToIntBits(overall_capacity) != Float.floatToIntBits(other.overall_capacity)) {
			return false;
		}
		if (power != other.power) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [name=" + this.getName() + " power=" + power + ", weight=" + weight + ", freezer_capacity=" + freezer_capacity
				+ ", overall_capacity=" + overall_capacity + ", height=" + height + ", width=" + width + "]";
	}
	
}
