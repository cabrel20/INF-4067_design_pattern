package BuilderPatternOne;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonteurPizza monteurPizza = new MonteurPizzaPiquante();
		Directeur directeur = new Directeur();
		Pizza pizza=directeur.construire(monteurPizza);
		pizza.print();

	}

}
