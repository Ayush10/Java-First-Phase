//package database;
//
//import java.sql.*;
//
//public class Database {
//
//    public static void main(String[] args) throws Exception {
//        getConnection();
//        createTable();
//    }
//
//    public static void createDatabase() throws Exception {
//        Connection connection = getConnection();
//        Statement statement = getConnection().createStatement();
//        try {
//            statement.execute("CREATE DATABASE test");
//            statement.execute("CREATE TABLE IF NOT EXIST login_information");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static void createTable() throws Exception {
//        try {
//            Connection connection = getConnection();
//            PreparedStatement createDatabase = connection.prepareStatement("CREATE DATABASE IF NOT EXIST test");
////            PreparedStatement createTable = connection.
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    public static Connection getConnection() throws Exception {
//        try {
////            String driver = "com.mysql.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306/?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//            String username = "root";
//            String password = "";
////            Class.forName(driver);
//
//            Connection connection = DriverManager.getConnection(url, username, password);
//            System.out.println("Connection successful");
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return null;
//    }
//}
