module com.basicstatistics.basic_statistics {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.basicstatistics.basic_statistics to javafx.fxml;
    exports com.basicstatistics.basic_statistics;
}