package pl.MartaHa.ElevManagement;

public class Elevator {

    private int id;
    private int floor;
    private ElevatorState elevatorState;

    public Elevator(int id, int floor) {
        this.id = id;
        this.floor = floor;
        elevatorState = new Stop(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", floor=" + floor +
                ", elevatorState=" + elevatorState +
                '}';
    }
}
