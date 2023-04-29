package com.company;

public class CarSerializerWithObjectToText implements SerializerWithObjectToText{
    final Serializer carSerializer;

    CarSerializerWithObjectToText(){
        carSerializer = new CarSerializer();
    }

    @Override
    public byte[] serialize(Car car) {
        return carSerializer.serialize(car);
    }

    @Override
    public Car deserialize(byte[] bytes) {
        return carSerializer.deserialize(bytes);
    }

    @Override
    public String serializeToText(Car car) {
        return "model/" + car.getModel() + "/model/years/" + car.getYear() + "/years/mileage/" +car.getMileage() +"/mileage/";
    }

    @Override
    public Car deserializeFromText(String string) {
        String[] features = string.split("/");
        // В целом, можно было бы сделать нормальный обход по строке, чтобы параметры
        // не по индексам инициализировались, да и вообще сделать свой алгоритм
        // сериализации для всех классов, но к сожалению дедлайн через 10 минут :(
        String model = features[1];
        int year = Integer.parseInt(features[4]);
        double mileage = Double.parseDouble(features[7]);
        return new Car(model,year,mileage);
    }
}
