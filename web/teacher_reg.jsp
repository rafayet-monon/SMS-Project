<%-- 
    Document   : tcrent_reg
    Created on : Mar 11, 2017, 11:52:08 PM
    Author     : ACE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="assets/css/demo_reg.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/style_reg.css" />
        <link rel="stylesheet" type="text/css" href="assets/css/animate-custom_reg.css" />
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">


        <title>Student Registration</title>
    </head>
    <body>
        <section>				
            <div id="container_demo" >


                <div id="wrapper">
                  


                    <div class="animate form">
                        <form  action="TeacherRegistration" autocomplete="on" method="post"> 
                            <h1> Teacher Registration </h1> 
                            <p> 
                                <label>Your full name</label>
                                <input  name="tcr_name" type="text" placeholder="eg. Md. Rafayet Alam" />
                            </p>
                            <p> 
                                <label>Your Username</label>
                                <input  name="tcr_username" type="text" placeholder="eg. Rafayet" />
                            </p>
                            <p> 
                                <label>Your password </label>
                                <input  name="tcr_password"  type="password" placeholder="eg. X8df!90EO"/>
                            </p>
                            <p> 
                                <label>Your Full Address</label>
                                <input  name="tcr_address"  type="text" placeholder="eg. Khulna" />
                            </p>
                              <p> 
                                <label>Your Email</label>
                                <input  name="tcr_email"  type="email" placeholder="eg. rafayet.monon@gmail.com" />
                            </p>
                            <p> 
                                <label>Your Contact Number</label>
                                <input name="tcr_phn"  type="text" placeholder="eg. 01712..."/> 
                            </p>

                            <p>

                                <label>Select Gender</label>

                                <select  name="tcr_gender" >
                                    <option>Male</option>
                                    <option>Female</option>
                                </select>

                            </p>
                            
                            <p>

                                <label>Select Blood Group</label>

                                <select  name="tcr_blood" >
                                    <option>A+</option>
                                    <option>A-</option>
                                    <option>AB+</option>
                                    <option>AB-</option>
                                    <option>B+</option>
                                    <option>B-</option>
                                    <option>O+</option>
                                    <option>O+</option>
                                </select>
                        
                            </p>
                            <p>
                                   <label>Select Religion</label>
                              <select  name="tcr_religion" >
                                    <option>Muslim</option>
                                    <option>Hindu</option>
                                    <option>Christian</option>
                                    <option>Bouddho</option>
                             
                                </select>
                            </p>
                             <p> 
                                <label>Your Designation</label>
                                <input  name="tcr_designation" type="text" placeholder="eg. Professor" />
                            </p>
                         
                           
                            <p> <!-- Date input -->
        <label class="control-label" for="date">Birth Date</label>
        <input class="form-control" id="date" name="tcr_date" placeholder="DD/MM/YYYY" type="text"/>
      </p>
                            
                      




                            <p class="signin button"> 
                                <input type="submit" value="Sign up"/> 
                            </p>
                            <p class="change_link">  
                                Already Registered ?
                                <a href="teacher_login.jsp"> Go and log in </a>
                            </p>
                        </form>
                        
                    </div>

                </div>
            </div>  
        </section>
    </body>
</html>
