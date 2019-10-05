package by.htp.part03.block11.criteria.task01.entity;

//TabletPC : BATTERY_CAPACITY=5, DISPLAY_INCHES=16, MEMORY_ROM=16000, FLASH_MEMORY_CAPACITY=8, COLOR=green
public class TabletPC extends Appliance{
	
	private int battery;
	private int inches;
	private int memory;
	private int flash_memory;
	private String color;	
	
	public TabletPC(String name, int battery, int inches, int memory, int flash_memory, String color) {
		super(name);
		this.battery = battery;
		this.inches = inches;
		this.memory = memory;
		this.flash_memory = flash_memory;
		this.color = color;
	}
	
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getFlash_memory() {
		return flash_memory;
	}
	public void setFlash_memory(int flash_memory) {
		this.flash_memory = flash_memory;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + battery;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + flash_memory;
		result = prime * result + inches;
		result = prime * result + memory;
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
		TabletPC other = (TabletPC) obj;
		if (this.getName() == null) {
			if (other.getName() != null) {
				return false;
			} else if (!getName().contentEquals(other.getName())) {
				return false;
			}	
		}
		if (battery != other.battery)
			return false;
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		if (flash_memory != other.flash_memory) {
			return false;
		}
		if (inches != other.inches) {
			return false;
		}
		if (memory != other.memory) {
			return false;
		}
		return true;
	}			
			
	@Override
	public String toString() {
		return "TabletPC [Name=" + getName() + " battery=" + battery + ", inches=" + inches +
				", memory=" + memory + ", flash_memory=" + flash_memory + ", color=" + color + "]";
	}
	
}
