package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Flat_BeltsController {
	
	//____________________________________________________________________________________________
	
	@FXML
	private TextField P_Text;
	
	@FXML
	private TextField Fs_Text;
	
	@FXML
	private TextField Ft_Text;
	
	@FXML
	private TextField P0_Text;
	
	@FXML
	private TextField k_Text;
	
	@FXML
	private TextField Pc_Text;
	
	@FXML
	private TextField P1_Text;
	
	@FXML
	private TextField Fa_Text;
	
	@FXML
	private TextField F_Text;
	
	
	
	//____________________________________________________________________________________________
	
	@FXML
	private Label L_Pc;
	
	@FXML
	private Label L_P1;
	
	@FXML
	private Label L_Belt_Width;
	
	@FXML
	private Label L_Q;
	
	@FXML
	private Label L_T;
	
	@FXML
	private Label L_t;
	
	//____________________________________________________________________________________________
	
	@FXML
	public void Pc(){
	    double P = Double.parseDouble(P_Text.getText());
	    double Fs = Double.parseDouble(Fs_Text.getText());
	    double Ft = Double.parseDouble(Ft_Text.getText());
		double res = P * Fs* Ft;
		
		L_Pc.setText("Result: " + res);
					
	}
	
	@FXML
	public void P1(){
		double P0 = Double.parseDouble(P0_Text.getText());
		double k = Double.parseDouble(k_Text.getText());
		
		double res = P0 * k;
		L_P1.setText("Result: " + res);
	}
	
	@FXML
	public void Belt_Width(){
		double Pc = Double.parseDouble(Pc_Text.getText());
		double P1 = Double.parseDouble(P1_Text.getText());
		double Fa = Double.parseDouble(Fa_Text.getText());
	
		double res = Pc/(P1 * Fa);
		L_Belt_Width.setText("Result: " + res);
	}
	
	@FXML
	public void Q(){
		double F = Double.parseDouble(F_Text.getText());
	
		double res = 4 * F;
		L_Q.setText("Result: " + res);	
	}
	
	@FXML
	public void T(){
		double F = Double.parseDouble(F_Text.getText());
		
		double res = 2.5 * F;
		L_T.setText("Result: " + res);	
	}
	
	@FXML
	public void t(){
		double P = Double.parseDouble(P_Text.getText());
		double Fs = Double.parseDouble(Fs_Text.getText());
		double Ft = Double.parseDouble(Ft_Text.getText());
		
		double res = P * Fs* Ft;
		L_t.setText("Result: " + res);			
	}
}
