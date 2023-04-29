package com.company;

public interface Serializer {
    byte[] serialize(Car car);
    Car deserialize(byte[] bytes);
}
