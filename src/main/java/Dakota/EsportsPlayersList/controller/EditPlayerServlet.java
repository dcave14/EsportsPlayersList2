package Dakota.EsportsPlayersList.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dakota.EsportsPlayersList.model.ListPlayer;

/**
 * Servlet implementation class EditPlayerServlet
 */
@WebServlet("/editPlayerServlet")
public class EditPlayerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EditPlayerServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int playerId = Integer.parseInt(request.getParameter("playerId"));
        ListPlayerHelper lph = new ListPlayerHelper();
        ListPlayer player = lph.getPlayerById(playerId);

        request.setAttribute("player", player);

        RequestDispatcher dispatcher = request.getRequestDispatcher("edit-player.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int playerId = Integer.parseInt(request.getParameter("playerId"));
        String name = request.getParameter("name");
        String team = request.getParameter("team");
        String role = request.getParameter("role");
        String state = request.getParameter("state");

        ListPlayerHelper lph = new ListPlayerHelper();
        ListPlayer player = lph.getPlayerById(playerId);
        
        player.setName(name);
        player.setTeam(team);
        player.setRole(role);
        player.setState(state);

        lph.updatePlayer(player);

        response.sendRedirect("viewPlayersServlet");
    }
}
