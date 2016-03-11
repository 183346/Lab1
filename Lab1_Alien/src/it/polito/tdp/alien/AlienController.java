package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtInput"
    private TextField txtInput; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML
    void doReset(ActionEvent event) {
    	this.txtResult.clear();
    	this.txtInput.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	this.txtResult.clear();
    	String stringaIntera=this.txtInput.getText();
    	String alienWord="";
    	String italianWord="";
    	AlienDictionary ad = new AlienDictionary();
    	int start=0;
    	if(!ad.controlloInput(stringaIntera)){this.txtResult.appendText("formato non corretto");return;}
    	
    	
    	
    	for(int i=0;i<stringaIntera.length();i++){
    		if(stringaIntera.charAt(i)!=32){
    			alienWord=alienWord+stringaIntera.charAt(i);
    			start=i+1;
    		}else{for(int j=start+1;j<stringaIntera.length();j++){
        		i= stringaIntera.length();
        			italianWord=italianWord+stringaIntera.charAt(j);
    	   		}
    		
    	}}
    	Word word = new Word();
    	if(stringaIntera.indexOf(" ")!=-1){
    	
    	
    	String controllo=word.compare(alienWord);
    	ad.addWord(alienWord, italianWord);
    	
    	
    	this.txtResult.appendText("alien word introdotta:  "+alienWord+"\n"+"italian word tradotta:  "+italianWord);
    	this.txtResult.appendText(controllo);
    	System.out.println(ad.words.entrySet().toString());
    	
    	

    
    }else{
    	String res1 = ad.translateWord(alienWord);
    	this.txtResult.appendText("la traduzione è:   "+ res1);
    }}

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}