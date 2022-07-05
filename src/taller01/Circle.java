package taller01;

/**
 * It represents the Circle class, which is used to calculate the area and perimeter of a circle.
 * @author Joan Peralta Collante
 */
public class Circle {
    /**
     * It represents the mathematical constant PI
     */
    public double PI = 3.1416;
    /**
     * It represents the attribute of type float radius
     */
    private float radius;
    /**
     * It represents the attribute of type String color
     */
    private String color;

    /**
     * Create an instance of a class Circle
     * @param radius Define the radius of the circle
     * @param color Define the color of the circle
     */
    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter method of the radius attribute
     * @return The radius of the circle
     */
    public float getRadius() {
        return radius;
    }

    /**
     * Setter method of the radius attribute
     * @param radius The radius attribute passed as an argument
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Getter method of the color attribute
     * @return The color of circle
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method of the color attribute
     * @param color The color attribute passed as an argument
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Create an instance of class Circle called Area
     * @param radius The value of radius of circle
     * @param PI The constant mathematical value PI
     * @return The value of Area
     */
    public String Area(int radius, double PI){
        return "The area of circle is: " + (radius * radius * PI);
    }

    /**
     * Create an instance of class Circle called Perimeter
     * @param radius The value of radius of circle
     * @param PI The constant mathematical value PI
     * @return The value of Perimeter
     */
    public String Perimeter(int radius, double PI){
        return "The perimeter of circle is: " + (2 * PI * radius);
    }
}