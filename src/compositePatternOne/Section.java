package compositePatternOne;

import java.util.ArrayList;

public class Section implements Text {
    private ArrayList<Text> sousSections = new ArrayList<Text>();
    private int longueur = 0;
    
    
    
    public int longueur() {
    	for(int i=0; i < sousSections.size();i++) {
    		longueur += sousSections.get(i).longueur();
    	}
    	return longueur;
    }
    
    public void ajouter(Text text) {
    	sousSections.add(text);
    };
    public void retirer(Text text) {
    	sousSections.remove(text);
    };
    
}
