package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/* No leading slash - it looks in the current "application" package
	        Parent root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
	        primaryStage.setTitle("Mechanical Calculator - By Yan C.");
	        primaryStage.setScene(new Scene(root, 1000, 700));
	        primaryStage.show();
	        */
			
			Parent root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
            primaryStage.setTitle("Mechanical Calculator - By Yan Chizhevskiy");           
            Scene scene = new Scene(root, 1000, 700);        
            String css = getClass().getResource("/styles/application.css").toExternalForm();
            scene.getStylesheets().add(css);
            primaryStage.setScene(scene);           
            primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
