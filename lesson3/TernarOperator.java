public class TernarOperator {
	public static void main(String [] args) {
		int i = -10;
		System.out.println("Само число: " + i);
		int module = i > 0 ? i : -i;
		System.out.println("Модуль числа: " + module);
	}

}