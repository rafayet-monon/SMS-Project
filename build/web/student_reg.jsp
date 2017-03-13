<%-- 
    Document   : stdent_reg
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
                        <form  action="StudentRegistration" autocomplete="on" method="post"> 
                            <h1> Student Registration </h1> 
                            <p> 
                                <label>Your full name</label>
                                <input  name="std_name" type="text" placeholder="eg. Md. Rafayet Alam" />
                            </p>
                            <p> 
                                <label>Your Username</label>
                                <input  name="std_username" type="text" placeholder="eg. Rafayet" />
                            </p>
                            <p> 
                                <label>Your password </label>
                                <input  name="std_password"  type="password" placeholder="eg. X8df!90EO"/>
                            </p>
                            <p> 
                                <label>Your Full Address</label>
                                <input  name="std_address"  type="text" placeholder="eg. Khulna" />
                            </p>
                              <p> 
                                <label>Your Email</label>
                                <input  name="std_email"  type="email" placeholder="eg. rafayet.monon@gmail.com" />
                            </p>
                            <p> 
                                <label>Your Contact Number</label>
                                <input name="std_phn"  type="text" placeholder="eg. 01712..."/> 
                            </p>

                            <p>

                                <label>Select Gender</label>

                                <select  name="std_gender" >
                                    <option>Male</option>
                                    <option>Female</option>
                                </select>

                            </p>
                            
                            <p>

                                <label>Select Blood Group</label>

                                <select  name="std_blood" >
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
                              <select  name="std_religion" >
                                    <option>Muslim</option>
                                    <option>Hindu</option>
                                    <option>Christian</option>
                                    <option>Bouddho</option>
                             
                                </select>
                            </p>
                           <p> 
                                <label>Your Roll No.</label>
                                <input name="std_roll"  type="text" placeholder="eg. 1202028"/> 
                            </p>
                     <p> 
                                <label>Your Registration no</label>
                                <input name="std_reg"  type="text" placeholder="eg. 03653"/> 
                            </p>
                           <p>

                                <label>Select Class</label>

                                <select  name="std_class" >
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                    <option>5</option>
                                    <option>6</option>
                                    <option>7</option>
                                    <option>8</option>
                                    <option>9</option>
                                    <option>10</option>
                                </select>
                        
                            </p>
                            <p> <!-- Date input -->
        <label class="control-label" for="date">Birth Date</label>
        <input class="form-control" id="date" name="std_date" placeholder="DD/MM/YYYY" type="text"/>
      </p>
                            
                      




                            <p class="signin button"> 
                                <input type="submit" value="Sign up"/> 
                            </p>
                            <p class="change_link">  
                                Already Registered ?
                                <a href="student_login.jsp"> Go and log in </a>
                            </p>
                        </form>
                        
                    </div>

                </div>
            </div>  
        </section>
    </body>
</html>
