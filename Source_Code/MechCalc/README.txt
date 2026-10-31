================================================================================
MECHANICAL CALCULATOR APPLICATION - JAVAFX
================================================================================

REFERENCE MANUAL:
This application is heavily based on the formulas and principles found in:
"Manuale di meccanica Nuova Edizione rinnovata e ampliata a cura di Luigi 
Caligaris Stefano Fava Carlo Tomasello Hoepli seconda edizione".

IMPORTANT WARNING & INTELLECTUAL PROPERTY NOTICE:
This calculator is intellectual property. The formulas present in this 
application are NOT complete. Not all mechanical formulas from the reference 
manual were implemented as the complete set is too vast and complex. Do not use 
these calculations for production-critical engineering without manual verification.

PROJECT STRUCTURE:
- /src/Controllers/      : Contains all mathematical logic classes (Domain).
- /src/UI/               : Contains the JavaFX Main application and UI Controller.
- /src/Resources/        : Contains the .fxml and .css for the Ui.

HOW TO RUN:
1. Ensure you have Java JDK 11+ and JavaFX installed and configured in your IDE.
2. Add the JavaFX library to your build path.
3. Add VM options if running via CLI: 
   --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml
4. Run the UI.Main class.






