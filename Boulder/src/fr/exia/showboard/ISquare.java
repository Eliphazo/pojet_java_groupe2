package fr.exia.showboard;

import java.awt.Image;

/**
 * <h1>The Interface ISquare.</h1>
 * <p>A class can implement the ISquare interface when it wants to be show on a IBoard.</p>
 *
 * @author Groupe2
 * @version 1.0
 * @see Image
 */
public interface ISquare {

    /**
     * Gets the image.
     *
     * @return the image
     */
    Image getImage();
}
