package pl.MartaHa.ElevManagement.state;

import pl.MartaHa.ElevManagement.elevator.Elevator;

public class GoingUp implements ElevatorState {

    Elevator elevator;

    public GoingUp(Elevator elevator) {
        this.elevator = elevator;
    }


    @Override
    public void changeState() {
        elevator.setElevatorState(new Stop(elevator));
    }
}

