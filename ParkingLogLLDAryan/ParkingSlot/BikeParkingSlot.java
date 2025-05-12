package ParkingSlot;

import Vehicle.VehicleType;

public class BikeParkingSlot extends ParkingSlot{

    public BikeParkingSlot(int spotNumber) {
        super(spotNumber, VehicleType.BIKE);
    }

    @Override
    public boolean canParkVehicle(VehicleType vehicleType) {
        return vehicleType == this.getSlotType();
    }
    
}
