package by.htp.part03.block11.criteria.task01.entity;

public class Appliance {
	
	private String name;
	
	public Appliance (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result = result * prime + ((name == null) ? 0 : name.hashCode());
		return result; 
	}

	public boolean equalsl(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Appliance appliance = (Appliance)obj;
		if (this.name == null) {
			if (appliance.name != null) {
				return false;
			} else if (!name.contentEquals(appliance.name)) {
				return false;
			}
 		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Appliance [name=" + name + "]";
	}
	
}
