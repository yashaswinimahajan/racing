package racing;

public class RealMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle("Red", "Toyota", "Camry", 2022);
	     car car = new car("NavyBlue", "Kia", "Seltos", 2023, 4, "Automatic");
	     Vehicle electricCar = new ElectricCar("Blue", "Tesla", "Model S", 2022, 4, "Automatic", 100, 300);
	     Vehicle gasolineCar = new GasolineCar("Silver", "Chevrolet", "Cruze", 2019, 4, "Manual", 12, 35);
	     Vehicle truck = new Truck("Black", "Ford", "F-150", 2021, 6.5, 10000);
	     
	     System.out.println("\nVehicle Info:");
	     vehicle.displayInfo();
	     System.out.println("\nCar Info:");
	     car.displayInfo();
      System.out.println("\nElectric Car Info:");
	     electricCar.displayInfo();
	     System.out.println("\nGasoline Car Info:");
	     gasolineCar.displayInfo();
	    System.out.println("\nTruck Info:");
	     truck.displayInfo();
	
	((ElectricCar) electricCar).charge();
   ((GasolineCar) gasolineCar).refuel();
	
	}

}
