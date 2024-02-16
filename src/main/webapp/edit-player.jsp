<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Player</title>
</head>
<body>
    <h1>Edit Player</h1>
    <form action="editPlayerServlet" method="post">
        <input type="hidden" name="playerId" value="${player.id}">
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${player.name}" required>
        
        <label for="team">Team:</label>
		<select id="team" name="team" required>
            <option value="${player.team}">${player.team}</option>
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
        <select id="role" name="role" required>
            <option value="SMG" ${player.role eq 'SMG' ? 'selected' : ''}>SMG</option>
            <option value="AR" ${player.role eq 'AR' ? 'selected' : ''}>AR</option>
            <option value="Flex" ${player.role eq 'Flex' ? 'selected' : ''}>Flex</option>
            <option value="Coach" ${player.role eq 'Coach' ? 'selected' : ''}>Coach</option>
        </select>
        
        <label for="state">State:</label>
        <select id="state" name="state" required>
            <option value="Active" ${player.state eq 'Active' ? 'selected' : ''}>Active</option>
            <option value="Substitute" ${player.state eq 'Substitute' ? 'selected' : ''}>Substitute</option>
            <option value="Inactive" ${player.state eq 'Inactive' ? 'selected' : ''}>Inactive</option>
        </select>
        
        <input type="submit" value="Save">
    </form>
    <a href="viewPlayersServlet">Cancel</a>
</body>
</html>