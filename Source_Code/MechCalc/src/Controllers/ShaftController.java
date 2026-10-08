package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ShaftController {
	//____________________________________________________________________________________________________
	
	@FXML
	private RadioButton Flexion;
	
	@FXML
	private RadioButton Twist;	
	
	//____________________________________________________________________________________________________
	
	@FXML
	private TextField sigma_tau_Text;
	
	@FXML
	private TextField diameter_Text;
	
	@FXML
	private TextField M_Text;
	
	@FXML
	private TextField Mt_Text;
	
	@FXML
	private TextField Mf_Text;
	
	//_____________________________________________________________________________________________________
	
	@FXML
	private Label L_Calc_Sigma_From_Diameter;
	
	@FXML
	private Label L_Shaft_Diameter_Flexion_and_Twist;
	
	@FXML
	private Label L_Ideal_Mf;
	
	@FXML
	private Label L_Calc_Sigma_or_Tau_From_Diameter;
	//______________________________________________________________________________________________________
	
	@FXML
	public void Shaft_Diameter_Flexion_and_Twist() {
		ToggleGroup group = new ToggleGroup(); 
		Twist.setToggleGroup(group);
		Flexion.setToggleGroup(group);
		
		RadioButton selected = (RadioButton) group.getSelectedToggle();
		// Min resistant Diameter For Flexion or Twist Sollecitation
		//calculates the diameter of a Tree based on sigma or tau and the Mf or Mfid expressed in Nmm	
		double sigma_tau = Double.parseDouble(sigma_tau_Text.getText());
		double M = Double.parseDouble(M_Text.getText());
		
			
		if(selected == Flexion) {
			double diameter = Math.cbrt((32 * M)/(Math.PI * sigma_tau));
			L_Shaft_Diameter_Flexion_and_Twist.setText("Result: " + diameter);
		}
		else {
			double diameter = Math.cbrt((16 * M)/(Math.PI * sigma_tau));
			L_Shaft_Diameter_Flexion_and_Twist.setText("Result: " + diameter);
		}
	}
	
	
	
	
	@FXML
	public void Ideal_Mf() {
        //Calculate Mfid using Mf and Mt
		
		double Mf = Double.parseDouble(Mf_Text.getText());
		double Mt = Double.parseDouble(Mt_Text.getText());
		
		double res = Math.sqrt(Math.pow(Mf, 2) + (0.75 * Math.pow(Mt, 2)));
		L_Ideal_Mf.setText("Result: " + res);
	}
	
	
	
	//______________________________| Calculate Sigma and Tau using Diameter and Mf --> Reverse Formula |__________________________
	@FXML
	public void Calc_Sigma_or_Tau_From_Diameter() {
		ToggleGroup group = new ToggleGroup(); 
		Twist.setToggleGroup(group);
		Flexion.setToggleGroup(group);
		
		RadioButton selected = (RadioButton) group.getSelectedToggle();
		
		
		double M = Double.parseDouble(M_Text.getText());
		double diameter = Double.parseDouble(diameter_Text.getText());
		
		
		if(selected == Flexion) {
			double res = (32 * M)/(Math.PI * Math.pow(diameter, 3));
			L_Calc_Sigma_From_Diameter.setText("Result: " + res);
		}
		else {
			double res = (16 * M)/(Math.PI * Math.pow(diameter, 3));
			L_Calc_Sigma_From_Diameter.setText("Result: " + res);
		}
		
		
	}
	
	
	
	
	
	
	
}
