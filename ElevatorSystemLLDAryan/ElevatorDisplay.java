public class ElevatorDisplay implements ElevatorObserver{

    @Override
    public void onElevatorStateChange(Elevator elevator, ElevatorState state){
        System.out.println("Elevator " + elevator.getId() + " state change to " + state);
    }

    @Override
    public void onElevatorFloorChange(Elevator elevator, int floor){
        System.out.println("Elevator " + elevator.getId() + " move to floor " + floor);
    }
}
