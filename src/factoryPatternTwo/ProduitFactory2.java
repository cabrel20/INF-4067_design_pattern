package factoryPatternTwo;

public class ProduitFactory2 extends ProduitFactory {
	
	 protected Produit createProduit() {
	    	return new ProduitA2();
	    }
}
