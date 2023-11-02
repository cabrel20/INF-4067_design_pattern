package compositePatternOne;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Section section = new Section();
         Paragraphe paragraphe = new Paragraphe("Introduction","Hello everyone");
         section.ajouter(paragraphe);
         System.out.println("La longueur de la section vaut: "+ section.longueur());
	}

}
