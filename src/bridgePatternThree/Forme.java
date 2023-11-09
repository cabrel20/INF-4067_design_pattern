package bridgePatternThree;

public abstract class Forme {

	Couleur couleur;
	public Forme(Couleur couleur) {
		this.couleur = couleur;
	}
	
	public abstract void colorier();
}
