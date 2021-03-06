package contract.model;

import contract.model.IMap;
import contract.model.element.mobile.IMobile;

/**
 * <h1>The Interface IModel.</h1>
 * @author Groupe2
 *
 */
public interface IModel {

    /**
     * Gets the map.
     */
    public IMap getMap();
    
    /** @return the player's character */
    public IMobile getMyCharacter();
    
    /** Makes the pawn follow their strategy */
    public void movePawns();
}
