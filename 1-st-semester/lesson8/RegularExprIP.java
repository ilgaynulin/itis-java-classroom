import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExprIP {
	public static void main(String[] args) {
		String text = "next ips 192.168.1.1 my ip 10.10.154.1  secondIP    1.1.1.1";
		String regEx = "(\\d{1,3}\\.){3}(\\d{1,3})";


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