package HW9.part1;

import java.sql.*;
import java.util.Scanner;


public class Article {
    private String title;
    private String brief;
    private String content;
    private String isPublished;
    Date creatDate;

    public void setIsPublished(String isPublished) {
        this.isPublished = isPublished;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getIsPublished() {
        return isPublished;
    }


    public static void showArticles(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        try {
            ResultSet resultSet = statement.executeQuery("select title ,brief , content,creatDate from articles  where isPublished= true ");
            while (resultSet.next()) {
                System.out.println("===========================================================================");
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.println("." + resultSet.getMetaData().getColumnName(i) + " : " + resultSet.getObject(i));
                }
                System.out.println("===========================================================================");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void showUserArticles(Connection connection, String username, String password) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select id,title,brief,content,creatDate,isPublished from user inner join articles on user.userid = articles.authorId where username = ? and password =?  ");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                    System.out.println("." + resultSet.getMetaData().getColumnName(i) + " : " + resultSet.getObject(i));
                }
                System.out.println("---------------------------------------------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void editArticles(Connection connection, String username, String password) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        showUserArticles(connection, username, password);
        System.out.printf("Which do you want to Edit ? (Enter It's Id) : ");
        String articleId = scanner.next();
        getFieldToEdit(connection, articleId);

    }


    public static void getFieldToEdit(Connection connection, String id) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Which Part Of Your Article Do You Want To Edit ? (if don't want to edit enter '6')");
                System.out.println("1.Title\n2.Brief\n3.content\n4.CreateDate\n5.isPublished");
                System.out.printf("Enter The Number  : ");
                int choice = scanner.nextInt();
                if (choice == 6) break;
                switch (choice) {
                    case 1:
                        System.out.printf("Enter new Title :");
                        updateArticle(connection, "title", id);
                        break;
                    case 2:
                        System.out.printf("Enter new brief :");
                        updateArticle(connection, "brief", id);
                        break;
                    case 3:
                        System.out.printf("Enter new content :");
                        updateArticle(connection, "content", id);

                        break;
                    case 4:
                        System.out.printf("Enter new createDate :");
                        updateArticle(connection, "creatDate", id);
                        break;
                    case 5:
                        System.out.printf("Enter new isPublished :");
                        updateArticle(connection, "isPublished", id);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void updateArticle(Connection connection, String articlePart, String id) throws SQLException {
        String editedPart = new Scanner(System.in).nextLine();
        PreparedStatement preparedStatement = connection.prepareStatement("update articles set " + articlePart + " = ? where id =?");
        preparedStatement.setString(1, editedPart);
        preparedStatement.setString(2, id);
        preparedStatement.executeUpdate();
    }

    public static void addNewArticle(Connection connection, String username, String password) {
        System.out.println("Select Article Category (if your article is'n in this article press <0> to add a category )");
        Category.showCategory(connection);
        int categoryId = new Scanner(System.in).nextInt();
        if (categoryId == 0) {
            System.out.printf("Enter Category Title : ");
            String categoryTitle = new Scanner(System.in).nextLine();
            try {
                Category.addNewCategory(connection, categoryTitle);

                PreparedStatement preparedStatement = connection.prepareStatement("select id from category where title = ?");
                preparedStatement.setString(1, categoryTitle);
                ResultSet resultSet;
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    categoryId = resultSet.getInt(1);
                }

                PreparedStatement preparedStatement1 = connection.prepareStatement("select userid from user where username = ? and password =?");
                preparedStatement1.setString(1, username);
                preparedStatement1.setString(2, password);
                resultSet = preparedStatement1.executeQuery();
                if (resultSet.next()) {
                    createArticle(connection, categoryId, resultSet.getInt(1));
                }
                System.out.println("Sucessfully added !");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } else {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select userid from  user  where username =? and password =? ");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    createArticle(connection, resultSet.getInt(1), categoryId);
                }
                System.out.println("Successfully added !");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void createArticle(Connection connection, int authorId, int categoryId) throws SQLException {
        Article article = new Article();
        setNewArticlesDetailes(article);

        PreparedStatement preparedStatement = connection.prepareStatement("insert into articles (title, brief, content, creatDate, isPublished, authorId, categoriId) values (?,?,?,?,?,?,?)");
        preparedStatement.setString(1, article.getTitle());
        preparedStatement.setString(2, article.getBrief());
        preparedStatement.setString(3, article.getContent());
        preparedStatement.setDate(4, article.getCreatDate());
        preparedStatement.setString(5, article.getIsPublished());
        preparedStatement.setInt(6, authorId);
        preparedStatement.setInt(7, categoryId);
        preparedStatement.executeUpdate();
    }

    public static void setNewArticlesDetailes(Article article) {
        System.out.printf("Enter title : ");
        article.setTitle(new Scanner(System.in).nextLine());
        System.out.printf("Enter brief : ");
        article.setBrief(new Scanner(System.in).nextLine());
        System.out.printf("Enter Content:");
        article.setContent(new Scanner(System.in).nextLine());
        System.out.printf("Enter CreateDate: ");
        article.setCreatDate(Date.valueOf(new Scanner(System.in).nextLine()));
        System.out.printf("Enter IsPublished(if yes enter 1 else Enter 0):");
        article.setIsPublished(new Scanner(System.in).next());
    }

}
