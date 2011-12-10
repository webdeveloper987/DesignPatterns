package my.patterns.decorator;

public class Test {

	public static void main(String[] args) {
		Computer c1 = new Disk(new CD(new Disk(new Computer())));
		Computer c2 = new Disk(new Disk(new CD(new Computer())));
		
		System.out.println(c1.getDescription());
		System.out.println(c2.getDescription());
	}

}
