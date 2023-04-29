package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CarSerializer implements Serializer {
    @Override
    public byte[] serialize(Car car) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream ous = null;
        try {
            ous = new ObjectOutputStream(byteArrayOutputStream);
            ous.writeObject(car);
            ous.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public Car deserialize(byte[] bytes) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        Car car = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            try {
                car = (Car) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
}
