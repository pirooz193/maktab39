package HW9.part1;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException, ParseException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/articlesworld?autoRecconect=true&charachterEncoding=UTF-8&userSSL=false"
                , "root", "13791372");
//        PreparedStatement preparedStatement;
//        preparedStatement = connection.prepareStatement("select id from category where title = ?");
//        preparedStatement.setString(1, "science");
//
//        preparedStatement = connection.prepareStatement("select userid from user where username = ? and password =?");
//        preparedStatement.setString(1, "pirooz");
//        preparedStatement.setString(2, "2130691005");

        PreparedStatement preparedStatement = connection.prepareStatement("select id,title,brief,content,creatDate,isPublished from user inner join articles on user.userid = articles.authorId where username = ? and password =?  ");
        preparedStatement.setString(1, "pirooz");
        preparedStatement.setString(2, "2130691005");
        ResultSet resultSet;
        resultSet = preparedStatement.executeQuery();

//        if (resultSet.next()) {
//            int x = resultSet.getInt(1);
//            System.out.println(x);
//        }
//
//        resultSet = preparedStatement.executeQuery();
//
//        if (resultSet.next()) {
//            int y = resultSet.getInt(1);
//            System.out.println(y);
//        }
//        System.out.println(resultSet.next());
//        if (!resultSet.next()) {
//            System.out.println("hi");
//        }else if (resultSet.next()){
//            while (resultSet.next() ) {
//
//                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
//                    System.out.println("." + resultSet.getMetaData().getColumnName(i) + " : " + resultSet.getObject(i));
//                }
//                System.out.println("---------------------------------------------------------------------");
//
//
//            }
//        }
        connection.close();
    }
}
