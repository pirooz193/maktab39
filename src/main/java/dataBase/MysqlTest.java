import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlTest {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/classicmodels?autoRecconect=true&charachterEncoding=UTF-8&userSSL=false",
                "root", "13791372");
        try {
            connection.setAutoCommit(false);
			/*System.out.println("executeSelect:");
			executeSelect(connection);*/
            System.out.println("executeUpdatePreparedStatement:");
            executeUpdatePreparedStatement(connection);
            System.out.println("executeSelectPreparedStatement:");
            executeSelectPreparedStatement(connection);
        }
        catch (Exception e) {
            connection.rollback();
        }
        finally {
            try {
                connection.close();
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    private static void executeSelect(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from Customers WHERE CustomerNumber = 497");) {
            while (resultSet.next()) {
                int numColumns = resultSet.getMetaData().getColumnCount();
                for (int i = 1; i <= numColumns; i++) {
                    System.out.println(String.format(" value of column \"%s\" [%d] is: \"%s\":", resultSet.getMetaData().getColumnName(i), i,
                            resultSet.getObject(i)));
                }
            }
        }
    }
    private static void executeUpdatePreparedStatement(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("update Customers SET ContactFirstName = 'Saeed' WHERE CustomerNumber = ?")) {
            statement.setInt(1, 497);
            statement.executeUpdate();
        }
        connection.commit();
    }

    private static void executeSelectPreparedStatement(Connection connection) throws SQLException {
        try (PreparedStatement preparedStatement = connection
                .prepareStatement("select * from Customers WHERE CustomerNumber = ?");) {
            preparedStatement.setInt(1, 497);
            try (ResultSet resultSet = preparedStatement.executeQuery();) {
                while (resultSet.next()) {
                    int numColumns = resultSet.getMetaData().getColumnCount();
                    for (int i = 1; i <= numColumns; i++) {
                        System.out.println(String.format(" value of column \"%s\" [%d] is: \"%s\":", resultSet.getMetaData().getColumnName(i),
                                i, resultSet.getObject(i)));
                    }
                }
            }
        }
    }
}