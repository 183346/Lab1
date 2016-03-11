package it.polito.tdp.alien;

import java.util.Set;
import java.util.TreeSet;

public class Word implements Comparable<Word>{
	
	private String alienWord;
	private String  translation;
	
	
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
	
	
	public String compare(String alienWord){
		String result="\n E' una nuova parola aliena";
		AlienDictionary ad = new AlienDictionary();
		for(String w:ad.words.keySet()){
			if(w.compareTo(alienWord)==0){
				result="\n Parola già esistente nel dizionario";
			}
		}
		
		
		return result;		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Word [alienWord=" + alienWord + ", translation=" + translation + "]";
	}
	@Override
	public int compareTo(Word arg0) {
		
		return this.getAlienWord().compareTo(arg0.getAlienWord());
	}

}
