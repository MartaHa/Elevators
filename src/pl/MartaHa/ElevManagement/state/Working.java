package pl.MartaHa.ElevManagement.state;
import pl.MartaHa.ElevManagement.elevator.Elevator;

public class Working implements ElevatorState {

    Elevator elevator;

    public Working(Elevator elevator) {
        this.elevator = elevator;
    }


    @Override
    public void changeState() {
        elevator.setElevatorState(new Stop(elevator));
    }
}
