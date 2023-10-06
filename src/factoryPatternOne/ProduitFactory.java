package factoryPatternOne;

public class ProduitFactory {
  public static final int TYPE_PRODUITA1 = 1 ;
  public static final int TYPE_PRODUITA2 = 2 ;
  public static final int TYPE_PRODUITA3 = 3 ;
  
  
  
  public Produit getProduitA(int typeProduit) {
	  Produit produit = null;
	  switch (typeProduit) {
	case TYPE_PRODUITA1:
		produit = new ProduitA1();
		break;
	case TYPE_PRODUITA2:
		produit = new ProduitA2();
		break;
	case TYPE_PRODUITA3:
		produit = new ProduitA3();
		break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + typeProduit);
	}
	  return produit;
  }
}
