import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FilesApp {

	/**
	 * Этот мнтод делает хуйню.
     *
	 * @param args массив хуйни
	 */
	public static void f1(String[] args){
		int begin = Integer.parseInt(args[1]);
		int amount = Integer.parseInt(args[2]);

		ArrayList<String> lines = Reader.read(args[0], begin, amount);
		Reports r = new Reports();

		//Scanner scan = new Scanner(System.in);

		//String hashtag = scan.nextLine();

		//scan.close();

		//Tweets tweets = r.Report1(lines,hashtag);

		//tweets.Print()

		try{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date1 = format.parse("2011-08-28 19:02:27");
			Date date2 = format.parse("2011-08-28 19:02:30");
			Double weight = r.Report2(lines,date1,date2,args[3]);
			System.out.println("\nWeight = " + weight);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void f2(String[] args){
		ArrayList<String> Sent = Reader.read(args[3]);
		Sentiments sentiments = new Sentiments();
		for (String s : Sent) {
			Sentiment sentiment = new Sentiment();
			sentiment = SentimentsParser.parse(s);
			sentiments.Add(sentiment);
		}
		sentiments.Print();
	}

	public static void f3(String[] args){
		States states = new States(StatesParser.parse(Reader.ReadJson(args[4])));
		states.Print();
	}

	public static void main(String[] args) {


		f1(args);
		//f2(args);
		//f3(args);





		//����� �������
		//Polygon p = new Polygon();
		/*Path2D p = new Path2D.Double();
		p.moveTo(1.1,1.1);
		p.moveTo(10.1,10.1);
		System.out.println(p.contains(5, 5));*/

		//BigDecimal d = new BigDecimal();
	}
}