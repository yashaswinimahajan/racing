package racing;

public class ElectricCar extends car implements ElectricCarImpl {
	
		 private double batteryCapacity;
		 private double range;

		 public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType,
		                    double batteryCapacity, double range) {
		     super(color, make, model, year, numDoors, transmissionType);
		     this.batteryCapacity = batteryCapacity;
		     this.range = range;
		 }
		 @Override
		 public void charge() {
		     System.out.println("Charging the electric car...");
		 }

		 @Override
		 public void displayInfo() {
		     super.displayInfo();
		     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
		     System.out.println("Range: " + range + " miles");
		 }
      }
