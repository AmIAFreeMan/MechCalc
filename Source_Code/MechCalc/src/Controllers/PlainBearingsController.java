package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PlainBearingsController {
	
	@FXML
	private TextField F_Text;
	
	@FXML
	private TextField diameter_Text;
	
	@FXML
	private TextField L_Text;
	
	@FXML
	private TextField p_Text;
	
	@FXML
	private TextField p_am_Text;
	
	//_____________________________________________________________________________________________________________
	
	@FXML
	private Label L_Specific_Pressure;
		
	@FXML
	private Label L_Verify;
	
	//_____________________________________________________________________________________________________________
	
	@FXML
	public void Specific_Pressure() {
		double F = Double.parseDouble(F_Text.getText());
		double diameter = Double.parseDouble(diameter_Text.getText());
		double L = Double.parseDouble(L_Text.getText());
		//F --> Force that the bearing is subjected to
		//L --> length of the bearing 
		
						
		double pressure = (F)/(diameter * L);		
		L_Specific_Pressure.setText("Result: " + pressure);
	}
	
	@FXML
	public void Verify() {
		
		double p = Double.parseDouble(p_Text.getText());
		double p_am = Double.parseDouble(p_am_Text.getText());
		
		if(p <= p_am) {
			L_Verify.setText("True");
		}
		else {
			L_Verify.setText("false");
		}
	}
}
