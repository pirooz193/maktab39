//package dataBase;
//
//import java.sql.*;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) throws Exception {
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://127.0.0.1:3306/university?autoRecconect=true&charachterEncoding=UTF-8&userSSL=false"
//                , "root", "13791372");
//
//        selectTest(connection);
//        showTable(connection);
//        connection.close();
//
//    }
//
//    private static void selectTest(Connection connection) throws SQLException {
//        Scanner scanner = new Scanner(System.in);
//        long id = scanner.nextInt();
//        String name = scanner.next() , address = scanner.next();
//        try(Statement statement = connection.createStatement()) {
//            statement.execute("insert into teacher (id , name , address)values('"+id+"','"+name+"','"+address+"')");
//
//        }catch (Exception ex){
//            System.out.printf(" id: %d has exist !\n",id);
//        }
//
//    }
//
//    public static void showTable(Connection connection) throws  SQLException{
//        try (Statement statement = connection.createStatement()) {
//
//            ResultSet resultSet = statement.executeQuery("select * from teacher");
//            while (resultSet.next()) {
////                System.out.println(resultSet.getMetaData().getColumnCount());
//                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
//
//                    System.out.print(resultSet.getObject(i));
//                    System.out.printf(" ");
//                    System.out.println();
//
//                }
//
//            }
//
//
//        }
//    }
//
//
//
//}
