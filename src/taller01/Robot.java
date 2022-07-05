package taller01;

/**
 * It represents the Robot class for the movement of a robot with movement in two dimensions,
 * with its respective attributes and methods.
 * @author Joan Peralta Collante
 */
public class Robot {
    /**
     * It represents the attribute of type float position X and position Y in the Robot class.
     */
    public float posX, posY;
    /**
     * It represents the attribute of type float direction in the Robot class.
     */
    private float direction;
    /**
     * It represents the attribute of type int velocity in the CuentaBancaria class.
     */
    protected int velocity;

    /**
     * Create the instance of class Robot
     * @param posX Sets the position on the X (horizontal) axis.
     * @param posY Sets the position on the Y (vertical) axis.
     * @param direction Sets the direction of the robot.
     * @param velocity Sets the velocity of the robot.
     */
    public Robot(float posX, float posY, float direction, int velocity){
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
        this.velocity = velocity;
    }

    /**
     * Setter method of the direction attribute
     * @param direction The direction attribute passed as an argument
     */
    public void setDirection(float direction) {
        this.direction = direction;
    }

    /**
     * Getter method of the direction attribute
     * @return Returns the value of the direction
     */
    public float getDirection() {
        return direction;
    }
}
