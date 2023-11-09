package decorateurPatternOne;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fenetre fenetre = new FenetreSimple();
		Decorateur decorateur = new DecorateurHorizontal(fenetre);
		decorateur.dessiner();
		decorateur.decrire();
		decorateur.dessinerCurseur();
		
	}

}
