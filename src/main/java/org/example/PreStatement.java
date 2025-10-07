package org.example;

import org.example.dbconnect.Dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.nextLine();
        System.out.println("enter your last_name");
        String last_name =sc.nextLine();

        try {
            Connection con = Dbconnection.takeconeection();
            String insertQuery = "INSERT INTO jdbc_data (name, last_name) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setString(1 ,name);
            ps.setString(2 ,last_name);
            ps.execute();
            System.out.println("record insert");

            }


        catch (Exception e) {
            e.printStackTrace();
        }
    }}