/**
 * The Stadium were going to play the teams
 */
package structure;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Stadium {
    private String name;
    private int id;
    private String city;
    private int capacity;
    
    public Stadium (String Name, int ID, String City, int Capacity){
        this.name = Name;
        this.id = ID;
        this.city = City;
        this.capacity = Capacity;
    }

    public Stadium(String name){
        this.name = name;
    }
    
}
