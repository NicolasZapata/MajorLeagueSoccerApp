/*
 * The Matches when play the teams
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Match {
    public int id;
    public String homeTeam;
    public String guestTeam;
    public String stadium;
    public String city;
    public String homeTeamColor;
    public String guestTeamColor;
    public int yellowCardHomeTeam;
    public int yellowCardGuestTeam;
    public int redCardHomeTeam;
    public int redCardGuestTeam;
    public int homeTeamGoals;
    public int guestTeamGoals;
    public int result;
    
    /**
     * 
     * @param HomeTeam is the team of the local area
     * @param GuestTeam is the team to going to visit the home team
     */
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
            if(homeTeamGoals > guestTeamGoals){
                System.out.print(homeTeam + " Win the match");
            }
            else if(guestTeamGoals > homeTeamGoals){
                System.out.print(guestTeam + " Win the match");
            }
            if(homeTeamGoals == guestTeamGoals){
                System.out.print("Nobody Win the match, thi's a tie");
            }
        }catch(Exception exep){
            System.out.println("Result System failed: " + exep.getMessage());
        }
    }
}
