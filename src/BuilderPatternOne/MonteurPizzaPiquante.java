package BuilderPatternOne;

public class MonteurPizzaPiquante extends MonteurPizza {
	 public void monterPate() {
		 pizza.setPate("feuilleté");
	 }
	 
	 public void monterSauce() {
		 pizza.setSauce("piquante");
	 }
	 
	 public void monterGarniture() {
		 pizza.setGarniture("peperoni+salami");
	 }
}
