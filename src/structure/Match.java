/*
 * The Matches when play the teams
 */
package structure;

import java.util.Scanner;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Match {
    private int id;
    private Team homeTeam;
    private Team guestTeam;
    private Stadium stadium;
    private String city;
    private String homeTeamColor;
    private String guestTeamColor;
    private int yellowCardHomeTeam;
    private int yellowCardGuestTeam;
    private int redCardHomeTeam;
    private int redCardGuestTeam;
    private int homeTeamGoals;
    private int guestTeamGoals;
    private int result;
    

    public Match(int id, Team homeTeam, Team guestTeam, Stadium stadium, String city, String homeTeamColor, String guestTeamColor, int homeTeamGoals, int guestTeamGoals){
        this.id = id;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.stadium = stadium;
        this.city = city;
        this.homeTeamColor = homeTeamColor;
        this.guestTeamColor = guestTeamColor;
        this.yellowCardGuestTeam = yellowCardHomeTeam;
        this.yellowCardHomeTeam = yellowCardGuestTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.guestTeamGoals = guestTeamGoals;
        this.result = result;
        
    }
   
    /**
     * This method show the match's result
    */
    public void PrintResult(Team team1, Team team2){
        try{
            if(homeTeamGoals > guestTeamGoals){
                System.out.print(team1.name + " Win the match");
            }
            else if(guestTeamGoals > homeTeamGoals){
                System.out.print(team2.name + " Win the match");
            }
            else if(homeTeamGoals == guestTeamGoals){
                System.out.print("Nobody Win the match, this is a tie");
            }
        }catch(Exception exep){
            System.out.println("Result System failed: " + exep.getMessage());
        }
    }
    
    public void PrintCards(){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Home Team Yellow Cards: ");
	yellowCardHomeTeam = scanner.nextInt();

	System.out.print("Guest Team Yellow Cards: ");
	yellowCardGuestTeam = scanner.nextInt();

	System.out.print("Guest Team Red Cards: ");
	redCardHomeTeam = scanner.nextInt();

	System.out.print("Guest Team Reed Cards: ");
	redCardGuestTeam = scanner.nextInt();
    }
    
    
    
    /**
     * This method shows the data of the match
     */
    public void ResultData(Stadium stadium){
        System.out.println("-------------- Result -------------------");
        System.out.println(homeTeam.name + " " + homeTeamGoals + " - " + guestTeamGoals + " " + guestTeam.name);
        
        System.out.println("-------------- Yellow Tarjets -------------------");
        System.out.println(yellowCardHomeTeam + " - " + yellowCardGuestTeam);

        System.out.println("-------------- Red Tarjets -------------------");
        System.out.println(redCardHomeTeam + " - " + redCardGuestTeam);
	
	System.out.println("------------ city -------------");
	System.out.println(city);
	
	System.out.println("---------- Stadium -----------");
	System.out.println(stadium.name + "(Whit capacity for " + stadium.capacity + " people)");
        
    }
    
}
