package my.design.creational.abstractfactory;

public class VeggieGarden extends Garden { 
    @Override
	public Plant getShade() { 
        return new Plant("Broccoli"); 
    } 
    @Override
	public Plant getCenter() { 
        return new Plant("Corn"); 
    } 
    @Override
	public Plant getBorder() { 
        return new Plant("Peas"); 
    } 
} 
