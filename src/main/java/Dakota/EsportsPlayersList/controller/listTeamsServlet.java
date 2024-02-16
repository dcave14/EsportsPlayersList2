/* Dakota Cave
CIS175 - JAVA II */

package Dakota.EsportsPlayersList.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import utility class for team operations
import Dakota.EsportsPlayersList.utils.TeamUtils;

//annotation to define servlet and its URL pattern
@WebServlet("/listTeamsServlet")

public class listTeamsServlet extends HttpServlet {
    //versioning control in Serializable class
    private static final long serialVersionUID = 1L;

    //default constructor
    public listTeamsServlet() {
        super();
    }

    //method to handle GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set attribute "teams" with list of teams from TeamUtils
        request.setAttribute("teams", TeamUtils.teams); 

        //create RequestDispatcher to forward request to JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list-teams.jsp");
        
        //forward request and response objects to JSP page
        dispatcher.forward(request, response);
    }
}