package contract.view;

/**
 * <h1>The Interface IView.</h1>
 * 
 * @author Groupe2
 * @version 1.0
 * 
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Follow myCharacter.
     */
    void followMyCharacter();
    
    /**
     * Refreshes and redraws elements on the board
     */
    void updateBoardFrame();
}
