/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletController;

import java.sql.*;

/**
 *
 * @author rashu
 */
public class AdminLoginModel {

    private static int id;
    private static String name;
    private static String email;


    public static int validateAdmin(String email, String password) {
      

        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException c) {
            System.out.println("Error:" + c.getMessage());
        }
        try {

            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@ACE:49675:xe", "system", "ace");
            PreparedStatement ps = conn.prepareStatement("select id, name, email from tbl_admin where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
                name = rs.getString(2);
                email = rs.getString(3);

                

            }

        } catch (Exception e) {

        }

        return id;

    }

    public static int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

}
