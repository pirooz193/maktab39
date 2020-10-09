package HW9.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/articlesworld?autoRecconect=true&charachterEncoding=UTF-8&userSSL=false"
                , "root", "13791372");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showFirstMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    User.registerUser(connection);
                    break;
                case 2:
                    String username , password;
                    System.out.printf("Enter Your Username : ");
                    username = new Scanner(System.in).nextLine();
                    System.out.printf("Enter Your Password : ");
                    password = new Scanner(System.in).nextLine();
                    while (true){
                        if (User.userLogin(connection ,username,password)) {
                            Menu.showUserMenu();
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    Article.showUserArticles(connection,username,password);
                                    break;
                                case 2:
                                    Article.editArticles(connection,username,password);
                                    break;
                                case 3:
                                    Article.addNewArticle(connection,username,password);
                                    break;
                            }

                        }
                        else{
                            System.out.println("Wrong Username or Password");
                            System.out.println("What Do You Want To Do ?");
                            System.out.println("1.continue \n2.Exit From Login Page ");
                            choice = scanner.nextInt();
                            if (choice == 2) break;
                            System.out.printf("Enter Your Username : ");
                            username = new Scanner(System.in).nextLine();
                            System.out.printf("Enter Your Password : ");
                            password = new Scanner(System.in).nextLine();
                            continue;
                        }
                        System.out.println("What Do You Want To Do ?");
                        System.out.println("1.continue \n2.Log Out");
                        choice = scanner.nextInt();
                        if (choice == 2) break;
                    }

                    break;

                case 3:
                    Article.showArticles(connection);
                    break;
            }
            System.out.println("What Do You Want To Do ?");
            System.out.println("1.Go To First Page \n2.Exit");
            choice = scanner.nextInt();
            if (choice == 2) {
                System.out.println("BYE :)");
                break;

            }

        }
        connection.close();
    }


}
