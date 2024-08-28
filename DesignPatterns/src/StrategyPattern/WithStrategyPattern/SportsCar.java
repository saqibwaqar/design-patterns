package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle {
    public SportsCar() {
        super(new SportsDriveStrategy());
    }

}
