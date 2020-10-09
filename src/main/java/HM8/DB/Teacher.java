package HM8.DB;

import java.sql.*;
import java.util.Scanner;

public class Teacher {


    public static void insertMember(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.printf(".Enter your Id : ");
        long id = scanner.nextInt();
        try {
            statement.execute("insert into teacher(id) value  (" + id + ");");
            System.out.printf(".Enter your name : ");
            String name = scanner.next();
            try {
                statement.execute("update teacher set name ='" + name + "' where( id = '" + id + "');");
                System.out.printf(".Enter your address : ");
                String address = scanner.next();
                statement.execute("update teacher set  address ='" + address + "' where (id = '" + id + "');");
            } catch (Exception ex) {
                statement.execute("delete from teacher where id ='" + id + "'");
                ResultSet resultSet = statement.executeQuery("select  id from teacher where name ='" + name + "'");
                if (resultSet.next()) {
                    System.out.println("duplicate name , a user whit this id :" + resultSet.getString(1) + " has exist");

                }
            }

        } catch (Exception ex) {
            System.out.println("duplicate id");

        }


    }


}
