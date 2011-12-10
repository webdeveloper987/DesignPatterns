package my.patterns.strategy;

public class Jet extends Vehicle {
	public Jet(){
		setGoAlgorithm(new GoByFlyingAlgorithm());
	}
}
