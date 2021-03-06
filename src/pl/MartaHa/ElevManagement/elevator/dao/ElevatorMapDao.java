package pl.MartaHa.ElevManagement.elevator.dao;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ElevatorMapDao implements ElevatorDao {

    private Map<Integer, Elevator> elevatorMap;

    public ElevatorMapDao() {
        elevatorMap = new HashMap<>();
    }

    public Map <Integer, Elevator> getElevatorMap(){
        return elevatorMap;
    }

    @Override
    public Map<Integer, Elevator> getNotWorkingElevators() {
        Map <Integer, Elevator> workingElevators = elevatorMap.entrySet().stream()
                .filter(a->a.getValue().getElevatorState().equals("STOP"))
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
        return workingElevators;
    }

    @Override
    public String setElevatorsMap(int number) {
        return null;
    }

}
