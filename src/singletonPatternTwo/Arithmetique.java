package singletonPatternTwo;

public final class Arithmetique {
	
	// déclaration des attributs de la classe
	private int x;
	private int y;
	String nom ;
	
	// déclaration de l'attribut de la classe
	private static Arithmetique instance ;
	
	// premier constructeur
	private Arithmetique() {
		super();
	}
	
	// second constructeur
	private Arithmetique(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// troisième construteur
	private Arithmetique (int x, int y, String nom) {
		this.x = x;
		this.y = y;
		this.nom = nom ;
	}
	
	// première methode getInstance
	 public static Arithmetique getInstance() {
		 if(instance == null) {
			 instance = new Arithmetique();
		 }
		 
		 return instance ;
	 }
	 
	 // seconde méthode getInstance
	 public static Arithmetique getInstance(int x, int y) {
		 if(instance == null) {
			 instance = new Arithmetique(x,y);
		 }
		 
		 return instance ;
	 }
	 
	 // troisième méthode getInstance
	 public static Arithmetique getInstance(int x, int y, String nom) {
		 if(instance == null) {
			 instance = new Arithmetique(x, y, nom);
		 }
		 
		 return instance ;
	 }
	 
	 // Autres méthodes
	 
	 public int somme(int x, int y) {
		 return x+y ;
	 }
	 
	 public int soustraction (int x, int y) {
		 return x-y ;
	 }
	 
	 public int multiplication (int x, int y) {
		 return x*y;
	 }
	 
	 public float moyenne(int x, int y) {
		 return somme(x, y)/2 ;
	 }
	 
	 public void afficher() {
		 if(nom == null) {
			 System.out.println("\n Je suis une instance dont mes valeurs sont: x= "+this.x + " et y= "+ this.y);
		 }else {
			 System.out.println("\n Je suis une instance dont mes valeurs sont: x= "+this.x + ", y= "+ this.y +" et mon nom est "+ this.nom);
		 }
	 }
	 
	 @Override
	   public Object clone() throws
	   CloneNotSupportedException {
	    throw new CloneNotSupportedException(); }
	   
	

}
