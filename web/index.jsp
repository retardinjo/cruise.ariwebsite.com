<%@page import="java.awt.*"%>
<%@page import="javax.naming.Context"%>
<%
    if (request.getHeader("User-Agent").indexOf("Mobile") != -1) {
        response.sendRedirect("m_index.jsp");
    }
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cruise.ARIwebsite.com</title>
        <link rel="shortcut icon" href="img/titl_ari.png"/>
        <link rel="stylesheet" media="screen and (min-width: 1440px)"  href="css/style_index.css"/>
        <link rel="stylesheet" media="screen and (max-width: 1440px)"  href="css/style_index_under1600.css"/>
        <link rel="stylesheet" href="css/temp.css">
    </head>
    <body> 

        <div class="main">
            <div class="wrapper">
                <div class="box a" onclick="window.location.href = 'underConstruction.jsp'">CASINO</div>
                <div class="box b" onclick="window.location.href = 'underConstruction.jsp'">UNDERWATER</div>
                <div class="box c" onclick="window.location.href = 'underConstruction.jsp'">NIGHT PARTIES</div>
                <div class="box d" onclick="window.location.href = 'underConstruction.jsp'"><%@include file="temp.jsp" %><%@include file="exchangeRate.jsp" %></div>
                <div class="box e" onclick="window.location.href = 'underConstruction.jsp'">KAYAK EXPLORE</div>           
                <div class="box f" onclick="window.location.href = 'underConstruction.jsp'">CLEAR WATER</div>
                <div class="box g" onclick="window.location.href = 'underConstruction.jsp'">PRIVATE PARADISE</div>
                <div class="box h" onclick="window.location.href = 'underConstruction.jsp'">DIVING</div>
                <div class="box i" onclick="window.location.href = 'underConstruction.jsp'">BOAT EXPLORE</div>
                <div class="box j" onclick="window.location.href = 'underConstruction.jsp'">BEACH MASSAGE</div>
                <div class="box k" onclick="window.location.href = 'underConstruction.jsp'">RESTAURANT</div>
                <div class="box l" onclick="window.location.href = 'underConstruction.jsp'">CINEMA</div>
                <div class="box m" onclick="window.location.href = 'underConstruction.jsp'">FITNESS</div>
            </div>
        </div>

        <%@include file="navBar.jsp" %>
        <%@include file="nbs.jsp" %>
        <%@include file="footer.jsp" %>
    </body>
</html>

