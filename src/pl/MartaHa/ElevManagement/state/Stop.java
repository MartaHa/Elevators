package pl.MartaHa.ElevManagement.state;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;


public class Stop implements ElevatorState {

    Elevator elevator;

    public Stop(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void changeState() {
        elevator.setElevatorState(new Working(elevator));
    }
}
