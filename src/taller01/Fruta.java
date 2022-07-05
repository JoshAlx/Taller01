package taller01;
import java.util.ArrayList;

/**
 * It represents the Fruta class and the getter and setter methods for the averageWeight and colors attribute.
 * @author: Joan Peralta Collante
 */
public class Fruta {
    /**
     * It represents the attribute of type String name in the Fruta class.
     */
    public String name;
    /**
     * It represents the attribute of type float averageWeight in the Fruta class.
     */
    private float averageWeight;
    /**
     * It represents the attribute of type ArrayList<String> colors in the Fruta class.
     */
    public ArrayList<String> colors;

    /**
     * Create an instance of class Fruta
     * @param averageWeight The average weight of the fruit
     * @param colors The colors of the fruit
     */
    public Fruta(float averageWeight, ArrayList<String> colors) {
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Setter method of the averageWeight attribute
     * @param averageWeight The averageWeight attribute passed as an argument
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Getter method of the averageWeight attribute
     * @return Returns the value of the average weight
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Setter method of the colors attribute
     * @param colors The colors attribute passed as an argument
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    /**
     * Getter method of the colors attribute
     * @return Returns the value of the Array List colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }
}
