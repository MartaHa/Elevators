package pl.MartaHa.ElevManagement.state;

import pl.MartaHa.ElevManagement.elevator.Elevator;

public interface ElevatorState {

    Elevator getElevator (int floor);
}
