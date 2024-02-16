package Dakota.EsportsPlayersList.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dakota.EsportsPlayersList.model.ListPlayer;
import Dakota.EsportsPlayersList.utils.TeamUtils;

@WebServlet("/addPlayerServlet")
public class AddPlayerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public AddPlayerServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //convert static teams arr from TeamUtils to List and set it as request attribute
    	System.out.println("AddPlayerServlet doGet() called");
        List<String> teams = Arrays.asList(TeamUtils.teams);
        request.setAttribute("teams", teams);
        
        //forward request to add-player.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("add-player.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //retrieve form data
        String name = request.getParameter("name");
        String team = request.getParameter("team");
        String role = request.getParameter("role");
        String state = request.getParameter("state");

        //create new player obj and insert it into database
        ListPlayer player = new ListPlayer(name, team, role, state);
        ListPlayerHelper lph = new ListPlayerHelper();
        lph.insertPlayer(player);

        //redirect to 'viewPlayersServlet' after player addition
        response.sendRedirect("viewPlayersServlet");
    }
}