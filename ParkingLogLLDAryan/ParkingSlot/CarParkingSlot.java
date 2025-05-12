package ParkingSlot;

import Vehicle.VehicleType;

public class CarParkingSlot extends ParkingSlot {

    public CarParkingSlot(int spotNumber) {
        super(spotNumber, VehicleType.CAR);
    }

    @Override
    public boolean canParkVehicle(VehicleType vehicleType) {
        return this.getSlotType() == vehicleType;
    }
}
