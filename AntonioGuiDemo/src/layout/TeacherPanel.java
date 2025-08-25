package layout;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class TeacherPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TeacherPanel() {
		setBackground(Color.ORANGE);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Add Teacher");
		btnNewButton.setBounds(150, 40, 117, 29);
		add(btnNewButton);
		
		JButton btnRemoveTeacher = new JButton("Remove Teacher");
		btnRemoveTeacher.setBounds(150, 134, 117, 29);
		add(btnRemoveTeacher);

	}

}
