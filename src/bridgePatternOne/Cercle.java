package bridgePatternOne;

public class Cercle extends Forme {

	public Cercle(Couleur couleur) {
		super(couleur);
	}
	
	public void colorier() {
		System.out.println("Je suis un cercle");
		couleur.remplirCouleur();
	}
}
