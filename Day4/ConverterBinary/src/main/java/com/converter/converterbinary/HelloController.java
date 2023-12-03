package com.converter.converterbinary;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class HelloController {
    @FXML
    private Button btnConvertir;
    @FXML
    private TextField lbDecimal;
    @FXML
    private TextField lbBinary;
    @FXML
    private Label lbWarning;

    @FXML
    private void toBinary() {
        try {
            if(Integer.parseInt( String.valueOf(lbDecimal.getText()) ) < 0){
                lbWarning.setText("Solamente se aceptan número enteros");
                lbDecimal.clear();
                lbBinary.clear();
            } else{
                int decimal = Integer.parseInt( String.valueOf( lbDecimal.getText() ) );

                if (decimal == 0) {
                    lbDecimal.setText("0");
                }
                StringBuilder binario = new StringBuilder();
                while (decimal > 0) {
                    int residuo = (decimal % 2);
                    decimal = decimal / 2;
                    binario.insert(0, residuo);
                }
                lbBinary.setText(binario.toString());
                lbWarning.setText("");
            }
        } catch(NumberFormatException e){
            lbWarning.setText("Solo se aceptan números.");
            lbDecimal.clear();
            lbBinary.clear();
        }
    }

    @FXML
    private void toDecimal(){

        try{
            if( lbBinary.getText().matches("[10]+") ){
                int binaryNumber = Integer.parseInt( String.valueOf(lbBinary.getText()) );
                int decimalNumber = 0;
                int power = 0;
                while(binaryNumber > 0){
                    int temp = binaryNumber%10;
                    decimalNumber += (int) (temp*Math.pow(2, power));
                    binaryNumber = binaryNumber/10;
                    power++;
                }
                lbDecimal.setText(String.valueOf(decimalNumber));
                lbWarning.setText("");
            } else if(Integer.parseInt(lbBinary.getText()) < 0){
                lbWarning.setText("Solamente se aceptan número enteros");
                lbDecimal.clear();
                lbBinary.clear();
            } else {
                lbWarning.setText("El código binario solamente acepta 1 y/o 0");
                lbDecimal.clear();
                lbBinary.clear();
            }
        } catch(NumberFormatException e){
            lbWarning.setText("Solo se aceptan números.");
            lbDecimal.clear();
            lbBinary.clear();
        }
    }
}