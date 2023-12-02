package compositePatternTwo;

import java.security.PublicKey;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SousRepertoire sousRepertoire = new SousRepertoire("Cours M1");
		SousRepertoire sousRepertoire2 = new SousRepertoire("Cours_S1");
		Fichier fichier = new Fichier("pattern de construction", "pdf");
		Fichier fichier2 = new Fichier("pattern de structuration", "txt");
		Fichier fichier3 = new Fichier("pattern comportement", "pdf");
		
		sousRepertoire2.ajouter(fichier3);
		sousRepertoire.ajouter(fichier2);
		sousRepertoire.ajouter(fichier);
		sousRepertoire.ajouter(sousRepertoire2);
		sousRepertoire.decrire();
		
		
		
		

	}

}
