/*
 * The Matches when play the teams
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Match {
    private int id;
    private String homeTeam;
    private String guestTeam;
    private String stadium;
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
    

    public Match(int id, String homeTeam, String guestTeam, String stadium, String city, 
            String homeTeamColor, String guestTeamColor, int yellowCardHomeTeam, int yellowCardGuestTeam, 
            int homeTeamGoals, int guestTeamGoals ,int result){
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
      public Match(int id, String homeTeam, String guestTeam,  String city, 
            String homeTeamColor, String guestTeamColor, int yellowCardHomeTeam, int yellowCardGuestTeam, 
            int homeTeamGoals, int guestTeamGoals ,int result){
        this.id = id;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
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
    public void PrintResult(){
        try{
            if(this.homeTeamGoals > this.guestTeamGoals){
                System.out.print(this.homeTeam + " Win the match");
            }
            else if(this.guestTeamGoals > this.homeTeamGoals){
                System.out.print(guestTeam + " Win the match");
            }
            else if(this.homeTeamGoals == this.guestTeamGoals){
                System.out.print("Nobody Win the match, this is a tie");
            }
        }catch(Exception exep){
            System.out.println("Result System failed: " + exep.getMessage());
        }
    }
}
