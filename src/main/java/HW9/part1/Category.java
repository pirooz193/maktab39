package HW9.part1;

import java.sql.*;
import java.util.Scanner;

public class Category {
    private String  title, description;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void showCategory(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select id,title from category");
            while (resultSet.next()) {
                System.out.println(resultSet.getObject(1)+". " +resultSet.getObject(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNewCategory(Connection connection ,String title) throws SQLException {
        Category category = new Category();
        System.out.printf("Enter Category Description :");
        category.setDescription(new Scanner(System.in).nextLine());
        PreparedStatement preparedStatement = connection.prepareStatement("insert into category ( title, description)  value(?,?) ");
        try {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, category.getDescription());
            preparedStatement.executeUpdate();
            System.out.println("Successfully added!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
