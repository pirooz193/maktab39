package HM8.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
    public static void insertMember(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Statement statement = connection.createStatement();
        String name, department;
        System.out.printf(".Enter your Id : ");
        long id = scanner.nextInt(), supervisorId;
        try {
            statement.execute("insert into student(id) value  (" + id + ");");
            System.out.printf(".Enter your name : ");
            name = scanner.next();
            try {
                statement.execute("update student set name ='" + name + "' where( id = '" + id + "');");
                System.out.printf(".Enter your department : ");
                department = scanner.next();
                System.out.printf(".Enter your supervisorId : ");
                supervisorId = scanner.nextInt();
                System.out.println("Succesfully insert!");


                statement.execute("update student set  department ='" + department + "',supervisorId = '" + supervisorId + "' where (id = '" + id + "');");
            } catch (Exception ex) {
                System.out.println("duplicate name");
                statement.execute("delete from student where id ='" + id + "';");

                ResultSet resultSet = statement.executeQuery("select  id from student where name ='" + name + "'");
                if (resultSet.next()) {
                    System.out.println("duplicate name , a user whit this id :" + resultSet.getString(1) + " has exist");

                }
            }

        } catch (Exception ex) {
            System.out.println("duplicate id");

        }
    }

    public static void deleteMember(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Statement statement = connection.createStatement();
        System.out.printf(".Enter your Id : ");
        long id = scanner.nextInt();
        try {
            statement.execute("delete from student where id =" + id + ";");
            System.out.println("Succesfully deleted!");


        } catch (Exception ex) {
            System.out.printf(" id: %d has not exist !\n", id);
        }
    }


    public static void showSuoervisor(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(".Enter your name : ");
        String name = scanner.next();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select  teacher.id from student " +
                    "inner join teacher on student.supervisorId = teacher.id where student.name ='" + name + "';");
            if (resultSet.next()) {
                System.out.println("your supervisorId is : " + resultSet.getString(1));
            }
        } catch (Exception ex) {
            System.out.println("name you Entered not exist!!");
        }
    }

    public static void showChoicesMenu() {
        System.out.printf("1.Enter\n2.Name of supervisor\n3.Delelte\n");
    }

}
