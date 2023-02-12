package entity;

public class Engineer extends Person{
    public Engineer(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }

    public void sayHello() {
        System.out.println("Меня зовут " + name + ". Мой рост " + height + " а мой вес " + weight);
    }
}
