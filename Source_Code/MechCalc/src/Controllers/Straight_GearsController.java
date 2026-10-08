package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Straight_GearsController {
	
	@FXML
	private RadioButton Precise_Gears;
	
	@FXML
	private RadioButton ExternalGear;
	
	//_______________________________________________________________________________________________________________
	
	@FXML
	private TextField sigma_Text;
	
	@FXML
	private TextField Mt_Text;
	
	@FXML
	private TextField lambda_Text;
	
	@FXML
	private TextField z_Text;
	
	@FXML
	private TextField sigma_am_Text;
	
	@FXML
	private TextField Lewis_number_Text;
	
	@FXML
	private TextField V_Text;
	
	@FXML
	private TextField Mt1_Text;
	
	@FXML
	private TextField k_Text;
	
	@FXML
	private TextField p_am_Text;
	
	@FXML
	private TextField p_max_Text;
	
	@FXML
	private TextField B_Text;
	
	@FXML
	private TextField H_Text;
	
	@FXML
	private TextField n1_Text;
	
	@FXML
	private TextField h_Text;
	
	
	@FXML
	private TextField K1_Text;
	
	@FXML
	private TextField at_Text;
	
	@FXML
	private TextField z1_Text;
	
	@FXML
	private TextField z2_Text;
	
	@FXML
	private TextField E1_Text;
	
	@FXML
	private TextField E2_Text;
	
	@FXML
	private TextField b_Text;
	
	@FXML
	private TextField d1_Text;
	
	@FXML
	private TextField d2_Text;
	
	@FXML
	private TextField f_Text;
	
	
	//_________________________________________________________________________________________________________________
	
	@FXML
	private Label L_Straight_Gear_Module;
	
	@FXML
	private Label L_Sigma_Gears_A;
	
	@FXML
	private Label L_Straight_Gear_Dim_Wear_module;
	
	@FXML
	private Label L_p_am;
	
	@FXML
	private Label L_k;
	
	@FXML
	private Label L_K1;
	
	@FXML
	private Label L_P_max;
	
	@FXML
	private Label L_Verify;
	
	@FXML
	private Label L_Gear_performance;
	
	
	//__________________________________________________________________________________________________________________
	
	@FXML
	public void Straight_Gear_Module() {
		
		double Mt = Double.parseDouble(Mt_Text.getText());
		double lambda = Double.parseDouble(lambda_Text.getText());
		double z = Double.parseDouble(z_Text.getText());
		double sigma_am = Double.parseDouble(sigma_am_Text.getText());
		double Lewis_number = Double.parseDouble(Lewis_number_Text.getText());
		
		
		int cosB = 1; // Since the gears are straight, the teeth inclination B (Beta) is 0 --> cosB = 1
		          
		double res = Math.cbrt((2 * Mt * cosB) / (lambda * z * sigma_am * Lewis_number));
		L_Straight_Gear_Module.setText("Result: " + res);
	}
	
	@FXML
	public void Sigma_Gears_A() {
		
		ToggleGroup group = new ToggleGroup();
		Precise_Gears.setToggleGroup(group);
		ExternalGear.setToggleGroup(group);
		
		RadioButton selected = (RadioButton) group.getSelectedToggle();
		
		double sigma = Double.parseDouble(sigma_Text.getText());
		double V = Double.parseDouble(V_Text.getText());
		
		if(selected == Precise_Gears) {
			int A = 6; // strict number for precise gears
			double res = sigma * (A/A+V); // (A/A+V) --> Xv
			L_Sigma_Gears_A.setText("Result: " + res);
		}
		else {
			int A = 3; // strict number for unprecise gears
			double res = sigma * (A/A+V); // (A/A+V) --> Xv
			L_Sigma_Gears_A.setText("Result: " + res);
		}
		
		 
		
		
	}
	
	@FXML
	public void Straight_Gear_Dim_Wear_module() {
		
		double Mt1 = Double.parseDouble(Mt1_Text.getText());
		double lambda = Double.parseDouble(lambda_Text.getText());
		double k = Double.parseDouble(k_Text.getText());
		double p_am = Double.parseDouble(p_am_Text.getText());
		double B = Double.parseDouble(B_Text.getText());
		
		
		
		double res = k * Math.cbrt((Mt1 * Math.pow(Math.cos(B), 2)) / (lambda * Math.pow(p_am, 2)));
		L_Straight_Gear_Dim_Wear_module.setText("Result: " + res);
	}
	
	@FXML
	public void P_am() {
		
		double H = Double.parseDouble(H_Text.getText());
		double n1 = Double.parseDouble(n1_Text.getText());
		double h = Double.parseDouble(h_Text.getText());
		
		double res = 24.5 * (H / Math.pow(n1, 1/6) * h);
		L_p_am.setText("Result: " + res);
	}
	
	@FXML
	public void k() {
		
		double K1 = Double.parseDouble(K1_Text.getText());
		double at = Double.parseDouble(at_Text.getText());
		double z1 = Double.parseDouble(z1_Text.getText());
		double z2 = Double.parseDouble(z2_Text.getText());
		
		double a = 2*at;
		double res = Math.cbrt(((2 * Math.pow(K1, 2)) / (Math.pow(z1, 2) * Math.sin(a))) * (1 + z1/z2));
		
		L_k.setText("Result: " + res);
	}
	
	@FXML
	public void K1() {
		double E1 = Double.parseDouble(E1_Text.getText());
		double E2 = Double.parseDouble(E2_Text.getText());
		
		
		double res = 1.18 * Math.sqrt((E1 * E2)/(E1 + E2));
		L_K1.setText("Result: " + res);
	}
	
	@FXML
	public void P_max() {
		
		double K1 = Double.parseDouble(K1_Text.getText());
		double Mt1 = Double.parseDouble(Mt1_Text.getText());
		double b = Double.parseDouble(b_Text.getText());
		double at = Double.parseDouble(at_Text.getText());
		double d1 = Double.parseDouble(d1_Text.getText());
		double d2 = Double.parseDouble(d2_Text.getText());
		
		
		double a = at * 2;      
		double res = K1 * Math.sqrt(( (2 * Mt1)/(b * d1 * Math.sin(a) )) * ((1/d1) + (1/d2)) );
		L_P_max.setText("Result: " + res);
	}
	
	@FXML
	public void Verify() {
		
		double p_am = Double.parseDouble(p_am_Text.getText());
		double p_max = Double.parseDouble(p_max_Text.getText());
		
		if(p_am >= p_max) {
			L_Verify.setText("True");
		} 
		else {
			L_Verify.setText("False");
		}
	}
	
	@FXML
	public void Gear_performance() {
		
		ToggleGroup group = new ToggleGroup();
		Precise_Gears.setToggleGroup(group);
		ExternalGear.setToggleGroup(group);
		
		RadioButton selected = (RadioButton) group.getSelectedToggle();
		
		double f = Double.parseDouble(f_Text.getText());
		double z1 = Double.parseDouble(z1_Text.getText());
		double z2 = Double.parseDouble(z2_Text.getText());
		
		if(selected == ExternalGear) {
			double res = 1 - f * Math.PI * ((1/z1) + (1/z2));
			L_Gear_performance.setText("Result: " + res);
		}
		else {
			double res = 1 - f * Math.PI * ((1/z1) - (1/z2));
			L_Gear_performance.setText("Result: " + res);
		}
			
		
	}
}
