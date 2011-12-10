package my.patterns.chainofresp;

public class ApplicationLayer implements HelpInterface {
	public static final int APPLICATION_LAYER = 3;

	public void getHelp(int helpConstant) {
		System.out.println("Help is from the APPLICATION LAYER");
	}
}
