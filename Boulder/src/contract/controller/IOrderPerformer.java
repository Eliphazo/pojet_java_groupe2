package contract.controller;

import java.io.IOException;

import contract.controller.UserOrder;

/**
 * <h1>The Interface IController.</h1>
 * @author Groupe2
 *
 */

public interface IOrderPerformer {

    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    void orderPerform(UserOrder userOrder) throws IOException;
}
