package my.patterns.decorator;


public class CD extends ComputerDecorator{
	Computer c;
	
	public CD(Computer c){
		this.c=c;
	}
	
	@Override
	public String getDescription() {
		return (c.getDescription() + " and a CD");
	}
	
}

