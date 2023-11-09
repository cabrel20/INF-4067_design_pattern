package bridgePatternThree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forme forme = new Rectangle(new CouleurRouge());
		forme.colorier();
		
		forme = new Cercle(new CouleurBleu());
		forme.colorier();
		
		forme = new Carre(new CouleurNoire());
		forme.colorier();
		

	}

}
