package com.mycompany.project3maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @Path("customers")
    @POST 
    public void createCustomers(@FormParam("inputUserName") String inputUserName, @FormParam("inputEmail") String inputEmail,
             @FormParam("inputFirstName") String inputFirstName, @FormParam("inputLastName") String inputLastName) throws SQLException {
    {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
try{
        // 1. Get a connection to database
        myConn = DriverManager.getConnection("jdbc:derby://localhost:1527/Project 3", "project", "project");

        // 3. Execute SQL query
        PreparedStatement pst = myConn.prepareStatement("INSERT INTO CUSTOMER (USERNAME,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME) VALUES (?,?,?,?)");
        pst.setString(1, inputUserName);
        pst.setString(2, inputEmail);
        pst.setString(3, inputFirstName);
        pst.setString(4, inputLastName);
        pst.executeUpdate();
}   catch(Exception ex){
    ex.printStackTrace();
}
    }

}
    @Path("allcust")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllCustomers() throws SQLException {
        CustomerManager cm = new CustomerManager();
        
        return cm.getCust();
    }
    
}