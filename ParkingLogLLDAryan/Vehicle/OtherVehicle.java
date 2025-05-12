package Vehicle;

import ParkingFees.ParkingFeesStrategy;

public class OtherVehicle extends Vehicle {

    public OtherVehicle(String licensePlate, ParkingFeesStrategy feesStrategy) {
        super(licensePlate, VehicleType.OTHER, feesStrategy);
    }
    
}
