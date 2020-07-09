package ru.leverx.egorov.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Jdbc {
    private static Connection connection;
    public static Statement statement;

    static {
        try {
            FileInputStream fis;
            Properties property = new Properties();
            fis = new FileInputStream("src/main/resources/db.properties");
            property.load(fis);
            String host = property.getProperty("db.url");
            String login = property.getProperty("db.username");
            String password = property.getProperty("db.password");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(host, login, password);
        }catch (ClassNotFoundException | SQLException | FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
