package my.design.creational.builder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class WealthBuilder extends JFrame implements ListSelectionListener,
		ActionListener {

	private static final long serialVersionUID = 1L;
	private JList stockList; // list of funds
	private JButton Plot; // plot command button
	private JPanel choicePanel; // right panel
	private MultiChoice mchoice; // ui for right panel
	private List<String> Bonds, Stocks, Mutuals; // 3 lists
	private final ChoiceFactory cfact; // the factory

	public WealthBuilder() {
		super("Wealth Builder"); // frame title bar
		setGUI(); // set up display
		buildStockLists(); // create stock lists
		cfact = new ChoiceFactory(); // create builder factory
	}

	// --------------
	private void buildStockLists() {
		// TODO Auto-generated method stub

	}

	private void setGUI() {
		JPanel jp = new JPanel();
		getContentPane().add(jp);
		jp.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		jp.add("Center", p);

		// center contains left and right panels
		p.setLayout(new GridLayout(1, 2));
		stockList = new JList(); // left list of stocks
		stockList.addListSelectionListener(this);
		p.add(stockList);
		stockList.add("Stocks", null);
		stockList.add("Bonds", null);
		stockList.add("Mutual Funds", null);
		stockList.addListSelectionListener(this);

		JPanel p1 = new JPanel();
		p1.setBackground(Color.GRAY);
		jp.add("South", p1);
		Plot = new JButton("Plot");
		Plot.setEnabled(false); // disabled until picked
		Plot.addActionListener(this);
		p1.add(Plot);
		// right is empty at first
		choicePanel = new JPanel();
		choicePanel.setBackground(Color.lightGray);
		p.add(choicePanel);

		setBounds(100, 100, 300, 200);
		setVisible(true);
	}

	public void stockList_Click() {
		List<String> v = null;
		int index = stockList.getSelectedIndex();
		choicePanel.removeAll(); // remove previous gui panel

		// switches between three different Vectors
		// and passes the selected one to the Builder pattern
		switch (index) {
		case 0:
			v = Stocks;
			break;
		case 1:
			v = Bonds;
			break;
		case 2:
			v = Mutuals;
		}
		mchoice = cfact.getChoiceUI(v); // get one of the guis
		choicePanel.add(mchoice.getUI()); // insert on right
		choicePanel.validate(); // re-layout and display
		choicePanel.repaint();
		Plot.setEnabled(true); // allow plots
	}

	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



}
