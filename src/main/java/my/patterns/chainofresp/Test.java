package my.patterns.chainofresp;

public class Test {

	public static void main(String[] args) {
		final int FRONT_END = 1;
		final int INTERMEDIATE_LAYER = 2;
		final int APPLICATION_LAYER = 3;
		
		HelpInterface helpInterface = new FrontEndLayer(new IntermediateLayer(new ApplicationLayer()));
		
		helpInterface.getHelp(APPLICATION_LAYER);
		helpInterface.getHelp(INTERMEDIATE_LAYER);
		helpInterface.getHelp(FRONT_END);
	}
}
