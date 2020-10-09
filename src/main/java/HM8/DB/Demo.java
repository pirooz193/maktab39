package HM8.DB;

import java.sql.*;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/university?autoRecconect=true&charachterEncoding=UTF-8&userSSL=false"
                , "root", "13791372");
        Scanner scanner = new Scanner(System.in);
        String teacher = "teacher", student = "student";
        int choice;
        showMemberType();
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Teacher.insertMember(connection);
                showTable(connection, teacher);
                break;
            case 2:
                Student.showChoicesMenu();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Student.insertMember(connection);
                        break;
                    case 2:
                        Student.showSuoervisor(connection);
                        break;
                    case 3:
                        Student.deleteMember(connection);
                        break;
                }
                showTable(connection, student);
                break;
        }
        connection.close();


    }

    public static void showTable(Connection connection, String typeOfMember) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from " + typeOfMember + ";");
            while (resultSet.next()) {
                System.out.println("==============");
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.print(resultSet.getObject(i));
                    System.out.printf(" ");
                    System.out.println();

                }

            }


        }
    }

    public static void showMemberType() {
        System.out.println("1.teacher");
        System.out.println("2.student");
    }
}
