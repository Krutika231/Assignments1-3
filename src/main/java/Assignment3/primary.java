package Assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class primary {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            String resultTeamName;
            String matchResult;
            String line = "";
            FootballTeam football;
            BasketballTeam basketball;
            ArrayList<FootballTeam> football1 = new ArrayList<>();
            ArrayList<BasketballTeam> basketball1 = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\Assignment3\\src\\main\\resources\\teams.csv"));
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                String teamData[] = line.split(",");
                if (teamData[0].equalsIgnoreCase("Basketball")) {
                    basketball = new BasketballTeam(teamData[1], Integer.parseInt(teamData[2]));
                    basketball1.add(basketball);

                }
                if (teamData[0].equalsIgnoreCase("Football")) {
                    football = new FootballTeam(teamData[1], Integer.parseInt(teamData[2]), teamData[3]);
                    football1.add(football);
                }
            }


        System.out.println("Football teams in Ascending order ");
        Collections.sort(football1, new FootballTeam());
        for (int i = 0; i < football1.size(); i++) {
            System.out.println("Team Name = " + football1.get(i).getTeamName());
            System.out.println(" Points = " + football1.get(i).getPoints());
        }

        System.out.println("Basketball teams Ascending order");
        Collections.sort(basketball1, new BasketballTeam());
        for (int i = 0; i < basketball1.size(); i++) {
            System.out.println("Team Name = " + basketball1.get(i).getTeamName());
            System.out.println(" Points = " + basketball1.get(i).getPoints());
        }


            Scanner scanner = new Scanner(new File("src\\main\\resources\\results.csv"));
            scanner.useDelimiter(",");
            String lineInResultFile = "";

            ArrayList<String[]> FootballTeams = new ArrayList<>();
            ArrayList<String[]> BasketballTeams = new ArrayList<>();
            while (scanner.hasNext()) {
                lineInResultFile = scanner.nextLine();
                String result[] = lineInResultFile.split(",");
                resultTeamName = result[0];
                matchResult = result[1];

                if (resultTeamName.equalsIgnoreCase("Boston Celtics") || resultTeamName.equalsIgnoreCase("Los Angeles Lakers") || resultTeamName.equalsIgnoreCase("Cleveland Cavaliers")) {
                    BasketballTeams.add(result);
                    //System.out.println(BasketballTeams);
                } else {
                    FootballTeams.add(result);
                    //System.out.println(FootballTeams);
                }
                //System.out.println("[Matches.Team Name: " + resultTeamName + ", " + "MatchResult: " + matchResult + "]");

            } //while loop end


        int updatedPoints;
        int pointsAdded;
        for (int i = 0; i < BasketballTeams.size(); i++) {

            pointsAdded = basketball1.get(0).updatePoints(BasketballTeams.get(i)[1]);
            for (int j = 0; j < basketball1.size(); j++) {

                if (basketball1.get(j).getTeamName().equals(BasketballTeams.get(i)[0])) {
                    updatedPoints = (basketball1.get(j).getPoints()) + pointsAdded;

//                    using arraylist set method replace object of BasketBallTeam on index j from loop.
                    basketball1.set(j, new BasketballTeam( basketball1.get(j).getTeamName(),updatedPoints));
                    break;
                }
            }
        }

        System.out.println();


        for (int i = 0; i < FootballTeams.size(); i++) {

            pointsAdded = football1.get(0).updatePoints(FootballTeams.get(i)[1]);
            for (int j = 0; j < football1.size(); j++) {

                if (football1.get(j).getTeamName().equals(FootballTeams.get(i)[0])) {
                    updatedPoints = (football1.get(j).getPoints()) + pointsAdded;


                    football1.set(j,new FootballTeam(football1.get(j).getTeamName(),updatedPoints));
                    break;
                }

            }
        }


        Collections.sort(football1, new FootballTeam());
        System.out.println("Football Team");
        for (FootballTeam football3 :football1) {
            System.out.println("Team Name=" + football3.getTeamName() + "Point=" + football3.getPoints());
        }



        System.out.println();
        Collections.sort(basketball1, new BasketballTeam());
        System.out.println("Basketball Team");
        for (BasketballTeam basketball3 : basketball1) {
            System.out.println("Team Name=" + basketball3.getTeamName() + "\n Point=" + basketball3.getPoints());
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
