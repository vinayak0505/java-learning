package Vehicle;

import ParkingFees.ParkingFeesStrategy;

public class CarVehicle extends Vehicle{
    public CarVehicle(String licensePlate, ParkingFeesStrategy feesStrategy){
        super(licensePlate, VehicleType.CAR, feesStrategy);
    }
}
