package pl.MartaHa.ElevManagement.elevator.dao;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;
import java.util.Map;

public interface ElevatorDao {

    Map<Integer, Elevator> getNotWorkingElevators();
    String setElevatorsMap(int number);

}
