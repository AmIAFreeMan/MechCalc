package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Sigma_Tau_VerificationController {
//___________________________________________________________________________________________________________________________
	
	private RadioButton Traction;
	private RadioButton Fatigue;
	private RadioButton Variable_Load;
//______________________________________________________________________________________________________________________________
	
	@FXML
	private Label L_Calc_Sigma;
	
	@FXML
	private Label L_Verify;
//__________________________________________________________________________________________________________________________
	
	@FXML
	private TextField Rm_Text;
	
	@FXML
	private TextField gr_Text;
	
	@FXML
	private TextField sigma_Text;
	
	@FXML
	private TextField sigma_ams_Text;
//____________________________________________________| TREES AND SIGMA\TAU |_________________________________________________________________
	
	@FXML
	public void Calc_Sigma() { 
		
		ToggleGroup group = new ToggleGroup();
		Traction.setToggleGroup(group);
		Fatigue.setToggleGroup(group);
		Variable_Load.setToggleGroup(group);
		
		RadioButton selected = (RadioButton) group.getSelectedToggle();
		//Calculates either the Sigma or the Tau --> Based on Sollecitation Type
		
		double Rm = Double.parseDouble(Rm_Text.getText());
		double gr = Double.parseDouble(gr_Text.getText());
		
		
		double staticSigma = Rm / gr;
		
		
		if(selected == Traction) {
			double res = (2 * staticSigma) / 3;
			L_Calc_Sigma.setText("Result: " + res);
		}
		
		if(selected == Fatigue) {
			double res = (1 * staticSigma) / 3;
			L_Calc_Sigma.setText("Result: " + res);
		}
		
		if(selected == Variable_Load) {
			double res = ((2.0 * staticSigma) / (3.0 * Math.sqrt(3)));
			L_Calc_Sigma.setText("Result: " + res);
		}
		
		
	}
	
	
	
	//______________________________________| Verify Simple solecitations |________________________________________________
	
	@FXML
	public void Verify() {
		
		double sigma = Double.parseDouble(sigma_Text.getText());
		double sigma_ams = Double.parseDouble(sigma_ams_Text.getText());
		
		if(sigma <= sigma_ams) {
			L_Verify.setText("True");
		}
		else {
			L_Verify.setText("False");
		}
	}	
	
	
	//___________________________________________________________________________________________________________________________________________
	

}
