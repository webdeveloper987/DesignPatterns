package my.patterns.facade;

public class TestFacade {
	public static void main(String args[]) {
		new TestFacade();
	}

	public TestFacade() {
		SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
		simpleProductFacade.setName("printer");
		System.out.println("This product is a " + simpleProductFacade.getName());
	}
}
