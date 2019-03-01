package pl.MartaHa.ElevManagement.state;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;

public class GoingDown implements ElevatorState {

    Elevator elevator;

    public GoingDown(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void changeState() {
        elevator.setElevatorState(new Stop(elevator));
    }
}
