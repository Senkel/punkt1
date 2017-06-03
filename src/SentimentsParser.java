
public class SentimentsParser implements IParse<Sentiment>{
	/**
	 * парсит настроение
	 * @param s строка
	 * @return возвращает настроение
	 */
	static public Sentiment parse(String s) {
		String[] str = s.split(",");
		return new Sentiment(str[0],Double.parseDouble(str[1]));
	}
}
