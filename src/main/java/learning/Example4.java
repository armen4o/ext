package learning;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class Example4 {
    public void jobWithFiles(){

        BufferedReader bufferedReader = null;

        try {
            File file = new File("newFile.txt"); // в папке, что и проект

            // проверка на существование файла
            if(!file.exists())
                file.createNewFile();

            //действия с файлом: запись в файл.
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Everything is working");
            printWriter.println("My program with file.");
            printWriter.println("Hello, world!");
            printWriter.close();

            // считать данные из файла
            bufferedReader = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line= bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
