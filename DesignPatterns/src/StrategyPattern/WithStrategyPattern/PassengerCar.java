package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerCar extends Vehicle {

    public PassengerCar() {
        super(new NormalDriveStrategy());
    }
}
