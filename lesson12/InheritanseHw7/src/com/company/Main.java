package com.company;

import com.company.entity.Aspirant;
import com.company.entity.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ильяс", "Гайнулин", "11-206", 4.0);
        System.out.println(String.format("Студент: %s %s, Группа: %s, Средняя оценка: %.2f", student.getFirstName(), student.getLastName(), student.getGroup(), student.getAverageMark()));
        System.out.println("Стипендия: " + student.getScholarship());

        Aspirant aspirant = new Aspirant("Николай", "Губин", "12-206", 4.0, "Проджект менеджент в условии кризиса");
        System.out.println(aspirant);
        System.out.println("Стипендия: " + aspirant.getScholarship());
    }
}
