public class ForCicle {
	public static void main(String [] args) {
		/*
		for(int i = 1; i <= 1024; i *= 2) {
			System.out.println(i);
		}

		// Составные операторы присваивания
		// i *= 2; // i = i * 2
		// i += 2; // i = i + 2

		for(int i = 1; i <= 1024; i ++) {
			System.out.println(i);
			if(i == 100) {
				break;
			}
		}

		

		System.out.println("Цикл завершён");
		*/

		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}	

}