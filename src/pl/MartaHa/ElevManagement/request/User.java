package pl.MartaHa.ElevManagement.request;

public class User {

    private int currentFloor;
    private int destinationFloor;
    String direction;

    public User(int currentFloor) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.direction=direction;
    }

    public void callElevator(int CurrentFloor, int destinationFloor, String direction){
    }
}
