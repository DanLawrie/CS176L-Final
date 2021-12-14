package labproject.finals;

public class Truck extends Vehicle {
	int payloadCapacty;
	
	int towCapacity;
	public Truck(int towCapacity, int payloadCapacty, int seats, int topSpeed)
	{
		super(seats, topSpeed);
		this.towCapacity = towCapacity;
		this.payloadCapacty = payloadCapacty;
	}
	public int getPayloadCapacty() {
		return payloadCapacty;
	}
	public void setPayloadCapacty(int payloadCapacty) {
		this.payloadCapacty = payloadCapacty;
	}
	public int getTowCapacity() {
		return towCapacity;
	}
	public void setTowCapacity(int towCapacity) {
		this.towCapacity = towCapacity;
	}
	public String toString() {
		return "Seats: " + seats + ", Top Speed: " + topSpeed + ", Tow capacity: " + towCapacity + ", Pay load capacity: " + payloadCapacty;
	}

}
