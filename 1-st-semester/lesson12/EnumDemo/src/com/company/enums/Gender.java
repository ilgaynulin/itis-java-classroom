package com.company.enums;

/**
 * Пол человека
 */
public enum Gender {
    MALE("Мужской пол", "М"),
    FEMALE("Женский пол", "Ж"),
    HELICOPTER("Вертолёт", "В"),
    UNDEFINED("Неопределённый пол", "Н");

    public String rusName;
    public String shortName;

    Gender(String rusName, String shortName) {
        this.rusName = rusName;
        this.shortName = shortName;
    }

//    public String getRusName() {
//        return rusName;
//    }
}
