package Controllers;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Belt_TransmissionController {
	
	//________________________________________| Radio_Button |_____________________________________________________|
	
	@FXML
	private RadioButton a1_Radio;
	@FXML
	private RadioButton a2_Radio;
	@FXML
	private RadioButton L_Radio;
	
	//________________________________________| TEXT_FIELDS |__________________________________________________|
	
	@FXML
	private TextField d1_Text;
	
	@FXML
	private TextField d2_Text;
	
	@FXML
	private TextField I_Text;
	

	
	//________________________________________| LABEL |________________________________________________________|
	
	@FXML
	private Label Belt_Data_result_label;
	
	//_________________________________________| CALCULATION |_________________________________________________|
	
	@FXML
	private void Calculate_Belt_Data() {
		
		// Gets values from text fields
		double d1 = Double.parseDouble(d1_Text.getText());
		double d2 = Double.parseDouble(d2_Text.getText());
		double I = Double.parseDouble(I_Text.getText());
		
		//Toggle group for RadioButtons
		ToggleGroup group = new ToggleGroup();
		a1_Radio.setToggleGroup(group);
		a2_Radio.setToggleGroup(group);
		L_Radio.setToggleGroup(group);
		
		RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
		
		
		//Calculation behavior
		
		if(selectedRadioButton == a1_Radio) {
			double result = a1(d1, d2, I); 
			Belt_Data_result_label.setText("Result: " + result);
		}
		else if(selectedRadioButton == a2_Radio){
			double result = a2(d1, d2, I); 
			Belt_Data_result_label.setText("Result: " + result);			
		}
		else {
			double result = L(d1, d2, I); 
			Belt_Data_result_label.setText("Result: " + result);
		}
		
		
	}
	
	
	//_________________________________________________________________________________________________________|
	
	
	public double a1(double d2, double d1, double I) {
		
		double a1;
		a1 = 180 - 57 * ((d2 - d1) / I);
		return a1;
	}
	
	
	public double a2(double d2, double d1, double I) {
		double a2;
		a2 = 180 + 57 * ((d2 - d1) / I);
		return a2;
	}
	
	
	public double L(double d2, double d1, double I) {
		double L;
		L = 2 * I + ((Math.PI * (d2 + d1))/(2)) + (Math.pow((d2-d1), 2)/4 * I);
		return L;
	}
	
	
}
