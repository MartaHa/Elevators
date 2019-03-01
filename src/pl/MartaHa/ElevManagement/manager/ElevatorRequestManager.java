package pl.MartaHa.ElevManagement.manager;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;
import pl.MartaHa.ElevManagement.elevator.dao.ElevatorMapDao;
import pl.MartaHa.ElevManagement.request.model.Request;
import pl.MartaHa.ElevManagement.request.dao.RequestsQueueDao;

import java.util.Map;

public class ElevatorRequestManager {

    private final ElevatorMapDao elevatorMapDao;
    private final RequestsQueueDao requestsQueueDao;

    public ElevatorRequestManager(ElevatorMapDao elevatorMapDao, RequestsQueueDao requestsQueueDao) {
        this.elevatorMapDao = elevatorMapDao;
        this.requestsQueueDao = requestsQueueDao;
    }

    public void manageRequest() {
        Map<Integer, Elevator> notWorkingElevators = elevatorMapDao.getNotWorkingElevators();
        Request request = requestsQueueDao.getFirstRequest();


    }
}
