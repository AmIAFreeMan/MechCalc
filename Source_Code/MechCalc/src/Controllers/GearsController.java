package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GearsController {
	
	@FXML
	private TextField z1_Text;
	
	@FXML
	private TextField z2_Text;
	
	@FXML
	private TextField w1_Text;
	
	@FXML
	private TextField w2_Text;
	
	@FXML
	private TextField diameter_Text;
	
	@FXML
	private TextField a_Text;
	
	@FXML
	private TextField z_Text;
	
	@FXML
	private TextField s_Text;
	
	@FXML
	private TextField u_Text;
	
	@FXML
	private TextField B_Text;
	
	@FXML
	private TextField x_Text;
	
	//____________________________________________________________________________________________
	
	@FXML
	private Label L_Gear_Ratio;
	
	@FXML
	private Label L_Transmition_Ratio;
	
	@FXML
	private Label L_Gear_Step;
	
	@FXML
	private Label L_Base_Diameter;
	
	@FXML
	private Label L_Gear_Module_Step;
	
	@FXML
	private Label L_Gear_Module_diameter;
	
	@FXML
	private Label L_Minimal_Theet_number;
	
	@FXML
	private Label L_Minimal_Theet_denture_spool;
	
	@FXML
	private Label L_REAL_Min_Theet_Z1;
	
	@FXML
	private Label L_REAL_Min_Theet_Z2;

	//____________________________________________________________________________________________
	
	@FXML
	public void Gear_Ratio() {
		double z1 = Double.parseDouble(z1_Text.getText());
		double z2 = Double.parseDouble(z2_Text.getText());
		
		double res = z2/z1;
		L_Gear_Ratio.setText("Result: " + res);
	}
	
	@FXML
	public void Transmition_Ratio() {
		
		double w1 = Double.parseDouble(w1_Text.getText());
		double w2 = Double.parseDouble(w2_Text.getText());
		// w1/w2 = n1/n2 = r2/r1
		
		double res;
		res = w1/w2;
		L_Transmition_Ratio.setText("Result: " + res);
	}
	
	@FXML
	public void Base_Diameter() {
		double diameter = Double.parseDouble(diameter_Text.getText());
		double a = Double.parseDouble(a_Text.getText());
		
		double d_b = diameter * Math.cos(a);
		L_Base_Diameter.setText("Result: " + d_b);
	}
	
	@FXML
	public void Gear_Step() {
		double diameter = Double.parseDouble(diameter_Text.getText());
		double z = Double.parseDouble(z_Text.getText());
		
		double step = (Math.PI * diameter) / z;
		L_Base_Diameter.setText("Result: " + step);
	}
	
	@FXML
	public void Gear_Module_Step() {
		double s = Double.parseDouble(s_Text.getText());
		 // s --> step
		double module = s / Math.PI;
		L_Base_Diameter.setText("Result: " + module);
	}
	
	@FXML
	public void Gear_Module_diameter() {
		
		double diameter = Double.parseDouble(diameter_Text.getText());
		double z = Double.parseDouble(z_Text.getText());
		
		 // z --> number of gear theet
		double module = diameter / z;
		L_Gear_Module_diameter.setText("Result: " + module);
	}
	
	@FXML
	public void Minimal_Theet_number() {
		double u = Double.parseDouble(u_Text.getText());
		double a = Double.parseDouble(a_Text.getText());
		
		
		double res = 2 / (Math.sqrt((Math.pow(u, 2) + (1 + 2 * u) * Math.pow(Math.sin(a), 2))) - u);
		L_Minimal_Theet_number.setText("Result: " + res);
	}
	
	@FXML
	public void Minimal_Theet_denture_spool() {
		double B = Double.parseDouble(B_Text.getText());
		double a = Double.parseDouble(a_Text.getText());
		double res = (2 / Math.pow(Math.sin(a), 2)) * Math.cos(B);
		L_Minimal_Theet_denture_spool.setText("Result: " + res);
	}
	
	@FXML
	public void REAL_Min_Theet_Z1() {
		double x = Double.parseDouble(x_Text.getText());
		double z1 = Double.parseDouble(z1_Text.getText());
		double res = (1 - x) * z1;
		L_REAL_Min_Theet_Z1.setText("Result: " + res);
	}
	
	@FXML
	public void REAL_Min_Theet_Z2() {
		double x = Double.parseDouble(x_Text.getText());
		double z2 = Double.parseDouble(z2_Text.getText());
		
		double res = (1 + x) * z2;
		L_REAL_Min_Theet_Z2.setText("Result: " + res);
	}
	
	
}
