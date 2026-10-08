package Navigation;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class MainController {
	
	
	//______________________________| FONDAMENTAL | _____________________________________________
	
	@FXML private StackPane contentArea;          // 1. Injects the center pane from main.fxml
		
	@FXML private NavController navBarController; // 2. Injects the controller belonging to the included sidebar

    @FXML    
    public void initialize() { 
    	// Function for Initialize The page switch
    	// Runs automatically right after the FXML layout finish loading and all @FXML fields are injected.
    	if (navBarController != null) {  // Safety check to ensure JavaFX successfully injected the nested NavController
            
    		// Step A: Hand over the StackPane reference to NavController so it knows
            //         WHERE to load new FXML views when navigation buttons are clicked.
    		navBarController.setContentArea(contentArea);
    		
    		
    		// Step B: Load and display the default initial page (Dashboard) on application startup.
            navBarController.showDisclaimer(); 
        }
    }
	

    //______________________________| FONDAMENTAL | _____________________________________________
   
}
