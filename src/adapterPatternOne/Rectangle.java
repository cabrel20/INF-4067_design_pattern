package adapterPatternOne;

public class Rectangle {

	private float longueur;
	private float largeur;
	
	public Rectangle(float longueur, float largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public float perimetre() {
		return (longueur * largeur)*2;
	}
	
	public float aire() {
		return longueur * largeur;
	}
}
