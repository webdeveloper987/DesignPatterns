package my.patterns.strategy;

public class Car extends Vehicle {
	public Car(){
		setGoAlgorithm(new GoByDrivingAlgorithm());
	}
}
