package com.path;

import java.io.IOException;
import java.nio.file.*;

public class ReadingString {

    public static void main(String[] args) {
        Path filePath=Paths.get("C:\\Users\\zahit\\Desktop","Yeni Metin Belgesi (3).txt");
        try {
            Files.writeString(filePath,"MERHABA DÜNYA", StandardOpenOption.APPEND);
            String content= Files.readString(filePath);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
