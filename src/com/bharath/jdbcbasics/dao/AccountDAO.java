package com.bharath.jdbcbasics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

    public static void main(String[] args) throws SQLException{

       Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:6603/mydb","root","mypassword");
       Statement statement = connection.createStatement();
       int result = statement.executeUpdate("INSERT INTO account VALUES (1,'andrei','cristea','100')");
        System.out.println(result);

        int resultUpdate = statement.executeUpdate("UPDATE account set bal=500 where accno=1");
        System.out.println(resultUpdate);

        int deleteResult = statement.executeUpdate("DELETE from account where accno=1");
        System.out.println(deleteResult);
    }
}
