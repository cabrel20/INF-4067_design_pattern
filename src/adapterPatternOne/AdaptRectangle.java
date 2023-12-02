package adapterPatternOne;

public class AdaptRectangle implements ICarre {

	private float cote;
	
	public AdaptRectangle(float cote) {
		this.cote = cote;
	}
	
	public float perimetre() {
		return new Rectangle(this.cote, this.cote).perimetre();
	}
	
	public float aire() {
		return new Rectangle(this.cote, this.cote).aire();
	}
	
	
}
