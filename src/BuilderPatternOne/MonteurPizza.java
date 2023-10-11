package BuilderPatternOne;

public abstract class MonteurPizza {

	protected Pizza pizza = new Pizza();
	public Pizza getPizza() { return pizza; }
	 public void creerNouvellePizza() { pizza = new Pizza(); }
	 public abstract void monterPate();
	 public abstract void monterSauce();
	 public abstract void monterGarniture();
}
