package decorateurPatternOne;

public abstract class Decorateur implements Fenetre {
	
	protected Fenetre fenetreDecoree;
	
	public Decorateur(Fenetre fenetreDecoree) {
		this.fenetreDecoree = fenetreDecoree;
	}

	public abstract void dessiner();
	public abstract void decrire();
	public abstract void dessinerCurseur();
}
