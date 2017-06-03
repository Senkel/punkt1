import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reports {

	public boolean ContainsHashtag(Tweet tweet,String hashtag){
		if(tweet.getTweet().contains(hashtag)){
			return true;
		}
		return false;
	}
	
	public Tweets Report1(ArrayList<String> lines, String hashtag){
		Tweets tweets = new Tweets();
		
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		for (String line : lines) {	
			Tweet tweet = new Tweet();
			tweet = TweetsParser.parse(line);
			if(ContainsHashtag(tweet, hashtag)){
				tweets.Add(tweet);
			}
		}
		tweets.Print();
		return tweets;
	}
	
	public boolean IsRightDate(Tweet tweet,Date date1, Date date2){
		
		if(date2.before(date1)){
		  Date date = new Date();
		  date = date1;
		  date1 = date2;
		  date2 = date;
		}
		if(tweet.getDate().after(date1) && tweet.getDate().before(date2)){
			return true;
		}
		return false;
	}
	
	public Tweets TweetsInThisDates(ArrayList<String> lines,Date date1,Date date2){
		Tweets tweets = new Tweets();
		for (String line : lines) {	
			Tweet tweet = new Tweet();
			tweet = TweetsParser.parse(line);
			if(IsRightDate(tweet, date1, date2))
			{
				tweets.Add(tweet);
			}
		}
		return tweets;
	}

	public Sentiments GetSentiments(String filename){
		ArrayList<String> Sent = Reader.read(filename);
		Sentiments sentiments = new Sentiments();
		for (String s : Sent) {
			Sentiment sentiment = new Sentiment();
			sentiment = SentimentsParser.parse(s);
			sentiments.Add(sentiment);
		}
		return sentiments;
	}
	
	public Double Weight(String s,Sentiments sentiments){
		
		for(Sentiment sentiment : sentiments.GetSentiments()){
		if(sentiment.GetWord().equals(s.toLowerCase())){
			return sentiment.GetPrice();
		}
		}
		return (double) 0;
	}
	
	public Double AllWeight(Tweets tweets,Sentiments sentiments){
		Double weight = (double) 0;
		for(Tweet tweet : tweets.GetTweets()){
			String tw = tweet.getTweet();
			String [] str = tw.split(" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			for(String s : str){
				weight += Weight(s,sentiments);
				System.out.println(s);
			}
		}
		
		return weight;
	}
	
	public Double Report2(ArrayList<String> lines,Date date1,Date date2,String filename){
		Tweets tweets = TweetsInThisDates(lines,date1,date2);
		Sentiments sentiments = GetSentiments(filename);
		return AllWeight(tweets,sentiments);
	}
}
