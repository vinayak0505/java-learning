import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;
    private List<ElevatorObserver> observers;
    private Queue<ElevatorRequest> requests;

    public Elevator(int id){
        this.id = id;
    }

    public void addObserver(ElevatorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ElevatorObserver observer) {
        observers.remove(observer);
    }

    private void notifyStateChange(ElevatorState state) {
        for (ElevatorObserver observer : observers) {
            observer.onElevatorStateChange(this, state);
        }
    }

    private void notifyFloorChange(int floor) {
        for (ElevatorObserver observer : observers) {
            observer.onElevatorFloorChange(this, floor);
        }
    }

    public void addRequest(ElevatorRequest elevatorRequest) {
        if (!requests.contains(elevatorRequest)) {
            requests.add(elevatorRequest);
        }

        int requestFloor = elevatorRequest.getFloor();

        if (state == ElevatorState.IDLE && !requests.isEmpty()) {
            if (requestFloor > currentFloor) {
                direction = Direction.UP;
            } else if (requestFloor < currentFloor) {
                direction = Direction.DOWN;
            }
            setState(ElevatorState.MOVING);
        }
    }

    public void completedArrival() {
        setState(ElevatorState.STOPPED);

        requests.removeIf(request -> request.getFloor() == currentFloor);

        if (requests.isEmpty()) {
            direction = Direction.IDLE;
            setState(ElevatorState.IDLE);
        } else {
            setState(ElevatorState.MOVING);
        }
    }

    private void setState(ElevatorState state) {
        this.state = state;
        notifyStateChange(state);
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public ElevatorState getState() {
        return state;
    }

    public Queue<ElevatorRequest> getRequestsQueue() {
        return new LinkedList<>(requests);
    }

    public List<ElevatorRequest> getDestinationFloors() {
        return new ArrayList<>(requests);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void moveToNextStop(int nextStop) {
        if(currentFloor == nextStop){
            completedArrival();
            return;
        }
        if(currentFloor > nextStop){
            currentFloor--;
        }else{
            currentFloor++;
        }
        notifyFloorChange(currentFloor);
    }
}
