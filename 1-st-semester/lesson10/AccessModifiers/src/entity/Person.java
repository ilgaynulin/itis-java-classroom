package entity;

public class Person {
    protected String name;
    private int age;
    protected int height;
    protected int weight;
    private final int K = 110;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void sayHello() {
        System.out.println("My name is " + name);
    }

    public boolean isOverweight() {
        return (height - K) > weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Некорректный возраст, укажем по умолчанию 0");
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
