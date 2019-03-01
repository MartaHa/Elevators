package pl.MartaHa.ElevManagement;

public class Stop implements  ElevatorState {

    Elevator elevator;


    public Stop(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public Elevator getElevator(int floor) {
        return null;
    }
}
