package BuilderPatternOne;

public class MonteurPizzaPiquante extends MonteurPizza {
	
	@Override
	public void creerNouvellePizza() {
		// TODO Auto-generated method stub
		super.creerNouvellePizza();
	}
	
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
