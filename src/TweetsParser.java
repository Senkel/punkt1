
public class TweetsParser implements IParse<Tweet> {
	/**
	 * вохвращает распаршенный твит из строки
	 * @param line строка
	 * @return твит
	 */
	static public Tweet parse(String line) {
		String[] str = line.split("\\[|\\]");
		String[] cord = str[1].split(", ");
		str = str[2].split("\\t");
		int number = Integer.parseInt(str[1]);
		return new Tweet(new Coordinates(Double.parseDouble(cord[0]), Double.parseDouble(cord[1])),number, str[2], str[3]);
	}

}
