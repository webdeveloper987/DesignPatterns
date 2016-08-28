package my.patterns.adapter;

import java.awt.Checkbox;

public class CheckboxAdapter extends Checkbox {
	private static final long serialVersionUID = 1L;

	public CheckboxAdapter(String n) {
		super(n);
	}

	public boolean isSelected() {
		return getState();
	}
}