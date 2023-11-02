package CompositePatternTwo;

public class Fichier implements Repertoire {
	
	private String nom;
	private String type;
	
   public Fichier(String nom, String type) {
	   this.nom = nom;
	   this.type = type;
   }
   
   public void decrire() {
	   System.out.println("Nom: "+nom+"\nType: "+type);
   }
   
   
}
