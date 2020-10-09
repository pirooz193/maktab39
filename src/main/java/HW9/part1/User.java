package HW9.part1;

import java.sql.*;
import java.util.Scanner;

public class User {
    private String userName, nationalCode, password;
    Date birthDay;

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void registerUser(Connection connection) {
        User user = new User();
        setUserDetailes(user);
        java.sql.Date sqlBirthDate = new java.sql.Date(user.getBirthDay().getTime());
        try (PreparedStatement preparedStatement = connection.prepareStatement("insert into user ( username, nationalCode, birthday, password) values (?,?,?,?)")) {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getNationalCode());
            preparedStatement.setDate(3, sqlBirthDate);
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.executeUpdate();
            PreparedStatement preparedStatement1 = connection.prepareStatement("select userid from user where username = ?");
            preparedStatement1.setString(1, user.getUserName());
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                System.out.printf("your id : ");
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.println(resultSet.getObject(i));
                }

            }
            System.out.println("Succesfully Registered !");
        } catch (Exception e) {
            System.out.println("Duplicate NationalCode");
        }
    }

    public static boolean userLogin(Connection connection, String username, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select username,password from user where username =? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return false;
    }


    public static void setUserDetailes(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter userName");
        user.setUserName(new Scanner(System.in).nextLine());
        System.out.printf("Enter nationalCode : ");
        user.setNationalCode(new Scanner(System.in).nextLine());
        user.setPassword(user.getNationalCode());
        System.out.printf("Enter password(default password is your nationalCode , if you want to change press Y  else Press N): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            System.out.printf("Enter Your PassWord : ");
            user.setPassword(scanner.next());
        }
        System.out.printf("Enter birthDay : ");
        user.setBirthDay(Date.valueOf(new Scanner(System.in).nextLine()));
    }
}
