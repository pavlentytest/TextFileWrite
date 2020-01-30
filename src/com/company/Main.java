package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:/345/66/readme.txt");
        // получаем полный путь к файла без имени самого файла
        // создаем директории
        file.getParentFile().mkdir();


        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();

        }
        // чтение
        Scanner scan = new Scanner(file);
        // запись
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.print("123123123");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
