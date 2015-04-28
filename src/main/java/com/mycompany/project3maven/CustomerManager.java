/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project3maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charlie
 */
public class CustomerManager {

    List<Customer> custList = new ArrayList();

    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;

    public String getCust() throws SQLException {

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:derby://localhost:1527/Project 3", "project", "project");

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from CUSTOMER");

            // 4. Process the result set
            while (myRs.next()) {

                Customer a = new Customer();
                a.setUsername(myRs.getString("USERNAME"));
                a.setEmailAddress(myRs.getString("EMAIL_ADDRESS"));
                a.setFirstName(myRs.getString("FIRST_NAME"));
                a.setLastName(myRs.getString("LAST_NAME"));
                custList.add(a);

            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }

        return custList.toString();

    }
}
