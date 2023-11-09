package bridgePatternTwo;

public class Rectangle extends Forme {

	public Rectangle(Couleur couleur) {
		super(couleur);
	}
	
	public void colorier() {
		System.out.println("Je suis un rectangle");
		couleur.remplirCouleur();
	}
}
