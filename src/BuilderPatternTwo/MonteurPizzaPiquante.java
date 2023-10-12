package BuilderPatternTwo;

public class MonteurPizzaPiquante extends MonteurPizza {
	
	private Pizza pizza = new Pizza();
	
	 public void monterPate() {
		 pizza.setPate("feuilleté");
	 }
	 
	 public void monterSauce() {
		 pizza.setSauce("piquante");
	 }
	 
	 public void monterGarniture() {
		 pizza.setGarniture("peperoni+salami");
	 }
	 
	 
		public Pizza getPizza() {
			return pizza;
		}
}
