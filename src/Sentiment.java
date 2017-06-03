
public class Sentiment {
	private String word = new String();
	private Double price;

	public String GetWord(){
		return word;
	}
	public Double GetPrice(){
		return price;
	}
	
	public Sentiment(){
		
	}
    public Sentiment(String word,Double price){
		this.word = word;
		this.price = price;
	}

	public void print() {
		System.out.println(word);
		System.out.println(price);
	}
}
