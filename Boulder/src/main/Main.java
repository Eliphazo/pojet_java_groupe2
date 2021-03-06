package main;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import contract.controller.IBoulderDashController;
import contract.model.IModel;
import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 * @author Groupe2
 *
 */
public abstract class Main {

    /**
     * This is the main method.
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     * @throws IOException 
     */
    public static void main(final String[] args) throws SQLException, IOException {
    	
    	String idToAsk= JOptionPane.showInputDialog("Hello ! Please choose the level : ", 1);
        int idAsked = Integer.parseInt(idToAsk);
        
    	final IModel model = new ModelFacade(idAsked);
    	final ViewFacade view = new ViewFacade(model.getMap(), model.getMyCharacter(), model.getMap().getPawns());
        final IBoulderDashController controller = new ControllerFacade(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());

        try {
            controller.start();
        } catch (InterruptedException e) {
        	System.out.println(e.getMessage());
			e.printStackTrace();
		}
    }
    
}
