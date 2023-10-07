package singletonPatternOne;

public final class Singleton {
	
	// déclaration d'attribut de la classe
   private int x ;
   private int y;
   
   // implémentation du premier constructeur
   private static Singleton singleton;
   
   private Singleton() {
	   super();
   }
   
   // implémentation du second constructeur
   private Singleton(int x, int y) {
	   this.x = x;
	   this.y = y;
   }
   
   // premier methode getInstance
   
   public static Singleton getInstance() {
	   if(singleton == null) {
		   singleton = new Singleton();
	   }
	   
	   return singleton;
   }
   
   // seconde methode getInstance
   
   public static Singleton getInstance(int a, int b) {
	   if(singleton == null) {
		   singleton = new Singleton(a, b);
	   }
	   
	   return singleton;
   }
   
   // Autres méthodes 
   
   public int somme(int x, int y) {
	   return x+y;
   }
   
   public double moyenne(int x, int y) {
	   return somme(x, y)/2 ;
   }
   
   public void affiche() {
	   System.out.println("\n Je suis une instance, mes valeurs sont: x= "+ this.x +" et y= "+this.y );
   }
   
   @Override
   public Object clone() throws
   CloneNotSupportedException {
    throw new CloneNotSupportedException(); }
   
}
