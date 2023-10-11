package BuilderPatternOne;

public class MonteurPizzaReine extends MonteurPizza {
	
 public void monterPate() {
	 pizza.setPate("croiseé");
 }
 
 public void monterSauce() {
	 pizza.setSauce("douce");
 }
 
 public void monterGarniture() {
	 pizza.setGarniture("Jambon+champignon");
 }
}
