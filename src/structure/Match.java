/*
 * The Matches when play the teams
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Match {
    public Stadium stadium;
    public String city;
    public int id;
    public String localTeam;
    public String visitedTeam;
    public String localTeamColor;
    public String visitedTeamColor;
    public int yellowCardLocalTeam;
    public int yellowCardVisitedTeam;
    public int redCardLocalTeam;
    public int redCardVisitedTeam;
    public int goals;
    public int result;
    
    /**
     * 
     * @param LocalTeam
     * @param VisitedTeam 
     */
    public Match(String LocalTeam, String VisitedTeam){
        LocalTeam = this.localTeam;
        VisitedTeam = this.visitedTeam;
    }
   
    /**
     * This method show the match's result
    */
    public void ImportResult(){
        
    }
}
