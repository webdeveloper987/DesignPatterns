package my.patterns.decorator;

public class Disk extends ComputerDecorator{
	Computer c;
	
	public Disk(Computer c){
		this.c=c;
	}
	
	@Override
	public String getDescription() {
		return (c.getDescription() + " and a Disk");
	}
	
}
