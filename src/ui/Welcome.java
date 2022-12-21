package ui;

import javax.swing.JOptionPane;

import icon.GameIcon;

public class Welcome {
	public static void welcomeView() {

		// Game start

		JOptionPane.showMessageDialog(null, "Bienvenido al juego de la Galleta Misteriosa", "Bienvenida",
				JOptionPane.PLAIN_MESSAGE, GameIcon.getBallBlackIcon());

		// Join to input view
		Input.inputView();

	}
}
