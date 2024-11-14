package com.mycompany.puconclick;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:config.properties")
public class DatabaseService {

    @Value("${db.endpoint}")
    private String dbEndpoint;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(dbEndpoint, dbUsername, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Error connecting to the database");
        }
    }
}
