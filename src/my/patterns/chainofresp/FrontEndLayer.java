package my.patterns.chainofresp;

public class FrontEndLayer implements HelpInterface {
	private static final int FRONT_END = 1;

	private HelpInterface successor;

	public FrontEndLayer(HelpInterface successor) {
		this.successor = successor;
	}

	public void getHelp(int helpConstant) {
		if (FRONT_END == helpConstant) {
			System.out.println("Help is from the FRONT END");
		} else {
			successor.getHelp(helpConstant);
		}
	}
}
