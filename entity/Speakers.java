package by.htp.part03.block11.criteria.task01.entity;

//Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
public class Speakers extends Appliance{
	
	private int power_consumption;
	private int number_of_speakers;
	private String frequency_threshold;	
	private int cord_length;		
	
	public Speakers(String name, int power_consumption, int number_of_speakers,
			        String frequency_threshold, int cord_length) {
		super(name);
		this.power_consumption = power_consumption;
		this.number_of_speakers = number_of_speakers;
		this.frequency_threshold = frequency_threshold;		
		this.cord_length = cord_length;
	}
	
	public int getPower_consumption() {
		return power_consumption;
	}
	public void setPower_consumption(int power_consumption) {
		this.power_consumption = power_consumption;
	}
	public int getNumber_of_speakers() {
		return number_of_speakers;
	}
	public void setNumber_of_speakers(int number_of_speakers) {
		this.number_of_speakers = number_of_speakers;
	}
	
	public String getFfrequency_threshold() {
		return frequency_threshold;
	}
	public void setFfrequency_threshold(String frequency_threshold) {
		this.frequency_threshold = frequency_threshold;
	}
	
	public int getCord_length() {
		return cord_length;
	}
	public void setCord_length(int cord_length) {
		this.cord_length = cord_length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cord_length;	
		result = prime * result + frequency_threshold.hashCode();
		result = prime * result + number_of_speakers;
		result = prime * result + power_consumption;
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
		Speakers other = (Speakers) obj;
		if (this.getName() != other.getName()) {
			return false;
		}
		if (cord_length != other.cord_length) {
			return false;		
		}
		if (frequency_threshold != other.frequency_threshold) {
			return false;
	    }
		if (number_of_speakers != other.number_of_speakers) {
			return false;
		}
		if (power_consumption != other.power_consumption) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Speakers [name" + this.getName() + " power_consumption=" + power_consumption + ", number_of_speakers=" + number_of_speakers
				+ ", frequency_threshold=" + frequency_threshold +  ", cord_length=" + cord_length + "]";
	}
	
}
