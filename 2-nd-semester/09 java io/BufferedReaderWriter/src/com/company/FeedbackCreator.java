package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FeedbackCreator {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        createFeedbacks(currentDirectory + "\\hw");
    }

    public static void createFeedbacks(String pathToHWDirectories) {
        File hwDir = new File(pathToHWDirectories);
        if(!hwDir.exists()) {
            System.out.println("Директории по пути " + hwDir.getPath() + " не существует");
            return;
        }

        File[] homeworks = hwDir.listFiles(File::isDirectory);
        Arrays.stream(homeworks).forEach(h -> {
            File newFile = new File(h.getPath() + "\\" + h.getName() + "_feedback.txt");
                    try {
                        if(newFile.createNewFile()) {
                            System.out.println("Файл " + newFile.getName() + "  создан");
                        } else {
                            System.out.println("Новый файл " + newFile.getName() +  " создать не удалось");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );



    }
}
