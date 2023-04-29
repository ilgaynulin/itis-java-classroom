package com.company;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw e38", 1990, 50000.43);
        SerializerWithObjectToText serializerWithObjectToText = new CarSerializerWithObjectToText();
        Car car1 = serializerWithObjectToText.deserialize(
                serializerWithObjectToText.serialize(car));
        System.out.println(car1.getMileage());
        System.out.println(car1.getModel());
        System.out.println(car.getYear());
        System.out.println(serializerWithObjectToText.serializeToText(car1));
        Car car2 = serializerWithObjectToText.deserializeFromText(
                serializerWithObjectToText.serializeToText(car1)
        );
        System.out.println(car2.getYear());
        System.out.println(car2.getMileage());
        System.out.println(car2.getModel());

    }
}