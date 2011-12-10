package my.patterns.chainofresp;

public class IntermediateLayer implements HelpInterface {
	private static final int INTERMEDIATE_LAYER = 2;

	private HelpInterface successor;

	public IntermediateLayer(HelpInterface successor) {
		this.successor = successor;
	}

	public void getHelp(int helpConstant) {
		if (INTERMEDIATE_LAYER == helpConstant) {
			System.out.println("Help is from the INTERMEDIATE LAYER");
		} else {
			successor.getHelp(helpConstant);
		}
	}
}
