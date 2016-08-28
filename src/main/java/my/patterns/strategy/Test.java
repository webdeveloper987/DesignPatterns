package my.patterns.strategy;

public class Test {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle jet = new Jet();
		
		car.go();
		jet.go();
		
		System.out.println("Changing Algorithm");
		jet.setGoAlgorithm(new GoByDrivingAlgorithm());
		jet.go();

	}

}
