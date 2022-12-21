package ui;

import javax.swing.JOptionPane;

import icon.GameIcon;

public class Input {
	private static String inputString;
	public static int inputInt;

	public static void inputView() {
		try {
			inputString = (String) JOptionPane.showInputDialog(null, "Introduce tu número de la suerte",
					"Galleta Misteriosa", JOptionPane.PLAIN_MESSAGE, GameIcon.getNahIcon(), null, "");

			if (!(inputString.equals(" ") || inputString.startsWith(" "))) {
				inputInt = Integer.parseInt(inputString);

				if (!(inputInt <= 0)) {
					Output.outputView(inputInt);
				} else {
					throw new ArithmeticException();
				}
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException ex00) {
			JOptionPane.showMessageDialog(null,
					"La galleta no recibe letras o espacios en blanco, en su lugar ingrese números",
					"Fatal Error - Input no esperado", JOptionPane.ERROR_MESSAGE);
			inputView();
		} catch (ArithmeticException ex01) {
			JOptionPane.showMessageDialog(null, "La galleta no recibe números negativos",
					"Fatal Error - Número Negativo", JOptionPane.ERROR_MESSAGE);
			inputView();
		}
		/*
		 * catch (Exception ex02) { JOptionPane.showMessageDialog(null,
		 * "Se ha producido un error.", "Java General Exception",
		 * JOptionPane.ERROR_MESSAGE); }
		 */
	}
}
