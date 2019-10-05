package by.htp.part03.block11.criteria.task01.entity;

//Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18
public class Laptop extends Appliance{

	private float batery;
	private String os;
	private int memory_rom;
	private int system_memory;
	private float cpu;
	private int display;
	
	public Laptop(String name, float batery, String os, int memory_rom, int system_memory, 
			      float cpu, int display) {
		super(name);
		this.batery = batery;
		this.os = os;
		this.memory_rom = memory_rom;
		this.system_memory = system_memory;
		this.cpu = cpu;
		this.display = display;
	}

	public float getBatery() {
		return batery;
	}

	public void setBatery(float batery) {
		this.batery = batery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getMemory_rom() {
		return memory_rom;
	}

	public void setMemory_rom(int memory_rom) {
		this.memory_rom = memory_rom;
	}

	public int getSystem_memory() {
		return system_memory;
	}

	public void setSystem_memory(int system_memory) {
		this.system_memory = system_memory;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public int getDisplay() {
		return display;
	}

	public void setDisplay(int display) {
		this.display = display;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(batery);
		result = prime * result + Float.floatToIntBits(cpu);
		result = prime * result + display;
		result = prime * result + memory_rom;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + system_memory;
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
		Laptop other = (Laptop) obj;
		if (this.getName() != other.getName()) {
			return false;
		}
		if (Float.floatToIntBits(batery) != Float.floatToIntBits(other.batery)) {	
			return false;
		}
		if (Float.floatToIntBits(cpu) != Float.floatToIntBits(other.cpu)) {
			return false;
		}
		if (display != other.display) {
			return false;
		}
		if (memory_rom != other.memory_rom) {
			return false;
		}
		if (os == null) {
			if (other.os != null) {
				return false;
			}
		} else if (!os.equals(other.os)) {
			return false;
		}
		if (system_memory != other.system_memory) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [name =" + this.getName() + " batery=" + batery + ", os=" + os + ", memory_rom="
	+ memory_rom + ", system_memory=" + system_memory + ", cpu=" + cpu + ", display=" + display + "]";
	}	
	
}
