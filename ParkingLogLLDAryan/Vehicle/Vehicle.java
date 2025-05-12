package Vehicle;

import ParkingFees.Durationtype;
import ParkingFees.ParkingFeesStrategy;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType type;

    private ParkingFeesStrategy feesStrategy;

    public Vehicle(String licensePlate, VehicleType vehicleType, ParkingFeesStrategy feesStrategy){
        this.licensePlate = licensePlate;
        this.type = vehicleType;
        this.feesStrategy = feesStrategy;
    }

    public VehicleType getVehicleType(){
        return type;
    }

    public double calculateFee(int hours){
        return feesStrategy.calculateFee(type, hours,Durationtype.HOURS );
    }
}
