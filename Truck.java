package racing;

public class Truck extends Vehicle {
	private double bedSize;
	 private int towingCapacity;
	

	 public Truck(String color, String make, String model, int year, double bedSize, int towingCapacity) {
	     super( color, make, model, year);
	     this.bedSize = bedSize;
	     this.towingCapacity = towingCapacity;
	 }
        public double getBedSize() {
		return bedSize;
	}
        public void setBedSize(double bedSize) {
		this.bedSize = bedSize;
	}
        public int getTowingCapacity() {
		return towingCapacity;
	}
        public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
     @Override
	 public void displayInfo() {
	     super.displayInfo();
	     System.out.println("Bed Size: " + bedSize + " feet");
	     System.out.println("Towing Capacity: " + towingCapacity + " lbs");
	 }


}
