package com.company;

public interface SerializerWithObjectToText extends Serializer{
    String serializeToText(Car car);
    Car deserializeFromText(String string);
}
