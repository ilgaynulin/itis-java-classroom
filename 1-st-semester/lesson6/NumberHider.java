public class NumberHider {
	public static void main(String[] args) {
		// 89991232323 = 1-2 на 8 либо +7, 3 символа на код, 7 символов на сам номер, итого 10 и более символов
		if(args.length != 1 || args[0].length() < 9) {
			// System.out.println("Некорректное кол-во аргументов");
			System.out.println("Введите номер телефона (одной строкой) и длиной больше 9");
			return;
		}

		String phoneNumberText = args[0];

		String lastFourDigits = phoneNumberText.substring(phoneNumberText.length() - 4);

		String hidenNumber = "*".repeat(phoneNumberText.length() - 4) + lastFourDigits;
		
		System.out.println(hidenNumber);
	}
}