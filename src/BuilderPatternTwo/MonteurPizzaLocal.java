package BuilderPatternTwo;



public class MonteurPizzaLocal extends MonteurPizza {
	private Pizza pizza = new Pizza();
	
	 public void monterPate() {
		 pizza.setPate("feuilleté");
	 }
	 
	 public void monterSauce() {
		 pizza.setSauce("22 épices");
	 }
	 
	 public void monterGarniture() {
		 pizza.setGarniture("escargot");
	 }
	 
	
	public Pizza getPizza() {
	
		return pizza;
	}
}
