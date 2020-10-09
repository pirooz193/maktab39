package file;

import java.io.IOException;
import java.io.StringReader;

public class FileDemo2 {
    public static void main(String[] args) {
        String s = "Pirooz Azar Abad";
        StringReader sr = new StringReader(s);
        try {

            for (int i = 0; i < s.length(); i++) {
                char c = (char) sr.read();
                System.out.print("" + c);
            }
            for (int i = 0; i < 600; i++) {

                char c = (char) sr.read();
                System.out.print("" + c);
            }
            for (int i = 0; i < 6; i++) {
                char c = (char) sr.read();
                System.out.print("" + c);
            }
            sr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
//import java.io.*;
//
//public class FileDemo2 {
//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\pirooz\\Desktop\\myFile.txt");
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            char ch;
//            for (int i = 0; i < 10; i++) {
//                ch = (char) reader.read();
//                System.out.print(ch);
//                if (reader.markSupported() && i == 3) {
//                    reader.mark(i);
//                }
//                if (i == 6) {
//                    reader.reset();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    {
//        File file = null;
//        file = new File("C:\\Users\\Pirooz\\Desktop\\myFile.txt");
//
//        try (Reader reader = new FileReader(file);) {
//            int i;
////            while ((i = reader.read()) != -1) {
////                System.out.print((char) i);
////            }
//            reader.mark(2);
//            char[] cArray = new char[50];
//            reader.read(cArray);
//            for (Character c : cArray) {
//                System.out.print(c);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
