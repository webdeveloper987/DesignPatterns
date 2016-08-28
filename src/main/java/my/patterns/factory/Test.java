package my.patterns.factory;

public class Test {
	public static void main(String args[]) {
		//TESTING NORMAL FACTORY METHOD
		FirstFactory factory1 = new FirstFactory("Oracle");
		Connection connection1 = factory1.createConnection();
		System.out.println("You’re connecting with " + connection1.description());
		
		//TESTING GoF FACTORY METHOD
		SecureFactory factory2 = new SecureFactory();
		Connection connection = factory2.createConnection("Oracle");
		System.out.println("You’re connecting with " + connection.description());
	}
}
