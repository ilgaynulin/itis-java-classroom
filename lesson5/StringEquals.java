public class StringEquals {
	public static void main(String[] args) {
		// String иммутабелен
		String str1 = "Привет";
		String helloWorld = "Привет мир";

		String str2 = str1 + " мир";

		if(helloWorld == str2) { // функция сравнения ссылок строк
			System.out.println("Ссылки равны");
		} else {
			System.out.println("Ссылки не равны");
		}
	}
}