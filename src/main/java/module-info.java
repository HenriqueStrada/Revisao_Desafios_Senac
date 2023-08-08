module com.example.revisaodesafops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.revisaodesafops to javafx.fxml;
    exports com.example.revisaodesafops;
}