module org.example.cscfeb19lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.example.cscfeb19lab2 to javafx.fxml;
    exports org.example.cscfeb19lab2;
}