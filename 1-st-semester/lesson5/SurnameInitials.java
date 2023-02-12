public class SurnameInitials {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.print("Введите Фамилию Имя Отчество");
			return;
		}
 		
 		String lastName = args[0]; // Фамилию lastName.charAt(0) // 'Ф'
 		String name = args[1];
 		String secondName = args[2];

 		// char charAt(int index)

 		//System.out.println(lastName + " " + name.charAt(0) + ". " + secondName.charAt(0) + ".");

 		System.out.println(lastName + " " + name.substring(0, 2) + ". " + secondName.substring(0, 2) + ".");
	}

}