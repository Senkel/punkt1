import java.util.ArrayList;

public class Sentiments {
	ArrayList<Sentiment> sentiments = new ArrayList<Sentiment>();
	
	public ArrayList<Sentiment> GetSentiments(){
		return sentiments;
	}
	
	public Sentiments(){
		
	}

	public Sentiments(Sentiment sent){
		sentiments.add(sent);
	}
	
	public Sentiments(ArrayList<Sentiment> sent){
		for(Sentiment s : sent)
			sentiments.add(s);
	}
	
	public void Add(Sentiment s){
		sentiments.add(s);
	}
	
	public void Print(){
		for(Sentiment s:sentiments ){
			s.print();
		}
	}

}
