package file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Pirooz\\Desktop\\569874\\889.exe");
//        boolean dirCreated = file.mkdirs();
        boolean fileExist = file.createNewFile();
//        System.out.println(dirCreated);
        System.out.println(fileExist);
    }
}
