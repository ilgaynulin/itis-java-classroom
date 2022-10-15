public class StringProgram {
	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("Введите пожалуйста два слова");
		}

		String str1 = args[0];
		String str2 = args[1];

		/*
		if(str1.equals(str2)) { // функция сравнения строк
			System.out.println("Строки равны");
		} else {
			System.out.println("Строки не равны");
		}
		*/
		
		if(str1 == str2) { // функция сравнения ссылок строк
			System.out.println("Строки равны");
		} else {
			System.out.println("Строки не равны");
		}
	}
}