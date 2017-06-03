
public class SentimentsParser implements IParse<Sentiment>{

	static public Sentiment parse(String s) {
		String[] str = s.split(",");
		return new Sentiment(str[0],Double.parseDouble(str[1]));
	}
}
