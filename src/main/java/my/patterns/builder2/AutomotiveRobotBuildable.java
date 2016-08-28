package my.patterns.builder2;

import java.util.ArrayList;

public class AutomotiveRobotBuildable implements RobotBuildable{
	ArrayList<Integer> actions;

	public AutomotiveRobotBuildable() {
	}

	public void loadActions(ArrayList<Integer> a) {
		actions = a;
	}

	public final void go() {
		for(Integer i : actions){
			switch (i) {
			case 1:
				getParts();
				break;
			case 2:
				assemble();
				break;
			case 3:
				test();
				break;
			}
		}
	}

	public void getParts() {
		System.out.println("Getting the Parts....");
	}

	public void assemble() {
		System.out.println("Assembling the parts....");
	}

	public void test() {
		System.out.println("Testing the Machine.....");
	}
}
