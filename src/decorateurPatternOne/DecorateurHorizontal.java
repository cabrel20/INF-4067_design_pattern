package decorateurPatternOne;

public class DecorateurHorizontal extends Decorateur {

	public DecorateurHorizontal(Fenetre fenetre) {
		super(fenetre);
	}
	
	public void dessiner() {
		fenetreDecoree.dessiner();
	}
	
	public void decrire() {
		fenetreDecoree.decrire();
	}
	
	public void dessinerCurseur() {
		System.out.println("Scrollbar horizontal activé");
	}
}
