package br.edu.ifro;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author 04026720209
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private javafx.scene.control.TextField txtNumero1, txtNumero2, txtResultado ;
    
      @FXML
      private javafx.scene.control.Button btnSoma, btnSubtrair, btnDividr, btnMultiplicar;
    
    @FXML
    private void somar(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double result;
      
      result = num1 + num2;
      
      txtResultado.setText(result.toString());
      
    }
    
     @FXML
     private void subtrair(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double result;
      
      result = num1 - num2;
      
      txtResultado.setText(result.toString());
     }
      
      @FXML
     private void dividir(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double result;
      
      result = num1 / num2;
      
      txtResultado.setText(result.toString());
     }
     
      @FXML
     private void multiplicar(ActionEvent event) {
      Double num1 = Double.parseDouble(txtNumero1.getText());
      Double num2 = Double.parseDouble(txtNumero2.getText());
      Double result;
      
      result = num1 * num2;
      
       txtResultado.setText(result.toString());
     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
