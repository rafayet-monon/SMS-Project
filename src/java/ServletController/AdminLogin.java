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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rashu
 */
public class AdminLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         try
    {

    Class.forName("oracle.jdbc.OracleDriver");
    }
    catch(ClassNotFoundException c)
    {
      System.out.println("Error:"+c.getMessage());
    }
       PrintWriter out=response.getWriter();
       String name=request.getParameter("admin_email");
       String pass=request.getParameter("admin_password");

       
           try
    {
    
      Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@ACE:49675:xe","system","ace");
        
      PreparedStatement ps = conn.prepareStatement("select * from tbl_admin where name=? and password=?");

        if (name.equals("") || pass.equals("")) {
            out.println("Cannot leave username or password blank");
            
        } 
        else {
           ps.setString(1,name);
            ps.setString(2,pass); 
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                
               
                HttpSession session=request.getSession();  
                session.setAttribute("name",name);  
             
                String message = "WELCOME";
                response.sendRedirect("admin_dashboard.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
            }
            else{
                   String message = "Please Regiser..";
        response.sendRedirect("admin_login.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
            }
        }
        
        conn.close();

    }
    catch(SQLException s)
    {
      System.out.println("Error:"+s.getMessage());
    }
    }

}
