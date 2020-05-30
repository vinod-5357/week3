package week3.day1.assignment1;

public class CruiseShip extends CargoShip{

	public void maximumPassengers() {

		int PassengerCapcity=  3000;

		System.out.println("Maximum capacity of passenger in a ship :"+PassengerCapcity);
	}


	public void cruiseCategory() {

		String Category= "SeaDream Yacht Club";

		System.out.println("Crise category :"+Category);

	}



public static void main(String[]arg) {
	
	CruiseShip obj = new CruiseShip();
	
	obj.shipName();
	obj.cruiseCategory();
	obj.shipBuildYear();
	obj.maximumPassengers();
	obj.cruiseCategory();
	obj.cargoCapacityinTons();
	
	
}

}
