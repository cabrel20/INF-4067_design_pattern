package factoryPatternOne;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Produit produit = null ;
        ProduitFactory produitFactory = new ProduitFactory();
        
        produit = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produit.methodeA();
        
        produit = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produit.methodeA();
        
        produit = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produit.methodeA();
	}

}
