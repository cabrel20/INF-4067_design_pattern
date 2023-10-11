package BuilderPatternOne;

public class Directeur {

	public Pizza construire(MonteurPizza monteurPizza) {
		monteurPizza.monterPate();
		monteurPizza.monterSauce();
		monteurPizza.monterGarniture();
		return monteurPizza.getPizza();	
	}
}
