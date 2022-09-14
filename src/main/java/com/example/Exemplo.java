package com.example;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Exemplo {

    @FXML
    private DatePicker dpData;

    @FXML
    private TextField tfNumero;


    @FXML
    private void pegarValores(ActionEvent evt){

        LocalDate data = dpData.getValue(); //pega a data selecionada
        String sNumero = tfNumero.getText();


        double numero = Double.valueOf(sNumero); //converte a string digitada em double.
        //Para converter para int, utilize Integer.valueOf(sNumero)

        String msg = "Você selecionou a data "+data+". E digitou o numero "+numero;

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();

    }
    
}
