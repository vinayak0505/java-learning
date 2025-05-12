import java.util.List;

import ParkingSlot.ParkingSlot;
import Vehicle.Vehicle;

public class ParkingLot {
    private List<ParkingSlot> slots;

    public ParkingLot(List<ParkingSlot> parkingSlots) {
        this.slots = parkingSlots;
    }

    public ParkingSlot findAailableSpot(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isOccupied() == false && slot.canParkVehicle(vehicle.getVehicleType())) {
                return slot;
            }
        }
        return null;
    }

    public ParkingSlot parkVehicle(Vehicle vehicle) {
        ParkingSlot slot = findAailableSpot(vehicle);
        if(slot == null){
            System.err.println("No parking spot avaiable");
            return null;
        }

        slot.parkVehicle(vehicle);
        System.out.println("Parked vehicle successfully");
        return slot;
    }

    public void vacateSpot(ParkingSlot  slot, Vehicle vehicle){
        if(slot != null && slot.isOccupied() && slot.getVehicle().equals(vehicle)){
            slot.vacate();
            System.err.println(vehicle.getVehicleType() + " vacated this spot: " + slot.getSpotNumber());
        }else{
            System.out.println("Invalid operations! Either the spot is alread vacant");
        }
    }

    public ParkingSlot getSpotByNumber(int spotNumber){
        for(ParkingSlot slot: slots){
            if(slot.getSpotNumber() == spotNumber){
                return slot;
            }
        }
        return null;
    }
}
