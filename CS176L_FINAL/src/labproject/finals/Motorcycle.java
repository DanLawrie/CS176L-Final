package labproject.finals;

public class Motorcycle extends Vehicle{
	
	boolean hasWindShield;
	
	public Motorcycle(boolean hasWindShield,int seats, int topSpeed) {
		super(seats, topSpeed);
		this.hasWindShield = hasWindShield;
		
	}
	
	
	public boolean isHasWindShield() {
		return hasWindShield;
	}
	public void setHasWindShield(boolean hasWindShield) {
		this.hasWindShield = hasWindShield;
	}
	public String toString() {
		return "Seats: " + seats + ", Top Speed: " + topSpeed + ", Has wind shield: " + hasWindShield;
	}
	
}
