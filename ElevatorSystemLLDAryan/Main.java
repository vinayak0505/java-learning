import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Building building = new Building("Office Tower", 10, 3);
        ElevatorController controller = building.getElevatorController();

        ElevatorDisplay display = new ElevatorDisplay();
        for (Elevator elevator : controller.getElevators()) {
            elevator.addObserver(display);
        }

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Elevator System Simulation");
        System.out.println("Building: " + building.getName());
        System.out.println("Floors " + building.getNumberOfFloors());

        while (running) {
            System.out.println("\nSelect an options:");
            System.out.println("1. Rqeust elevator (external)");
            System.out.println("2. Request elevator (internal)");
            System.out.println("3. Simulate next step");
            System.out.println("4. Chagne scheduling startegy");
            System.out.println("5. Exit simulation");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter floor number: ");
                    int floorNum = scanner.nextInt();
                    System.out.print("Direction (1 for UP, 2 for DOWN): ");
                    int dirChoice = scanner.nextInt();
                    Direction dir = dirChoice == 1 ? Direction.UP : Direction.DOWN;
                    controller.requestElevator(floorNum, floorNum, dir);
                    break;

                case 2:
                    System.out.print("Enter elevator Id: ");
                    int elevatorId = scanner.nextInt();
                    System.out.print("Enter destination floor: ");
                    int destFloor = scanner.nextInt();
                    controller.requestFloor(elevatorId, destFloor);
                    break;
                case 3:
                    System.out.println("Simulating next step...");
                    controller.step();
                    displayElevatorStatus(controller.getElevators());
                case 4:
                    System.out.println("Select strategy: ");
                    System.out.println("1. SCAN Algorithm");
                    System.out.println("2. FCFS Algorithm");
                    System.out.println("3. Look Algorithm");

                    int strategyChoice = scanner.nextInt();
                    if (strategyChoice == 1) {
                        controller.setSchedulingStrategy(new ScanSchedulingStrategy());
                    } else if (strategyChoice == 2) {
                        controller.setSchedulingStrategy(new FCFSSchedulingStrategy());
                    } else {
                        controller.setSchedulingStrategy(new LookSchedulingStrategy());
                    }
                case 5:
                    running = false;
                    break;
                default:
                    System.err.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
        System.out.println("Simulation ended");
    }

    private static void displayElevatorStatus(List<Elevator> elevators) {
        System.out.println("\nElevator Status:");

        for (Elevator elevator : elevators) {
            System.out.println("Elevator " + elevator.getId() +
                    ": Floor " + elevator.getCurrentFloor() +
                    ", Direction " + elevator.getDirection() +
                    ", State " + elevator.getState() +
                    ", Destinations " + elevator.getDestinationFloors());
        }
    }
}