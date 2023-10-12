package BuilderPatternTwo;

public class MonteurPizzaReine extends MonteurPizza {
	
	private Pizza pizza = new Pizza();
	
 public void monterPate() {
	 pizza.setPate("croiseé");
 }
 
 public void monterSauce() {
	 pizza.setSauce("douce");
 }
 
 public void monterGarniture() {
	 pizza.setGarniture("Jambon+champignon");
 }
 

	public Pizza getPizza() {
		
		return pizza;
	}
}
