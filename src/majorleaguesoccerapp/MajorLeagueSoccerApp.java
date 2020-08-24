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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String team1, team2;
        int goalsTeam1, goalsTeam2;
        
        //stadium = new Stadium("New York Stadium");
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Print the home team: ");
        team1 = scanner.nextLine();
        
        System.out.println("Print the guest team: ");
        team2 = scanner.nextLine();
        
        System.out.println("Print the home team's goals: ");
        goalsTeam1 = scanner.nextInt();
        
        System.out.println("Print the guest team's goals: ");
        goalsTeam2 = scanner.nextInt();
        
        calcResult(team1, team2, goalsTeam1, goalsTeam2);
    }
    public static void calcResult(String team1, String team2, int goalsTeam1, int goalsTeam2){
        Match match = new Match(562, team1, team2, "New York", "Purple", "Red", 0, 0, 0, 0, 0);
        match.PrintResult();
    }
    
}
