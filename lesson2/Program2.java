public class Program2 {
	public static void main(String[] args) {
		int number = 10;
		boolean numberIsEven = (number % 2) == 0;
		boolean numberIsPositive = number > 0;
		if(numberIsEven && numberIsPositive) {
			System.out.println("Число чётное и положительное");
		}
		boolean numberIsNotEven = !numberIsEven;
		System.out.println("Число нечётное: " + numberIsNotEven);
	}
}