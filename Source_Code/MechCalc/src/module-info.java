module Testing {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens Navigation to javafx.fxml;
	opens Controllers to javafx.fxml;
}
