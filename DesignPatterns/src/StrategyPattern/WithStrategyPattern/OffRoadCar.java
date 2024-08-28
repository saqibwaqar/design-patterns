package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadCar extends Vehicle {

    public OffRoadCar() {
        super(new SportsDriveStrategy());
    }
}
