package pl.MartaHa.ElevManagement;

import pl.MartaHa.ElevManagement.elevator.model.Elevator;
import pl.MartaHa.ElevManagement.elevator.dao.ElevatorMapDao;
import pl.MartaHa.ElevManagement.request.model.Request;

import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start!");

        //first elevators Positions SetUp

        ElevatorMapDao map = new ElevatorMapDao();
        Map<Integer, Elevator> buidlingElevators = map.getElevatorMap();

        for (int i=1; i<=5; i++){
            Random random = new Random();
            int randomFloor = random.nextInt(9)+1;
            Elevator elevator = new Elevator(i,randomFloor);
            buidlingElevators.put(i,elevator);
        }
        System.out.println(buidlingElevators);

        Request request = new Request(4,12);

        System.out.println("Stop!");
    }
}
