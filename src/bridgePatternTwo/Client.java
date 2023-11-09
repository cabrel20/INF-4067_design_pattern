package bridgePatternTwo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forme forme = new Rectangle(new CouleurRouge());
		forme.colorier();
		
		forme = new Cercle(new CouleurBleu());
		forme.colorier();
		
		forme = new Rectangle(new CouleurNoire());
		forme.colorier();

	}

}
