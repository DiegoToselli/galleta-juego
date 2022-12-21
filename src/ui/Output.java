package ui;

import javax.swing.JOptionPane;

import cookie.Phrases;
import icon.GameIcon;

public class Output {
	public static void outputView(int inputInt) {
		// Use two index to handler out range index
		int index = (int) Math.floor(Math.random() * inputInt);
		int index2 = (int) Math.floor(Math.random() * (Phrases.getPhrases().size() - 1));

		if ((index >= 0) && (index < Phrases.getPhrases().size())) {
			JOptionPane.showMessageDialog(null, "Hoy la suerte te dice que... " + Phrases.getPhrases().get(index),
					"La suerte te dice", JOptionPane.PLAIN_MESSAGE, GameIcon.getCokieeIcon());

			Leave.leaveView();
		} else {
			JOptionPane.showMessageDialog(null, "Para tu número de la suerte: " + Phrases.getPhrases().get(index2),
					"La suerte te dice", JOptionPane.PLAIN_MESSAGE, GameIcon.getCokieeIcon());

			Leave.leaveView();
		}
	}
}
