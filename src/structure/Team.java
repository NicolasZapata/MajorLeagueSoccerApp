/*
 * This Class is for choised the Teams to play the matches
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Team {
    public String name;
    public int id;
    public String teamCity;
    public String color;
    public int points;
    
    public Team (String Name, int ID, String TeamCity, String Color, int Points){
        Name = this.name;
        ID = this.id;
        TeamCity = this.teamCity;
        Color = this.color;
        Points = this.points;
    }

    public void UpdatePoints(){
        
    }

}