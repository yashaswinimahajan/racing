package racing;

public class car extends Vehicle {
	private int numDoors;
	 private String transmissionType;
	 
 public car(String color, String make, String model, int year, int numDoors, String transmissionType) {
		super(color, make, model, year);
		this.numDoors = numDoors;
	     this.transmissionType = transmissionType;
	 }

	  public int getNumDoors() {
	return numDoors;
}

public void setNumDoors(int numDoors) {
	this.numDoors = numDoors;
}

public String getTransmissionType() {
	return transmissionType;
}

public void setTransmissionType(String transmissionType) {
	this.transmissionType = transmissionType;
}

	@Override
	 public void displayInfo() {
	     super.displayInfo();
	     System.out.println("Number of Doors: " + numDoors);
	     System.out.println("Transmission Type: " + transmissionType);

		
	}

}
