package factoryPatternTwo;

public class ProduitFactory1 extends ProduitFactory {
    protected Produit createProduit() {
    	return new ProduitA1();
    }
}
