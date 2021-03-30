<%-- 
    Document   : home
    Created on : Mar 30, 2021, 7:56:50 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <form method="post" action="createEpm">
            <table>
                <tr>
                    <td>Employee Name </td>
                    <td> : </td>
                    <td> <input type="text" name="empName" placeholder="Input Name "/> </td>
                </tr>
                <tr>
                    <td>Employee Phone </td>
                    <td> : </td>
                    <td> <input type="text" name="empPhone" placeholder="Input phone "/> </td>
                </tr>
                <tr>
                    <td></td>
                    <td> </td>
                    <td> <input type="submit" value="Submit"/> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
