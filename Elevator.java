import java.util.ArrayList;
import java.util.List;


// Elevator class
public class Elevator {
    private int currentFloor;
    private int capacity;
    private boolean moving;
    private Direction direction;
    private List<Passenger> passengers;

    // Constructor
    public Elevator(int capacity) {
        this.capacity = capacity;
        this.currentFloor = 1; // Start from ground floor
        this.moving = false;
        this.direction = Direction.NONE; // Elevator is stationary initially
        this.passengers = new ArrayList<>();
    }

    // Methods
    public void moveUp() {
        this.currentFloor++;
        System.out.println("Elevator moving up to floor " + this.currentFloor);
    }

    public void moveDown() {
        this.currentFloor--;
        System.out.println("Elevator moving down to floor " + this.currentFloor);
    }

    public void openDoors() {
        System.out.println("Elevator doors opening at floor " + this.currentFloor);
    }

    public void closeDoors() {
        System.out.println("Elevator doors closing at floor " + this.currentFloor);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
            System.out.println("Passenger added to elevator at floor " + this.currentFloor);
        } else {
            System.out.println("Elevator is full. Cannot add more passengers.");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
        System.out.println("Passenger removed from elevator at floor " + this.currentFloor);
    }

    // Other getters and setters
}


