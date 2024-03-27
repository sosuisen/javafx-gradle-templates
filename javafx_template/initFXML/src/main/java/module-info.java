// 'myapp': Your module name
// 'com.example': Your package name
module myapp {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.example to javafx.fxml, javafx.graphics;
}
