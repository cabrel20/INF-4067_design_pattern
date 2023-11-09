package decorateurPatternOne;

public class DecorateurVertical extends Decorateur {

	public DecorateurVertical(Fenetre fenetre) {
		super(fenetre);
	}
	
	public void dessiner() {
		fenetreDecoree.dessiner();
	}
	
	public void decrire() {
		fenetreDecoree.decrire();
	}
	
	public void dessinerCurseur() {
		System.out.println("Scrollbar vertical activé");
	}
}
