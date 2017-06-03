import java.util.ArrayList;

public class StatesParser implements IParse<State>{

	static public ArrayList<State> parse(String line) {
		ArrayList<State> states = new ArrayList<State>();
		try {
			State state = new State();
			String[] str = line.split("\"");
			for (int n = 2; n < str.length; n += 2) {
				String[] data = str[2].split(",");
				ArrayList<Double> x = new  ArrayList<Double>();
				ArrayList<Double> y = new  ArrayList<Double>();
				for (int i = 0; i < data.length - 1; i++) {
					data[i] = data[i].replaceAll("\\[|\\]|\\:| ", "");
					if (i % 2 == 0) {
						x.add(Double.parseDouble(data[i]));
					} else {
						y.add(Double.parseDouble(data[i]));
					}
				}
				state = new State(str[n - 1], x, y);
				states.add(state);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return states;
	}
	
}
