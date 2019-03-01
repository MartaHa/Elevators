package pl.MartaHa.ElevManagement;

import pl.MartaHa.ElevManagement.elevator.Elevator;
import pl.MartaHa.ElevManagement.elevator.dao.ElevatorMapDao;

import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start!");

        //first SetUp

        ElevatorMapDao map = new ElevatorMapDao();
        Map<Integer, Elevator> buidlingElevators = map.getElevatorMap();

        for (int i=1; i<=5; i++){
            Random random = new Random();
            int randomFloor = random.nextInt(9)+1;
            Elevator elevator = new Elevator(i,randomFloor);
            buidlingElevators.put(i,elevator);
        }
        System.out.println(buidlingElevators);

        System.out.println("Stop!");
    }
}
