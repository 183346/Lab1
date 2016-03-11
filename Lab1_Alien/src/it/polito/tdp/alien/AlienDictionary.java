package it.polito.tdp.alien;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienDictionary {
	public static Map<String,Word> words = new TreeMap<String,Word>();
	
	public void addWord(String alienWord, String translation){
		Word word = new Word();
		word.setAlienWord(alienWord);
		word.setTranslation(translation);
		words.put(alienWord,word);
		
	}

	
	public String translateWord(String alienWord){
		String result="";
		if(!words.containsKey(alienWord)){
			result=null;
		}else {result=words.get(alienWord).getTranslation();}
		
		
		return result;
			
	}
	public boolean controlloInput(String text) {
		 Pattern p = Pattern.compile("^[a-z,A-Z]+[ ]{1}+[a-z,A-Z]+|[a-z,A-Z]+$");
		// il punto interrogativo indica OPZIONALE
		 //IL SIMBOLO + CONCATENA
		 //esempio per numeri reali
		 // il carattere | indica la OR
		 //le due sbarre \\ si mettono davanti ai caratteri speciali
		// Pattern p = Pattern.compile("^[+-]?\\d+\\.\\d+|\\d+|\\.\\d+|\\d+\\.$");
		 
		 Matcher m = p.matcher(text);
		 boolean b = m.matches();
		 
		 return b;
	}
}
