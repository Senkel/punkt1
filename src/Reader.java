import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * этот класс возвращает определенное кол-во строк из файла
 */
public class Reader {
	static public ArrayList<String> read(String filename, int begin, int amount) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				if (i >= begin && i < begin + amount) {
					System.out.println(line);// !!!
					lines.add(line);
				} else if (i > begin + amount) {
					break;
				}
				i++;
			}
			reader.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return lines;
	}

	static public ArrayList<String> read(String filename) {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			reader.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return lines;
	}

	/**
	 * этот метод возвращает считанную строку из json файла
	 * @param filename путь к файлу
	 * @return строка из json
	 */
	static public String ReadJson(String filename) {
		String line = null;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			line = reader.readLine();
			reader.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return line;
	}
}
