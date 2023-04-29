package com.company;

import java.io.File;

public class FileManager {
    private String currentFolder;
    private String path;


    public FileManager(String currentFolder) {
        this.currentFolder = currentFolder;
        this.path = currentFolder;
    }

    public String getCurrentFolder() {
        return currentFolder;
    }

    public void listOfFiles(boolean withSize) {
        File currentFolderAsFile = new File(currentFolder);
        // получили все файлы текущей папки
        File files[] = currentFolderAsFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                if (withSize) {
                    System.out.print(file.getName() + "\\ " + getFolderSize(file));
                } else {
                    System.out.print(file.getName() + "\\ ");
                }
                System.out.println();
            } else {
                if (withSize) {
                    System.out.print(file.getName() + " " + file.length());
                } else {
                    System.out.print(file.getName() + " ");
                }
                System.out.println();
            }

        }
    }
    public void changeDirectory(String folderName) {
        String oldPath = this.currentFolder;
        if (folderName.equals("path")) { // в целом не требовалось в задании
            this.currentFolder = this.path;
        } else if (folderName.equals("../")) {
            int startLastFolderPosition = this.currentFolder.lastIndexOf("\\");
            this.currentFolder = this.currentFolder.substring(0, startLastFolderPosition);
        } else {
            this.currentFolder = this.currentFolder + "\\" + folderName;
        }
        if(!new File(this.currentFolder).isDirectory()) { // её не было
            System.out.println("Директория не существует");
            this.currentFolder = oldPath;
        }
    }

    public long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();

        int count = files.length;

        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}
