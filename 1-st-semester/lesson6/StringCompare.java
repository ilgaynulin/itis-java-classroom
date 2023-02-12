public class StringCompare {
	public static void main(String[] args) {
		if(args.length != 2 || args[0].length() != args[1].length()) {
			System.out.println("Введите 2 аргумента с равной длиной");
			return;
		}

		String str1 = args[0], str2 = args[1];
		boolean equal = true;

		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) > str2.charAt(i)) {
				System.out.println("Первая строка больше");
				equal = false;
				break;
			} else if(str1.charAt(i) < str2.charAt(i)) {
				System.out.println("Вторая строка больше");
				equal = false;
				break;
			}
		}
		if(equal) {
			System.out.println("Строки равны");
		}

	}
}
