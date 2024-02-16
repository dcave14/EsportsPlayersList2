/* Dakota Cave
CIS175 - JAVA II */

package Dakota.EsportsPlayersList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String team;
    private String role;
    private String state;

    public ListPlayer() {
    }

    public ListPlayer(String name, String team, String role, String state) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.state = state;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getRole() {
        return role;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String returnPlayerDetails(){
        return "ID: " + id + ", Team: " + team + ", Player: " + name + ", Role: " + role + ", State: " + state;
    }
}