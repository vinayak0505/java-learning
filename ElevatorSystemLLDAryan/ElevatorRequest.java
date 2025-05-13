
public class ElevatorRequest implements ElevatorCommand {
    private int elevatorId;
    private int floor;
    private Direction requestDirection;
    private ElevatorController controller;
    private boolean isInternalRequest;

    public ElevatorRequest(int elevatorId, int floor, boolean isInternalRequest, Direction direction){
        this.elevatorId = elevatorId;
        this.floor = floor;
        this.isInternalRequest = isInternalRequest;
        this.requestDirection = direction;
        // this.controller = new ElevatorController(new FCFSSchedulingStrategy());
    }

    @Override
    public void execute() {
        if(isInternalRequest) controller.requestFloor(elevatorId, floor);
        else controller.requestElevator(elevatorId, floor, requestDirection);
    }

    public Direction getDirection(){
        return requestDirection;
    }
    public int getFloor(){
        return floor;
    }

    public boolean isInternalRequest(){
        return isInternalRequest;
    }

}
