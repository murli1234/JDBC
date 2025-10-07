package org.example.dbconnect;
import java.sql.*;

public class Dbconnection {
    public static  Connection takeconeection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String path = "jdbc:mysql://localhost:3306/jdbc";
            String usrname = "root";
            String password = "murli@123";
            con = DriverManager.getConnection(path, usrname, password);
        } catch (Exception e) {
            System.out.println(e);
        }
             if (con != null){
               System.out.println("Connection succes");
           }
           else {
               System.out.println("Connection fail");
           }
        return con;
    }
    }
