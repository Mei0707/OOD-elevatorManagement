import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int currentFloor;
    private int capacity;
    private boolean moving;
    private Direction direction;
    private List<Passenger> passengers;
    private List<Integer> requestedFloors;

    public Elevator(int capacity) {
        this.capacity = capacity;
        this.currentFloor = 1; // Start from ground floor
        this.moving = false;
        this.direction = Direction.NONE;
        this.passengers = new ArrayList<>();
        this.requestedFloors = new ArrayList<>();
    }

    public void moveUp() {
        if (moving) {
            this.currentFloor++;
            System.out.println("Elevator moving up to floor " + this.currentFloor);
            checkAndHandleRequests();
        }
    }

    public void moveDown() {
        if (moving) {
            this.currentFloor--;
            System.out.println("Elevator moving down to floor " + this.currentFloor);
            checkAndHandleRequests();
        }
    }

    public void openDoors() {
        System.out.println("Elevator doors opening at floor " + this.currentFloor);
        // Handle passenger exits and new requests
        handlePassengers();
    }

    public void closeDoors() {
        System.out.println("Elevator doors closing at floor " + this.currentFloor);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            requestedFloors.add(passenger.getDestinationFloor());
            System.out.println("Passenger added to elevator at floor " + this.currentFloor);
        } else {
            System.out.println("Elevator is full. Cannot add more passengers.");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
        System.out.println("Passenger removed from elevator at floor " + this.currentFloor);
    }

    public void requestElevator(int floorNumber) {
        // Handle floor requests (just simulate elevator movement here)
        System.out.println("Elevator requested on floor " + floorNumber);
        this.moving = true;
        // Move to requested floor logic here (simple example)
        while (currentFloor != floorNumber) {
            if (currentFloor < floorNumber) {
                moveUp();
            } else {
                moveDown();
            }
        }
        this.moving = false;
    }

    private void handlePassengers() {
        passengers.removeIf(p -> p.getDestinationFloor() == this.currentFloor);
    }

    private void checkAndHandleRequests() {
        if (requestedFloors.contains(currentFloor)) {
            openDoors();
            requestedFloors.remove((Integer) currentFloor);
        }
    }

    public void displayStatus() {
        System.out.println("Elevator is currently on floor " + this.currentFloor);
        System.out.println("Moving direction: " + this.direction);
        System.out.println("Moving status: " + (this.moving ? "Moving" : "Stationary"));
    }

    // Other getters and setters
}
