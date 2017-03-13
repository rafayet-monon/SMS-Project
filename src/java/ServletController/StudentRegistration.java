/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletController;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACE
 */
public class StudentRegistration extends HttpServlet {

 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
      
       try
    {
  

    Class.forName("oracle.jdbc.OracleDriver");
    }
    catch(ClassNotFoundException c)
    {
      System.out.println("Error:"+c.getMessage());
    }
       PrintWriter out=response.getWriter();
       
       String name=request.getParameter("std_name");
       String username=request.getParameter("std_username");
       String pass=request.getParameter("std_password");
       String address=request.getParameter("std_address");
       String email=request.getParameter("std_email");
       String mobile=request.getParameter("std_phn");
       String gender=request.getParameter("std_gender");
       String blood=request.getParameter("std_blood");
       String religion=request.getParameter("std_religion");
       String roll=request.getParameter("std_roll");
       String registration=request.getParameter("std_reg");
       String stdclass=request.getParameter("std_class");
       String bdate=request.getParameter("std_date");
    
       
       
           try
    {
    
      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@ACE:49675:xe","system","ace");
        
      PreparedStatement ps = conn.prepareStatement("insert into tbl_student (std_name,std_username,std_password,std_address,std_email,std_phn,std_gender,std_blood,std_religion,std_roll,std_reg,std_class,std_bdate) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");

        
        ps.setString(1,name);
        ps.setString(2,username);
        ps.setString(3,pass);
        ps.setString(4,address);
        ps.setString(5,email);
        ps.setString(6,mobile);
        ps.setString(7,gender);
        ps.setString(8,blood);
        ps.setString(9,religion);
        ps.setString(10,roll);
        ps.setString(11,registration);
        ps.setString(12,stdclass);
        ps.setString(13,bdate);
        
        int rows = ps.executeUpdate();
        
       String message = "Successfully Registered. Please log in to continue..";
        response.sendRedirect("student_login.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
        
        conn.close();

    }
    catch(SQLException s)
    {
      System.out.println("Error:"+s.getMessage());
    }

      
  }

}
