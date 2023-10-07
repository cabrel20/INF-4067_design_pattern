package singletonPatternTwo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetique arithmetique1 = Arithmetique.getInstance(23, 16, "John Doe");
		 arithmetique1.afficher();
		 
		 Arithmetique arithmetique2 = Arithmetique.getInstance(25, 6);
		 arithmetique2.afficher();
		 
		 Arithmetique arithmetique3 = Arithmetique.getInstance();
		 arithmetique3.afficher();
		
	}

}
