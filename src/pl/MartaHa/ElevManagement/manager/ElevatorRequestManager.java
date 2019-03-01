package pl.MartaHa.ElevManagement.manager;

import pl.MartaHa.ElevManagement.elevator.dao.ElevatorMapDao;
import pl.MartaHa.ElevManagement.request.User;

public class ElevatorRequestManager {

    private final ElevatorMapDao elevatorMap;
    private final User user;

    public ElevatorRequestManager(ElevatorMapDao elevatorMap, User user) {
        this.elevatorMap = elevatorMap;
        this.user = user;
    }

    public static void processRequest(){

        //get the user request


    }
}
