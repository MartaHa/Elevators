package pl.MartaHa.ElevManagement;

import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start!");

        //first SetUp

        ElevatorMap map = new ElevatorMap();
        Map<Integer, Elevator> buidlingElevators = map.getElevatorMap();

        for (int i=1; i<=5; i++){
            Random random = new Random();
            int randomFloor = random.nextInt();
            Elevator elevator = new Elevator(i,randomFloor);
            buidlingElevators.put(i,elevator);
        }
        System.out.println(buidlingElevators.toString());

        System.out.println("Stop!");
    }
}
