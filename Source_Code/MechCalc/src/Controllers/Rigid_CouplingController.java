package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Rigid_CouplingController {
	
	@FXML
	private TextField diameter_Text;
	
	@FXML
	private TextField f_Text;
	
	@FXML
	private TextField z_Text;
	
	@FXML
	private TextField F_Text;
	
	@FXML
	private TextField Tau_amd_Text;
	
	@FXML
	private TextField ks_Text;
	
	@FXML
	private TextField M_Text;
	
	//__________________________________________________________________________________________________
	@FXML
	private Label L_RigidCoupling;
	
	@FXML
	private Label L_Mt_RigidCoupling;
	
	@FXML
	private Label L_Mt_RigidCoupling_ks;
	
	//________________________________________| Rigid Coupling |________________________________________
	
	@FXML
	public void RigidCoupling() {
		double diameter = Double.parseDouble(diameter_Text.getText());
		double f = Double.parseDouble(f_Text.getText());
		double z = Double.parseDouble(z_Text.getText());
		double F = Double.parseDouble(F_Text.getText());
		
		double Mt = (Math.PI / 4) * diameter * f * z * F;
		// f -> friction coefficient
		// z -> number of screws
		// F -> Force transmitted by evry screw
		L_RigidCoupling.setText("Result: " + Mt);
	}
		
	@FXML
    public void Mt_RigidCoupling() {
    	double diameter = Double.parseDouble(diameter_Text.getText());
    	double Tau_amd = Double.parseDouble(Tau_amd_Text.getText());
		
		double Mt = (Math.PI / 16) * Math.pow(diameter, 3) * Tau_amd;
			
		L_Mt_RigidCoupling.setText("Result: " + Mt);
	}
		
	@FXML
    public void Mt_RigidCoupling_ks() {
    	double M = Double.parseDouble(M_Text.getText());
    	double ks = Double.parseDouble(ks_Text.getText());
		
		double Mt = M * ks; //Can obtain the traction moment via the service coefficient witch is a value between 1,1 and 1,25
		L_Mt_RigidCoupling_ks.setText("Result: " + Mt);
	}
}
