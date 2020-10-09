package file;

import java.io.*;
import java.util.Scanner;

public class FileDemo3 {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\pirooz\\Desktop\\myFile.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//
//
//        Teacher t1 = new Teacher();
//        t1.setfName("Pirooz");
//        t1.setLastName("Azar Azbad");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Java\\Maktab 39\\Sessions\\sample\\teacher.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        Teacher t1 = new Teacher();
        t1.setfName("Ali");
        t1.setLastName("Noori");
        outputStream.writeObject(t1);
        outputStream.close();

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();



    }
}
