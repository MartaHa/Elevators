package pl.MartaHa.ElevManagement.elevator.dao;

import pl.MartaHa.ElevManagement.elevator.Elevator;
import java.util.Map;

public interface ElevatorDao {

    Map<Integer, Elevator> getWorkingElevators();


}
