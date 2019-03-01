package pl.MartaHa.ElevManagement;

import java.util.HashMap;
import java.util.Map;

public class ElevatorMap {

    private Map<Integer, Elevator> elevatorMap;

    public ElevatorMap() {
        this.elevatorMap = new HashMap<>();
    }

    public Map<Integer, Elevator> getElevatorMap() {
        return elevatorMap;
    }
}
