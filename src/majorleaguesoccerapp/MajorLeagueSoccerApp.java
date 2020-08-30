package majorleaguesoccerapp;

import java.util.Scanner;
import structure.Match;
import structure.Stadium;
import structure.Team;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class MajorLeagueSoccerApp {
    
    public static void main(String[] args) {
        Team team1, team2;
        Stadium stadium;
        int goalsTeam1, goalsTeam2;
        
        //stadium = new Stadium("New York Stadium");
        Scanner scanner = new Scanner(System.in);
  
        stadium = new Stadium("Red Bull Arena", 4526, "New York", 1000);
        team1 = new Team("LA Galaxi", 4523, "Los Ángeles", "Red", 0);
        team2 = new Team("Red Bull New York", 7523, "New York", "Blue", 0);
        
        System.out.println("Print the home team's goals: ");
        goalsTeam1 = scanner.nextInt();
        
        System.out.println("Print the guest team's goals: ");
        goalsTeam2 = scanner.nextInt();
        
        Match match = new Match(562, team1, team2, stadium, "New York", "Purple", "Red", goalsTeam1, goalsTeam2);
//        match.PrintResult();
	match.PrintCards();
	match.ResultData(stadium);
    }

    
}
