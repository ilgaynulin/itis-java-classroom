import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExprEmail {
	public static void main(String[] args) {
		String text = "my email @ is ilgayn_ulin@gmail.com   my reserve mail  ilyas@gmail.com ";
		String regEx = "^[a-zA-Z0-9._%+-]+?@[a-zA-Z0-9.-]+?\\.[a-zA-Z]{2,6}$";

		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(text);

		int count = 1;
		while(m.find()) {
			System.out.println("Номер найденного слова: " + count);
			System.out.println("text: " + text);
			System.out.println("regEx: " + regEx);
			int foundBeginIndex = m.start();
			int foundEndIndex = m.end();
			System.out.println("foundBeginIndex = " + foundBeginIndex + " foundEndIndex = " + foundEndIndex);
			System.out.println(text.substring(foundBeginIndex, foundEndIndex));
			count++;
		}
	}
}