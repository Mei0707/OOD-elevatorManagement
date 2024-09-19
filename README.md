# Elevator Management System

## Overview

This project simulates a basic elevator management system. It includes classes for the Elevator, Floor, and Passenger, and provides basic functionality for moving the elevator, handling passenger requests, and managing floor buttons.

## Features

- **Elevator**: 
  - Moves up and down
  - Opens and closes doors
  - Adds and removes passengers
  - Handles destination requests
  - Displays current status
  
- **Floor**:
  - Press up and down buttons (if applicable)
  
- **Passenger**:
  - Requests from and to different floors

## Classes

### `Elevator`
Manages the state of the elevator, including its position, direction, and passengers.

**Methods**:
- `moveUp()`
- `moveDown()`
- `openDoors()`
- `closeDoors()`
- `addPassenger(Passenger passenger)`
- `removePassenger(Passenger passenger)`
- `requestElevator(int floorNumber)`
- `displayStatus()`

### `Floor`
Represents a floor in the building with buttons for elevator requests.

**Methods**:
- `pressUpButton()`
- `pressDownButton()`

### `Passenger`
Represents a passenger with a starting and destination floor.

**Methods**:
- Getters and setters for current and destination floors

## Usage

1. **Create an Elevator**:
    ```java
    Elevator elevator = new Elevator(10);
    ```

2. **Create Floors**:
    ```java
    Floor floor1 = new Floor(1);
    Floor floor2 = new Floor(2);
    ```

3. **Create Passengers**:
    ```java
    Passenger passenger1 = new Passenger(1, 3);
    ```

4. **Add Passengers to Elevator**:
    ```java
    elevator.addPassenger(passenger1);
    ```

5. **Move the Elevator**:
    ```java
    elevator.moveUp();
    ```

6. **Press Buttons on Floors**:
    ```java
    floor1.pressUpButton();
    ```

## Building and Running

Compile the Java files:
```bash
javac Elevator.java Floor.java Passenger.java
