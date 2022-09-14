package com.example;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Exemplo implements Initializable{

    @FXML
    private DatePicker dpData;

    @FXML
    private TextField tfNumero;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        //Inicializa o DatePicker com a data de hoje
        dpData.setValue(LocalDate.now());
        
    }


    @FXML
    private void pegarValores(ActionEvent evt){

        LocalDate data = dpData.getValue(); //pega a data selecionada
        //LocalDate data = LocalDate.now(); //pega a data de hoje

        String sNumero = tfNumero.getText();

        //tenta fazer a conversão do texto para número
        double numero = 0;
        try{
            numero = Double.valueOf(sNumero); //converte a string digitada em double.
            //Para converter para int, utilize Integer.valueOf(sNumero)
        }catch(NumberFormatException e){
            //se o usuário digitou um número inválido, com letra ou outra coisa
            //gera um erro e para a execução.
            Alert alert = new Alert(AlertType.INFORMATION,"Número inválido!");
            alert.showAndWait();
            return;
        }
        
        //Faz a conversão da data para o formato de data BR
        String dataBR = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String msg = "Você selecionou a data "+dataBR+". E digitou o numero "+numero;

        Alert alert = new Alert(AlertType.INFORMATION,msg);
        alert.showAndWait();

    }



    
}
