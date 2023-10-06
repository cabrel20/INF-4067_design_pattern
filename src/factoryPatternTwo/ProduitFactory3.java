package factoryPatternTwo;

public class ProduitFactory3 extends ProduitFactory {
	
	 protected Produit createProduit() {
	    	return new ProduitA3();
	    }
}
