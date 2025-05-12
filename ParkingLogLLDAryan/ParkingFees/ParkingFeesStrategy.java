package ParkingFees;

import Vehicle.VehicleType;

public interface ParkingFeesStrategy {
    double calculateFee(VehicleType vehicleType, int duration, Durationtype durationtype);
}
