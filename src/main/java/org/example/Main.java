package org.example;
import org.example.dbconnect.Dbconnection;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            Connection con = Dbconnection.takeconeection();
            Statement statement = con.createStatement();
            String insertQuery = "INSERT INTO jdbc_data (name, last_name) VALUES ('james', 'log')";
            statement.execute(insertQuery);
            System.out.println("Data inserted!");
            String selectQuery = "SELECT * FROM jdbc_data";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String age = resultSet.getString("last_name");

                System.out.println(id + " | " + name + " | " + age);
            }
            resultSet.close();
            statement.close();
            con.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }}