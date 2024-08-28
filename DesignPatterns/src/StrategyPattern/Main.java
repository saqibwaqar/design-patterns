package StrategyPattern;

import StrategyPattern.WithStrategyPattern.SportsCar;
import StrategyPattern.WithStrategyPattern.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new SportsCar();
        vehicle.drive();

    }
}


/*
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new SportsCar();
        vehicle.drive();

    }
}*/
