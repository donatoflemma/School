package designpatterns.factory;

//Erzeugungsmuster
public class FactoryTest {

	public static void main(String[] args) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		//get a GolfGTI object
		Vehicle v1 = vehicleFactory.getVehicle("Golf");
		v1.showInfo();
		
		//get a Audi Q2 object
		Vehicle v2 = vehicleFactory.getVehicle("Audi");
		v2.showInfo();
				
		//get a VW Polo object
		Vehicle v3 = vehicleFactory.getVehicle("Polo");
		v3.showInfo();
	}

}
