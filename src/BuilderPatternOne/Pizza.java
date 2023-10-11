package BuilderPatternOne;

public class Pizza {

	public String pate = "";
	public String sauce = " ";
	public String garniture = " ";
	
	public void setPate(String pate) {
		this.pate = pate;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void setGarniture(String garniture) {
		this.garniture = garniture;
	}
	
	public void print() {
		 System.out.println(this.toString());
		 System.out.println("Pate = " + pate + "\nSauce = " + sauce +
		"\nGarniture = " + garniture);}
}
