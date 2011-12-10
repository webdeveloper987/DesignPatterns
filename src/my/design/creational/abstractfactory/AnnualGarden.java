package my.design.creational.abstractfactory;

public class AnnualGarden extends Garden { 
    @Override
	public Plant getShade() { 
        return new Plant("Mango"); 
    } 
    @Override
	public Plant getCenter() { 
        return new Plant("Palm"); 
    } 
    @Override
	public Plant getBorder() { 
        return new Plant("Apple"); 
    } 
} 
