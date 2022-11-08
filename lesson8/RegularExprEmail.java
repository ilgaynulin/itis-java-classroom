import java.util.regex.Pattern;

public class RegularExprEmail {
	public static void main(String[] args) {
		String text = "my email @ is ilgaynulin@gmail.com   I don't have reserve mail";
		String regEx = "\\s[a-z]+@[a-z\\.]+\\s";

		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(text);

		int count = 0;
		while(m.find()) {
			System.out.println("Номер найденного слова: " + count);
			int foundBeginIndex = m.start();
			int foundEndIndex = m.end();
			System.out.println("foundBeginIndex = " + foundBeginIndex + "foundEndIndex = " + foundEndIndex);
			count++;
		}
	}
}