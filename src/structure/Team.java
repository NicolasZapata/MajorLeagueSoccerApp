/*
 * This Class is for choised the Teams to play the matches
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Team {
    private String name;
    private int id;
    private String teamCity;
    private String color;
    private int points;
    
    public Team (String Name, int ID, String TeamCity, String Color, int Points){
        this.name = Name;
        this.id = ID;
        this.teamCity = TeamCity;
        this.color = Color;
        this.points = Points;
    }
    
    public Team(String name){
        this.name = name;
    }
    

}
