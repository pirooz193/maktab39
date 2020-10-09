package test;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test  {
    public static void main(String args[])
    {
        String text = "123-M";
        // Specifies the string pattern which is to be searched
        String delimiter = "\\d\\d\\d[-][a-g]";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);

        // Used to perform case insensitive search of the string
        String[] result = pattern.split(text);


        for (String temp: result)
            System.out.println(temp);


        Date today  = new Date();
        today.getTime();
        System.out.print(today );
    }
}







