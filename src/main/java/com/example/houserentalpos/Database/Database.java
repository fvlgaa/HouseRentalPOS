package com.example.houserentalpos.Database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database instance;
    private Connection connection = null;

    private Database() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + Const.DB_NAME + "?serverTimezone=UTC",
                    Const.DB_USER, Const.DB_PASS
            );
            System.out.println("Created Connection!");

            // Create tables if they do not exist
            createTable("property",
                    "CREATE TABLE property(" +
                            "id INT NOT NULL AUTO_INCREMENT, " +
                            "property_name VARCHAR(50), " +
                            "location VARCHAR(50), " +
                            "type VARCHAR(20), " +
                            "monthly_rent DECIMAL(10,2), " +
                            "availability VARCHAR(10), " +
                            "PRIMARY KEY(id));", this.connection);

            createTable("tenant",
                    "CREATE TABLE tenant(" +
                            "id INT NOT NULL AUTO_INCREMENT, " +
                            "name VARCHAR(50), " +
                            "contact_info VARCHAR(20), " +
                            "email VARCHAR(50), " +
                            "loyalty_points INT, " +
                            "PRIMARY KEY(id));", this.connection);

            createTable("payment",
                    "CREATE TABLE payment(" +
                            "id INT NOT NULL AUTO_INCREMENT, " +
                            "tenant_id INT NOT NULL, " +
                            "amount DECIMAL(10,2), " +
                            "payment_date DATE, " +
                            "status VARCHAR(10), " +
                            "PRIMARY KEY(id), " +
                            "FOREIGN KEY (tenant_id) REFERENCES tenant(id));", this.connection);

            // Create users table for login authentication
            createTable("users",
                    "CREATE TABLE users(" +
                            "id INT NOT NULL AUTO_INCREMENT, " +
                            "username VARCHAR(50), " +
                            "password VARCHAR(50), " +
                            "PRIMARY KEY(id));", this.connection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable(String tableName, String tableQuery, Connection connection) throws SQLException {
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getTables(null, null, tableName, null);

        // Check if table already exists
        if (resultSet.next()) {
            System.out.println(tableName + " Table already exists!");
        } else {
            // Create the table if it doesn't exist
            Statement statement = connection.createStatement();
            statement.execute(tableQuery);
            System.out.println("The " + tableName + " table has been created");
        }
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}


