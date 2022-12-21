package icon;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GameIcon {
	private static final Icon ballBlackIcon = new ImageIcon("./images/ball8-120.gif");
	private static final Icon nahIcon = new ImageIcon("./images/nah-120.gif");
	private static final Icon cokieeIcon = new ImageIcon("./images/galleta-120.gif");
	private static final Icon ballStarIcon = new ImageIcon("./images/ball-star-120.gif");

	public static Icon getBallBlackIcon() {
		return ballBlackIcon;
	}

	public static Icon getNahIcon() {
		return nahIcon;
	}

	public static Icon getCokieeIcon() {
		return cokieeIcon;
	}

	public static Icon getBallStarIcon() {
		return ballStarIcon;
	}
}
