package my.patterns.builder2;

import java.util.ArrayList;

public class AutomotiveRobotBuilder implements RobotBuilder {
	AutomotiveRobotBuildable robot;
	ArrayList<Integer> actions;

	public AutomotiveRobotBuilder() {
		robot = new AutomotiveRobotBuildable();
		actions = new ArrayList<Integer>();
	}

	public void addGetParts() {
		actions.add(new Integer(1));
	}

	public void addAssemble() {
		actions.add(new Integer(2));
	}

	public void addTest() {
		actions.add(new Integer(3));
	}

	public RobotBuildable getRobot() {
		robot.loadActions(actions);
		return robot;
	}

	@Override
	public void addStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStop() {
		// TODO Auto-generated method stub
		
	}
}
