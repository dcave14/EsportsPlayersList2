/* Dakota Cave
CIS175 - JAVA II */

//package declaration
package Dakota.EsportsPlayersList.utils;

//necessary import
import java.util.Scanner;

//class declaration
public class TeamUtils {
    //array of team names
    public static String[] teams = {
        "ATLANTA FAZE", "BOSTON BREACH", "CAROLINA ROYAL RAVENS",
        "LOS ANGELES GUERRILLAS", "LOS ANGELES THIEVES", "MIAMI HERETICS",
        "MINNESOTA RØKKR", "NEW YORK SUBLINERS", "SEATTLE SURGE",
        "TEXAS OPTIC", "TORONTO ULTRA", "VEGAS LEGION"
    };

    //method to display teams and get user's team selection
    public static String showTeams(Scanner in) {
        //loop to display team names
        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + ". " + teams[i]);
        }

        //prompt user to choose a team
        System.out.print("Choose a team number: ");
        //get user's choice
        int teamChoice = in.nextInt();
        //consume newline left-over
        in.nextLine(); 

        //check if choice is valid
        if (teamChoice > 0 && teamChoice <= teams.length) {
            //return chosen team
            return teams[teamChoice - 1];
        } else {
            //inform user of invalid choice
            System.out.println("Invalid choice. Please try again.");
            //recursively call to ensure valid selection
            return showTeams(in); 
        }
    }
}