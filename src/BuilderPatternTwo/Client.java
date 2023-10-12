package BuilderPatternTwo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonteurPizza monteurPizza = new MonteurPizzaLocal();
		Directeur directeur = new Directeur();
		Pizza pizza=directeur.construire(monteurPizza);
		pizza.print();

	}

}
