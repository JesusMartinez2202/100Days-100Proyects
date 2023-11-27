package com.example.conversor;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private TextField txtPesos;
    @FXML
    private TextField txtDolar;
    @FXML
    private Button btnConvertir;

    @FXML
    private void convDolar(){
        try {
            double mxn = Double.parseDouble(this.txtPesos.getText());
            Conversion conv = new Conversion(mxn);
            double resultado = conv.mxnToUsd();
            this.txtDolar.setText(resultado + "");
        } catch(NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR!");
            alert.setContentText("Solo se aceptan números.");
            alert.showAndWait();
        }
    }

    @FXML
    private void convPesos() {
        try {
            double usd = Double.parseDouble(this.txtDolar.getText());
            Conversion conver = new Conversion(usd);
            double resultado = conver.usdToMxn();
            this.txtPesos.setText(resultado + "");
        } catch(NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR!");
            alert.setContentText("Solo se aceptan números.");
            alert.showAndWait();
        }
    }
}