import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {
	private Coordinates coor;
	private int number;
	private Date date;
	private String tweet;
	static private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	public Tweet() {

	}

	public Tweet(Coordinates coor ,int number, String str,String tweet) {
		try {
		this.coor = coor;
		this.number = number;		
		this.date = format.parse(str);
		this.tweet = tweet;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getTweet(){
		return tweet;
	}
	public Date getDate(){
		return date;
	}

	/**
	 * выводит информацию о твите
	 */
	public void Print(){
		System.out.println("Coor :\n"+ coor.ToString()+"\n" + "date = "+ format.format(date)+ "\nTweet = "+ tweet);
	}
	
	public String ToString() {


		return "Coor :\n"+ coor.ToString()+"\n" + "date = "+ format.format(date)+ "Tweet = "+ tweet;
	}
}
