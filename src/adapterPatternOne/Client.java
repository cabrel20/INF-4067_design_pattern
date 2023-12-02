package adapterPatternOne;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdaptRectangle carre = new AdaptRectangle(4);
		System.out.println("Le perimetre de ce carre est "+carre.perimetre());
		System.out.println("L'aire de ce carre est "+carre.aire());
	}

}
