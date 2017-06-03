import java.util.ArrayList;

public class State {
	private String state;
	private ArrayList<Coordinates> coor = new ArrayList<Coordinates>();

	public State() {

	}

	public State(String state, ArrayList<Coordinates> coor) {
		this.state = state;
		this.coor = coor;
	}
	
	public State(String state,ArrayList<Double> x,ArrayList<Double> y){
		this.state = state;
		for(int i=0;i<x.size();i++){
		coor.add(new Coordinates(x.get(i),y.get(i)));
		}
	}
	
	public State(String state,double [] x, double [] y){
		this.state = state;
		
		for(int i=0;i<x.length;i++){
		this.coor.add(new Coordinates(x[i],y[i]));
		}
	}

	public void print() {
		System.out.println("Штат = " + state);
		for(Coordinates c :coor){
			System.out.println(c.ToString());
		}
	}
}
