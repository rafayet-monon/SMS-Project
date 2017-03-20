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
public class TeacherRegistration extends HttpServlet {

 @Override
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
       
       String name=request.getParameter("tcr_name");
       String username=request.getParameter("tcr_username");
       String pass=request.getParameter("tcr_password");
       String address=request.getParameter("tcr_address");
       String email=request.getParameter("tcr_email");
       String mobile=request.getParameter("tcr_phn");
       String gender=request.getParameter("tcr_gender");
       String blood=request.getParameter("tcr_blood");
       String religion=request.getParameter("tcr_religion");
       String designation=request.getParameter("tcr_designation");
       String bdate=request.getParameter("tcr_date");
    
       
       
           try
    {
    
      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@ACE:49677:xe","system","ace");
        
      PreparedStatement ps = conn.prepareStatement("insert into tbl_teacher (tcr_name,tcr_username,tcr_password,tcr_address,tcr_email,tcr_phn,tcr_gender,teacher_blood,tcr_religion,tcr_designation,tcr_bdate) values (?,?,?,?,?,?,?,?,?,?,?)");

        
        ps.setString(1,name);
        ps.setString(2,username);
        ps.setString(3,pass);
        ps.setString(4,address);
        ps.setString(5,email);
        ps.setString(6,mobile);
        ps.setString(7,gender);
        ps.setString(8,blood);
        ps.setString(9,religion);
        ps.setString(10,designation);
        ps.setString(11,bdate);
        
        int rows = ps.executeUpdate();
        
       String message = "Successfully Registered. Please log in to continue..";
        response.sendRedirect("teacher_login.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
        
        conn.close();

    }
    catch(SQLException s)
    {
      System.out.println("Error:"+s.getMessage());
    }

      
  }

}
