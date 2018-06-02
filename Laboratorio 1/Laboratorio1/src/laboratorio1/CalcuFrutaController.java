/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;
import laboratorio1.Frutas;

/**
 * 
 *
 * @author hvill
 */
public class CalcuFrutaController implements Initializable {
    
    @FXML ComboBox primerFrutaComboBox;
    @FXML ComboBox segundaFrutaComboBox;
    
    @FXML RadioButton sumaRadioButton;
    @FXML RadioButton restaRadioButton;
    private ToggleGroup radioButtonSeleccionado;
    
    @FXML Label resultadoLabel;
    
    private ArrayList<Frutas> listaFrutas;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        radioButtonSeleccionado = new ToggleGroup();
        sumaRadioButton.setToggleGroup(radioButtonSeleccionado);
        restaRadioButton.setToggleGroup(radioButtonSeleccionado);
        
        primerFrutaComboBox.setValue(Frutas.Pera);
        segundaFrutaComboBox.setValue(Frutas.Pera);
        resultadoLabel.setText(Frutas.Pera.toString());
        
        radioButtonSeleccionado.selectToggle(sumaRadioButton);
        
        llenarLista();
        llenarComboBox();
    }  
    
    public void llenarLista(){
        listaFrutas = new ArrayList<>();
        for (Frutas value : Frutas.values()) {
            listaFrutas.add(value);
        }
    }
    
    public void llenarComboBox(){
        for (int i = 0; i < listaFrutas.size(); i++) {
            primerFrutaComboBox.getItems().add(listaFrutas.get(i));
            segundaFrutaComboBox.getItems().add(listaFrutas.get(i));
        }
    }
    
    public void muestraResultado(){ 
            if(this.radioButtonSeleccionado.getSelectedToggle().equals(this.sumaRadioButton))    
                if(primerFrutaComboBox.getValue().equals(Frutas.Pera) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
            if(this.radioButtonSeleccionado.getSelectedToggle().equals(this.restaRadioButton))
                if(primerFrutaComboBox.getValue().equals(Frutas.Pera) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Pera)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Manzana)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Limón)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Melón)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja) &&segundaFrutaComboBox.getValue().equals(Frutas.Pera)){
                    resultadoLabel.setText(Frutas.Limón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Manzana)){
                    resultadoLabel.setText(Frutas.Manzana.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Limón)){
                    resultadoLabel.setText(Frutas.Melón.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Melón)){
                    resultadoLabel.setText(Frutas.Pera.toString());
                }
                else if(primerFrutaComboBox.getValue().equals(Frutas.Naranja)&&segundaFrutaComboBox.getValue().equals(Frutas.Naranja)){
                    resultadoLabel.setText(Frutas.Naranja.toString());
                }
    }
    
}
