package bridgePatternThree;

public class Carre extends Forme {

	public Carre(Couleur couleur) {
		super(couleur);
	}
	
	public void colorier() {
		System.out.println("Je suis un Carre");
		couleur.remplirCouleur();
	}
}
