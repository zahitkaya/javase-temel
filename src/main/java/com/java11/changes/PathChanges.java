package com.java11.changes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathChanges {
    public static void main(String[] args) {
        //Dosyanın içerisindeki yazıyı okuma
        Path filePath = Paths.get("C:\\Users\\zahit\\IdeaProjects\\javase2\\src\\main\\" +
                "java\\com\\java11\\changes","sample.txt");
        try {
            String content= Files.readString(filePath);
            System.out.println(content); //Detay Soft
        }

        catch (IOException e){
            e.printStackTrace();

        }

        try {
            Files.writeString(filePath,"sample.txt'nin içerisindeki yazıyı değiştiriyoruz");
            String content= Files.readString(filePath); //sample.txt'nin içerisine yazı ekliyoruz
            System.out.println(content);
        }

        catch (IOException e){
            e.printStackTrace();

        }






    }
}
