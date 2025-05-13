import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;
    private List<Floor> floors;
    private SchedulingStrategy schedulingStrategy;

    public ElevatorController(int numberOfElevators, int numberOfFloors, SchedulingStrategy schedulingStrategy) {
        this.elevators = new ArrayList<>(numberOfElevators);
        this.floors = new ArrayList<>(numberOfFloors);
        this.schedulingStrategy = schedulingStrategy;

        for (int i = 1; i <= numberOfElevators; i++) {
            elevators.add(new Elevator(i));
        }

        for (int i = 1; i <= numberOfFloors; i++) {
            floors.add(new Floor(i));
        }
    }

    public void requestElevator(int elevatorId, int floor, Direction direction) {
        System.out.println("External request: Floor " + floor + " , Direction " + direction);

        Elevator selectedElevator = getElevatorById(elevatorId);

        if (selectedElevator != null) {
            selectedElevator.addRequest(new ElevatorRequest(elevatorId, floor, false, direction));
            System.out.println("Assigned elevator " + selectedElevator.getId() + " to floor " + floor);
        } else {
            System.out.println("No elevator availabelf or floor " + floor);
        }
    }

    public void requestFloor(int elevatorId, int floorNumber){
        Elevator elevator = getElevatorById(elevatorId);
        System.out.println("Internal request: Elevator " + elevator.getId() + " to floor " + floorNumber);

        Direction direction = floorNumber > elevator.getCurrentFloor() ? Direction.UP : Direction.DOWN;

        elevator.addRequest(new ElevatorRequest(elevatorId, floorNumber, true, direction));
    }

    private Elevator getElevatorById(int elevatorId) {
        for (Elevator elevator : elevators) {
            if(elevator.getId() == elevatorId) return elevator;
        }
        return null;
    }

    public void step(){
        for (Elevator elevator : elevators) {
            if(!elevator.getRequestsQueue().isEmpty()){
                int nextStop = schedulingStrategy.getNextStop(elevator);
                if(elevator.getCurrentFloor() != nextStop){
                    elevator.moveToNextStop(nextStop);
                }
            }
        }
    }

    public List<Elevator> getElevators(){
        return elevators;
    }

    public void setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }
}
