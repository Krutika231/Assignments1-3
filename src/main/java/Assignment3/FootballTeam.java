package Assignment3;

import java.util.Comparator;

public class FootballTeam implements Team, Comparator<FootballTeam> {
    private String TeamName;
    private int Points;
    private String Sponsor;

    public FootballTeam() {              //Default Constructor
        String TeamName = "";
        int Points = 0;
        String Sponsor;
    }

    public FootballTeam(String teamName, int points, String sponsor) {      //parameterized constructor
        this.TeamName = teamName;
        this.Points = points;
        this.Sponsor = sponsor;
    }

    public FootballTeam(String teamName, int updatedPoints) {
        this.TeamName = teamName;
        this.Points = updatedPoints;
    }

    @Override
    public String getTeamName() {
        return this.TeamName;
    }

    @Override
    public int updatePoints(String result) {
        if (result.equalsIgnoreCase("Win")) {
            return 3;
        }
        else if (result.equalsIgnoreCase("Drawn")) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getPoints() {
        return this.Points;
    }

    @Override
    public int compare(FootballTeam o1, FootballTeam o2) {
        return o1.getPoints()-o2.getPoints();
    }

}
