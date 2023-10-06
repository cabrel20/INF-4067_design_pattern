package factoryPatternTwo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();
        
        Produit produit = null;
        
        System.out.println("Utilisation de la première fabrique");
        produit = produitFactory1.getProduit();
        produit.methodeA();
        
        System.out.println("Utilisation de la deuxième fabrique");
        produit = produitFactory2.getProduit();
        produit.methodeA();
        
        System.out.println("Utilisation de la troisième fabrique");
        produit = produitFactory3.getProduit();
        produit.methodeA();
        
	}

}
