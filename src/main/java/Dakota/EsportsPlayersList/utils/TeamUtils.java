package Dakota.EsportsPlayersList.utils;

import java.util.Scanner;

public class TeamUtils {
    public static String[] teams = {
        "ATLANTA FAZE", "BOSTON BREACH", "CAROLINA ROYAL RAVENS",
        "LOS ANGELES GUERRILLAS", "LOS ANGELES THIEVES", "MIAMI HERETICS",
        "MINNESOTA RØKKR", "NEW YORK SUBLINERS", "SEATTLE SURGE",
        "TEXAS OPTIC", "TORONTO ULTRA", "VEGAS LEGION"
    };

    //method to display teams and get user's team selection
    public static String showTeams(Scanner in) {
        for (int i = 0; i < teams.length; i++) {
            System.out.println((i + 1) + ". " + teams[i]);
        }

        System.out.print("Choose a team number: ");
        int teamChoice = in.nextInt();
        in.nextLine(); 

        if (teamChoice > 0 && teamChoice <= teams.length) {
            return teams[teamChoice - 1];
        } else {
            System.out.println("Invalid choice. Please try again.");
            //recursively call to ensure valid selection
            return showTeams(in); 
        }
    }
}