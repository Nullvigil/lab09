module lincz.matthew.lab09 {
    requires javafx.controls;
    requires javafx.fxml;

    opens lincz.matthew.lab09 to javafx.fxml;
    exports lincz.matthew.lab09;
}
