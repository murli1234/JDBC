package org.example;

import org.example.dbconnect.Dbconnection;

import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;


public class CallbackStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.nextLine();
        System.out.println("enter your last_name");
        String last_name =sc.nextLine();

        try {
            Connection con = Dbconnection.takeconeection();
            CallableStatement cs= con.prepareCall("{call insertdata(?,?)}");
            cs.setString(1 ,name);
            cs.setString(2 ,last_name);
            cs.execute();
            System.out.println("record insert");

            }


        catch (Exception e) {
            e.printStackTrace();
        }
    }}