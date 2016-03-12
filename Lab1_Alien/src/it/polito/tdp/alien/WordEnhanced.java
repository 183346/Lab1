package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	private String  translation;
	
	private static List<WordEnhanced> lista1 = new LinkedList<WordEnhanced>();
	
	
	



	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTranslation() {
		return translation;
	}


	public void setTranslation(String translation) {
		this.translation = translation;
	}


	

	
	public void addWord(String alienWord, String translation){
		this.alienWord=alienWord;
		this.translation=translation;
		this.lista1.add(this);
		
		
		
		return ;
		
	}


	public String getLista(String alienWord2) {
		String result="";
		for(WordEnhanced l:lista1){
			
			if(l.getAlienWord().compareTo(alienWord2)==0){
				result = result+"traduzione:  "+l.getTranslation()+"\n";
			}
		}
		return result;
	}
	
	public List<WordEnhanced> getListaa(){
		
		
		return this.lista1;
	}


	@Override
	public String toString() {
		return "WordEnhanced [alienWord=" + alienWord + ", translation=" + translation + "]";
	}
	
}
