package Assignment3;

import java.util.ArrayList;
import java.util.Comparator;

public class BasketballTeam implements Team, Comparator<BasketballTeam> {
    private String TeamName;
    private int Points;

    ArrayList<BasketballTeam> basketball1=new ArrayList<>();
    public BasketballTeam() {
        String TeamName = "";
        int Points = 0;
    }

    public BasketballTeam(String teamName, int points) {
        this.TeamName = teamName;
        this.Points = points;
    }

    public BasketballTeam(String teamName) {
        this.TeamName=teamName;
    }

    @Override
    public String getTeamName() {
        return this.TeamName;
    }

    @Override
    public int updatePoints(String result) {
        if(result.equalsIgnoreCase("Win"))
            return 2;
        else
            return 0;

    }

    @Override
    public int getPoints() {
        return this.Points;
    }

    @Override
    public int compare(BasketballTeam obj1, BasketballTeam obj2) {
        if(obj1.Points==obj2.Points)
        {
            return 0;
        }
        else if(obj1.Points< obj2.Points){
            return 1;
        }
        else {
            return -1;
        }
    }
}