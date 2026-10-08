package Navigation;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;


public class NavController {
	
	private StackPane contentArea; 
    
	// Navigation 
	
	@FXML
    public void showDisclaimer() {
        loadPage("/views/Disclaimer.fxml");
    }
    
    @FXML
    public void showBelt_Transmission() {
        loadPage("/views/Belt_Transmission.fxml");
    }
    
    @FXML
    public void showConic_Gears() {
        loadPage("/views/Conic_Gears.fxml");
    }
    
    @FXML
    public void showEnd_Pivots() {
        loadPage("/views/End_Pivots.fxml");
    }
    
    @FXML
    public void showFlat_Belts() {
        loadPage("/views/Flat_Belts.fxml");
    }
    
    @FXML
    public void showGears() {
        loadPage("/views/Gears.fxml");
    }
    
    @FXML
    public void showPlainBearings() {
        loadPage("/views/PlainBearings.fxml");
    }
    
    @FXML
    public void showRigid_Coupling() {
        loadPage("/views/Rigid_Coupling.fxml");
    }
    
    @FXML
    public void showShaft() {
        loadPage("/views/Shaft.fxml");
    }
    
    @FXML
    public void showSigma_Tau_Verification() {
        loadPage("/views/Sigma_Tau_Verification.fxml");
    }
    
    @FXML
    public void showStraight_Gears() {
        loadPage("/views/Straight_Gears.fxml");
    }

    
    
    //______________________________| FONDAMENTAL | _____________________________________________
    
    
    // Setter for contentArea
    // Called by MainController to pass the center pane reference
    public void setContentArea(StackPane contentArea) {
        this.contentArea = contentArea;
    }
    
    
    // Helper method to load FXML into the center pane
    private void loadPage(String fxmlFile) {  // Obviously if it was a simple UI switch app this would've  
        if (contentArea == null) {            // been more then enough to switch pages.
            System.err.println("Error: contentArea is null in NavController. Ensure MainController called setContentArea().");
            return;
        }

        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlFile));
            contentArea.getChildren().setAll(view); // Replaces current view
        } catch (IOException e) {
        	System.err.println("Could not load: " + fxmlFile);
            e.printStackTrace();
        }
    }
    
	
	
	
}
