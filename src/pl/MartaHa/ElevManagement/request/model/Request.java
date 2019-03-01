package pl.MartaHa.ElevManagement.request.model;

public class Request {

    private int currentFloor;
    private int destinationFloor;
    String direction;

    public Request(int currentFloor, int destinationFloor) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        setDirection(currentFloor, destinationFloor);

    }

    private void setDirection(int currentFloor, int destinationFloor) {
        if (currentFloor < destinationFloor) {
            direction = "UP";
        } else {
            direction = "DOWN";
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public String getDirection() {
        return direction;
    }
}
