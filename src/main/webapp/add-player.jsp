<!-- JSP file for adding a new player to the Esports Players List app -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add New Player</title>
</head>
<body>
    <h1>Add New Player</h1>
    <form action="${pageContext.request.contextPath}/addPlayerServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        
        <label for="team">Team:</label>
		<select id="team" name="team" required>
		    <option value=""></option>
		    <option value="ATLANTA FAZE">ATLANTA FAZE</option>
		    <option value="BOSTON BREACH">BOSTON BREACH</option>
		    <option value="CAROLINA ROYAL RAVENS">CAROLINA ROYAL RAVENS</option>
		    <option value="LOS ANGELES GUERRILLAS">LOS ANGELES GUERRILLAS</option>
		    <option value="LOS ANGELES THIEVES">LOS ANGELES THIEVES</option>
		    <option value="MIAMI HERETICS">MIAMI HERETICS</option>
		    <option value="MINNESOTA RØKKR">MINNESOTA RØKKR</option>
		    <option value="NEW YORK SUBLINERS">NEW YORK SUBLINERS</option>
		    <option value="SEATTLE SURGE">SEATTLE SURGE</option>
		    <option value="TEXAS OPTIC">TEXAS OPTIC</option>
		    <option value="TORONTO ULTRA">TORONTO ULTRA</option>
		    <option value="VEGAS LEGION">VEGAS LEGION</option>
		</select>
        
        <label for="role">Role:</label>
        <select id="role" name="role">
            <option value="SMG">SMG</option>
            <option value="AR">AR</option>
            <option value="Flex">Flex</option>
            <option value="Coach">Coach</option>
        </select>
        
        <label for="state">State:</label>
        <select id="state" name="state">
            <option value="Active">Active</option>
            <option value="Substitute">Substitute</option>
            <option value="Inactive">Inactive</option>
        </select>
        
        <input type="submit" value="Add Player">
    </form>
    <a href="index.html">Back to Home</a>
</body>
</html>