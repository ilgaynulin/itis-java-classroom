package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        DeterminateGender determinateGender = new DeterminateGenderExt();
        try {
            System.out.println(determinateGender.nameToGender("Sasha"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Задание 2
        DownlandPhoto downlandPhoto = new DownlandDogImage();
        try {
            downlandPhoto.downlandPhotoInQuality("DogImages",10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}