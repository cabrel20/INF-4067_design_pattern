package compositePatternTwo;

import java.util.ArrayList;

public class SousRepertoire implements Repertoire {
	
	private ArrayList<Repertoire> repertoires = new ArrayList<Repertoire>();
	private String nom;
	private String type;
	
	public SousRepertoire(String nom) {
	   this.nom = nom;
	   this.type = "Dossier";
	}
	
	// méthode décrire
	
	public void decrire() {
		System.out.println(this.type+" "+this.nom+"\\"+"\n");
		for (int i = 0; i < repertoires.size(); i++) {
			repertoires.get(i).decrire();
		}
	}
  
	// méthode  ajouter
	public void ajouter(Repertoire repertoire) {
		repertoires.add(repertoire);
	}
	
	// méthode supprimer
	public void supprimer(Repertoire repertoire) {
		repertoires.remove(repertoire);
	}
	
	// méthode obtenir
	
	public void obtenir(Repertoire repertoire) {
		
		for (int i = 0; i < repertoires.size(); i++) {
			if(repertoires.get(i).equals(repertoire)) {
				System.out.println("Cet élément est le "+ i+ " ème élément");
			}
		}
	}
	
	
	
	
}
