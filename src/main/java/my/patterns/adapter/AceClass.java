package my.patterns.adapter;

public class AceClass implements AceInterface {
	String name;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}
