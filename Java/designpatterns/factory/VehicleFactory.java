package designpatterns.factory;

public class VehicleFactory {

	Vehicle getVehicle(String vehicleType) {
		if (vehicleType == null)
			return null;
		if (vehicleType.equalsIgnoreCase("Audi"))
			return new AudiQ2();
		if (vehicleType.equalsIgnoreCase("Golf"))
			return new GolfGTI();
		if (vehicleType.equalsIgnoreCase("Polo"))
			return new VWPolo();
		
		return null;
	}
}
