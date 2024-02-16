<!-- Dakota Cave
CIS175 - JAVA II  -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Players by Team</title>
</head>
<body>
    <h1>Players for Team: ${teamName}</h1>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Team</th>
                <th>Role</th>
                <th>State</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${playersByTeam}" var="player">
                <tr>
                    <td>${player.name}</td>
                    <td>${player.team}</td>
                    <td>${player.role}</td>
                    <td>${player.state}</td>
                    <td><a href="editPlayerServlet?playerId=${player.id}">Edit</a></td>
                    <td><a href="deletePlayerServlet?playerId=${player.id}" onclick="return confirm('Are you sure?')">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="index.html">Back to Home</a>
</body>
</html>
