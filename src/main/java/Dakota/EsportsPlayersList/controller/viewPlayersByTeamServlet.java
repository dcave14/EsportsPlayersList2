package Dakota.EsportsPlayersList.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dakota.EsportsPlayersList.model.ListPlayer;

@WebServlet("/viewPlayersByTeamServlet")
public class viewPlayersByTeamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public viewPlayersByTeamServlet() {
        super();
    }

    //handle GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get team name from request parameter
        String teamName = request.getParameter("teamName");
        
        //create instance of ListPlayerHelper
        ListPlayerHelper lph = new ListPlayerHelper();
        
        //search for players by team name
        List<ListPlayer> playersByTeam = lph.searchForPlayerByTeam(teamName);

        //set playersByTeam and teamName attributes in request
        request.setAttribute("playersByTeam", playersByTeam);
        request.setAttribute("teamName", teamName); 
        
        //forward request and response to view-players-by-team.jsp page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view-players-by-team.jsp");
        dispatcher.forward(request, response);
    }
}
