package racing;

public class GasolineCar extends car implements GasolineCarImpl {
	private double fuelCapacity;
	 private double mpg;

	 public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType,
	                    double fuelCapacity, double mpg) {
	     super(color, make, model, year, numDoors, transmissionType);
	     this.fuelCapacity = fuelCapacity;
	     this.mpg = mpg;
	 }
	 @Override
	 public void refuel() {
	     System.out.println("Refueling the gasoline car...");
	 }


	 @Override
	 public void displayInfo() {
	     super.displayInfo();
	     System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
	     System.out.println("Miles Per Gallon: " + mpg);
	 }


}
