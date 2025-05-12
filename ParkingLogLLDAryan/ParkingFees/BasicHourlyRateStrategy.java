package ParkingFees;

import Vehicle.VehicleType;

public class BasicHourlyRateStrategy implements ParkingFeesStrategy {

    @Override
    public double calculateFee(VehicleType vehicleType, int duration, Durationtype durationType) {
        switch (vehicleType) {
            case AUTO:
                return durationType == Durationtype.HOURS ? duration * 8 : duration * 9 * 24;
            case BIKE:
                return durationType == Durationtype.HOURS ? duration * 5 : duration * 5 * 24;
            case CAR:
                return durationType == Durationtype.HOURS ? duration * 10 : duration * 10 * 24;
        }
        return durationType == Durationtype.HOURS ? duration * 15 : duration * 15 * 24;
    }

}
