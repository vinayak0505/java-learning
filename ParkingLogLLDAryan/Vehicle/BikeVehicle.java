package Vehicle;

import ParkingFees.ParkingFeesStrategy;

public class BikeVehicle extends Vehicle{

    public BikeVehicle(String licensePlate, ParkingFeesStrategy feesStrategy) {
        super(licensePlate, VehicleType.BIKE, feesStrategy);
    }
    
}
