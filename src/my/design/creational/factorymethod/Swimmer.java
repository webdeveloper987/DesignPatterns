package my.design.creational.factorymethod;

public class Swimmer {
	
	public int age;
	public String club;
	public int heat;
	public int lane;
	public String name;
	public String time;
	
	public Swimmer(String s){
		this.name=s;
	}

	public int getHeat() {
		return heat;
	}

	public void setHeat(int heat) {
		this.heat = heat;
	}

	public int getLane() {
		return lane;
	}

	public void setLane(int lane) {
		this.lane = lane;
	}

	public int getAge() {
		return age;
	}
	public String getClub() {
		return club;
	}
	public String getName() {
		return name;
	}
	public String getTime() {
		return time;
	}
	
	
	
}
