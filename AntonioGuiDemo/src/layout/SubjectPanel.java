package layout;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class SubjectPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public SubjectPanel() {
		setBackground(Color.GRAY);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Add Subject");
		btnNewButton.setBounds(150, 40, 117, 29);
		add(btnNewButton);
		
		JButton btnRemoveTeacher = new JButton("Remove Subject");
		btnRemoveTeacher.setBounds(150, 134, 117, 29);
		add(btnRemoveTeacher);

	}

}
