import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExprQuotesGreedyLazy {
	public static void main(String[] args) {
		String text = "И он сказал: \"Привет!\". Я тем временем сказал \"И тебе привет!\"";
		String regEx = "\".+?\"";

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