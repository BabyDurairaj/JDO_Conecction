<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page import="full.JDO.com.RegistrationControl"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <style type="text/css">
     body
      {
         text-align:center;
         font-color:blue;
         font-family:arial;
         position:relative;
         
      }
      .btn
      {
      display:inline-block;
      }
      .wrapper
      {
      text-align:center;
      
      font-size:40px;
      }
      .table
      {
      position :absolute;
      right:0;
      
      
      }
      
   </style>
</head>
<body>
   <h1>Welcome to our page</h1>
   <div class="wrapper">
   <p><span id="hrs">00</span>:<span id="min">00</span>:<span id="sec">00</span>
   </p>
   <div>
   <button id="button" class="btn btn-default">start/stop</button>
   </div>
   </div>
       <div class="table">
            <img src="image1.png" width="150px" height="150px" />
          
          
              <p> 
                <%=(String)session.getAttribute("email")%><br />
                <%= (String)session.getAttribute("name")%><br />
            
                  <%= (String)session.getAttribute("password") %><br />
               
                  <%=(String)session.getAttribute("mobile")%><br />
                  </p>
             </div>
     <script type="text/javascript" src="CountDown.js"></script>
   </body>
 </html>

