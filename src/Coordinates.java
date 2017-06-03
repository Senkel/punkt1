
public class Coordinates {
	private double x;
	private double y;

	public Coordinates() {

	}

	public Coordinates(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String  ToString(){
		return "x = " + x +"\n" +"y = " + y;
	}
}
