package labproject.finals;

public class Car extends Vehicle{
	String driveTrain;
	int doors;
	public Car(String driveTrain, int doors,int seats, int topSpeed) {
		super(seats, topSpeed);
		this.driveTrain = driveTrain;
		this.doors = doors;
	}
	public String toString() {
		return "Seats: " + seats + ", Top Speed: " + topSpeed + ", drive train: " + driveTrain + ", doors: " + doors;
	}
}
