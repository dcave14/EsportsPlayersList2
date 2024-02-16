/* Dakota Cave
CIS175 - JAVA II */

package Dakota.EsportsPlayersList.controller;

//necessary imports
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dakota.EsportsPlayersList.model.ListPlayer;

/**
 * Servlet implementation class ViewPlayersServlet
 */
@WebServlet("/viewPlayersServlet")
//extends HttpServlet
public class ViewPlayersServlet extends HttpServlet {
    //serial version UID
    private static final long serialVersionUID = 1L;
       
    //constructor
    public ViewPlayersServlet() {
        super();
    }

    //handles GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //create ListPlayerHelper object
        ListPlayerHelper lph = new ListPlayerHelper();
        //get list of players
        List<ListPlayer> players = lph.showAllPlayers();
        //set attribute "players" in request
        request.setAttribute("players", players);

        //create RequestDispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("view-players.jsp");
        //forward request and response to JSP
        dispatcher.forward(request, response);
    }
}