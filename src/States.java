import java.util.ArrayList;

public class States implements IParse<State> {
	private ArrayList<State> states = new ArrayList<State>();
	
	public States()
	{
		
	}
	
	public States(ArrayList<State> states){
		for(State st : states){
			this.states.add(st);
		}
	}


	public void Print() {
		for (State st : this.states) {
			st.print();
		}
	}
	
	public void setStates(ArrayList<State> value)
	{
		this.states = value;
	}
}
