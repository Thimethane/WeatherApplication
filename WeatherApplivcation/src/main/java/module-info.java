module com.mycompany.weatherapplivcation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;

    opens com.mycompany.weatherapplivcation to javafx.fxml;
    exports com.mycompany.weatherapplivcation;
}
