package compositePatternOne;

public class Paragraphe implements Text {
	
	private String titre;
	private String preambule;
	
	public Paragraphe(String titre, String preambule) {
		this.titre = titre;
		this.preambule = preambule;
	}
	
  public int longueur() {
	  return titre.length() + preambule.length();
  }
}
