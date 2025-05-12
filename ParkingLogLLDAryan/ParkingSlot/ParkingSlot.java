package ParkingSlot;
import Vehicle.Vehicle;
import Vehicle.VehicleType;

public abstract class ParkingSlot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private VehicleType spotType;

    public ParkingSlot(int spotNumber, VehicleType spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehicle(VehicleType vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupies");
        }

        if (canParkVehicle(vehicle.getVehicleType()) == false) {
            throw new IllegalArgumentException("This spot is not suitalbe for" + vehicle.getVehicleType());
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate(){
        if(isOccupied == false){
            return;
        }
        isOccupied = false;
    }

    public int getSpotNumber(){
        return spotNumber;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public VehicleType getSlotType(){
        return spotType;
    }
}
