package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;

public class Conic_GearsController {
	//__________________________________| LABELS |__________________________________________________________|
	
	@FXML
	private Label L_Medium_Module_Break_CG;
	
	@FXML
	private Label L_Max_Module_Break_CG;
	
	@FXML
	private Label L_Medium_Module_Wear_CG;
	
	@FXML
	private Label L_kc_Wear_CG;
	
	@FXML
	private Label L_Verify_Wear_CG;
	
	
	
	//____________________________________| TEXT_FIELDS |___________________________________________________|
	
	@FXML
	private TextField Mt_TextField;
	
	@FXML
	private TextField Mt1_TextField;
	
	@FXML
	private TextField E_TextField;
	
	@FXML
	private TextField lambda_m_TextField;
	
	@FXML
	private TextField y_TextField;
	
	@FXML
	private TextField a_TextField;
	
	@FXML
	private TextField sigma_TextField;
	
	@FXML
	private TextField sigma1_TextField;
	
	@FXML
	private TextField sigma2_TextField;
	
	@FXML
	private TextField mm_TextField;
	
	@FXML
	private TextField delta_TextField;
	
	@FXML
	private TextField pam_TextField;
	
	@FXML
	private TextField K1_TextField;
	
	@FXML
	private TextField kc_TextField;
	
	@FXML
	private TextField z_TextField;
	
	@FXML
	private TextField z1_TextField;
	
	@FXML
	private TextField z2_TextField;
	
	@FXML
	private TextField b_TextField;
	
	@FXML
	private TextField d1m_TextField;
	
	@FXML
	private TextField d2m_TextField;
	
	
	
	//____________________________| BREAK |_______________________________________________________________|

	@FXML
	public void Medium_Module_Break_CG() {
			
		double Mt = Double.parseDouble(Mt_TextField.getText());
		double lambda_m = Double.parseDouble(lambda_m_TextField.getText());	
		double sigma = Double.parseDouble(sigma_TextField.getText());
		double y = Double.parseDouble(y_TextField.getText());
		double z = Double.parseDouble(z_TextField.getText());
		double E = Double.parseDouble(E_TextField.getText());
		
		
		double res = Math.cbrt((2 * E * Mt)/(lambda_m * z * sigma * y));
		
		L_Medium_Module_Break_CG.setText("Result: " + res);
	}
	
	@FXML
	public void Max_Module_Break_CG() {
		
		double delta = Double.parseDouble(delta_TextField.getText());
		double z = Double.parseDouble(z_TextField.getText());
		double mm = Double.parseDouble(mm_TextField.getText());
		double lambda_m = Double.parseDouble(lambda_m_TextField.getText());
		
		double m = mm * (1 + (lambda_m/z) * Math.sin(delta));
		
		L_Max_Module_Break_CG.setText("Result: " + m);
		
	}
	
	//__________________________| Wear |___________________________________________________________________|
	
	@FXML
	public void Medium_Module_Wear_CG() {
		
		double kc = Double.parseDouble(kc_TextField.getText());
		double Mt1 = Double.parseDouble(Mt1_TextField.getText());
		double E = Double.parseDouble(E_TextField.getText());
		double delta = Double.parseDouble(delta_TextField.getText());
		double lambda_m = Double.parseDouble(lambda_m_TextField.getText());
		double pam = Double.parseDouble(pam_TextField.getText());
		
		double mm = kc * Math.cbrt((Mt1 * E * Math.pow(Math.cos(delta), 2))/(lambda_m * Math.pow(pam, 2)));
		
		L_Medium_Module_Wear_CG.setText("Result: " + mm);
	}
	
	@FXML
	public void kc_Wear_CG() {
		
		double K1 = Double.parseDouble(K1_TextField.getText());
		double z1 = Double.parseDouble(z1_TextField.getText());
		double z2 = Double.parseDouble(z2_TextField.getText());
		double a = Double.parseDouble(a_TextField.getText());
		double sigma1 = Double.parseDouble(sigma1_TextField.getText());
		double sigma2 = Double.parseDouble(sigma1_TextField.getText());
		
		
		double kc = Math.cbrt( ( ( 2 * Math.pow(K1, 2) ) / ( Math.pow(z1, 2) * Math.sin( 2 * a) )) * (1 + (z1 * Math.cos(sigma2))/(z2 * Math.cos(sigma1))) );
		L_kc_Wear_CG.setText("Result: " + kc);
	}
	
	
	@FXML
	public void Verify_Wear_CG() {
		
		double a = Double.parseDouble(a_TextField.getText());
		double b = Double.parseDouble(b_TextField.getText());
		double E = Double.parseDouble(E_TextField.getText());
		double Mt1 = Double.parseDouble(Mt1_TextField.getText());
		double d1m = Double.parseDouble(d1m_TextField.getText());
		double d2m = Double.parseDouble(d2m_TextField.getText());
		double sigma1 = Double.parseDouble(sigma1_TextField.getText());
		double sigma2 = Double.parseDouble(sigma2_TextField.getText());
		
		double kc = Math.cbrt(((2 * E * Mt1 * Math.cos(sigma1))/(b * d1m * Math.sin(2 * a))) * ((Math.cos(sigma1)/d1m) + (Math.cos(sigma2)/d2m)));
		
		L_Verify_Wear_CG.setText("Result: " + kc);
	}
	
}
