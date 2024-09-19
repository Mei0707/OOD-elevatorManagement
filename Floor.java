public class Floor {
    private int floorNumber;
    private boolean hasUpButton;
    private boolean hasDownButton;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.hasUpButton = true; // Assume all floors have up button
        this.hasDownButton = (floorNumber > 1); // Floors above 1 have down button
    }

    public void pressUpButton() {
        System.out.println("Up button pressed on floor " + this.floorNumber);
    }

    public void pressDownButton() {
        if (hasDownButton) {
            System.out.println("Down button pressed on floor " + this.floorNumber);
        } else {
            System.out.println("Down button is not available on floor " + this.floorNumber);
        }
    }

    // Other getters and setters
}
