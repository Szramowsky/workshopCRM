<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Workshop CRM</title>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            * {
                box-sizing: border-box;
                font-family: Arial, Helvetica, sans-serif;
            }
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }
            /* Style the top navigation bar */
            .topnav {
                overflow: hidden;
                background-color: #333;
                display: flex;
                justify-content: space-evenly;
            }
            /* Style the topnav links */
            .topnav a {
                float: left;
                display: block;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }
            /* Change color on hover */
            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }
        </style>
</head>

<header>
    <div class="topnav">
        <table>
            <tr>
                <td><a href="<c:url value="/"/>" class="btn btn-primary">
                    Workshop CRM
                </a>
                </td>
                <td><a href="<c:url value="/login"/>">Login</a></td>
                <td><a href="<c:url value="/sign-up"/>">Sign up</a></td>
                <td><a href="<c:url value="/about"/>">About us</a></td>
                <td><a href="<c:url value="/faq"/>">FAQ</a></td>
            </tr>
        </table>
    </div>

</header>

</body>
</html>