package pl.MartaHa.ElevManagement.elevator.model;
import pl.MartaHa.ElevManagement.state.ElevatorState;
import pl.MartaHa.ElevManagement.state.Stop;

import java.util.Objects;

public class Elevator implements  ElevatorState{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elevator elevator = (Elevator) o;
        return id == elevator.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", floor=" + floor +
                ", elevatorState=" + elevatorState +
                '}';
    }

    @Override
    public void changeState() {
        elevatorState.changeState();
    }
}
