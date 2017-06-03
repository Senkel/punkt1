import java.util.ArrayList;

/**
 * это класс коллекции твитов
 */
public class Tweets {
	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	
	
	public ArrayList<Tweet> GetTweets(){
		return tweets;
	}
	
	public Tweets(){
		
	}
	
	public Tweets(Tweet tw){
		tweets = new ArrayList<Tweet>();
		tweets.add(tw);
	}

	public Tweets(ArrayList<Tweet> tw){
		tweets = new ArrayList<Tweet>();
		for(Tweet t : tw ){
			tweets.add(t);
		}
	}

	/**
	 * добавляет твит в коллекцию
	 * @param tw твит
	 */
	public void Add(Tweet tw){
		tweets.add(tw);
	}

	/**
	 * выводит твиты
	 */
	public void Print(){
		for(Tweet tw : tweets){
			tw.Print();
		}
	}
}
