package by.htp.part03.block11.criteria.task01.entity;

//Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70;
public class Oven extends Appliance{
	
	private int power;
	private int weight;
	private int capacity;
	private int depth;
	private int height;
	private int width;
	
	public Oven(String name, int power, int weight, int capacity, int depth, int height, int width) {
		super(name);
		this.power = power;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
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
		result = prime * result + capacity;
		result = prime * result + depth;
		result = prime * result + height;
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
		Oven other = (Oven) obj;
		if (this.getName() != other.getName()) {
			return false;
		}
		if (capacity != other.capacity) {
			return false;
		}
		if (depth != other.depth) {
			return false;
		}
		if (height != other.height) {
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
		return "Oven [name=" + this.getName() + " power=" + power + ", weight=" + weight + ", capacity="
	            + capacity + ", depth=" + depth	+ ", height=" + height + ", width=" + width + "]";
	}
	
}
