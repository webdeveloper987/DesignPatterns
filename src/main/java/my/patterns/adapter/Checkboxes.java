package my.patterns.adapter;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Checkboxes extends JFrame implements ItemListener {
	private static final long serialVersionUID = -1396802267529727972L;
	CheckboxAdapter checks[];
	JTextField text;

	public Checkboxes() {
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		checks = new CheckboxAdapter[4];
		for (int loopIndex = 0; loopIndex <= checks.length - 1; loopIndex++) {
			checks[loopIndex] = new CheckboxAdapter("Check " + loopIndex);
			checks[loopIndex].addItemListener(this);
			contentPane.add(checks[loopIndex]);
		}
		text = new JTextField(30);
		contentPane.add(text);
	}

	public void itemStateChanged(ItemEvent e) {
		String outString = new String("Selected: ");
		for (int loopIndex = 0; loopIndex <= checks.length - 1; loopIndex++) {
			if (checks[loopIndex].isSelected()) {
				outString += " checkbox " + loopIndex;
			}
		}
		text.setText(outString);
	}

	public static void main(String args[])

	{
		final Checkboxes f = new Checkboxes();
		f.setBounds(100, 100, 400, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}