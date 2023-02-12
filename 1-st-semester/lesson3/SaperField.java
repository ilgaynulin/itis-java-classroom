public class SaperField {
	public static void main(String [] args) {
		boolean saper[][] = {
			{false, false, true},
			{false, true, false},
			{true, false, false}
			};

		if(saper[0][2]) {
			System.out.println("Заминировано!");
		} else {
			System.out.println("Безопасно!");
		}
	}
}