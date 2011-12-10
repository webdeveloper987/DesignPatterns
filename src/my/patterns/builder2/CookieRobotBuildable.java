package my.patterns.builder2;

import java.util.ArrayList;

public class CookieRobotBuildable implements RobotBuildable {
	ArrayList<Integer> actions;

	public CookieRobotBuildable() {
	}

	public void loadActions(ArrayList<Integer> a) {
		actions = a;
	}

	public final void go() {
		for(Integer i : actions){
			switch (i) {
			case 1:
				start();
				break;
			case 2:
				getParts();
				break;
			case 3:
				assemble();
				break;
			case 4:
				test();
				break;
			case 5:
				stop();
				break;
			}
		}
	}

	public void start() {
		System.out.println("Starting....");
	}

	public void getParts() {
		System.out.println("Getting flour and sugar....");
	}

	public void assemble() {
		System.out.println("Baking a cookie....");
	}

	public void test() {
		System.out.println("Crunching a cookie....");
	}

	public void stop() {
		System.out.println("Stopping....");
	}
}
