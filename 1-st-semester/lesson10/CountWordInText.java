
public class CountWordInText {
	public static void main(String[] args) {
		String text = "Привет    мир!    ";
		String text1 = "   Привет    мир!    ";
		String text2 = "Привет";

		wordCounter(text);
		wordCounter(text1);
		wordCounter(text2);


		
	}
	static void wordCounter(String text) {
		int wordCounter = 0;
		boolean isWord = false;
		for(int i = 0; i < text.length() - 1; i++) {
			if(text.charAt(i) != ' ' && !isWord) {
				wordCounter++;
				isWord = true;
			}
			if(text.charAt(i) == ' ' && isWord) {
				isWord = false;
			}
		}

		System.out.println(wordCounter);
	}
}