package taller01;
import java.util.Date;

/**
 * It represents the Persona class and the getter and setter methods for the name attribute.
 * @author: Joan Peralta Collante
 */
public class Persona {
    /**
     * It represents the attributes of type String name, lastName 1 and lastName 2 in the Persona class.
     */
    public String name, lastName1, lastName2;
    /**
     * It represents the attribute of type Date dateBirth in the Persona class.
     */
    public Date dateBirth;
    /**
     * It represents the attribute of type float height in the Persona class.
     */
    public float height;

    /**
     * Create an instance of the Persona class.
     * @param name The name of Persona
     * @param lastName1 The first last name of Persona
     * @param lastName2 The second last name of Persona
     * @param dateBirth Persona's birthday
     * @param height Persona height
     */
    public Persona(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Setter method of the name attribute.
     * @param name The name attribute passed as an argument.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method of the name attribute.
     * @return Return the name attribute.
     */
    public String getName(){
        return name;
    }

}

