package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class End_PivotsController {
	
	//___________________________________| LABELS |_____________________________________|
	
	@FXML
	private Label L_Calc_Shaft_Diameter;
	
	@FXML
	private Label L_Calc_Intermediate_Shaft_Diameter;
	
	//___________________________________| TEXTFIELDS |_________________________________|
	
	
	@FXML
	private TextField Fa_Text;
	
	@FXML
	private TextField sigma_amf_Text;
	
	@FXML
	private TextField L_d_Text;
	
	@FXML
	private TextField Mfi_Text;
	

	
	//__________________________________________________________________________________|
	@FXML
	public void Calc_Shaft_Diameter() {
		
		double Fa = Double.parseDouble(Fa_Text.getText());
		double sigma_amf = Double.parseDouble(sigma_amf_Text.getText());
		double L_d = Double.parseDouble(L_d_Text.getText());
		
		
		double diameter = Math.sqrt(((5 * Fa)/sigma_amf)* L_d);
		
		L_Calc_Shaft_Diameter.setText("Result: " + diameter);
	}
	
	@FXML
	public void Calc_Intermediate_Shaft_Diameter() {
		
		double Mfi = Double.parseDouble(Mfi_Text.getText());
		double sigma_amf = Double.parseDouble(sigma_amf_Text.getText());
		double diameter = Math.cbrt((32 * Mfi) * (Math.PI * sigma_amf));
		
		L_Calc_Intermediate_Shaft_Diameter.setText("Result: " + diameter);
		
	}
}
