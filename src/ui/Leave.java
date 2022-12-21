package ui;

import javax.swing.JOptionPane;

import icon.GameIcon;

public class Leave {
	public static void leaveView() {
		JOptionPane.showMessageDialog(null, "*** Sucederá pronto hasta luego! ***", "Hasta pronto",
				JOptionPane.PLAIN_MESSAGE, GameIcon.getBallStarIcon());
	}
}
