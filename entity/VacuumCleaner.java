package by.htp.part03.block11.criteria.task01.entity;

//VacuumCleaner : POWER_CONSUMPTION=90, FILTER_TYPE=C, BAG_TYPE=XX00, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2950, CLEANING_WIDTH=30
public class VacuumCleaner extends Appliance{
    private int power;
    private String filter;
    private String bag_type;
    private String wand_type;
    private int speed;
    private int width;
    
	public VacuumCleaner(String name, int power, String filter, String bag_type, String wand_type, 
			int speed, int width) {
		
		super(name);
		this.power = power;
		this.filter = filter;
		this.bag_type = bag_type;
		this.wand_type = wand_type;
		this.speed = speed;
		this.width = width;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getBag_type() {
		return bag_type;
	}

	public void setBag_type(String bag_type) {
		this.bag_type = bag_type;
	}

	public String getWand_type() {
		return wand_type;
	}

	public void setWand_type(String wand_type) {
		this.wand_type = wand_type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		result = prime * result + ((bag_type == null) ? 0 : bag_type.hashCode());
		result = prime * result + ((filter == null) ? 0 : filter.hashCode());
		result = prime * result + power;
		result = prime * result + speed;
		result = prime * result + ((wand_type == null) ? 0 : wand_type.hashCode());
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;		
		if (this.getName() == null) {
			if (other.getName() != null) {
				return false;
			} else if (!getName().contentEquals(other.getName())) {
				return false;
			}
		}
		if (bag_type == null) {
			if (other.bag_type != null) {
				return false;
			}
		} else if (!bag_type.equals(other.bag_type)) {
			return false;
		}
		if (filter == null) {
			if (other.filter != null) {
				return false;
			}
		} else if (!filter.equals(other.filter)) {
			return false;
		}
		if (power != other.power) {
			return false;
		}
		if (speed != other.speed) {
			return false;
		}
		if (wand_type == null) {
			if (other.wand_type != null) {
				return false;
			}
		} else if (!wand_type.equals(other.wand_type)) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [name" + getName() +" power=" + power + ", filter=" + filter +
		", bag_type=" + bag_type + ", wand_type=" + wand_type + ", speed=" + speed + ", width=" + width + "]";
	}	

}
