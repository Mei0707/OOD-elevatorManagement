enum Direction {
    UP,
    DOWN,
    NONE // For stationary state
}

public class ElevatorManagementSystem {
    public static void main(String[] args) {
        // Creating an elevator with a capacity of 10
        Elevator elevator = new Elevator(10);

        // Creating floors
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);

        // Simulating passenger requests
        Passenger passenger1 = new Passenger(1, 3); // Passenger wants to go from floor 1 to 3
        Passenger passenger2 = new Passenger(2, 1); // Passenger wants to go from floor 2 to 1

        // Adding passengers to elevator
        elevator.addPassenger(passenger1);
        elevator.addPassenger(passenger2);

        // Moving elevator
        elevator.moveUp();
        elevator.openDoors();
        elevator.closeDoors();
        elevator.moveUp();
        elevator.openDoors();

        // Simulating passenger leaving elevator
        elevator.removePassenger(passenger1);

        // Pressing buttons on floors
        floor2.pressUpButton();
        floor3.pressDownButton();
    }
}