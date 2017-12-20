package com.bharath.jdbcbasics.dao;

import java.sql.*;

public class AccountDAO {

    public static void main(String[] args){

        try( Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:6603/mydb", "root", "mypassword");
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM account");){


            // int result = statement.executeUpdate("INSERT INTO account VALUES (1,'andrei','cristea','100')");
            // System.out.println(result);

            // int resultUpdate = statement.executeUpdate("UPDATE account set bal=500 where accno=1");
            // System.out.println(resultUpdate);

            // int deleteResult = statement.executeUpdate("DELETE from account where accno=1");
            // System.out.println(deleteResult);


            while (rs.next()) {
                System.out.println(
                        "Account number " +
                                rs.getString("accno") +
                                " with name " +
                                rs.getString("firstname") + " " +
                                rs.getString("lastname") +
                                " has balance of " +
                                rs.getString("bal"));
            }
        }
        catch (SQLException e){

        }


    }
}
