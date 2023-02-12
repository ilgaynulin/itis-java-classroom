import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExprURL {
	public static void main(String[] args) {
		String text = "my website mail.ru github home page github.com  classroom classroom.github.com";
		String regEx = "([a-z]+\\-?[a-z]+\\.){1,30}[a-z]{2,4}";


		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(text);

		System.out.println("text: " + text);
		System.out.println("regEx: " + regEx);
		int count = 1;
		while(m.find()) {
			System.out.println("Номер найденного слова: " + count);
			
			int foundBeginIndex = m.start();
			int foundEndIndex = m.end();
			System.out.println("foundBeginIndex = " + foundBeginIndex + " foundEndIndex = " + foundEndIndex);
			System.out.println(text.substring(foundBeginIndex, foundEndIndex));
			System.out.println();
			count++;
		}
	}
}