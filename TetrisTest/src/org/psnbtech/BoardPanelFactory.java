package org.psnbtech;



/**
 * The class <code>BoardPanelFactory</code> implements static methods that return instances of the class <code>{@link BoardPanel}</code>.
 *
 * @generatedBy CodePro at 29.10.2014 17:15
 * @author Antti
 * @version $Revision: 1.0 $
 */
public class BoardPanelFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 29.10.2014 17:15
	 */
	private BoardPanelFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BoardPanel}</code>.
	 *
	 * @generatedBy CodePro at 29.10.2014 17:15
	 */
	public static BoardPanel createBoardPanel() {
		return new BoardPanel(TetrisFactory.createTetris());
	}
}