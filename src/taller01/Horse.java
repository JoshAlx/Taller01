package taller01;

/**
 * It represents a class called Horse, which establishes as attributes the name, age,
 * weight, state of the teeth and the horseHair of the animal.
 * @author Joan Peralta Collante
 */
public class Horse {
    /**
     * It represents the attribute of type String name
     */
    public String name;
    /**
     * It represents the attribute of type int age
     */
    public int age;
    /**
     * It represents the attribute of type float weight
     */
    public float weight;
    /**
     * It represents the attribute of type String teeth
     */
    private String teeth;
    /**
     * It represents the attribute of type String horseHair
     */
    protected String horseHair;

    /**
     * Create the instances of class Horse
     * @param name Define the name of animal
     * @param age Define the age of the animal
     * @param weight Define the weight of animal
     * @param teeth Define the state of teeth of an animal
     * @param horseHair Define the state if horseHair
     */
    public Horse(String name, int age, float weight, String teeth, String horseHair){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.teeth = teeth;
        this.horseHair =horseHair;
    }

    /**
     * Getter method of the name attribute
     * @return The name of the horse
     */
    public String getName() {
        return "The name of the horse is: " + name;
    }

    /**
     * Getter method of the age attribute
     * @return The age of the horse
     */
    public String getAge() {
        return "The age of the horse is: " + age;
    }

    /**
     * Getter method of the teeth attribute
     * @return The condition of the teeth
     */
    public String getTeeth() {
        return "The horse has good teeth";
    }

    /**
     * Setter method of the teeth attribute
     * @param teeth The condition of teeth passed of an argument
     */
    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }
}
