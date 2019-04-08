<%-- 
    Document   : newjsp
    Created on : 17 Mar, 2019, 6:02:02 PM
    Author     : 91880
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String n =request.getParameter("n1");
            out.print(n);
            
        %>  
    </body>
</html>
