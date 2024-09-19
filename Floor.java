public class Floor {
    private int floorNumber;
    private boolean hasUpButton;
    private boolean hasDownButton;

    // Constructor
    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.hasUpButton = false;
        this.hasDownButton = false;
    }

    // Methods
    public void pressUpButton() {
        System.out.println("Up button pressed on floor " + this.floorNumber);
    }

    public void pressDownButton() {
        System.out.println("Down button pressed on floor " + this.floorNumber);
    }

    // Other getters and setters
}