public class Building {
    private String name;
    private int numberOfFloors;
    private ElevatorController elevatorController;

    public Building(String name, int numberOfFloors, int numberOfElevators){
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.elevatorController = new ElevatorController(numberOfElevators, numberOfFloors, new LookSchedulingStrategy());
    }

    public String getName(){
        return name;
    }

    public int getNumberOfFloors(){
        return numberOfFloors;
    }

    public ElevatorController getElevatorController(){
        return elevatorController;
    }
}
