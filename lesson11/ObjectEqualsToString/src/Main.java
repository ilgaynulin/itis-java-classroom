import com.company.Rectangle;

public class Main {

    public static void main(String[] args) {
//        Person person1 = new Person("Иван", 19);
//        Person person2 = new Person("Иван", 19);
//        Person person3 = new Person("Лиля", 20);
//
//        if(person1 == person2) {
//            System.out.println("Сравнение person1 == person2: true");
//        } else {
//            System.out.println("Сравнение person1 == person2: false");
//        }
//
//        if(person1.equals(person2)) {
//            System.out.println("person1.equals(person2) = true");
//        } else {
//            System.out.println("person1.equals(person2) = false");
//        }
//
//        if(person1.equals(person3)) {
//            System.out.println("person1.equals(person3) = true");
//        } else {
//            System.out.println("person1.equals(person3) = false");
//        }
//
//        System.out.println("Вызываем у person1 getClass().getName(): ");
//        System.out.println(person1.getClass().getName());
//
//        System.out.println("Строковое представление класса person1");
//        System.out.println(person1);

        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(2, 1);
        Rectangle r3 = new Rectangle(3, 4);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

        String str = "Прибавляем эту строку к классу " + r1;
        System.out.println(str);

        System.out.println(r1);
    }
}
